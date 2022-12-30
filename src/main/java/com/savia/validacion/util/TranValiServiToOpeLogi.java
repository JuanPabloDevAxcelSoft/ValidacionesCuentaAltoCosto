package com.savia.validacion.util;

import com.savia.validacion.reflector.Reflector;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TranValiServiToOpeLogi {
    @Autowired
    Reflector reflector;
    public boolean tranferValidacion(Map<?,?> paciente, String Json, Object classValidacion, String nomMetodo){
        boolean result= true;
        JSONArray jsonArray = new JSONArray(Json);
        for (int i = 0; i < jsonArray.length(); i++) {
            boolean multipleVa= false;
            JSONObject obj = jsonArray.getJSONObject(i);
            String[] valor = obj.getString("valor").split("\\:");
            String operador = obj.getString("operador");
            String parametro = obj.getString("parametro");
            parametro= String.valueOf(paciente.get(parametro)) ;
            for (int j = 0; j < valor.length; j++) {
                multipleVa=multipleVa||reflector.validacionGenericoFinal(classValidacion,nomMetodo,parametro,valor[j],operador);
            }
            result=multipleVa&&result;

        }
        return result;
    }

    }


