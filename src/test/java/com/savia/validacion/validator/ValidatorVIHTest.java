package com.savia.validacion.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.savia.validacion.interfaces.ValidacionInterfaces;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.util.MethodsGeneric;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ValidatorVIHTest {

    private final Integer idEnfermedad = 2;
    private String response = null;;
    private MethodsGeneric methodsGeneric = new MethodsGeneric();

    @Autowired
    private ValidacionService validacion;

    @Test
    void validatorV1() {
        Map<String, String> parametros = new HashMap<String, String>() {
            {
                put("entidad_reporte", "11000");
                put("entidad_reportante_sgsss", "asdasdN");
            }
        };

        List<ValidacionInterfaces> list = validacion.findAllValidacionesByIdEnfermedad(idEnfermedad);
        for (ValidacionInterfaces item : list) {
            response = methodsGeneric.validacionDependenciaUno(item, parametros);
        }

        assertEquals("ok", response);
    }

}
