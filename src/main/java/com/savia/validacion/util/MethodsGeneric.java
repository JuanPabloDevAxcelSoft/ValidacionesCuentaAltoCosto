package com.savia.validacion.util;

import java.util.Map;

import javax.annotation.PostConstruct;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.savia.validacion.dto.ValidateOperadores;
import com.savia.validacion.interfaces.ValidacionInterfaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MethodsGeneric {

    Logger logger = LoggerFactory.getLogger(MethodsGeneric.class);

    // @Autowired
    OperadoresLogicos operadoreLogicos = new OperadoresLogicos();

    @PostConstruct
    public void init() {
    }

    public String validacionDependenciaUno(ValidacionInterfaces valoresBd, Map<String, String> parametros) {
        String response = "ok";
        boolean encontrado = false;
        ValidateOperadores validateOperadores = null;

        String var_ind = valoresBd.getVariable_independiente();
        String var_dep = valoresBd.getVariable_dependiente();
        Integer tipo_metodo = valoresBd.getTipo_metodo();
        String valor_var_dep = valoresBd.getNombre();
        String operador = valoresBd.getOperador();

        if (tipo_metodo == null) {
            response = "ERROR : Acción no permitida, El tipo de metodo que tiene configurado esta vacio.";
            return response;
        }

        String contantes = valoresBd.getContantes();
        String errores = valoresBd.getErrores();

        if ((contantes == null || contantes.equals("")) && (errores == null || errores.equals(""))) {
            response = "ERROR : Acción no permitida, La validacion no contiene parametros de comparacion, Validar campo 'Constantes' o 'Id Errores'";
            return response;
        }

        String listaConstatnes[] = contantes.split("\\|");
        String listaErrores[] = errores.split("\\|");

        int iterador = 0;
        while ((iterador < listaConstatnes.length) && !encontrado) {
            if (parametros.get(var_ind).toUpperCase().equals(listaConstatnes[iterador].toUpperCase())) {
                validateOperadores = this.operadoreLogicos.isOperadorCampos(parametros.get(var_dep).toUpperCase(),
                        valor_var_dep, operador);
                encontrado = validateOperadores.getIsCompleted();
                logger.info(validateOperadores.getDescription());
                if (!encontrado) {
                    response = "ERROR (" + listaErrores[iterador] + ")";
                    encontrado = true;
                }
            }
            iterador++;
        }
        validateOperadores = null;
        return response;
    }
}
