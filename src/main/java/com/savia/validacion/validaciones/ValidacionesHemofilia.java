package com.savia.validacion.validaciones;

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
    //------------------------------------------------------------------------------------------------------
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
    //--------------------------------------------------------------------------
    public String validacionV8(Map<String,String> parametros){
        /*fila 23*/
        if (parametros.get("sexoUsuario").equals("M")&&parametros.get("tipoDeficienciaDiagnosticada").equals("2")){
            return "ERROR(B4557) Esta ingresando sexo Paciente: M pero en la variable 23 es igual 2 ";
        }else{
            return "ok";
        }
    }
    //-------------------------------------------------------------------------------
    public  String  validacionV11(Map<String,String> parametros){
        /*fila 27-88 and 163-166*/
        if(parametros.get("codigoEapb").matches("EPSS34|" +
                "ESS024|ESS062|ESS091|ESS118|ESS207|EPS037|EPSI01|EPSI03|EPSI04|EPSI05|EPSI06|EPS005|" +
                "EPS008|EPS010|EPS012|EPS016|EPS017|EPS018|EPS022|EPS025|EPS001|EPS002|CCF055|CCF102|" +
                "CCF023|CCF024|CCF033|EPSS40|EPS044|EPS045|EPSS41|EPS046")&&
                parametros.get("sgsss").toUpperCase().matches("C|S")==false)
        {
            return "ERROR Esta ingresando en la variable 11: "+parametros.get("codigoEapb")+" Pero en la variable 10: " +
                    "No es C o S";
        }
        /*fila 89-162*/
        if(parametros.get("codigoEapb").matches("05000|" +
                "08000|08001|11001|13000|13001|15000|17000|18000|19000|20000|23000|25000|27000|41000|" +
                "44000|47000|47001|50000|52000|54000|63000|66000|68000|70000|73000|76000|76109|81000|" +
                "85000|86000|88000|91000|94000|95000|97000|99000")&&
                parametros.get("sgsss").toUpperCase().matches("N|S")==false)
        {
            return "ERROR Esta ingresando en la variable 11: "+parametros.get("codigoEapb")+" Pero en la variable 10: " +
                    "No es N o S";
        }
        /*fila 167-168*/
        if(parametros.get("codigoEapb").matches("EAS016|EAS027")&&
                parametros.get("sgsss").toUpperCase().matches("C")==false)
        {
            return "ERROR Esta ingresando en la variable 11: "+parametros.get("codigoEapb")+" Pero en la variable 10: " +
                    "No es C";
        }
        /*fila 169-175 and 180-189*/
        if(parametros.get("codigoEapb").matches("EMP015|EMP017|" +
                "EMP019|EMP023|EMP025|EMP028|EMP029|RES006|RES007|RES008|RES009|RES011|RES012|RES014|" +
                "REUE04|REUE05|REUE09")&&
                parametros.get("sgsss").toUpperCase().matches("E")==false)
        {
            return "ERROR Esta ingresando en la variable 11: "+parametros.get("codigoEapb")+" Pero en la variable 10: " +
                    "No es E";
        }
        /*fila 176-179 */
        if(parametros.get("codigoEapb").matches("RES001|RES002|" +
                "RES003|RES004")&&
                parametros.get("sgsss").toUpperCase().matches("P")==false)
        {
            return "ERROR Esta ingresando en la variable 11: "+parametros.get("codigoEapb")+" Pero en la variable 10: " +
                    "No es P";
        }else
        {
            return "ok";
        }
    }
}
