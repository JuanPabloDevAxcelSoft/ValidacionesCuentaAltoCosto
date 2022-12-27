package com.savia.validacion.reflector;

import com.savia.validacion.service.HemofiliaReadService;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ReflectorImpl implements Reflector {

    private HemofiliaReadService hemofiliaReadService;

    @Override
    public Object buscarGenerico(Object enfermedad, String metodo, Integer idPaciente) {
        Method[] methods = enfermedad.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(metodo)) {
                try {
                    System.out.println("hola");
                    System.out.println(hemofiliaReadService.oneElement(idPaciente).getClass().getName());
                    System.out.println("hecho");
                    System.out.println(m.invoke(enfermedad, idPaciente) + "Resultado busqueda");
                    System.out.println("HOlaasmaksk");
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
    public List<String> validacionGenerico(Object claseValidaciones, String metodo, Map<?, ?> parametros) {
        List<String> stringList = new ArrayList<>();
        Method[] methods = claseValidaciones.getClass().getMethods();
        stringList.add("");
        stringList.add("");
        stringList.set(0, "false");
        for (Method m : methods) {
            if (m.getName().equals(metodo)) {
                try {
                    String resultValidation = (String) m.invoke(claseValidaciones, parametros);
                    stringList.set(0, (resultValidation.equals("ok")) ? "true" : "false");
                    stringList.set(1, (resultValidation.equals("ok")) ? "" : resultValidation);
                } catch (IllegalAccessException e) {
                    stringList.set(1, e.getMessage());
                } catch (InvocationTargetException e) {
                    stringList.set(1, e.getMessage());
                }
            }
        }
        return stringList;
    }
}
