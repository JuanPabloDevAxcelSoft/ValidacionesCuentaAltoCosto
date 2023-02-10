package com.savia.validacion.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.graalvm.polyglot.Engine;
import org.graalvm.polyglot.Context;

@Service
public class OperadoresLogicos {
    Logger logger = LoggerFactory.getLogger(OperadoresLogicos.class);

    public OperadoresLogicos() {
    }

    public boolean isValidationGeneric(String variableValidar, String valorVariableValidar, String operador,
            String tipoDato) {

        Engine engine = Engine.newBuilder().option("engine.WarnInterpreterOnly", "false").build();
        Context ctx = Context.newBuilder("js").engine(engine).build();
        String condicion;

        if ((tipoDato.equals("Date")) | (tipoDato.equals("String"))) {
            condicion = "'" + variableValidar + "'" + operador + "'" + valorVariableValidar + "'";
        } else {
            condicion = variableValidar + operador + valorVariableValidar;
        }
        boolean result = false;
        try {
            org.graalvm.polyglot.Value eval = ctx.eval("js", condicion);
            result = eval.asBoolean();
        } catch (Exception e) {
            logger.error("Ocurrio un error en la funcion 'validationGeneric': " + e.getMessage());
        }
        System.out.println(condicion +" soy la condicion "+ result);
        return result;
    }
}
