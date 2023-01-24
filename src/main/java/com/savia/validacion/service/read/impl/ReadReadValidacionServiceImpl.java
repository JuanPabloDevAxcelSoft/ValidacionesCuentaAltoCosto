package com.savia.validacion.service.read.impl;

import com.savia.validacion.model.read.ReadCmValidacion;
import com.savia.validacion.repository.read.ReadCmValidacionRepository;
import com.savia.validacion.service.read.ReadValidacionService;
import com.savia.validacion.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReadReadValidacionServiceImpl implements ReadValidacionService {
    Logger logger = LoggerFactory.getLogger(ReadReadValidacionServiceImpl.class);

    @Autowired
    TranValiServiToOpeLogi tranValiServiToOpeLogi;

    @Autowired
    TranferObjectoMap tranferObjectoMap;

    @Autowired
    PacienteFind pacienteFind;

    @Autowired
    PacienteSaveFinal pacienteSaveFinal;

    @Autowired
    GenerateClassGeneric generateClassGeneric;

    @Autowired
    private ReadCmValidacionRepository readCmValidacionRepository;
    
    @Autowired
    Errores errores;

    @Override
    public String isPacienteCorrect(int idPaciente, int idEnfermedad, String claveArchivo) {
        String result = "";
        Object objectPasciente;
        Object claseValidaciones;
        // Sacando paciente
        objectPasciente = pacienteFind.paciente(idPaciente, idEnfermedad);
        // Transformando Paciente a Mapa
        Map<String, Object> mapPaciente = tranferObjectoMap.objectToMap(objectPasciente);
        // Sacando las validaciones de tbl_validaciones
        List<ReadCmValidacion> listReadCmValidacion = readCmValidacionRepository.listValidaciones(idEnfermedad);
        for (ReadCmValidacion readCmValidacionModel : listReadCmValidacion) {
            // sacando clase de validaciones
            claseValidaciones = generateClassGeneric.classGeneric(readCmValidacionModel.getClaseValidacion());
            // envio a validacion
            if ((tranValiServiToOpeLogi.tranferValidacion(mapPaciente, readCmValidacionModel.getJsonValidacion(),
                    claseValidaciones,
                    readCmValidacionModel.getNombreValidacion())) == false) {
                result = result + readCmValidacionModel.getError() + ";";
            }
        }

        if (result.equals("")){
            result=pacienteSaveFinal.Paciente(idEnfermedad,mapPaciente,claveArchivo);
        }
        else{
            errores.guardarErrores(idEnfermedad,idPaciente,result,claveArchivo);
        }
        return result;
    }

}
