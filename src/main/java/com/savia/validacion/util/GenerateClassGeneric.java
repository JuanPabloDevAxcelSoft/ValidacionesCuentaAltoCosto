package com.savia.validacion.util;

import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class GenerateClassGeneric {
    public Object classGeneric(String rutClass) {
        Object claseGenric = null;
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass(rutClass);
            claseGenric = clazz.getDeclaredConstructor().newInstance();
            return claseGenric;
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        } catch (NoSuchMethodException e) {
        }
        return claseGenric;
    }
}
