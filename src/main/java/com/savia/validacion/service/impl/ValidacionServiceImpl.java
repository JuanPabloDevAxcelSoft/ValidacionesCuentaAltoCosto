package com.savia.validacion.service.impl;

import com.savia.validacion.interfaces.ValidacionInterfaces;
import com.savia.validacion.reflector.Reflector;
import com.savia.validacion.repository.ValidacionRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.util.GenerateClassGeneric;
import com.savia.validacion.util.TranferObjectoMap;
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
    private ValidacionRepository validacionRepository;

    @Autowired
    private Reflector reflector;

    @Override
    public ResponseEntity<Message> resultValidacion(int idPaciente, int idEnfermedad) {
        Object objectPasciente;
        Object claseValidaciones;
        // Sacando paciente
        switch (idEnfermedad) {
            case 1: {
                objectPasciente = hemofiliaReadService.oneElement(idPaciente);
                break;
            }
            default:
                return ResponseEntity.badRequest().body(new Message("No se encontró la enfermedad"));
        }
        // Transformando Paciente a Mapa
        Map<String, Object> mapPaciente = tranferObjectoMap.objectToMap(objectPasciente);
        if (mapPaciente.equals(null)) {
            return ResponseEntity.badRequest().body(new Message("No se pudo convertir el paciente en Mapa"));
        }
        Map<String, String> parame = new HashMap<>();
        // Sacando las validaciones de tbl_validaciones
        List<ValidacionInterfaces> listValidacion = validacionRepository.findAllEnfermedadId(idEnfermedad);

        // Recorriendo todas las validaciones
        for (int i = 0; i < listValidacion.size(); i++) {
            // Sacar clase validaciones generico
            claseValidaciones = generateClassGeneric.classGeneric(listValidacion.get(i).getRuta_validaciones());
            // Sacar Parameters
            String[] parametrosTbl = listValidacion.get(i).getParametros().split(",");
            for (int j = 0; j < parametrosTbl.length; j++) {
                parame.put(parametrosTbl[j], mapPaciente.get(parametrosTbl[j]).toString());
            }
            // Hacer validaciones
            List<String> resultadoValidacion = reflector.validacionGenerico(claseValidaciones,
                    listValidacion.get(i).getNombre_metodo(), parame);
            if (resultadoValidacion.get(0).equals("false")) {
                return ResponseEntity.badRequest().body(new Message(resultadoValidacion.get(1)));// matriz de errores
            }
        }
        return ResponseEntity.ok().body(new Message("Validacion Exitosa"));
    }

    @Override
    public List<ValidacionInterfaces> findAllValidacionesByIdEnfermedad(int enfermedadId) {
        List<ValidacionInterfaces> list = validacionRepository.findAllEnfermedadId(enfermedadId);
        return list;
    }
}
