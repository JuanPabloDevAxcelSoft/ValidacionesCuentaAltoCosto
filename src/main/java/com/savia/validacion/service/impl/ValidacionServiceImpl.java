package com.savia.validacion.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.savia.validacion.model.TblReadValidacionModel;
import com.savia.validacion.reflector.Reflector;
import com.savia.validacion.repository.TblReadValidacionRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ValidacionServiceImpl implements ValidacionService {

    @Autowired
    private HemofiliaReadService hemofiliaReadService;

    @Autowired
    private TblReadValidacionRepository tblReadValidacionRepository;

    @Autowired
    private Reflector reflector;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ResponseEntity<Message> resultValidacion(int idPaciente, int idEnfermedad) {
        try {
            Object objectPasciente;
            Object claseValidaciones = null;
            switch (idEnfermedad) {
                case 1: {
                    objectPasciente = hemofiliaReadService.oneElement(idPaciente);
                    break;
                }
                default:
                    return ResponseEntity.badRequest().body(new Message("No se encontró la enfermedad"));
            }

            if (objectPasciente.equals(null)) {
                return ResponseEntity.badRequest().body(new Message("No se pudo encontrar al pasciente"));
            } else {
                ObjectMapper mapper = new ObjectMapper();
                mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
                String JSON_SOURCE = mapper.writeValueAsString(objectPasciente);
                Map<?, ?> result = mapper.readValue(JSON_SOURCE, HashMap.class);
                Map<String, String> parame = new HashMap<>();
                try {
                    List<TblReadValidacionModel> listValidacion = tblReadValidacionRepository
                            .listValidaciones(idEnfermedad);
                    for (int i = 0; i < listValidacion.size(); i++) {
                        // Sacar parametros
                        String[] parametrosTbl = listValidacion.get(i).getParametros().split(",");
                        for (int j = 0; j < parametrosTbl.length; j++) {
                            parame.put(parametrosTbl[j], result.get(parametrosTbl[j]).toString());
                        }
                        // Sacar clase validaciones generico
                        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                        try {
                            Class<?> clazz = classLoader.loadClass(listValidacion.get(i).getClaseValidacion());
                            claseValidaciones = clazz.getDeclaredConstructor().newInstance();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        /*
                         * //Sacar el objeto para validar
                         * ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                         * try {
                         * Class<?> clazz =
                         * classLoader.loadClass(listValidacion.get(i).getBuscarElemento());
                         * Object objetoClaseValidacion = clazz.newInstance();
                         * objetoClaseValidacion=reflector.buscarGenerico(objetoClaseValidacion,
                         * "oneElement",idPaciente);
                         * System.out.println(objetoClaseValidacion.toString()+"hola");
                         * } catch (ClassNotFoundException e) {
                         * e.printStackTrace();
                         * } catch (InstantiationException e) {
                         * e.printStackTrace();
                         * } catch (IllegalAccessException e) {
                         * e.printStackTrace();
                         * }
                         */
                        try {
                            List<String> resultadoValidacion = reflector.validacionGenerico(claseValidaciones,
                                    listValidacion.get(i).getNombreValidacion(), parame);
                            if (resultadoValidacion.get(0).equals("false")) {
                                /* Matriz de errores */
                                return ResponseEntity.badRequest().body(new Message(resultadoValidacion.get(1)));
                            }
                        } catch (Exception e) {
                            return ResponseEntity.badRequest()
                                    .body(new Message("No se pudo hacer la validacion " + e.getMessage()));
                        }
                    }
                    return ResponseEntity.ok().body(new Message("Validacion Exitosa"));
                } catch (Exception e) {
                    return ResponseEntity.badRequest()
                            .body(new Message("No se pudo encontrar la validacion" + e.getMessage()));
                }

            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Message("No se pudo terminar la validacion" + e.getMessage()));
        }

    }
}
