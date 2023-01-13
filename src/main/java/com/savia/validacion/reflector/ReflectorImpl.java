package com.savia.validacion.reflector;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Service
public class ReflectorImpl implements Reflector {
    Logger logger = LoggerFactory.getLogger(ReflectorImpl.class);

    @Override
    public Object buscarGenerico(Object enfermedad, String metodo, Integer idPaciente) {
        Method[] methods = enfermedad.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(metodo)) {
                try {
                    System.out.println(m.invoke(enfermedad, idPaciente) + "Resultado busqueda");
                    return new Object();
                } catch (InvocationTargetException e) {
                    System.out.println(e.getMessage());
                    return null;
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public boolean validacionGenericoFinal
            (Object claseValidaciones, String metodo, String variableValidar, String valorVariableValidar,String operador, String tipoDato){
        Method[] methods = claseValidaciones.getClass().getMethods();
        boolean result = false;
        for (Method m : methods) {
            if (m.getName().equals(metodo)) {
                try {
                   result= (boolean) m.invoke(claseValidaciones,variableValidar,valorVariableValidar,operador,tipoDato );
                   return result;
                } catch (IllegalAccessException e) {
                    logger.error("ERROR en Reflector illegalAccessException "+e.getMessage());
                } catch (InvocationTargetException e) {
                    logger.error("ERROR en Reflector invocation "+e.getMessage());
                }
            }
        }
        return  result;
    }
}
