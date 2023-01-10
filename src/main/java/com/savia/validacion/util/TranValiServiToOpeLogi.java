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
        boolean multipleVa= false;
        String tipoMe="";
        boolean result= true;
        JSONArray jsonArray = new JSONArray(Json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            if(i==0){
                tipoMe=obj.getString("tipo");
            }else{
                String[] valor= obj.getString("valor").split("\\:");
                String operador=obj.getString("operador");
                String[] parametro = obj.getString("parametro").split("\\:");
                String parametroIndep;
                parametroIndep= String.valueOf(paciente.get(parametro[0]));
                if(tipoMe.equals("depen")){
                    if ((i==2)&&(result==false)){
                        return true;
                    }
                }
                if(tipoMe.equals("integ")&&parametro.length>=2){
                    valor[valor.length-1]=String.valueOf(paciente.get(parametro[1]));
                }
                if(tipoMe.equals("integYo")){
                    if (parametro.length>=2){
                        valor[valor.length-1]=String.valueOf(paciente.get(parametro[1]));
                    }
                    if ((i==2)&&(result==true)){
                        return true;
                    }else if(i==3){
                        result=true;
                    }
                }
                for (int j = 0; j < valor.length; j++) {
                    multipleVa=multipleVa|reflector.validacionGenericoFinal(classValidacion,nomMetodo,parametroIndep,valor[j],operador);
                    if(multipleVa){
                        break;
                    }
                }
                result=result&&multipleVa;
            }
            multipleVa=false;
        }
        return result;
    }
    }


