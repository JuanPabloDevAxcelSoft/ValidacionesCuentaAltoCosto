package com.savia.validacion.util;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class OperadoresLogicos {
    Logger logger = LoggerFactory.getLogger(OperadoresLogicos.class);

    public OperadoresLogicos() {
    }

    public boolean isValidationGeneric(String variableValidar, String valorVariableValidar, String operador){
        ScriptEngineManager scriptEngineManager= new ScriptEngineManager() ;
        String condicion =  "'"+variableValidar +"'"+  operador +  "'"+valorVariableValidar+"'" ;
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        boolean result = false;
        try {
            result = (boolean) scriptEngine.eval(condicion);
            return result;
        } catch (ScriptException e) {
            logger.error("Ocurrió un error en la función 'validationGeneric'"+ e.getMessage());
        }
        return result;
    }

}
