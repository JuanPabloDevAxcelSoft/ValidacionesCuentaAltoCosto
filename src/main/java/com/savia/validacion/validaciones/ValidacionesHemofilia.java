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
    //--------------------------------------------------------------------------------
    public String validacionV16(Map<String,String> parametros){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaV17 = Calendar.getInstance();
        Calendar fechaVariable = Calendar.getInstance();
        try {
            fechaV17.setTime(simpleDateFormat.parse(parametros.get("fechaAfilicionEps")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            fechaVariable.setTime(simpleDateFormat.parse(parametros.get("fechaCorte")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        /*fila 195*/
        if (fechaV17.after(fechaVariable))
        {
            return "ERROR(B899) Esta ingresando en Variable 16 una fecha" +
                            " mayor a la variable 66";
        }
        /*fila 196*/
        try {
            fechaVariable.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (fechaV17.before(fechaVariable))
        {
            return "ERROR(B899) Esta ingresando en Variable 16 una fecha" +
                            " menor a la variable 7";
        }
        else{
            return "ok";
        }
    }
    //--------------------------------------------------------------------------------
    public String validacionV17(Map<String,String> parametros){
        /*fila 198*/
        if(parametros.get("estadoGestacionUsuario").equals("3")&&
                parametros.get("sexoUsuario").equals("M")==false)
        {
            return "ERROR(B1566) Esta ingresando en Variable 17 : '3'" +
                            " pero en la variable 8 no ingreso 'M'";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaV7 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        Calendar fechaVariable2 = Calendar.getInstance();
        try {
            fechaV7.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        fechaVariable1.set(1962,00,31 );
        fechaVariable2.set(2013,00,31 );
        /*fila 199-200*/
        if (parametros.get("estadoGestacionUsuario").equals("1")&&fechaV7.before(fechaVariable1)||
                fechaV7.after(fechaVariable2))
        {
            return"ERROR(B1844) Esta ingresando en Variable 17 : '1'" +
                            " pero en la variable 7 no ingreso un dato mayor a '1962-01-31' o menor" +
                            " a 2013-01-31";
        }
        /*fila 201*/
        if (parametros.get("estadoGestacionUsuario").equals("55")&&
                parametros.get("novedades").equals("11")==false)
        {
            return"ERROR(B2380) Esta ingresando en Variable 17 : '55'" +
                            "pero  la variable 64 no es: '11' ";
        }
        /*fila 202*/
        if(Integer.parseInt(parametros.get("estadoGestacionUsuario"))<=2&&
                parametros.get("sexoUsuario").equals("F")==false)
        {
            return "ERROR(B900) Esta ingresando en Variable 17 : '<=2'" +
                            " pero en la variable 8 no ingreso 'F'";
        }
        else
        {
            return "ok";
        }
    }
    //--------------------------------------------------------------------------------
    //cambia en el tiempo
    public String validacionV18(Map<String,String> parametros){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaV7 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        Calendar fechaVariable2 = Calendar.getInstance();
        try {
            fechaV7.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        fechaVariable1.set(2010,00,31 );
        fechaVariable2.set(1952,00,31);
        /*fila 204-205*/
        if ((parametros.get("usuarioProgramaPlanificacion").equals("3")) && (fechaV7.before(fechaVariable1)||fechaV7.after(fechaVariable2)))
        {
            return"ERROR(B1845) Esta ingresando en Variable 18 : '3'" +
                    " pero en la variable 7 no ingreso un dato mayor a '2010-01-31' " +
                    "o menor a '1952-01-31'";
        }
        /*fila 206*/
        if (parametros.get("usuarioProgramaPlanificacion").equals("55")&&
                parametros.get("novedades").equals("11")==false)
        {
            return"ERROR(B2381) Esta ingresando en Variable 18 : '55'" +
                    "pero  la variable 64 no es: '11' ";
        }

        fechaVariable1.set(2012,00,31 );
        /*fila 207-208*/
        if (parametros.get("usuarioProgramaPlanificacion").matches("0|2")&&fechaV7.after(fechaVariable1))
        {
            return"ERROR(B5802) Esta ingresando en Variable 18 : '0|2'" +
                    " pero en la variable 7 no ingreso un dato o menor a '2012-01-31'";
        }
        else
        {
            return "ok";
        }
    }
    //--------------------------------------------------------------------------------

    public String validacionV19(Map<String,String> parametros){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        /*fila 210*/
        if (parametros.get("edadUsuarioConsulta").equals("5555")&&
                parametros.get("novedades").equals("11")==false)
        {
            return "ERROR(B2382) Esta ingresando en Variable 19 : '5555'" +
                            "pero  la variable 64 no es: '11' ";
        }
        /*fila 211*/
        Calendar fechaV21 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        try {
            fechaV21.setTime(simpleDateFormat.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        fechaVariable1.set(1846,00,01);
        if (parametros.get("edadUsuarioConsulta").equals("5555")&&(fechaV21.compareTo(fechaVariable1)>0))
        {
            return"ERROR(B2382) Esta ingresando en Variable 19 : '5555'" +
                    "pero  la variable 21 no es: '1846-01-01' ";
        }
        /*fila 212*/
        fechaVariable1.set(1811,00,01);
        if (parametros.get("edadUsuarioConsulta").equals("9998")&&
                fechaV21.after(fechaVariable1))
        {
            return "ERROR(B2383) Esta ingresando en Variable 19 : '9999'" +
                            "pero  la variable 21 no es: '<=1811-01-01' ";
        }
        else
        {
            return "ok";
        }
    }
    //--------------------------------------------------------------------------------
    public String validacionV20(Map<String,String> parametros){
        /*fila 214*/
        if(parametros.get("motivoPruebaDiagnostico").equals("5555")&&
                parametros.get("novedades").equals("11")==false)
        {
            return "ERROR(B2384) Esta ingresando en Variable 20 : '55'" +
                            "pero  la variable 64 no es: '11' ";
        }
        /*fila 215-216*/
        if((parametros.get("motivoPruebaDiagnostico").equals("55")==false)&&
                (Integer.parseInt(parametros.get("motivoPruebaDiagnostico"))>4))
        {
            return "ERROR(B3978) No esta ingresando en Variable 20 " +
                            "un dato:'<=4' o '55'";
        }else
        {
            return "ok";
        }
    }
    //--------------------------------------------------------------------------------
    public String validacionV21(Map<String,String> parametros){
        System.out.println("llegue"+parametros.get("fechaDiagnostico")+"--"+parametros.get("novedades")+"--"+
                parametros.get("fechaNacimientoUsuario")+"--"+parametros.get("edadUsuarioConsulta")+"--"+
                parametros.get("fechaCorte"));
        /*fila 218-219*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if((parametros.get("fechaDiagnostico").equals("1811-01-01")||
                parametros.get("fechaDiagnostico").equals("1800-01-01"))&&
                (parametros.get("novedades").equals("2")))
        {
            return "(B1558),(B2386)Esta ingresando en la variable 21 " +
                            "'1811-01-01' o '1800-01-01' y en la variable 64 '2'";
        }
        //fila 220
        if((parametros.get("fechaDiagnostico").equals("1846-01-01"))&&
                (parametros.get("novedades").equals("11")==false))
        {
            return "(B2387)Esta ingresando en la variable 21 " +
                    "'1846-01-01' y en la variable 64 no es '11'";
        }
        Calendar fechaV21 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        try {
            fechaVariable1.setTime(format.parse(parametros.get("fechaNacimientoUsuario")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            fechaV21.setTime(format.parse(parametros.get("fechaDiagnostico")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //fila221
        if((fechaV21.after(fechaVariable1)||
                parametros.get("fechaDiagnostico").equals(parametros.get("fechaNacimientoUsuario")))
                &&(Integer.parseInt(parametros.get("edadUsuarioConsulta"))>100))
        {
            return "ERROR(B2388) esta ingresando una fecha en la variable 21 >= a la variable 7, pero " +
                    "variable V19 no es <100  ";
        }
        Calendar fechaVariable2 = Calendar.getInstance();
        try {
            fechaVariable2.setTime(format.parse(parametros.get("fechaCorte")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //fila223-226
        if((fechaV21.before(fechaVariable1)||fechaV21.after(fechaVariable2))
                &&(parametros.get("fechaDiagnostico")
                .matches("[1][8][0][0][-][0][1][-][0][1]|[1][8][1][1][-][0][1][-][0][1]|[1][8][4][6][-][0][1][-][0][1]")==false))
        {
            return "ERROR(B901) esta ingresando una fecha no valida en la variable 21  ";
        }

        else
        {
            return "ok";
        }
    }
    public String validacionV22(Map<String,String> parametros){
        //fila228
        if(parametros.get("codigoValidoHabilitacionIps").equals("99")&&parametros.get("novedades").equals("2"))
        {
            return "ERROR(B2389) esta ingresando en la variable 22 :99 y en la variable 64:2 ";
        }else
        {
            return "ok";
        }
    }

}
