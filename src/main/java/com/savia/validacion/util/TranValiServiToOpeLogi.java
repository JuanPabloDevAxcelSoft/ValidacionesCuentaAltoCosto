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
            String[] operador = obj.getString("operador").split("\\:");
            String[] parametro = obj.getString("parametro").split("\\:");
            String parametroIndep=new  String();
            parametroIndep= String.valueOf(paciente.get(parametro[0])) ;
            if(parametro.length>1) {
                valor[valor.length-1]=String.valueOf(paciente.get(parametro[1]));
            }
            for (int j = 0; j < valor.length; j++) {
                multipleVa=multipleVa||reflector.validacionGenericoFinal(classValidacion,nomMetodo,parametroIndep,valor[j],operador[j]);
            }
            result=multipleVa&&result;

        }
        return result;
    }

    }


