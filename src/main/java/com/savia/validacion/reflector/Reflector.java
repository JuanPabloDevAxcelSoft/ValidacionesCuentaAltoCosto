package com.savia.validacion.reflector;

public interface Reflector {
    Object buscarGenerico(Object enfermedad, String metodo, Integer idPaciente);

    boolean validacionGenericoFinal(Object claseValidaciones, String metodo, String variableValidar,
            String valorVariableValidar, String operador, String tipoDato);

}
