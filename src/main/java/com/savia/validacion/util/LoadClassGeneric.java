package com.savia.validacion.util;

import java.lang.reflect.InvocationTargetException;

public class LoadClassGeneric {

    public Object getNewInstance(String path)
            throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Object claseValidaciones = null;
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass(path);
            claseValidaciones = clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return claseValidaciones;
    }

}
