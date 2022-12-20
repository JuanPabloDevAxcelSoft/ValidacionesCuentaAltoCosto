package com.savia.validacion.validaciones;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.valueobject.Message;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

public class ValidacionesHemofilia {
    /*Validación Variable V5 */
    public String validacionV5(Map<String,String> parametros){
        Calendar fechaMayorVariable= Calendar.getInstance();
        fechaMayorVariable.set(fechaMayorVariable.get(Calendar.YEAR)-18,fechaMayorVariable.get(Calendar.MONTH),fechaMayorVariable.get(Calendar.DAY_OF_MONTH));
        Calendar fecNacimientoUsuario= new GregorianCalendar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecNacimientoUsuario.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            return "La fecha que esta ingresando no es valida";
        }
        //----------------------------------------3----------------------------------------
        if(parametros.get("tipoIdentificacionUsuario").equals("CC")&&fecNacimientoUsuario.after(fechaMayorVariable)){
            return "Esta ingresando en el tipo de documento CC pero  la fecha de " +
                            "nacimiento no es menor al año "+ fechaMayorVariable.get(Calendar.YEAR)
                            +" Mes: " +(fechaMayorVariable.get(Calendar.MONTH)+1)+ " Dia: "+
                            fechaMayorVariable.get(Calendar.DAY_OF_MONTH);
        }else {
            return "ok";
        }
    }
    public String validacionV7(Map<String,String> parametros){
        Calendar fechaMayorVariable= Calendar.getInstance();
        Calendar fecNacimientoUsuario= new GregorianCalendar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecNacimientoUsuario.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            return "La fecha que esta ingresando no es valida";
        }
        /*fila 10-17*/
        fechaMayorVariable.set(2017,0,31);//pude cambiar en el tiempo
        if(fecNacimientoUsuario.after(fechaMayorVariable)&&
                parametros.get("reemplazoArticularesVida").matches("0|9996|5555|9999")==false
                ||parametros.get("reemplazoArticularesPeriodo").matches("0|9996|5555|9999")==false) {
            return "Error se esta ingresando una fecha mayor a " +
                            "2017-01-31 pero se tiene un dato diferente a 0|9996|5555|9999 en las variable 56 o 56.1 " +
                            " campo digitado en la variable 56:  "+parametros.get("reemplazoArticularesVida")+
                            " campo digitado en la variable 56.1 :"+parametros.get("reemplazoArticularesPeriodo");
        }
        /*fila 18*/
        fechaMayorVariable.set(2014,0,31);//puede cambiar en el tiempo
        if (fecNacimientoUsuario.equals(fechaMayorVariable)||fecNacimientoUsuario.after(fechaMayorVariable)
                && Integer.parseInt(parametros.get("usuarioProgramaPlanificacion"))!=0 )
        {
            return "ERROR(B5800) Esta ingresando una Fecha mayor a 2014-01-31" +
                            " pero la variable 18 no es 0";
        }
        /*fila 19*/
        fechaMayorVariable.set(1952,0,31);
        if (fecNacimientoUsuario.equals(fechaMayorVariable)||fecNacimientoUsuario.before(fechaMayorVariable)
                && Integer.parseInt(parametros.get("usuarioProgramaPlanificacion"))!=4 )
        {
            return "ERROR(B5801) Esta ingresando una Fecha menor a 1952-01-31 " +
                            " pero la variable 18 no es 4";
        }
        /*fila 20*/
        try {
            fechaMayorVariable.setTime(simpleDateFormat.parse(parametros.get("fechaCorte")));
        } catch (ParseException e) {
            return "La fecha que esta ingresando no es valida"+parametros.get("fechaCorte");
        }
        if(fecNacimientoUsuario.after(fechaMayorVariable))
        {
            return "ERROR(B897) Esta ingresando una Fecha De Nacimiento:" +
                            " mayor a "+fechaMayorVariable.get(Calendar.YEAR);
        }
        /*fila 21*/
        fechaMayorVariable.set(1919,01,31);
        if(fecNacimientoUsuario.before(fechaMayorVariable))
        {
            return "ERROR(B897) Esta ingresando una Fecha De Nacimiento:" +
                            " menor a 1919-01-31 ";
        }
        else{
            return "ok";
        }
    }
}
