package com.savia.validacion.service.impl.validaciones;


import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.valueobject.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class ValidacionesHemofilia {

    /*Validación Variable V5 */
    public ResponseEntity<Message> validacionV5(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        Calendar fechaMayorVariable= Calendar.getInstance();
        fechaMayorVariable.set(fechaMayorVariable.get(Calendar.YEAR)-18,fechaMayorVariable.get(Calendar.MONTH),fechaMayorVariable.get(Calendar.DAY_OF_MONTH));
        Calendar fecNacimientoUsuario= new GregorianCalendar();
        fecNacimientoUsuario.setTime(tblReadHemofiliaPasoModel.getFechaNacimientoUsuario());
        //--------------------------------------------------------------------------------
        if(tblReadHemofiliaPasoModel.getTipoIdentificacionUsuario().equals("CC")&&fecNacimientoUsuario.after(fechaMayorVariable)){
            return ResponseEntity.badRequest()
                    .body(new Message("Esta ingresando en el tipo de documento CC pero  la fecha de " +
                            "nacimiento no es menor al año "+ fechaMayorVariable.get(Calendar.YEAR)
                            +" Mes: " +(fechaMayorVariable.get(Calendar.MONTH)+1)+ " Dia: "+
                            fechaMayorVariable.get(Calendar.DAY_OF_MONTH)));
        }else {
            return validacionV7(tblReadHemofiliaPasoModel,fechaMayorVariable,fecNacimientoUsuario);
        }
    }
    //--------------------------------------------------------------------------------

    //Validación Variable 7
    public ResponseEntity<Message> validacionV7(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel, Calendar fechaMayorVariable, Calendar fecNacimientoUsuario){
        /*fila 10-17*/
        fechaMayorVariable.set(2017,0,31);
        if(fecNacimientoUsuario.after(fechaMayorVariable)&&
                Integer.toString(tblReadHemofiliaPasoModel.getReemplazoArticularesVida()).matches("0|9996|5555|9999")==false
                ||Integer.toString(tblReadHemofiliaPasoModel.getReemplazoArticularesPeriodo()).matches("0|9996|5555|9999")==false) {
            return ResponseEntity.badRequest()
                    .body(new Message("Error se esta ingresando una fecha mayor a " +
                            "2017-01-31 pero se tiene un dato diferente a 0|9996|5555|9999 en las variable 56 o 56.1 " +
                            " campo digitado en la variable 56:  "+ tblReadHemofiliaPasoModel.getReemplazoArticularesVida()+
                            " campo digitado en la variable 56.1 :"+ tblReadHemofiliaPasoModel.getReemplazoArticularesPeriodo()));
        }
        /*fila 18*/
        fechaMayorVariable.set(2014,0,31);
        if (fecNacimientoUsuario.equals(fechaMayorVariable)||fecNacimientoUsuario.after(fechaMayorVariable)
            && Integer.parseInt(tblReadHemofiliaPasoModel.getUsuarioProgramaPlanificacion())!=0 )
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B5800) Esta ingresando una Fecha mayor a 2014-01-31 " +
                            " pero la variable 18 no es 0"));
        }
        /*fila 19*/
        fechaMayorVariable.set(1952,0,31);
        if (fecNacimientoUsuario.equals(fechaMayorVariable)||fecNacimientoUsuario.before(fechaMayorVariable)
           && Integer.parseInt(tblReadHemofiliaPasoModel.getUsuarioProgramaPlanificacion())!=4 )
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B5801) Esta ingresando una Fecha menor a 1952-01-31 " +
                            " pero la variable 18 no es 4"));
        }
        /*fila 20*/
        fechaMayorVariable.setTime(tblReadHemofiliaPasoModel.getFechaCorte());
        if(fecNacimientoUsuario.after(fechaMayorVariable))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B897) Esta ingresando una Fecha De Nacimiento:" +
                            " mayor a "+fechaMayorVariable.get(Calendar.YEAR)));
        }
        /*fila 21*/
        fechaMayorVariable.set(1919,01,31);
        if(fecNacimientoUsuario.before(fechaMayorVariable))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B897) Esta ingresando una Fecha De Nacimiento:" +
                            " menor a 1919-01-31 "));
        }
        else{
            return validacionV8(tblReadHemofiliaPasoModel);
        }
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 8
    public ResponseEntity<Message> validacionV8(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        /*fila 23*/
        if (tblReadHemofiliaPasoModel.getSexoUsuario().equals("M")&& tblReadHemofiliaPasoModel.getTipoDeficienciaDiagnosticada().equals("2")){
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B4557) Esta ingresando sexo Paciente: M" +
                            " pero en la variable 23 es igual 2 "));
        }else{
            return validacionV16(tblReadHemofiliaPasoModel);
        }
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 11 Preguntar a ximena
    //--------------------------------------------------------------------------------
    //Validación Variable 16
    public ResponseEntity<Message> validacionV16(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        Calendar fechaV17 = Calendar.getInstance();
        Calendar fechaVariable = Calendar.getInstance();
        fechaV17.setTime(tblReadHemofiliaPasoModel.getFechaAfilicionEps());
        fechaVariable.setTime(tblReadHemofiliaPasoModel.getFechaCorte());
        /*fila 195*/
        if (fechaV17.after(fechaVariable))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B899) Esta ingresando en Variable 16 una fecha" +
                            " mayor a la variable 66"));
        }
        /*fila 196*/
        fechaVariable.setTime(tblReadHemofiliaPasoModel.getFechaNacimientoUsuario());
        if (fechaV17.before(fechaVariable))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B899) Esta ingresando en Variable 16 una fecha" +
                            " menor a la variable 7"));
        }
        else{
            return validacionV17(tblReadHemofiliaPasoModel);
        }
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 17
    public ResponseEntity<Message> validacionV17(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        /*fila 198*/
        if(tblReadHemofiliaPasoModel.getEstadoGestacionUsuario().equals("3")&&
                tblReadHemofiliaPasoModel.getSexoUsuario().equals("M")==false)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B1566) Esta ingresando en Variable 17 : '3'" +
                            " pero en la variable 8 no ingreso 'M'"));
        }
        Calendar fechaV7 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        Calendar fechaVariable2 = Calendar.getInstance();
        fechaV7.setTime(tblReadHemofiliaPasoModel.getFechaNacimientoUsuario());
        fechaVariable1.set(1962,00,31 );
        fechaVariable2.set(2013,00,31 );
        /*fila 199-200*/
        if (tblReadHemofiliaPasoModel.getEstadoGestacionUsuario().equals("1")&&fechaV7.before(fechaVariable1)||
                fechaV7.after(fechaVariable2))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B1844) Esta ingresando en Variable 17 : '1'" +
                            " pero en la variable 7 no ingreso un dato mayor a '1962-01-31' o menor" +
                            " a 2013-01-31"));
        }
        /*fila 201*/
        if (tblReadHemofiliaPasoModel.getEstadoGestacionUsuario().equals("55")&&
                tblReadHemofiliaPasoModel.getNovedades().equals("11")==false)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B2380) Esta ingresando en Variable 17 : '55'" +
                            "pero  la variable 64 no es: '11' "));
        }
        /*fila 202*/
        if(Integer.parseInt(tblReadHemofiliaPasoModel.getEstadoGestacionUsuario())<=2&&
                tblReadHemofiliaPasoModel.getSexoUsuario().equals("F")==false)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B900) Esta ingresando en Variable 17 : '<=2'" +
                            " pero en la variable 8 no ingreso 'F'"));
        }
        else
        {
            return validacionV18(tblReadHemofiliaPasoModel);
        }
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 18 preguntar a Ximena
    public ResponseEntity<Message> validacionV18(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        return validacionV19(tblReadHemofiliaPasoModel);
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 19
    public ResponseEntity<Message> validacionV19(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        /*fila 210*/
        if (tblReadHemofiliaPasoModel.getEdadUsuarioConsulta()==5555&&
                tblReadHemofiliaPasoModel.getNovedades().equals("11")==false)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B2382) Esta ingresando en Variable 19 : '5555'" +
                            "pero  la variable 64 no es: '11' "));
        }
        /*fila 211*/
        Calendar fechaV21 = Calendar.getInstance();
        Calendar fechaVariable1 = Calendar.getInstance();
        fechaV21.setTime(tblReadHemofiliaPasoModel.getFechaDiagnostico());
        fechaVariable1.set(1846,00,01);
        if (tblReadHemofiliaPasoModel.getEdadUsuarioConsulta()==5555&&(fechaV21.compareTo(fechaVariable1)>0))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B2382) Esta ingresando en Variable 19 : '5555'" +
                            "pero  la variable 21 no es: '1846-01-01' "));
        }
        /*fila 212*/
        fechaVariable1.set(1811,00,01);
        if (tblReadHemofiliaPasoModel.getEdadUsuarioConsulta()==9998&&
                fechaV21.after(fechaVariable1))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B2383) Esta ingresando en Variable 19 : '9999'" +
                            "pero  la variable 21 no es: '<=1811-01-01' "));
        }
        else
        {
            return validacionV20(tblReadHemofiliaPasoModel);
        }
    }
    //--------------------------------------------------------------------------------
    //Validación Variable 20
    public ResponseEntity<Message> validacionV20(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        /*fila 214*/
        if(Integer.parseInt(tblReadHemofiliaPasoModel.getMotivoPruebaDiagnostico())==55&&
                tblReadHemofiliaPasoModel.getNovedades().equals("11")==false)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B2384) Esta ingresando en Variable 20 : '55'" +
                            "pero  la variable 64 no es: '11' "));
        }
        /*fila 215-216*/
        if((Integer.parseInt(tblReadHemofiliaPasoModel.getMotivoPruebaDiagnostico())==55)==false&&
                Integer.parseInt(tblReadHemofiliaPasoModel.getMotivoPruebaDiagnostico())>4)
        {
            return ResponseEntity.badRequest()
                    .body(new Message("ERROR(B3978) No esta ingresando en Variable 20 " +
                            "un dato:'<=4' o '55'"));
        }else
        {
            return validacionV21(tblReadHemofiliaPasoModel);
        }

    }
    //--------------------------------------------------------------------------------
    //Validación Variable 21
    public ResponseEntity<Message> validacionV21(TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel){
        /*fila 218-219*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if(format.format(tblReadHemofiliaPasoModel.getFechaDiagnostico()).equals("1811-01-01")||
                format.format(tblReadHemofiliaPasoModel.getFechaDiagnostico()).equals("1800-01-01")&&
                tblReadHemofiliaPasoModel.getNovedades().equals("2"))
        {
            return ResponseEntity.badRequest()
                    .body(new Message("(B1558),(B2386)Esta ingresando en la variable 21 " +
                            "'1811-01-01' o '1800-01-01' y en la variable 64 '2'"));
        }
        else
        {
            return ResponseEntity.ok()
                    .body(new Message("ok"));
        }

    }

}
