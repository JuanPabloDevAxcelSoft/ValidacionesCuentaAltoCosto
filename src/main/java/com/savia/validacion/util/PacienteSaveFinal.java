package com.savia.validacion.util;

import com.savia.validacion.model.write.WriteCmDetallePaciente;
import com.savia.validacion.model.write.WriteCmPaciente;
import com.savia.validacion.model.write.WriteCmPacienteHemofilia;
import com.savia.validacion.model.write.WriteCmPacienteVih;
import com.savia.validacion.repository.CmPacienteVihRepository;
import com.savia.validacion.repository.write.WriteCmDetallePacienteRepository;
import com.savia.validacion.repository.write.WriteCmPacienteHemofiliaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class PacienteSaveFinal {
    private final Logger logger = LoggerFactory.getLogger(PacienteSaveFinal.class);
    @Autowired
    WriteCmDetallePacienteRepository writeCmDetallePacienteRepository;

    @Autowired
    WriteCmPacienteHemofiliaRepository writeCmPacienteHemofiliaRepository;
    @Autowired
    CmPacienteVihRepository cmPacienteVihRepository;
    public String Paciente(int idEnfermedad, Map<String,Object> paciente,String claveArchivo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, String> mapaConvert = new HashMap<>();
        for (Map.Entry<String, Object> entry : paciente.entrySet()) {
            Object valor = entry.getValue();
            String valorString = valor == null ? null : valor.toString();
            mapaConvert.put(entry.getKey(), valorString);
        }
        switch (idEnfermedad) {
            case 1: {
                // sacando Paciente
                WriteCmPaciente writeCmPaciente = null;
                try {
                    writeCmPaciente= new WriteCmPaciente(mapaConvert.get("primerNombre"),
                            mapaConvert.get("segundoNombre"),mapaConvert.get("primerApellido"),mapaConvert.get("segundoApellido"),
                            mapaConvert.get("tipoIdentificacionUsuario"),mapaConvert.get("numeroIdentificacionUsuario"),
                            simpleDateFormat.parse(mapaConvert.get("fechaNacimientoUsuario")),mapaConvert.get("sexoUsuario").toCharArray()[0],
                            mapaConvert.get("codigoPertenenciaEtnica").toCharArray()[0],claveArchivo);

                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
                // Sacando el Paciente hemofilia
                WriteCmPacienteHemofilia writeCmPacienteHemofilia = null;
                try {
                    writeCmPacienteHemofilia = new WriteCmPacienteHemofilia(
                            Integer.parseInt(mapaConvert.get("ocupacionUsuario")),
                            Integer.parseInt(mapaConvert.get("grupoPoblacional")),
                            mapaConvert.get("estadoGestacionUsuario"), mapaConvert.get("usuaProgPlan"),
                            Integer.parseInt(mapaConvert.get("edadUsuarioConsulta")),
                            mapaConvert.get("motivoPruebaDiagnostico"),
                            simpleDateFormat.parse(mapaConvert.get("fechaDiagnostico")),
                            new BigInteger(mapaConvert.get("codiValiHabiIps")), mapaConvert.get("tipoDefiDiag"),
                            mapaConvert.get("clasSeveNiveFact"),
                            Float.parseFloat(mapaConvert.get("actividadCoagulanteFactor")),
                            mapaConvert.get("anteFamiAsocHemo"), mapaConvert.get("factReciPrimTrat"),
                            mapaConvert.get("esquemaPrimerTratamiento"),
                            simpleDateFormat.parse(mapaConvert.get("fechInicPrimTrat")),
                            Integer.parseInt(mapaConvert.get("factReciActuTrat")),
                            mapaConvert.get("esquemaActualTratamiento"),
                            Float.parseFloat(mapaConvert.get("pesoUsuario")),
                            Float.parseFloat(mapaConvert.get("dosis")), mapaConvert.get("frecuenciaSemana"),
                            Integer.parseInt(mapaConvert.get("numeroDosisTotalesPeriodo")),
                            Integer.parseInt(mapaConvert.get("numeApliTotaPeri")), mapaConvert.get("modaApliTrat"),
                            mapaConvert.get("viaAdministracion"),
                            mapaConvert.get("cum1"), mapaConvert.get("cum2"), mapaConvert.get("cum3"),
                            mapaConvert.get("cum4"),
                            Long.parseLong(mapaConvert.get("codigoHabilitacionEps")), mapaConvert.get("hermartrosis"),
                            Integer.parseInt(mapaConvert.get("numeHermEspoUltiAño")),
                            Integer.parseInt(mapaConvert.get("numeHermTrauUltiAño")),
                            Integer.parseInt(mapaConvert.get("hemorragiaIlioPsoas")),
                            Integer.parseInt(mapaConvert.get("hemorragiaMuscular")),
                            Integer.parseInt(mapaConvert.get("hemorragiaIntracraneal")),
                            Integer.parseInt(mapaConvert.get("hemorragiaCuello")),
                            Integer.parseInt(mapaConvert.get("hemorragiaOral")),
                            Integer.parseInt(mapaConvert.get("hemoOtraLoca")),
                            Integer.parseInt(mapaConvert.get("hemoOtraDifeHemaEspo")),
                            Integer.parseInt(mapaConvert.get("hemoOtraDifeHemaTrau")),
                            Integer.parseInt(mapaConvert.get("hemoAsocProcDifeHema")),
                            mapaConvert.get("presInhiFechCort"),
                            simpleDateFormat.parse(mapaConvert.get("fechDeteTituInhi")),
                            mapaConvert.get("recibidoItiUsuario"), mapaConvert.get("recibioItiPeriodo"),
                            Integer.parseInt(mapaConvert.get("tiempoUsuarioIti")),
                            mapaConvert.get("artropatiaHemofilicaCronica"),
                            Integer.parseInt(mapaConvert.get("numArtiComp")), mapaConvert.get("usuarioInfectadoVhc"),
                            mapaConvert.get("usuarioInfectadoVhb"), mapaConvert.get("usuarioInfectadoVih"),
                            mapaConvert.get("pseudotumores"), mapaConvert.get("fracturas"),
                            mapaConvert.get("anafilaxis"), mapaConvert.get("factorAnacfiliactica"),
                            Integer.parseInt(mapaConvert.get("reemplazoArticularesVida")),
                            Integer.parseInt(mapaConvert.get("reemplazoArticularesPeriodo")),
                            mapaConvert.get("profesionalAtencionUsuario"),
                            Integer.parseInt(mapaConvert.get("consPresHema")),
                            Integer.parseInt(mapaConvert.get("consPresOrto")),
                            Integer.parseInt(mapaConvert.get("inteProfEnfe")),
                            Integer.parseInt(mapaConvert.get("consultasOdontologo")),
                            Integer.parseInt(mapaConvert.get("consultaNutricionista")),
                            Integer.parseInt(mapaConvert.get("intervencionTrabajoSocial")),
                            Integer.parseInt(mapaConvert.get("consultaFisiatria")),
                            Integer.parseInt(mapaConvert.get("consultaPsicologia")),
                            Integer.parseInt(mapaConvert.get("inteQuimFarm")),
                            Integer.parseInt(mapaConvert.get("intervencionFisioterapia")),
                            mapaConvert.get("primNombMediPrin"), mapaConvert.get("seguNombMediPrin"),
                            mapaConvert.get("primApelMediPrin"),
                            mapaConvert.get("seguApelMediPrin"),
                            Integer.parseInt(mapaConvert.get("numeAtenServUrgeHemo")),
                            Integer.parseInt(mapaConvert.get("numeEvenHospHemo")),
                            Double.parseDouble(mapaConvert.get("costoTotalUnidadesFactor")),
                            Double.parseDouble(mapaConvert.get("costosAgentePuente")),
                            Double.parseDouble(mapaConvert.get("costosCoagulopatia")),
                            Double.parseDouble(mapaConvert.get("costIncaCoag")), mapaConvert.get("novedades"),
                            mapaConvert.get("causaMuerte"),
                            simpleDateFormat.parse(mapaConvert.get("fechaMuerte")),
                            Long.parseLong(mapaConvert.get("bdua")),
                            simpleDateFormat.parse(mapaConvert.get("fechaCorte")), writeCmPaciente);
                } catch (ParseException e) {
                    logger.error(e.getMessage());
                }
                // Sacando detalle Paciente
                WriteCmDetallePaciente writeCmDetallePaciente = null;
                try {
                    writeCmDetallePaciente = new WriteCmDetallePaciente(mapaConvert.get("sgsss").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("municipioResidencia")),
                            mapaConvert.get("numeroTelefonicoUsuario"),
                            mapaConvert.get("codigoEapb"), simpleDateFormat.parse(mapaConvert.get("fechaAfilicionEps")),
                            simpleDateFormat.parse(mapaConvert.get("fechaMuerte")), mapaConvert.get("causaMuerte"),
                            simpleDateFormat.parse(mapaConvert.get("fechaCorte")), mapaConvert.get("bdua"),
                            writeCmPaciente);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
                // Guardando
                writeCmDetallePacienteRepository.save(writeCmDetallePaciente);
                writeCmPacienteHemofiliaRepository.save(writeCmPacienteHemofilia);
                return "Paciente de Hemofilia guardado";
            }
            case 2: {
                System.out.println("------------------------------------");
                System.out.println(paciente);
                    System.out.println(mapaConvert);
                // sacando Paciente
                WriteCmPaciente writeCmPaciente = null;
                try {
                    writeCmPaciente= new WriteCmPaciente(mapaConvert.get("primerNombre"),
                            mapaConvert.get("segundoNombre"),mapaConvert.get("primerApellido"),mapaConvert.get("segundoApellido"),
                            mapaConvert.get("tipoIdentificacion"),mapaConvert.get("numeroIdentificacion"),
                            simpleDateFormat.parse(mapaConvert.get("fechaNacimiento")),mapaConvert.get("sexo").toCharArray()[0],
                            mapaConvert.get("codigoEtnia").toCharArray()[0],claveArchivo);

                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
                // Sacando detalle Paciente
                WriteCmDetallePaciente writeCmDetallePaciente = null;
                try {
                    writeCmDetallePaciente = new WriteCmDetallePaciente(mapaConvert.get("entidadReportanteSgsss").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("codigoMunicipioResidencia")),
                            "0",
                            mapaConvert.get("entidadReporte"), simpleDateFormat.parse(mapaConvert.get("fechAfilEntiRepo")),
                            simpleDateFormat.parse(mapaConvert.get("fechaMuerte")), mapaConvert.get("causaMuerte"),
                            simpleDateFormat.parse(mapaConvert.get("fechaCorte")), mapaConvert.get("codigoSerial"),
                            writeCmPaciente);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
                WriteCmPacienteVih writeCmPacienteVih= new WriteCmPacienteVih(paciente);

                /*
                //sacando paciente vih
                WriteCmPacienteVih writeCmPacienteVih= null;
                try {
                    writeCmPacienteVih= new WriteCmPacienteVih(mapaConvert.get("poblacionClave").toCharArray()[0],
                            mapaConvert.get("mujerGestante").toCharArray()[0],mapaConvert.get("hijoMadreVih").equals("1"),
                            mapaConvert.get("tuberculosis").toCharArray()[0],mapaConvert.get("diagnosticoInfecciónVih").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechaDiagnosticoGestacion")),simpleDateFormat.parse(mapaConvert.get("fechaTamizajeVihT1")),
                            simpleDateFormat.parse(mapaConvert.get("fechaTamizajeVihT2")),simpleDateFormat.parse(mapaConvert.get("fechaTamizajeVihT3")),
                            simpleDateFormat.parse(mapaConvert.get("fechaTamizajeVihParto")),mapaConvert.get("mujeDiagVihGest").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("edadGestDiagVih")),mapaConvert.get("tratamientoVihGestacion").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("edadGestacionalTar")),mapaConvert.get("tarIntraparto").toCharArray()[0],
                            mapaConvert.get("resultadoGestacionVih").toCharArray()[0],simpleDateFormat.parse(mapaConvert.get("fechCulmGestVih")),
                            mapaConvert.get("supresionLactanciaVih").toCharArray()[0],mapaConvert.get("tipoIdenReciNaci"),mapaConvert.get("numeIdenReciNaci"),
                            mapaConvert.get("tipoIdentificacionMadreVih"),mapaConvert.get("numeIdenMadrVih"),mapaConvert.get("madrDiagConfVih").toCharArray()[0],
                            mapaConvert.get("profReciNaciExpuVih").toCharArray()[0],mapaConvert.get("suministroFormulaLactea").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechaCargaViralHijoP1")),mapaConvert.get("resultadoCargaViralHijoP1"),
                            simpleDateFormat.parse(mapaConvert.get("fechaCargaViralHijoP2")),mapaConvert.get("resultadoCargaViralHijoP2"),
                            simpleDateFormat.parse(mapaConvert.get("fechaCargaViralHijoP3")),mapaConvert.get("resultadoCargaViralHijoP3"),
                            mapaConvert.get("condicionFinHijo").toCharArray()[0],simpleDateFormat.parse(mapaConvert.get("fechDiagTurb")),
                            simpleDateFormat.parse(mapaConvert.get("fechTamiTurbVih")),simpleDateFormat.parse(mapaConvert.get("fechaPruebaPresuntivaVih")),
                            mapaConvert.get("pruebaPresuntivaVih"),simpleDateFormat.parse(mapaConvert.get("fechaConfirmacionVih")),
                            mapaConvert.get("reportePersonaVihAfiliada").toCharArray()[0],mapaConvert.get("entidadReportante"),
                            simpleDateFormat.parse(mapaConvert.get("fechaInicioAtencionVih")),mapaConvert.get("viaTransmisionVih").toCharArray()[0],
                            mapaConvert.get("estadioClinico").toCharArray()[0],Integer.parseInt(mapaConvert.get("valoLinfTcd4Diag")),
                            Integer.parseInt(mapaConvert.get("contLinfTcd4Diag")),mapaConvert.get("realCargViraDiag").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("cargaViralDiagnostico")),simpleDateFormat.parse(mapaConvert.get("fechaInicioTar")),
                            Integer.parseInt(mapaConvert.get("medicamento1InicioTar")),Integer.parseInt(mapaConvert.get("medicamento2InicioTar")),
                            Integer.parseInt(mapaConvert.get("medicamento3InicioTar")),Integer.parseInt(mapaConvert.get("medicamento4InicioTar")),
                            Integer.parseInt(mapaConvert.get("medicamento5InicioTar")),mapaConvert.get("linfocitosTcd4Tar").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("valorLinfocitosTcd4Tar")),mapaConvert.get("realizoCargaViralTar").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("cargaViralTar")),mapaConvert.get("motivoInicioTar"),
                            mapaConvert.get("coinfeccionVhbInicioTar").toCharArray()[0],mapaConvert.get("coinfeccionVhcInicioTar").toCharArray()[0],
                            mapaConvert.get("coinTubeInicTar").toCharArray()[0],Integer.parseInt(mapaConvert.get("numMesesDispensoTar")),
                            Integer.parseInt(mapaConvert.get("numConsultasVihTar")),mapaConvert.get("cambiosEsquemaTar").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechaCambioMedicamentoTar")),mapaConvert.get("causaCambioMedicamentoTar"),
                            mapaConvert.get("medicamento1Cambio"),mapaConvert.get("medicamento2Cambio"),mapaConvert.get("medicamento3Cambio"),
                            mapaConvert.get("medicamento4Cambio"),mapaConvert.get("fallasTar").toCharArray()[0],
                            Integer.parseInt(mapaConvert.get("numFallasTar")),mapaConvert.get("infeccionesBacterianas").toCharArray()[0],
                            mapaConvert.get("candidiasis").toCharArray()[0],mapaConvert.get("tubePulmExtr").toCharArray()[0],
                            mapaConvert.get("cancerCervixInvasivo").toCharArray()[0],mapaConvert.get("coccidioidomicosis").toCharArray()[0],
                            mapaConvert.get("citomegalovirus"),mapaConvert.get("retinitis").toCharArray()[0],
                            mapaConvert.get("herpes").toCharArray()[0],mapaConvert.get("diarrea").toCharArray()[0],
                            mapaConvert.get("histoplasmosis").toCharArray()[0],mapaConvert.get("linfoma").toCharArray()[0],
                            mapaConvert.get("neumoníaPneumocystis").toCharArray()[0],mapaConvert.get("neumoníaRecurrente").toCharArray()[0],
                            mapaConvert.get("septicemiaSalmonella").toCharArray()[0],mapaConvert.get("infecciónDiseminada").toCharArray()[0],
                            mapaConvert.get("criptococosisExtrapulmonar").toCharArray()[0],mapaConvert.get("sarcomakaposi").toCharArray()[0],
                            mapaConvert.get("sindromeDesgaste").toCharArray()[0],mapaConvert.get("leucoencefalopatia").toCharArray()[0],
                            mapaConvert.get("toxoplasmosisCerebral").toCharArray()[0], mapaConvert.get("demenciaAsociadaVih").toCharArray()[0],
                            mapaConvert.get("neumoníaIntersticial").toCharArray()[0],mapaConvert.get("codigoSedeIps"),
                            simpleDateFormat.parse(mapaConvert.get("fechaIngresoIps")),Integer.parseInt(mapaConvert.get("municipioIps")),
                            mapaConvert.get("tipoPersonaAtiende"),mapaConvert.get("valoracionInfectologo").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechaUltimaGenotipificación")),mapaConvert.get("estadioClinicoActual").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechaUltimoColesterol")),Integer.parseInt(mapaConvert.get("resultadoUltimoColesterol")),
                            simpleDateFormat.parse(mapaConvert.get("fechaNivelTrigliceridos")),Integer.parseInt(mapaConvert.get("resultadoNivelTrigliceridos")),
                            simpleDateFormat.parse(mapaConvert.get("fechaHemoglobinaSerica")),Float.parseFloat(mapaConvert.get("resultadoHemoglobinaSerica")),
                            simpleDateFormat.parse(mapaConvert.get("fechaAtl")),Integer.parseInt(mapaConvert.get("resultadoAtl")),
                            simpleDateFormat.parse(mapaConvert.get("fechUltiCreaSeri")),mapaConvert.get("resuUltiCreaSeri"),
                            simpleDateFormat.parse(mapaConvert.get("fechUltiGlucSeriEnAyun")),mapaConvert.get("resuUltiGlucSeriEnAyun"),
                            simpleDateFormat.parse(mapaConvert.get("fechUltiMediPesoCorpPeri")),mapaConvert.get("resuUltiMediPesoCorp"),
                            Integer.parseInt(mapaConvert.get("talla")),mapaConvert.get("neuropatiaPeriferica").toCharArray()[0],
                            mapaConvert.get("lipoatrofiaOLiodistrofia").toCharArray()[0],mapaConvert.get("coinHepaBCron").toCharArray()[0],
                            mapaConvert.get("coinHepaCCron").toCharArray()[0],mapaConvert.get("oTuvoCoinTubeActi").toCharArray()[0],
                            mapaConvert.get("tipoTuberculosisActiva").toCharArray()[0],mapaConvert.get("personaCoinfeccionTbVih").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fechInicTratAnti")),mapaConvert.get("mediUnoTratAntiCoin"),mapaConvert.get("mediDosTratAntiCoin"),
                            mapaConvert.get("mediTresTratAntiCoin"),mapaConvert.get("mediCuatTratAntiCoin"),mapaConvert.get("mediCincTratAntiCoin"),
                            mapaConvert.get("mediSeisTratAntiCoin"),mapaConvert.get("mediSietTratAntiCoin"),mapaConvert.get("mediOchoTratAntiCoin"),
                            mapaConvert.get("mediNuevTratAntiCoin"),simpleDateFormat.parse(mapaConvert.get("fechEnTermElTratAnti")),
                            mapaConvert.get("condEgreTratAnti"),mapaConvert.get("cirrosisHepatica").toCharArray()[0],
                            mapaConvert.get("enfeRenaCronVihb").toCharArray()[0],mapaConvert.get("enfermedadCoronaria").toCharArray()[0],
                            mapaConvert.get("otrInfTraSexDifSifHep").toCharArray()[0],mapaConvert.get("neoplasiaNoRelacionadaSida").toCharArray()[0],
                            mapaConvert.get("discapacidadFuncional").toCharArray()[0],simpleDateFormat.parse(mapaConvert.get("fecUltConLinCd4PerObs")),
                            mapaConvert.get("valoUltiCargViraPeriObse"),simpleDateFormat.parse(mapaConvert.get("fehaUltiCargViraPeriObse")),
                            mapaConvert.get("valoUltiCargViraPeriObse"),mapaConvert.get("recibeTar").toCharArray()[0],
                            simpleDateFormat.parse(mapaConvert.get("fehaInicMediReciPersVive")),mapaConvert.get("medicamentoUnoTarActual"),
                            mapaConvert.get("medicamentoDosTarActual"),mapaConvert.get("medicamentoTresTarActual"),mapaConvert.get("medicamentoCuatroTarActual"),
                            mapaConvert.get("medicamentoCincoTarActual"),mapaConvert.get("medicamentoSeisTarActual"),mapaConvert.get("numeMeseDispFormCompTar"),
                            Integer.parseInt(mapaConvert.get("numeCondSumiUltiAnio")),mapaConvert.get("metoPlanFamiPersViveVih").toCharArray()[0],
                            mapaConvert.get("vacunacionContraHepatitsA").toCharArray()[0],mapaConvert.get("vacunacionContraHepatitsB").toCharArray()[0],
                            mapaConvert.get("vacunacionContraNeumococo").toCharArray()[0],mapaConvert.get("tamiTubeActiUltiCons").toCharArray()[0],
                            mapaConvert.get("ppdPrueEquiIdenTube").toCharArray()[0],mapaConvert.get("reciTratTubeLate"),
                            mapaConvert.get("tamiSifiEnPersViveVih").toCharArray()[0],mapaConvert.get("recibioTratamientoSifilis").toCharArray()[0],
                            mapaConvert.get("tamiVihAnogPersViveVih"),mapaConvert.get("tamiHepaBPersViveVih").toCharArray()[0],
                            mapaConvert.get("tamiHepaCPersViveVih").toCharArray()[0],mapaConvert.get("resuEvalRiesCardPersVive"),
                            mapaConvert.get("profilaxisMac").toCharArray()[0],mapaConvert.get("profCripNeof").toCharArray()[0],
                            mapaConvert.get("profPneuJiro").toCharArray()[0],Integer.parseInt(mapaConvert.get("costTotaAtenNoHosp")),
                            Integer.parseInt(mapaConvert.get("costTotaAtenHosp")),Integer.parseInt(mapaConvert.get("numeHospPeriRelaElVih")),
                            mapaConvert.get("noveUsuaRespAlRepoAnte"),simpleDateFormat.parse(mapaConvert.get("fechasafiliacionEntidad")),
                            mapaConvert.get("entiTrasUsuaVihDesa"), writeCmPaciente);
                }catch (Exception e){
                    logger.error(e.getMessage());
                }*/
                writeCmPacienteVih.setIdPaciente(writeCmPaciente);
                writeCmDetallePacienteRepository.save(writeCmDetallePaciente);
                cmPacienteVihRepository.save(writeCmPacienteVih);
                return "llegue hasta guardado" ;
            }
            default:
                return null;
        }
    }
}
