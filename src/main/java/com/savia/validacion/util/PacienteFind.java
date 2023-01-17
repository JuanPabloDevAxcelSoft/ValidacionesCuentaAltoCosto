package com.savia.validacion.util;

import com.savia.validacion.service.read.ReadCmVihPasoService;
import com.savia.validacion.service.read.ReadHemofiliaPasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteFind {
    @Autowired
    ReadHemofiliaPasoService readHemofiliaPasoService;
    @Autowired
    ReadCmVihPasoService readCmVihPasoService;
    public  Object paciente(int idPaciente,int idEnfermedad){
        Object objectPasciente;
        switch (idEnfermedad) {
            case 1: {
                objectPasciente = readHemofiliaPasoService.oneElement(idPaciente);
                return objectPasciente;
            }
            case 2:{
                objectPasciente=readCmVihPasoService.oneElement(Long.valueOf(idPaciente));
                return objectPasciente;
            }
            default:
                return null;
        }
    }
}
