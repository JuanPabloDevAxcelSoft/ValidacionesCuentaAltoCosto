package com.savia.validacion.util;

import com.savia.validacion.service.HemofiliaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteFind {
    @Autowired
    HemofiliaReadService hemofiliaReadService;
    public  Object paciente(int idPaciente,int idEnfermedad){

        Object objectPasciente;
        switch (idEnfermedad) {
            case 1: {
                objectPasciente = hemofiliaReadService.oneElement(idPaciente);
                return objectPasciente;
            }
            default:
                return null;
        }
    }
}
