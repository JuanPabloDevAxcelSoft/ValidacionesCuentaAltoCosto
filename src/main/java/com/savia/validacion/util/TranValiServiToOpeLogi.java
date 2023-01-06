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
        boolean varde=false;
        String tipoMe="";
        boolean result= true;
        JSONArray jsonArray = new JSONArray(Json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            boolean multipleVa= false;
            if(i==0){
                tipoMe=obj.getString("tipo");
            }else{
                String[] valor= obj.getString("valor").split("\\:");
                if(tipoMe.equals("depen")){
                    String operador=obj.getString("operador");
                    String parametro = obj.getString("parametro");
                    parametro=String.valueOf(paciente.get(parametro));
                    if ((i==2)&&(varde==false)){
                        return true;
                    }
                    for (int j = 0; j < valor.length; j++) {
                        multipleVa=multipleVa|reflector.validacionGenericoFinal(classValidacion,nomMetodo,parametro,valor[j],operador);
                        if(multipleVa){
                            break;
                        }
                    }
                    varde=varde|multipleVa;
                    result=result&&multipleVa;
                }
                if(tipoMe.equals("integ")){
                    multipleVa=true;
                    String[] operador = obj.getString("operador").split("\\:");
                    String[] parametro = obj.getString("parametro").split("\\:");
                    String parametroIndep=new  String();
                    parametroIndep= String.valueOf(paciente.get(parametro[0]));
                    valor[valor.length-1]=String.valueOf(paciente.get(parametro[1]));
                    for (int j = 0; j < valor.length; j++) {
                        multipleVa=multipleVa&&reflector.validacionGenericoFinal(classValidacion,nomMetodo,parametroIndep,valor[j],operador[j]);
                    }
                    result=result&&multipleVa;
                }
            }


        }
        return result;
    }

    }


