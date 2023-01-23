package com.savia.validacion.util;

import com.savia.validacion.model.write.WriteCmDetallePaciente;
import com.savia.validacion.model.write.WriteCmPaciente;
import com.savia.validacion.model.write.WriteCmPacienteHemofilia;
import com.savia.validacion.repository.write.WriteCmDetallePacienteRepository;
import com.savia.validacion.repository.write.WriteCmPacienteHemofiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
@Service
public class PacienteSaveFinal {
    @Autowired
    WriteCmDetallePacienteRepository writeCmDetallePacienteRepository;
    @Autowired
    WriteCmPacienteHemofiliaRepository writeCmPacienteHemofiliaRepository;
    public String Paciente(int idEnfermedad, Map<String,Object> paciente) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, String> mapaConvert = new HashMap<>();
        for (Map.Entry<String, Object> entry : paciente.entrySet()) {
            Object valor = entry.getValue();
            String valorString = valor == null ? null : valor.toString();
            mapaConvert.put(entry.getKey(), valorString);
        }
        switch (idEnfermedad) {
            case 1: {
                //sacando Paciente
                WriteCmPaciente writeCmPaciente=null;
                try {
                    writeCmPaciente= new WriteCmPaciente(mapaConvert.get("primerNombre"),
                            mapaConvert.get("segundoNombre"),mapaConvert.get("primerApellido"),mapaConvert.get("segundoApellido"),
                            mapaConvert.get("tipoIdentificacionUsuario"),mapaConvert.get("numeroIdentificacionUsuario"),
                            simpleDateFormat.parse(mapaConvert.get("fechaNacimientoUsuario")),mapaConvert.get("sexoUsuario").toCharArray()[0],
                            mapaConvert.get("codigoPertenenciaEtnica").toCharArray()[0]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //Sacando el Paciente hemofilia
                WriteCmPacienteHemofilia writeCmPacienteHemofilia= null;
                try {
                    writeCmPacienteHemofilia = new WriteCmPacienteHemofilia(Integer.parseInt(mapaConvert.get("ocupacionUsuario")),
                            Integer.parseInt(mapaConvert.get("grupoPoblacional")),mapaConvert.get("estadoGestacionUsuario"),mapaConvert.get("usuaProgPlan"),
                            Integer.parseInt(mapaConvert.get("edadUsuarioConsulta")),mapaConvert.get("motivoPruebaDiagnostico"),simpleDateFormat.parse(mapaConvert.get("fechaDiagnostico")),
                            new BigInteger(mapaConvert.get("codiValiHabiIps")),mapaConvert.get("tipoDefiDiag"),mapaConvert.get("clasSeveNiveFact"),
                            Float.parseFloat(mapaConvert.get("actividadCoagulanteFactor")),mapaConvert.get("anteFamiAsocHemo"),mapaConvert.get("factReciPrimTrat"),
                            mapaConvert.get("esquemaPrimerTratamiento"),simpleDateFormat.parse(mapaConvert.get("fechInicPrimTrat")),
                            Integer.parseInt(mapaConvert.get("factReciActuTrat")),mapaConvert.get("esquemaActualTratamiento"),Float.parseFloat(mapaConvert.get("pesoUsuario")),
                            Float.parseFloat(mapaConvert.get("dosis")),mapaConvert.get("frecuenciaSemana"),Integer.parseInt(mapaConvert.get("numeroDosisTotalesPeriodo")),
                            Integer.parseInt(mapaConvert.get("numeApliTotaPeri")),mapaConvert.get("modaApliTrat"),mapaConvert.get("viaAdministracion"),
                            mapaConvert.get("cum1"),mapaConvert.get("cum2"),mapaConvert.get("cum3"),mapaConvert.get("cum4"),
                            Long.parseLong(mapaConvert.get("codigoHabilitacionEps")),mapaConvert.get("hermartrosis"),
                            Integer.parseInt(mapaConvert.get("numeHermEspoUltiAño")),Integer.parseInt(mapaConvert.get("numeHermTrauUltiAño")),
                            Integer.parseInt(mapaConvert.get("hemorragiaIlioPsoas")),Integer.parseInt(mapaConvert.get("hemorragiaMuscular")),
                            Integer.parseInt(mapaConvert.get("hemorragiaIntracraneal")),Integer.parseInt(mapaConvert.get("hemorragiaCuello")),
                            Integer.parseInt(mapaConvert.get("hemorragiaOral")),Integer.parseInt(mapaConvert.get("hemoOtraLoca")),
                            Integer.parseInt(mapaConvert.get("hemoOtraDifeHemaEspo")),Integer.parseInt(mapaConvert.get("hemoOtraDifeHemaTrau")),
                            Integer.parseInt(mapaConvert.get("hemoAsocProcDifeHema")),mapaConvert.get("presInhiFechCort"),simpleDateFormat.parse(mapaConvert.get("fechDeteTituInhi")),
                            mapaConvert.get("recibidoItiUsuario"),mapaConvert.get("recibioItiPeriodo"),Integer.parseInt(mapaConvert.get("tiempoUsuarioIti")),
                            mapaConvert.get("artropatiaHemofilicaCronica"),Integer.parseInt(mapaConvert.get("numArtiComp")),mapaConvert.get("usuarioInfectadoVhc"),
                            mapaConvert.get("usuarioInfectadoVhb"),mapaConvert.get("usuarioInfectadoVih"),mapaConvert.get("pseudotumores"),mapaConvert.get("fracturas"),
                            mapaConvert.get("anafilaxis"),mapaConvert.get("factorAnacfiliactica"),Integer.parseInt(mapaConvert.get("reemplazoArticularesVida")),
                            Integer.parseInt(mapaConvert.get("reemplazoArticularesPeriodo")),mapaConvert.get("profesionalAtencionUsuario"),
                            Integer.parseInt(mapaConvert.get("consPresHema")),Integer.parseInt(mapaConvert.get("consPresOrto")),
                            Integer.parseInt(mapaConvert.get("inteProfEnfe")),Integer.parseInt(mapaConvert.get("consultasOdontologo")),
                            Integer.parseInt(mapaConvert.get("consultaNutricionista")),Integer.parseInt(mapaConvert.get("intervencionTrabajoSocial")),
                            Integer.parseInt(mapaConvert.get("consultaFisiatria")),Integer.parseInt(mapaConvert.get("consultaPsicologia")),
                            Integer.parseInt(mapaConvert.get("inteQuimFarm")),Integer.parseInt(mapaConvert.get("intervencionFisioterapia")),
                            mapaConvert.get("primNombMediPrin"),mapaConvert.get("seguNombMediPrin"),mapaConvert.get("primApelMediPrin"),
                            mapaConvert.get("seguApelMediPrin"),Integer.parseInt(mapaConvert.get("numeAtenServUrgeHemo")),
                            Integer.parseInt(mapaConvert.get("numeEvenHospHemo")),Double.parseDouble(mapaConvert.get("costoTotalUnidadesFactor")),
                            Double.parseDouble(mapaConvert.get("costosAgentePuente")),Double.parseDouble(mapaConvert.get("costosCoagulopatia")),
                            Double.parseDouble(mapaConvert.get("costIncaCoag")),mapaConvert.get("novedades"),mapaConvert.get("causaMuerte"),
                            simpleDateFormat.parse(mapaConvert.get("fechaMuerte")),Long.parseLong(mapaConvert.get("bdua")),
                            simpleDateFormat.parse(mapaConvert.get("fechaCorte")),writeCmPaciente);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //Sacando detalle Paciente
                WriteCmDetallePaciente writeCmDetallePaciente= null;
                try {
                    writeCmDetallePaciente= new WriteCmDetallePaciente(mapaConvert.get("sgsss").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("municipioResidencia")),mapaConvert.get("numeroTelefonicoUsuario"),
                            mapaConvert.get("codigoEapb"),simpleDateFormat.parse(mapaConvert.get("fechaAfilicionEps")),
                            simpleDateFormat.parse(mapaConvert.get("fechaMuerte")),mapaConvert.get("causaMuerte"),
                            simpleDateFormat.parse(mapaConvert.get("fechaCorte")),mapaConvert.get("bdua"),writeCmPaciente);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //Guardando
                writeCmDetallePacienteRepository.save(writeCmDetallePaciente);
                writeCmPacienteHemofiliaRepository.save(writeCmPacienteHemofilia);
                return "Paciente de Hemofilia guardado";
            }
            case 2:
            {
               return "llegue hasta guardado";
            }
            default:
                return null;
        }
    }
}
