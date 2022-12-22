package com.savia.validacion.util;

import org.springframework.stereotype.Service;

@Service
public class GenerateClassGeneric {
    public Object classGeneric(String rutClass){
        Object claseGenric= null;
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass(rutClass);
            claseGenric =  clazz.newInstance();
            return claseGenric;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return claseGenric;
    }
}
