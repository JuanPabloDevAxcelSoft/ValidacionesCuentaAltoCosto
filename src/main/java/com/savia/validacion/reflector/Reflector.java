package com.savia.validacion.reflector;

import java.util.List;
import java.util.Map;

public interface Reflector {
    Object buscarGenerico(Object enfermedad, String metodo, Integer idPaciente);
    boolean validacionGenericoFinal(Object claseValidaciones, String metodo,String variableValidar, String valorVariableValidar, String operador);
    List<String> validacionGenerico(Object validacion, String metodo, Map<?, ?> map);
}
