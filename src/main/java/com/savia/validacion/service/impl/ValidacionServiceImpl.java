package com.savia.validacion.service.impl;


import com.savia.validacion.model.ReadCmValidacion;
import com.savia.validacion.repository.ReadCmValidacionRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.util.GenerateClassGeneric;
import com.savia.validacion.util.PacienteFind;
import com.savia.validacion.util.TranferObjectoMap;
import com.savia.validacion.util.TranValiServiToOpeLogi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ValidacionServiceImpl implements ValidacionService {
    Logger logger = LoggerFactory.getLogger(ValidacionServiceImpl.class);
    @Autowired
    TranValiServiToOpeLogi tranValiServiToOpeLogi;
    @Autowired
    TranferObjectoMap tranferObjectoMap;
    @Autowired
    PacienteFind pacienteFind;
    @Autowired
    GenerateClassGeneric generateClassGeneric;
    @Autowired
    private HemofiliaReadService hemofiliaReadService;
    @Autowired
    private ReadCmValidacionRepository readCmValidacionRepository;


    @Override
    public String isPacienteCorrect(int idPaciente, int idEnfermedad){
        String result="";
        Object objectPasciente;
        Object claseValidaciones;
        // Sacando paciente
        objectPasciente =pacienteFind.paciente(idPaciente,idEnfermedad);
        // Transformando Paciente a Mapa
        Map<String, Object> mapPaciente = tranferObjectoMap.objectToMap(objectPasciente);
        // Sacando las validaciones de tbl_validaciones
       List<ReadCmValidacion> listReadCmValidacion = readCmValidacionRepository.listValidaciones(idEnfermedad);
        for (ReadCmValidacion readCmValidacionModel:listReadCmValidacion) {
            //sacando clase de validaciones
            claseValidaciones=generateClassGeneric.classGeneric(readCmValidacionModel.getClaseValidacion());
            //envio a validacion
            if(tranValiServiToOpeLogi.tranferValidacion(mapPaciente,readCmValidacionModel.getJsonValidacion(),claseValidaciones,
                    readCmValidacionModel.getNombreValidacion())){
                result=result+" Error detectado: "+readCmValidacionModel.getError()+";";
            }
        }
        return result;

    }

}
