package com.savia.validacion.service.impl;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.databind.ObjectMapper;
import com.savia.validacion.interfaces.ValidacionInterfaces;
>>>>>>> 6d169b22d7b4658d6aecf176207cf19fde6c3aae
import com.savia.validacion.model.TblReadValidacionModel;
import com.savia.validacion.reflector.Reflector;
import com.savia.validacion.repository.ReadValidacionRepository;
import com.savia.validacion.repository.ValidacionRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
<<<<<<< HEAD
import com.savia.validacion.util.GenerateClassGeneric;
import com.savia.validacion.util.TranferObjectoMap;
=======
import com.savia.validacion.util.LoadClassGeneric;
>>>>>>> 6d169b22d7b4658d6aecf176207cf19fde6c3aae
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ValidacionServiceImpl implements ValidacionService {

    @Autowired
    TranferObjectoMap tranferObjectoMap;
    @Autowired
    GenerateClassGeneric generateClassGeneric;
    @Autowired
    private HemofiliaReadService hemofiliaReadService;

    @Autowired
    private ReadValidacionRepository ReadValidacionRepository;

    @Autowired
    private Reflector reflector;
<<<<<<< HEAD

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
=======
    @Override
    public ResponseEntity<Message> resultValidacion(int idPaciente, int idEnfermedad) {
        Object objectPasciente;
        Object claseValidaciones;
        //Sacando paciente
        switch (idEnfermedad)
        {
            case 1:
            {
                objectPasciente= hemofiliaReadService.oneElement(idPaciente);
                break;
            }
            default:
                return ResponseEntity.badRequest().body(new Message("No se encontró la enfermedad"));
>>>>>>> dev.juan
        }
        //Transformando Paciente a Mapa
        Map<String,Object> mapPaciente= tranferObjectoMap.objectToMap(objectPasciente);
        if (mapPaciente.equals(null))
        {
            return ResponseEntity.badRequest().body(new Message("No se pudo convertir el paciente en Mapa"));
        }
        Map<String,String> parame = new HashMap<>();
        //Sacando las validaciones de tbl_validaciones
        List<TblReadValidacionModel> listValidacion=tblReadValidacionRepository.listValidaciones(idEnfermedad);

        //Recorriendo todas las validaciones
        for (int i = 0; i <listValidacion.size() ; i++) {
            //Sacar clase validaciones generico
            claseValidaciones=generateClassGeneric.classGeneric(listValidacion.get(i).getClaseValidacion());
            //Sacar Parameters
            String[] parametrosTbl=listValidacion.get(i).getParametros().split(",");
            for (int j = 0; j < parametrosTbl.length; j++) {
                parame.put(parametrosTbl[j],mapPaciente.get(parametrosTbl[j]).toString());
            }
            //Hacer validaciones
            List<String> resultadoValidacion=reflector.validacionGenerico(claseValidaciones,listValidacion.get(i).getNombreValidacion(),parame);
            if (resultadoValidacion.get(0).equals("false"))
            {
                return ResponseEntity.badRequest().body(new Message(resultadoValidacion.get(1)));//matriz de errores
            }
        }
        return  ResponseEntity.ok().body(new Message("Validacion Exitosa"));
    }

    @Override
    public List<ValidacionInterfaces> findAllValidacionesByIdEnfermedad(int enfermedadId) {
        List<ValidacionInterfaces> list = validacionRepository.findAllEnfermedadId(enfermedadId);
        return list;
    }
}
