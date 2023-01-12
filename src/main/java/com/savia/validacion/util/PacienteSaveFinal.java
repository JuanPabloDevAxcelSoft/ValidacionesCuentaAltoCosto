package com.savia.validacion.util;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class PacienteSaveFinal {
    public String Paciente(int idEnfermedad, Map paciente) {
        switch (idEnfermedad) {
            case 1: {
                return "llegue hasta guardado";
            }
            default:
                return null;
        }
    }
}
