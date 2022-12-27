package com.savia.validacion.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.savia.validacion.interfaces.ValidacionInterfaces;
import com.savia.validacion.model.TblReadValidacionModel;
import com.savia.validacion.reflector.Reflector;
import com.savia.validacion.repository.ReadValidacionRepository;
import com.savia.validacion.repository.ValidacionRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.util.LoadClassGeneric;
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
    private ReadValidacionRepository ReadValidacionRepository;

    @Autowired
    private Reflector reflector;

    @Autowired
    private ValidacionRepository validacionRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private LoadClassGeneric loadClass = new LoadClassGeneric();

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
                Map<String, String> parametros = new HashMap<>();
                try {
                    List<TblReadValidacionModel> listValidacion = ReadValidacionRepository
                            .listValidaciones(idEnfermedad);
                    for (int i = 0; i < listValidacion.size(); i++) {
                        // Sacar parametros
                        String[] parametrosTbl = listValidacion.get(i).getParametros().split(",");
                        for (String item : parametrosTbl) {
                            parametros.put(item, result.get(item).toString());
                        }

                        // Sacar clase validaciones generico
                        String nombreValidacion = listValidacion.get(i).getNombreValidacion();
                        claseValidaciones = this.loadClass.getNewInstance(nombreValidacion);
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
                                    nombreValidacion, parametros);

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

    @Override
    public List<ValidacionInterfaces> findAllValidacionesByIdEnfermedad(int enfermedadId) {
        List<ValidacionInterfaces> list = validacionRepository.findAllEnfermedadId(enfermedadId);
        return list;
    }
}
