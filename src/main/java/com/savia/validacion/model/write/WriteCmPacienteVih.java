/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.write;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "cm_paciente_vih")
public class WriteCmPacienteVih implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poblacion_clave")
    private Character poblacionClave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mujer_gestante")
    private Character mujerGestante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hijo_madre_vih")
    private boolean hijoMadreVih;
    @Basic(optional = false)
    @NotNull
    private Character tuberculosis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diagnostico_infecci\u00f3n_vih")
    private Character diagnosticoInfecci├│nVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico_gestacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnosticoGestacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tamizaje_vih_t1")
    @Temporal(TemporalType.DATE)
    private Date fechaTamizajeVihT1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tamizaje_vih_t2")
    @Temporal(TemporalType.DATE)
    private Date fechaTamizajeVihT2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tamizaje_vih_t3")
    @Temporal(TemporalType.DATE)
    private Date fechaTamizajeVihT3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tamizaje_vih_parto")
    @Temporal(TemporalType.DATE)
    private Date fechaTamizajeVihParto;
    @Column(name = "muje_diag_vih_gest")
    private Character mujeDiagVihGest;
    @Column(name = "edad_gest_diag_vih")
    private Integer edadGestDiagVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tratamiento_vih_gestacion")
    private Character tratamientoVihGestacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad_gestacional_tar")
    private int edadGestacionalTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tar_intraparto")
    private Character tarIntraparto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_gestacion_vih")
    private Character resultadoGestacionVih;
    @Column(name = "fech_culm_gest_vih")
    @Temporal(TemporalType.DATE)
    private Date fechCulmGestVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supresion_lactancia_vih")
    private Character supresionLactanciaVih;
    @Size(max = 2)
    @Column(name = "tipo_iden_reci_naci")
    private String tipoIdenReciNaci;
    @Size(max = 20)
    @Column(name = "nume_iden_reci_naci")
    private String numeIdenReciNaci;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion_madre_vih")
    private String tipoIdentificacionMadreVih;
    @Size(max = 20)
    @Column(name = "nume_iden_madr_vih")
    private String numeIdenMadrVih;
    @Column(name = "madr_diag_conf_vih")
    private Character madrDiagConfVih;
    @Column(name = "prof_reci_naci_expu_vih")
    private Character profReciNaciExpuVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "suministro_formula_lactea")
    private Character suministroFormulaLactea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_carga_viral_hijo_p1")
    @Temporal(TemporalType.DATE)
    private Date fechaCargaViralHijoP1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "resultado_carga_viral_hijo_p1")
    private String resultadoCargaViralHijoP1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_carga_viral_hijo_p2")
    @Temporal(TemporalType.DATE)
    private Date fechaCargaViralHijoP2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "resultado_carga_viral_hijo_p2")
    private String resultadoCargaViralHijoP2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_carga_viral_hijo_p3")
    @Temporal(TemporalType.DATE)
    private Date fechaCargaViralHijoP3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "resultado_carga_viral_hijo_p3")
    private String resultadoCargaViralHijoP3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "condicion_fin_hijo")
    private Character condicionFinHijo;
    @Column(name = "fech_diag_turb")
    @Temporal(TemporalType.DATE)
    private Date fechDiagTurb;
    @Column(name = "fech_tami_turb_vih")
    @Temporal(TemporalType.DATE)
    private Date fechTamiTurbVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_prueba_presuntiva_vih")
    @Temporal(TemporalType.DATE)
    private Date fechaPruebaPresuntivaVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "prueba_presuntiva_vih")
    private String pruebaPresuntivaVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_confirmacion_vih")
    @Temporal(TemporalType.DATE)
    private Date fechaConfirmacionVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reporte_persona_vih_afiliada")
    private Character reportePersonaVihAfiliada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "entidad_reportante")
    private String entidadReportante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_atencion_vih")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioAtencionVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "via_transmision_vih")
    private Character viaTransmisionVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadio_clinico")
    private Character estadioClinico;
    @Column(name = "valo_linf_tcd4_diag")
    private Integer valoLinfTcd4Diag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cont_linf_tcd4_diag")
    private int contLinfTcd4Diag;
    @Column(name = "real_carg_vira_diag")
    private Character realCargViraDiag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "carga_viral_diagnostico")
    private int cargaViralDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_tar")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento1_inicio_tar")
    private int medicamento1InicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento2_inicio_tar")
    private int medicamento2InicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento3_inicio_tar")
    private int medicamento3InicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento4_inicio_tar")
    private int medicamento4InicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento5_inicio_tar")
    private int medicamento5InicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "linfocitos_tcd4_tar")
    private Character linfocitosTcd4Tar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_linfocitos_tcd4_tar")
    private int valorLinfocitosTcd4Tar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "realizo_carga_viral_tar")
    private Character realizoCargaViralTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "carga_viral_tar")
    private int cargaViralTar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "motivo_inicio_tar")
    private String motivoInicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coinfeccion_vhb_inicio_tar")
    private Character coinfeccionVhbInicioTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coinfeccion_vhc_inicio_tar")
    private Character coinfeccionVhcInicioTar;
    @Column(name = "coin_tube_inic_tar")
    private Character coinTubeInicTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_meses_dispenso_tar")
    private int numMesesDispensoTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_consultas_vih_tar")
    private int numConsultasVihTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cambios_esquema_tar")
    private Character cambiosEsquemaTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cambio_medicamento_tar")
    @Temporal(TemporalType.DATE)
    private Date fechaCambioMedicamentoTar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "causa_cambio_medicamento_tar")
    private String causaCambioMedicamentoTar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "medicamento1_cambio")
    private String medicamento1Cambio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "medicamento2_cambio")
    private String medicamento2Cambio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "medicamento3_cambio")
    private String medicamento3Cambio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "medicamento4_cambio")
    private String medicamento4Cambio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fallas_tar")
    private Character fallasTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_fallas_tar")
    private int numFallasTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "infecciones_bacterianas")
    private Character infeccionesBacterianas;
    @Basic(optional = false)
    @NotNull
    private Character candidiasis;
    @Column(name = "tube_pulm_extr")
    private Character tubePulmExtr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cancer_cervix_invasivo")
    private Character cancerCervixInvasivo;
    @Basic(optional = false)
    @NotNull
    private Character coccidioidomicosis;
    @Basic(optional = false)
    @NotNull
    private String  citomegalovirus;
    @Basic(optional = false)
    @NotNull
    private Character retinitis;
    @Basic(optional = false)
    @NotNull
    private Character herpes;
    @Basic(optional = false)
    @NotNull
    private Character diarrea;
    @Basic(optional = false)
    @NotNull
    private Character histoplasmosis;
    @Basic(optional = false)
    @NotNull
    private Character linfoma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neumon\u00eda_pneumocystis")
    private Character neumon├şaPneumocystis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neumon\u00eda_recurrente")
    private Character neumon├şaRecurrente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "septicemia_salmonella")
    private Character septicemiaSalmonella;
    @Basic(optional = false)
    @NotNull
    @Column(name = "infecci\u00f3n_diseminada")
    private Character infecci├│nDiseminada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "criptococosis_extrapulmonar")
    private Character criptococosisExtrapulmonar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sarcoma_kaposi")
    private Character sarcomakaposi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sindrome_desgaste")
    private Character sindromeDesgaste;
    @Basic(optional = false)
    @NotNull
    private Character leucoencefalopatia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "toxoplasmosis_cerebral")
    private Character toxoplasmosisCerebral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "demencia_asociada_vih")
    private Character demenciaAsociadaVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neumon\u00eda_intersticial")
    private Character neumon├şaIntersticial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo_sede_ips")
    private String codigoSedeIps;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso_ips")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoIps;
    @Basic(optional = false)
    @NotNull
    @Column(name = "municipio_ips")
    private int municipioIps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_persona_atiende")
    private String tipoPersonaAtiende;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valoracion_infectologo")
    private Character valoracionInfectologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_genotipificaci\u00f3n")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaGenotipificaci├│n;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadio_clinico_actual")
    private Character estadioClinicoActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultimo_colesterol")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoColesterol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_ultimo_colesterol")
    private int resultadoUltimoColesterol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nivel_trigliceridos")
    @Temporal(TemporalType.DATE)
    private Date fechaNivelTrigliceridos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_nivel_trigliceridos")
    private int resultadoNivelTrigliceridos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hemoglobina_serica")
    @Temporal(TemporalType.DATE)
    private Date fechaHemoglobinaSerica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_hemoglobina_serica")
    private float resultadoHemoglobinaSerica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_atl")
    @Temporal(TemporalType.DATE)
    private Date fechaAtl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_atl")
    private int resultadoAtl;
    @Column(name = "fech_ulti_crea_seri")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechUltiCreaSeri;
    @Size(max = 4)
    @Column(name = "resu_ulti_crea_seri")
    private String resuUltiCreaSeri;
    @Column(name = "fech_ulti_gluc_seri_en_ayun")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechUltiGlucSeriEnAyun;
    @Size(max = 4)
    @Column(name = "resu_ulti_gluc_seri_en_ayun")
    private String resuUltiGlucSeriEnAyun;
    @Column(name = "fech_ulti_medi_peso_corp_peri")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechUltiMediPesoCorpPeri;
    @Size(max = 3)
    @Column(name = "resu_ulti_medi_peso_corp")
    private String resuUltiMediPesoCorp;
    @Basic(optional = false)
    @NotNull
    private int talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neuropatia_periferica")
    private Character neuropatiaPeriferica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lipoatrofia_o_liodistrofia")
    private Character lipoatrofiaOLiodistrofia;
    @Column(name = "coin_hepa_b_cron")
    private Character coinHepaBCron;
    @Column(name = "coin_hepa_c_cron")
    private Character coinHepaCCron;
    @Column(name = "o_tuvo_coin_tube_acti")
    private String otuvoCoinTubeActi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_tuberculosis_activa")
    private Character tipoTuberculosisActiva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "persona_coinfeccion_tb_vih")
    private Character personaCoinfeccionTbVih;
    @Column(name = "fech_inic_trat_anti")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechInicTratAnti;
    @Size(max = 5)
    @Column(name = "medi_uno_trat_anti_coin")
    private String mediUnoTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_dos_trat_anti_coin")
    private String mediDosTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_tres_trat_anti_coin")
    private String mediTresTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_cuat_trat_anti_coin")
    private String mediCuatTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_cinc_trat_anti_coin")
    private String mediCincTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_seis_trat_anti_coin")
    private String mediSeisTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_siet_trat_anti_coin")
    private String mediSietTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_ocho_trat_anti_coin")
    private String mediOchoTratAntiCoin;
    @Size(max = 5)
    @Column(name = "medi_nuev_trat_anti_coin")
    private String mediNuevTratAntiCoin;
    @Column(name = "fech_en_term_el_trat_anti")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechEnTermElTratAnti;
    @Size(max = 2)
    @Column(name = "cond_egre_trat_anti")
    private String condEgreTratAnti;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cirrosis_hepatica")
    private Character cirrosisHepatica;
    @Column(name = "enfe_rena_cron_vihb")
    private Character enfeRenaCronVihb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enfermedad_coronaria")
    private Character enfermedadCoronaria;
    @Column(name = "otr_inf_tra_sex_dif_sif_hep")
    private Character otrInfTraSexDifSifHep;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neoplasia_no_relacionada_sida")
    private Character neoplasiaNoRelacionadaSida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discapacidad_funcional")
    private Character discapacidadFuncional;
    @Column(name = "fec_ult_con_lin_cd4_per_obs")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecUltConLinCd4PerObs;
    @Size(max = 4)
    @Column(name = "val_ult_con_lin_cd4_per_obs")
    private String valUltConLinCd4PerObs;
    @Column(name = "feha_ulti_carg_vira_peri_obse")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehaUltiCargViraPeriObse;
    @Size(max = 8)
    @Column(name = "valo_ulti_carg_vira_peri_obse")
    private String valoUltiCargViraPeriObse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibe_tar")
    private Character recibeTar;
    @Column(name = "feha_inic_medi_reci_pers_vive")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehaInicMediReciPersVive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_uno_tar_actual")
    private String medicamentoUnoTarActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_dos_tar_actual")
    private String medicamentoDosTarActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_tres_tar_actual")
    private String medicamentoTresTarActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_cuatro_tar_actual")
    private String medicamentoCuatroTarActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_cinco_tar_actual")
    private String medicamentoCincoTarActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_seis_tar_actual")
    private String medicamentoSeisTarActual;
    @Size(max = 2)
    @Column(name = "nume_mese_disp_form_comp_tar")
    private String numeMeseDispFormCompTar;
    @Column(name = "nume_cond_sumi_ulti_anio")
    private Integer numeCondSumiUltiAnio;
    @Column(name = "meto_plan_fami_pers_vive_vih")
    private Character metoPlanFamiPersViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vacunacion_contra_hepatits_a")
    private Character vacunacionContraHepatitsA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vacunacion_contra_hepatits_b")
    private Character vacunacionContraHepatitsB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vacunacion_contra_neumococo")
    private Character vacunacionContraNeumococo;
    @Column(name = "tami_tube_acti_ulti_cons")
    private Character tamiTubeActiUltiCons;
    @Column(name = "ppd_prue_equi_iden_tube")
    private Character ppdPrueEquiIdenTube;
    @Size(max = 2)
    @Column(name = "reci_trat_tube_late")
    private String reciTratTubeLate;
    @Column(name = "tami_sifi_en_pers_vive_vih")
    private Character tamiSifiEnPersViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibio_tratamiento_sifilis")
    private Character recibioTratamientoSifilis;
    @Size(max = 2)
    @Column(name = "tami_vih_anog_pers_vive_vih")
    private String tamiVihAnogPersViveVih;
    @Column(name = "tami_hepa_b_pers_vive_vih")
    private Character tamiHepaBPersViveVih;
    @Column(name = "tami_hepa_c_pers_vive_vih")
    private Character tamiHepaCPersViveVih;
    @Size(max = 3)
    @Column(name = "resu_eval_ries_card_pers_vive")
    private String resuEvalRiesCardPersVive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profilaxis_mac")
    private Character profilaxisMac;
    @Column(name = "prof_crip_neof")
    private Character profCripNeof;
    @Column(name = "prof_pneu_jiro")
    private Character profPneuJiro;
    @Column(name = "cost_tota_aten_no_hosp")
    private Integer costTotaAtenNoHosp;
    @Column(name = "cost_tota_aten_hosp")
    private Integer costTotaAtenHosp;
    @Column(name = "nume_hosp_peri_rela_el_vih")
    private Integer numeHospPeriRelaElVih;
    @Size(max = 2)
    @Column(name = "nove_usua_resp_al_repo_ante")
    private String noveUsuaRespAlRepoAnte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechasafiliacion_entidad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasafiliacionEntidad;
    @Size(max = 6)
    @Column(name = "enti_tras_usua_vih_desa")
    private String entiTrasUsuaVihDesa;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteVih() {
    }
    public WriteCmPacienteVih(Map<String, Object> map)  {
        Logger logger = LoggerFactory.getLogger(WriteCmPacienteVih.class);
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();
            try {
                Field field = this.getClass().getDeclaredField(fieldName);
                Class<?> fieldType = field.getType();
                if (fieldType == String.class) {
                    field.set(this,  value.toString());
                } else if (fieldType == Integer.class || fieldType ==int.class || fieldType ==Long.class) {
                    field.set(this, Integer.parseInt(value.toString()));
                } else if (fieldType == Character.class) {
                    field.set(this, value.toString().toCharArray()[0]);
                } else if (fieldType == Date.class) {
                    field.set(this, simpleDateFormat.parse(value.toString()));
                } else if (fieldType == float.class || fieldType== Float.class || fieldType== Double.class) {
                    field.set(this,Float.parseFloat(value.toString()));
                } else if (fieldType == boolean.class || fieldType == Boolean.class ) {
                    field.set(this,Boolean.parseBoolean(value.toString()));
                } else {
                    logger.info("dato no soportado"+ fieldType);
                }
            }catch (NoSuchFieldException e){
            }
            catch (IllegalAccessException |ParseException |IllegalArgumentException e) {
                logger.error(e.getMessage());
            }
        }
    }

    public WriteCmPacienteVih(Long id) {
        this.id = id;
    }

    public WriteCmPacienteVih(Character poblacionClave, Character mujerGestante, boolean hijoMadreVih, Character tuberculosis, Character diagnosticoInfecci├│nVih, Date fechaDiagnosticoGestacion, Date fechaTamizajeVihT1, Date fechaTamizajeVihT2, Date fechaTamizajeVihT3, Date fechaTamizajeVihParto, Character mujeDiagVihGest, Integer edadGestDiagVih, Character tratamientoVihGestacion, int edadGestacionalTar, Character tarIntraparto, Character resultadoGestacionVih, Date fechCulmGestVih, Character supresionLactanciaVih, String tipoIdenReciNaci, String numeIdenReciNaci, String tipoIdentificacionMadreVih, String numeIdenMadrVih, Character madrDiagConfVih, Character profReciNaciExpuVih, Character suministroFormulaLactea, Date fechaCargaViralHijoP1, String resultadoCargaViralHijoP1, Date fechaCargaViralHijoP2, String resultadoCargaViralHijoP2, Date fechaCargaViralHijoP3, String resultadoCargaViralHijoP3, Character condicionFinHijo, Date fechDiagTurb, Date fechTamiTurbVih, Date fechaPruebaPresuntivaVih, String pruebaPresuntivaVih, Date fechaConfirmacionVih, Character reportePersonaVihAfiliada, String entidadReportante, Date fechaInicioAtencionVih, Character viaTransmisionVih, Character estadioClinico, Integer valoLinfTcd4Diag, int contLinfTcd4Diag, Character realCargViraDiag, int cargaViralDiagnostico, Date fechaInicioTar, int medicamento1InicioTar, int medicamento2InicioTar, int medicamento3InicioTar, int medicamento4InicioTar, int medicamento5InicioTar, Character linfocitosTcd4Tar, int valorLinfocitosTcd4Tar, Character realizoCargaViralTar, int cargaViralTar, String motivoInicioTar, Character coinfeccionVhbInicioTar, Character coinfeccionVhcInicioTar, Character coinTubeInicTar, int numMesesDispensoTar, int numConsultasVihTar, Character cambiosEsquemaTar, Date fechaCambioMedicamentoTar, String causaCambioMedicamentoTar, String medicamento1Cambio, String medicamento2Cambio, String medicamento3Cambio, String medicamento4Cambio, Character fallasTar, int numFallasTar, Character infeccionesBacterianas, Character candidiasis, Character tubePulmExtr, Character cancerCervixInvasivo, Character coccidioidomicosis, String citomegalovirus, Character retinitis, Character herpes, Character diarrea, Character histoplasmosis, Character linfoma, Character neumon├şaPneumocystis, Character neumon├şaRecurrente, Character septicemiaSalmonella, Character infecci├│nDiseminada, Character criptococosisExtrapulmonar, Character sarcomakaposi, Character sindromeDesgaste, Character leucoencefalopatia, Character toxoplasmosisCerebral, Character demenciaAsociadaVih, Character neumon├şaIntersticial, String codigoSedeIps, Date fechaIngresoIps, int municipioIps, String tipoPersonaAtiende, Character valoracionInfectologo, Date fechaUltimaGenotipificaci├│n, Character estadioClinicoActual, Date fechaUltimoColesterol, int resultadoUltimoColesterol, Date fechaNivelTrigliceridos, int resultadoNivelTrigliceridos, Date fechaHemoglobinaSerica, float resultadoHemoglobinaSerica, Date fechaAtl, int resultadoAtl, Date fechUltiCreaSeri, String resuUltiCreaSeri, Date fechUltiGlucSeriEnAyun, String resuUltiGlucSeriEnAyun, Date fechUltiMediPesoCorpPeri, String resuUltiMediPesoCorp, int talla, Character neuropatiaPeriferica, Character lipoatrofiaOLiodistrofia, Character coinHepaBCron, Character coinHepaCCron, String otuvoCoinTubeActi, Character tipoTuberculosisActiva, Character personaCoinfeccionTbVih, Date fechInicTratAnti, String mediUnoTratAntiCoin, String mediDosTratAntiCoin, String mediTresTratAntiCoin, String mediCuatTratAntiCoin, String mediCincTratAntiCoin, String mediSeisTratAntiCoin, String mediSietTratAntiCoin, String mediOchoTratAntiCoin, String mediNuevTratAntiCoin, Date fechEnTermElTratAnti, String condEgreTratAnti, Character cirrosisHepatica, Character enfeRenaCronVihb, Character enfermedadCoronaria, Character otrInfTraSexDifSifHep, Character neoplasiaNoRelacionadaSida, Character discapacidadFuncional, Date fecUltConLinCd4PerObs, String valUltConLinCd4PerObs, Date fehaUltiCargViraPeriObse, String valoUltiCargViraPeriObse, Character recibeTar, Date fehaInicMediReciPersVive, String medicamentoUnoTarActual, String medicamentoDosTarActual, String medicamentoTresTarActual, String medicamentoCuatroTarActual, String medicamentoCincoTarActual, String medicamentoSeisTarActual, String numeMeseDispFormCompTar, Integer numeCondSumiUltiAnio, Character metoPlanFamiPersViveVih, Character vacunacionContraHepatitsA, Character vacunacionContraHepatitsB, Character vacunacionContraNeumococo, Character tamiTubeActiUltiCons, Character ppdPrueEquiIdenTube, String reciTratTubeLate, Character tamiSifiEnPersViveVih, Character recibioTratamientoSifilis, String tamiVihAnogPersViveVih, Character tamiHepaBPersViveVih, Character tamiHepaCPersViveVih, String resuEvalRiesCardPersVive, Character profilaxisMac, Character profCripNeof, Character profPneuJiro, Integer costTotaAtenNoHosp, Integer costTotaAtenHosp, Integer numeHospPeriRelaElVih, String noveUsuaRespAlRepoAnte, Date fechasafiliacionEntidad, String entiTrasUsuaVihDesa, WriteCmPaciente idPaciente) {
        this.poblacionClave = poblacionClave;
        this.mujerGestante = mujerGestante;
        this.hijoMadreVih = hijoMadreVih;
        this.tuberculosis = tuberculosis;
        this.diagnosticoInfecci├│nVih = diagnosticoInfecci├│nVih;
        this.fechaDiagnosticoGestacion = fechaDiagnosticoGestacion;
        this.fechaTamizajeVihT1 = fechaTamizajeVihT1;
        this.fechaTamizajeVihT2 = fechaTamizajeVihT2;
        this.fechaTamizajeVihT3 = fechaTamizajeVihT3;
        this.fechaTamizajeVihParto = fechaTamizajeVihParto;
        this.mujeDiagVihGest = mujeDiagVihGest;
        this.edadGestDiagVih = edadGestDiagVih;
        this.tratamientoVihGestacion = tratamientoVihGestacion;
        this.edadGestacionalTar = edadGestacionalTar;
        this.tarIntraparto = tarIntraparto;
        this.resultadoGestacionVih = resultadoGestacionVih;
        this.fechCulmGestVih = fechCulmGestVih;
        this.supresionLactanciaVih = supresionLactanciaVih;
        this.tipoIdenReciNaci = tipoIdenReciNaci;
        this.numeIdenReciNaci = numeIdenReciNaci;
        this.tipoIdentificacionMadreVih = tipoIdentificacionMadreVih;
        this.numeIdenMadrVih = numeIdenMadrVih;
        this.madrDiagConfVih = madrDiagConfVih;
        this.profReciNaciExpuVih = profReciNaciExpuVih;
        this.suministroFormulaLactea = suministroFormulaLactea;
        this.fechaCargaViralHijoP1 = fechaCargaViralHijoP1;
        this.resultadoCargaViralHijoP1 = resultadoCargaViralHijoP1;
        this.fechaCargaViralHijoP2 = fechaCargaViralHijoP2;
        this.resultadoCargaViralHijoP2 = resultadoCargaViralHijoP2;
        this.fechaCargaViralHijoP3 = fechaCargaViralHijoP3;
        this.resultadoCargaViralHijoP3 = resultadoCargaViralHijoP3;
        this.condicionFinHijo = condicionFinHijo;
        this.fechDiagTurb = fechDiagTurb;
        this.fechTamiTurbVih = fechTamiTurbVih;
        this.fechaPruebaPresuntivaVih = fechaPruebaPresuntivaVih;
        this.pruebaPresuntivaVih = pruebaPresuntivaVih;
        this.fechaConfirmacionVih = fechaConfirmacionVih;
        this.reportePersonaVihAfiliada = reportePersonaVihAfiliada;
        this.entidadReportante = entidadReportante;
        this.fechaInicioAtencionVih = fechaInicioAtencionVih;
        this.viaTransmisionVih = viaTransmisionVih;
        this.estadioClinico = estadioClinico;
        this.valoLinfTcd4Diag = valoLinfTcd4Diag;
        this.contLinfTcd4Diag = contLinfTcd4Diag;
        this.realCargViraDiag = realCargViraDiag;
        this.cargaViralDiagnostico = cargaViralDiagnostico;
        this.fechaInicioTar = fechaInicioTar;
        this.medicamento1InicioTar = medicamento1InicioTar;
        this.medicamento2InicioTar = medicamento2InicioTar;
        this.medicamento3InicioTar = medicamento3InicioTar;
        this.medicamento4InicioTar = medicamento4InicioTar;
        this.medicamento5InicioTar = medicamento5InicioTar;
        this.linfocitosTcd4Tar = linfocitosTcd4Tar;
        this.valorLinfocitosTcd4Tar = valorLinfocitosTcd4Tar;
        this.realizoCargaViralTar = realizoCargaViralTar;
        this.cargaViralTar = cargaViralTar;
        this.motivoInicioTar = motivoInicioTar;
        this.coinfeccionVhbInicioTar = coinfeccionVhbInicioTar;
        this.coinfeccionVhcInicioTar = coinfeccionVhcInicioTar;
        this.coinTubeInicTar = coinTubeInicTar;
        this.numMesesDispensoTar = numMesesDispensoTar;
        this.numConsultasVihTar = numConsultasVihTar;
        this.cambiosEsquemaTar = cambiosEsquemaTar;
        this.fechaCambioMedicamentoTar = fechaCambioMedicamentoTar;
        this.causaCambioMedicamentoTar = causaCambioMedicamentoTar;
        this.medicamento1Cambio = medicamento1Cambio;
        this.medicamento2Cambio = medicamento2Cambio;
        this.medicamento3Cambio = medicamento3Cambio;
        this.medicamento4Cambio = medicamento4Cambio;
        this.fallasTar = fallasTar;
        this.numFallasTar = numFallasTar;
        this.infeccionesBacterianas = infeccionesBacterianas;
        this.candidiasis = candidiasis;
        this.tubePulmExtr = tubePulmExtr;
        this.cancerCervixInvasivo = cancerCervixInvasivo;
        this.coccidioidomicosis = coccidioidomicosis;
        this.citomegalovirus = citomegalovirus;
        this.retinitis = retinitis;
        this.herpes = herpes;
        this.diarrea = diarrea;
        this.histoplasmosis = histoplasmosis;
        this.linfoma = linfoma;
        this.neumon├şaPneumocystis = neumon├şaPneumocystis;
        this.neumon├şaRecurrente = neumon├şaRecurrente;
        this.septicemiaSalmonella = septicemiaSalmonella;
        this.infecci├│nDiseminada = infecci├│nDiseminada;
        this.criptococosisExtrapulmonar = criptococosisExtrapulmonar;
        this.sarcomakaposi = sarcomakaposi;
        this.sindromeDesgaste = sindromeDesgaste;
        this.leucoencefalopatia = leucoencefalopatia;
        this.toxoplasmosisCerebral = toxoplasmosisCerebral;
        this.demenciaAsociadaVih = demenciaAsociadaVih;
        this.neumon├şaIntersticial = neumon├şaIntersticial;
        this.codigoSedeIps = codigoSedeIps;
        this.fechaIngresoIps = fechaIngresoIps;
        this.municipioIps = municipioIps;
        this.tipoPersonaAtiende = tipoPersonaAtiende;
        this.valoracionInfectologo = valoracionInfectologo;
        this.fechaUltimaGenotipificaci├│n = fechaUltimaGenotipificaci├│n;
        this.estadioClinicoActual = estadioClinicoActual;
        this.fechaUltimoColesterol = fechaUltimoColesterol;
        this.resultadoUltimoColesterol = resultadoUltimoColesterol;
        this.fechaNivelTrigliceridos = fechaNivelTrigliceridos;
        this.resultadoNivelTrigliceridos = resultadoNivelTrigliceridos;
        this.fechaHemoglobinaSerica = fechaHemoglobinaSerica;
        this.resultadoHemoglobinaSerica = resultadoHemoglobinaSerica;
        this.fechaAtl = fechaAtl;
        this.resultadoAtl = resultadoAtl;
        this.fechUltiCreaSeri = fechUltiCreaSeri;
        this.resuUltiCreaSeri = resuUltiCreaSeri;
        this.fechUltiGlucSeriEnAyun = fechUltiGlucSeriEnAyun;
        this.resuUltiGlucSeriEnAyun = resuUltiGlucSeriEnAyun;
        this.fechUltiMediPesoCorpPeri = fechUltiMediPesoCorpPeri;
        this.resuUltiMediPesoCorp = resuUltiMediPesoCorp;
        this.talla = talla;
        this.neuropatiaPeriferica = neuropatiaPeriferica;
        this.lipoatrofiaOLiodistrofia = lipoatrofiaOLiodistrofia;
        this.coinHepaBCron = coinHepaBCron;
        this.coinHepaCCron = coinHepaCCron;
        this.otuvoCoinTubeActi = otuvoCoinTubeActi;
        this.tipoTuberculosisActiva = tipoTuberculosisActiva;
        this.personaCoinfeccionTbVih = personaCoinfeccionTbVih;
        this.fechInicTratAnti = fechInicTratAnti;
        this.mediUnoTratAntiCoin = mediUnoTratAntiCoin;
        this.mediDosTratAntiCoin = mediDosTratAntiCoin;
        this.mediTresTratAntiCoin = mediTresTratAntiCoin;
        this.mediCuatTratAntiCoin = mediCuatTratAntiCoin;
        this.mediCincTratAntiCoin = mediCincTratAntiCoin;
        this.mediSeisTratAntiCoin = mediSeisTratAntiCoin;
        this.mediSietTratAntiCoin = mediSietTratAntiCoin;
        this.mediOchoTratAntiCoin = mediOchoTratAntiCoin;
        this.mediNuevTratAntiCoin = mediNuevTratAntiCoin;
        this.fechEnTermElTratAnti = fechEnTermElTratAnti;
        this.condEgreTratAnti = condEgreTratAnti;
        this.cirrosisHepatica = cirrosisHepatica;
        this.enfeRenaCronVihb = enfeRenaCronVihb;
        this.enfermedadCoronaria = enfermedadCoronaria;
        this.otrInfTraSexDifSifHep = otrInfTraSexDifSifHep;
        this.neoplasiaNoRelacionadaSida = neoplasiaNoRelacionadaSida;
        this.discapacidadFuncional = discapacidadFuncional;
        this.fecUltConLinCd4PerObs = fecUltConLinCd4PerObs;
        this.valUltConLinCd4PerObs = valUltConLinCd4PerObs;
        this.fehaUltiCargViraPeriObse = fehaUltiCargViraPeriObse;
        this.valoUltiCargViraPeriObse = valoUltiCargViraPeriObse;
        this.recibeTar = recibeTar;
        this.fehaInicMediReciPersVive = fehaInicMediReciPersVive;
        this.medicamentoUnoTarActual = medicamentoUnoTarActual;
        this.medicamentoDosTarActual = medicamentoDosTarActual;
        this.medicamentoTresTarActual = medicamentoTresTarActual;
        this.medicamentoCuatroTarActual = medicamentoCuatroTarActual;
        this.medicamentoCincoTarActual = medicamentoCincoTarActual;
        this.medicamentoSeisTarActual = medicamentoSeisTarActual;
        this.numeMeseDispFormCompTar = numeMeseDispFormCompTar;
        this.numeCondSumiUltiAnio = numeCondSumiUltiAnio;
        this.metoPlanFamiPersViveVih = metoPlanFamiPersViveVih;
        this.vacunacionContraHepatitsA = vacunacionContraHepatitsA;
        this.vacunacionContraHepatitsB = vacunacionContraHepatitsB;
        this.vacunacionContraNeumococo = vacunacionContraNeumococo;
        this.tamiTubeActiUltiCons = tamiTubeActiUltiCons;
        this.ppdPrueEquiIdenTube = ppdPrueEquiIdenTube;
        this.reciTratTubeLate = reciTratTubeLate;
        this.tamiSifiEnPersViveVih = tamiSifiEnPersViveVih;
        this.recibioTratamientoSifilis = recibioTratamientoSifilis;
        this.tamiVihAnogPersViveVih = tamiVihAnogPersViveVih;
        this.tamiHepaBPersViveVih = tamiHepaBPersViveVih;
        this.tamiHepaCPersViveVih = tamiHepaCPersViveVih;
        this.resuEvalRiesCardPersVive = resuEvalRiesCardPersVive;
        this.profilaxisMac = profilaxisMac;
        this.profCripNeof = profCripNeof;
        this.profPneuJiro = profPneuJiro;
        this.costTotaAtenNoHosp = costTotaAtenNoHosp;
        this.costTotaAtenHosp = costTotaAtenHosp;
        this.numeHospPeriRelaElVih = numeHospPeriRelaElVih;
        this.noveUsuaRespAlRepoAnte = noveUsuaRespAlRepoAnte;
        this.fechasafiliacionEntidad = fechasafiliacionEntidad;
        this.entiTrasUsuaVihDesa = entiTrasUsuaVihDesa;
        this.idPaciente = idPaciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getPoblacionClave() {
        return poblacionClave;
    }

    public void setPoblacionClave(Character poblacionClave) {
        this.poblacionClave = poblacionClave;
    }

    public Character getMujerGestante() {
        return mujerGestante;
    }

    public void setMujerGestante(Character mujerGestante) {
        this.mujerGestante = mujerGestante;
    }

    public boolean getHijoMadreVih() {
        return hijoMadreVih;
    }

    public void setHijoMadreVih(boolean hijoMadreVih) {
        this.hijoMadreVih = hijoMadreVih;
    }

    public Character getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(Character tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public Character getDiagnosticoInfecci├│nVih() {
        return diagnosticoInfecci├│nVih;
    }

    public void setDiagnosticoInfecci├│nVih(Character diagnosticoInfecci├│nVih) {
        this.diagnosticoInfecci├│nVih = diagnosticoInfecci├│nVih;
    }

    public Date getFechaDiagnosticoGestacion() {
        return fechaDiagnosticoGestacion;
    }

    public void setFechaDiagnosticoGestacion(Date fechaDiagnosticoGestacion) {
        this.fechaDiagnosticoGestacion = fechaDiagnosticoGestacion;
    }

    public Date getFechaTamizajeVihT1() {
        return fechaTamizajeVihT1;
    }

    public void setFechaTamizajeVihT1(Date fechaTamizajeVihT1) {
        this.fechaTamizajeVihT1 = fechaTamizajeVihT1;
    }

    public Date getFechaTamizajeVihT2() {
        return fechaTamizajeVihT2;
    }

    public void setFechaTamizajeVihT2(Date fechaTamizajeVihT2) {
        this.fechaTamizajeVihT2 = fechaTamizajeVihT2;
    }

    public Date getFechaTamizajeVihT3() {
        return fechaTamizajeVihT3;
    }

    public void setFechaTamizajeVihT3(Date fechaTamizajeVihT3) {
        this.fechaTamizajeVihT3 = fechaTamizajeVihT3;
    }

    public Date getFechaTamizajeVihParto() {
        return fechaTamizajeVihParto;
    }

    public void setFechaTamizajeVihParto(Date fechaTamizajeVihParto) {
        this.fechaTamizajeVihParto = fechaTamizajeVihParto;
    }

    public Character getMujeDiagVihGest() {
        return mujeDiagVihGest;
    }

    public void setMujeDiagVihGest(Character mujeDiagVihGest) {
        this.mujeDiagVihGest = mujeDiagVihGest;
    }

    public Integer getEdadGestDiagVih() {
        return edadGestDiagVih;
    }

    public void setEdadGestDiagVih(Integer edadGestDiagVih) {
        this.edadGestDiagVih = edadGestDiagVih;
    }

    public Character getTratamientoVihGestacion() {
        return tratamientoVihGestacion;
    }

    public void setTratamientoVihGestacion(Character tratamientoVihGestacion) {
        this.tratamientoVihGestacion = tratamientoVihGestacion;
    }

    public int getEdadGestacionalTar() {
        return edadGestacionalTar;
    }

    public void setEdadGestacionalTar(int edadGestacionalTar) {
        this.edadGestacionalTar = edadGestacionalTar;
    }

    public Character getTarIntraparto() {
        return tarIntraparto;
    }

    public void setTarIntraparto(Character tarIntraparto) {
        this.tarIntraparto = tarIntraparto;
    }

    public Character getResultadoGestacionVih() {
        return resultadoGestacionVih;
    }

    public void setResultadoGestacionVih(Character resultadoGestacionVih) {
        this.resultadoGestacionVih = resultadoGestacionVih;
    }

    public Date getFechCulmGestVih() {
        return fechCulmGestVih;
    }

    public void setFechCulmGestVih(Date fechCulmGestVih) {
        this.fechCulmGestVih = fechCulmGestVih;
    }

    public Character getSupresionLactanciaVih() {
        return supresionLactanciaVih;
    }

    public void setSupresionLactanciaVih(Character supresionLactanciaVih) {
        this.supresionLactanciaVih = supresionLactanciaVih;
    }

    public String getTipoIdenReciNaci() {
        return tipoIdenReciNaci;
    }

    public void setTipoIdenReciNaci(String tipoIdenReciNaci) {
        this.tipoIdenReciNaci = tipoIdenReciNaci;
    }

    public String getNumeIdenReciNaci() {
        return numeIdenReciNaci;
    }

    public void setNumeIdenReciNaci(String numeIdenReciNaci) {
        this.numeIdenReciNaci = numeIdenReciNaci;
    }

    public String getTipoIdentificacionMadreVih() {
        return tipoIdentificacionMadreVih;
    }

    public void setTipoIdentificacionMadreVih(String tipoIdentificacionMadreVih) {
        this.tipoIdentificacionMadreVih = tipoIdentificacionMadreVih;
    }

    public String getNumeIdenMadrVih() {
        return numeIdenMadrVih;
    }

    public void setNumeIdenMadrVih(String numeIdenMadrVih) {
        this.numeIdenMadrVih = numeIdenMadrVih;
    }

    public Character getMadrDiagConfVih() {
        return madrDiagConfVih;
    }

    public void setMadrDiagConfVih(Character madrDiagConfVih) {
        this.madrDiagConfVih = madrDiagConfVih;
    }

    public Character getProfReciNaciExpuVih() {
        return profReciNaciExpuVih;
    }

    public void setProfReciNaciExpuVih(Character profReciNaciExpuVih) {
        this.profReciNaciExpuVih = profReciNaciExpuVih;
    }

    public Character getSuministroFormulaLactea() {
        return suministroFormulaLactea;
    }

    public void setSuministroFormulaLactea(Character suministroFormulaLactea) {
        this.suministroFormulaLactea = suministroFormulaLactea;
    }

    public Date getFechaCargaViralHijoP1() {
        return fechaCargaViralHijoP1;
    }

    public void setFechaCargaViralHijoP1(Date fechaCargaViralHijoP1) {
        this.fechaCargaViralHijoP1 = fechaCargaViralHijoP1;
    }

    public String getResultadoCargaViralHijoP1() {
        return resultadoCargaViralHijoP1;
    }

    public void setResultadoCargaViralHijoP1(String resultadoCargaViralHijoP1) {
        this.resultadoCargaViralHijoP1 = resultadoCargaViralHijoP1;
    }

    public Date getFechaCargaViralHijoP2() {
        return fechaCargaViralHijoP2;
    }

    public void setFechaCargaViralHijoP2(Date fechaCargaViralHijoP2) {
        this.fechaCargaViralHijoP2 = fechaCargaViralHijoP2;
    }

    public String getResultadoCargaViralHijoP2() {
        return resultadoCargaViralHijoP2;
    }

    public void setResultadoCargaViralHijoP2(String resultadoCargaViralHijoP2) {
        this.resultadoCargaViralHijoP2 = resultadoCargaViralHijoP2;
    }

    public Date getFechaCargaViralHijoP3() {
        return fechaCargaViralHijoP3;
    }

    public void setFechaCargaViralHijoP3(Date fechaCargaViralHijoP3) {
        this.fechaCargaViralHijoP3 = fechaCargaViralHijoP3;
    }

    public String getResultadoCargaViralHijoP3() {
        return resultadoCargaViralHijoP3;
    }

    public void setResultadoCargaViralHijoP3(String resultadoCargaViralHijoP3) {
        this.resultadoCargaViralHijoP3 = resultadoCargaViralHijoP3;
    }

    public Character getCondicionFinHijo() {
        return condicionFinHijo;
    }

    public void setCondicionFinHijo(Character condicionFinHijo) {
        this.condicionFinHijo = condicionFinHijo;
    }

    public Date getFechDiagTurb() {
        return fechDiagTurb;
    }

    public void setFechDiagTurb(Date fechDiagTurb) {
        this.fechDiagTurb = fechDiagTurb;
    }

    public Date getFechTamiTurbVih() {
        return fechTamiTurbVih;
    }

    public void setFechTamiTurbVih(Date fechTamiTurbVih) {
        this.fechTamiTurbVih = fechTamiTurbVih;
    }

    public Date getFechaPruebaPresuntivaVih() {
        return fechaPruebaPresuntivaVih;
    }

    public void setFechaPruebaPresuntivaVih(Date fechaPruebaPresuntivaVih) {
        this.fechaPruebaPresuntivaVih = fechaPruebaPresuntivaVih;
    }

    public String getPruebaPresuntivaVih() {
        return pruebaPresuntivaVih;
    }

    public void setPruebaPresuntivaVih(String pruebaPresuntivaVih) {
        this.pruebaPresuntivaVih = pruebaPresuntivaVih;
    }

    public Date getFechaConfirmacionVih() {
        return fechaConfirmacionVih;
    }

    public void setFechaConfirmacionVih(Date fechaConfirmacionVih) {
        this.fechaConfirmacionVih = fechaConfirmacionVih;
    }

    public Character getReportePersonaVihAfiliada() {
        return reportePersonaVihAfiliada;
    }

    public void setReportePersonaVihAfiliada(Character reportePersonaVihAfiliada) {
        this.reportePersonaVihAfiliada = reportePersonaVihAfiliada;
    }

    public String getEntidadReportante() {
        return entidadReportante;
    }

    public void setEntidadReportante(String entidadReportante) {
        this.entidadReportante = entidadReportante;
    }

    public Date getFechaInicioAtencionVih() {
        return fechaInicioAtencionVih;
    }

    public void setFechaInicioAtencionVih(Date fechaInicioAtencionVih) {
        this.fechaInicioAtencionVih = fechaInicioAtencionVih;
    }

    public Character getViaTransmisionVih() {
        return viaTransmisionVih;
    }

    public void setViaTransmisionVih(Character viaTransmisionVih) {
        this.viaTransmisionVih = viaTransmisionVih;
    }

    public Character getEstadioClinico() {
        return estadioClinico;
    }

    public void setEstadioClinico(Character estadioClinico) {
        this.estadioClinico = estadioClinico;
    }

    public Integer getValoLinfTcd4Diag() {
        return valoLinfTcd4Diag;
    }

    public void setValoLinfTcd4Diag(Integer valoLinfTcd4Diag) {
        this.valoLinfTcd4Diag = valoLinfTcd4Diag;
    }

    public int getContLinfTcd4Diag() {
        return contLinfTcd4Diag;
    }

    public void setContLinfTcd4Diag(int contLinfTcd4Diag) {
        this.contLinfTcd4Diag = contLinfTcd4Diag;
    }

    public Character getRealCargViraDiag() {
        return realCargViraDiag;
    }

    public void setRealCargViraDiag(Character realCargViraDiag) {
        this.realCargViraDiag = realCargViraDiag;
    }

    public int getCargaViralDiagnostico() {
        return cargaViralDiagnostico;
    }

    public void setCargaViralDiagnostico(int cargaViralDiagnostico) {
        this.cargaViralDiagnostico = cargaViralDiagnostico;
    }

    public Date getFechaInicioTar() {
        return fechaInicioTar;
    }

    public void setFechaInicioTar(Date fechaInicioTar) {
        this.fechaInicioTar = fechaInicioTar;
    }

    public int getMedicamento1InicioTar() {
        return medicamento1InicioTar;
    }

    public void setMedicamento1InicioTar(int medicamento1InicioTar) {
        this.medicamento1InicioTar = medicamento1InicioTar;
    }

    public int getMedicamento2InicioTar() {
        return medicamento2InicioTar;
    }

    public void setMedicamento2InicioTar(int medicamento2InicioTar) {
        this.medicamento2InicioTar = medicamento2InicioTar;
    }

    public int getMedicamento3InicioTar() {
        return medicamento3InicioTar;
    }

    public void setMedicamento3InicioTar(int medicamento3InicioTar) {
        this.medicamento3InicioTar = medicamento3InicioTar;
    }

    public int getMedicamento4InicioTar() {
        return medicamento4InicioTar;
    }

    public void setMedicamento4InicioTar(int medicamento4InicioTar) {
        this.medicamento4InicioTar = medicamento4InicioTar;
    }

    public int getMedicamento5InicioTar() {
        return medicamento5InicioTar;
    }

    public void setMedicamento5InicioTar(int medicamento5InicioTar) {
        this.medicamento5InicioTar = medicamento5InicioTar;
    }

    public Character getLinfocitosTcd4Tar() {
        return linfocitosTcd4Tar;
    }

    public void setLinfocitosTcd4Tar(Character linfocitosTcd4Tar) {
        this.linfocitosTcd4Tar = linfocitosTcd4Tar;
    }

    public int getValorLinfocitosTcd4Tar() {
        return valorLinfocitosTcd4Tar;
    }

    public void setValorLinfocitosTcd4Tar(int valorLinfocitosTcd4Tar) {
        this.valorLinfocitosTcd4Tar = valorLinfocitosTcd4Tar;
    }

    public Character getRealizoCargaViralTar() {
        return realizoCargaViralTar;
    }

    public void setRealizoCargaViralTar(Character realizoCargaViralTar) {
        this.realizoCargaViralTar = realizoCargaViralTar;
    }

    public int getCargaViralTar() {
        return cargaViralTar;
    }

    public void setCargaViralTar(int cargaViralTar) {
        this.cargaViralTar = cargaViralTar;
    }

    public String getMotivoInicioTar() {
        return motivoInicioTar;
    }

    public void setMotivoInicioTar(String motivoInicioTar) {
        this.motivoInicioTar = motivoInicioTar;
    }

    public Character getCoinfeccionVhbInicioTar() {
        return coinfeccionVhbInicioTar;
    }

    public void setCoinfeccionVhbInicioTar(Character coinfeccionVhbInicioTar) {
        this.coinfeccionVhbInicioTar = coinfeccionVhbInicioTar;
    }

    public Character getCoinfeccionVhcInicioTar() {
        return coinfeccionVhcInicioTar;
    }

    public void setCoinfeccionVhcInicioTar(Character coinfeccionVhcInicioTar) {
        this.coinfeccionVhcInicioTar = coinfeccionVhcInicioTar;
    }

    public Character getCoinTubeInicTar() {
        return coinTubeInicTar;
    }

    public void setCoinTubeInicTar(Character coinTubeInicTar) {
        this.coinTubeInicTar = coinTubeInicTar;
    }

    public int getNumMesesDispensoTar() {
        return numMesesDispensoTar;
    }

    public void setNumMesesDispensoTar(int numMesesDispensoTar) {
        this.numMesesDispensoTar = numMesesDispensoTar;
    }

    public int getNumConsultasVihTar() {
        return numConsultasVihTar;
    }

    public void setNumConsultasVihTar(int numConsultasVihTar) {
        this.numConsultasVihTar = numConsultasVihTar;
    }

    public Character getCambiosEsquemaTar() {
        return cambiosEsquemaTar;
    }

    public void setCambiosEsquemaTar(Character cambiosEsquemaTar) {
        this.cambiosEsquemaTar = cambiosEsquemaTar;
    }

    public Date getFechaCambioMedicamentoTar() {
        return fechaCambioMedicamentoTar;
    }

    public void setFechaCambioMedicamentoTar(Date fechaCambioMedicamentoTar) {
        this.fechaCambioMedicamentoTar = fechaCambioMedicamentoTar;
    }

    public String getCausaCambioMedicamentoTar() {
        return causaCambioMedicamentoTar;
    }

    public void setCausaCambioMedicamentoTar(String causaCambioMedicamentoTar) {
        this.causaCambioMedicamentoTar = causaCambioMedicamentoTar;
    }

    public String getMedicamento1Cambio() {
        return medicamento1Cambio;
    }

    public void setMedicamento1Cambio(String medicamento1Cambio) {
        this.medicamento1Cambio = medicamento1Cambio;
    }

    public String getMedicamento2Cambio() {
        return medicamento2Cambio;
    }

    public void setMedicamento2Cambio(String medicamento2Cambio) {
        this.medicamento2Cambio = medicamento2Cambio;
    }

    public String getMedicamento3Cambio() {
        return medicamento3Cambio;
    }

    public void setMedicamento3Cambio(String medicamento3Cambio) {
        this.medicamento3Cambio = medicamento3Cambio;
    }

    public String getMedicamento4Cambio() {
        return medicamento4Cambio;
    }

    public void setMedicamento4Cambio(String medicamento4Cambio) {
        this.medicamento4Cambio = medicamento4Cambio;
    }

    public Character getFallasTar() {
        return fallasTar;
    }

    public void setFallasTar(Character fallasTar) {
        this.fallasTar = fallasTar;
    }

    public int getNumFallasTar() {
        return numFallasTar;
    }

    public void setNumFallasTar(int numFallasTar) {
        this.numFallasTar = numFallasTar;
    }

    public Character getInfeccionesBacterianas() {
        return infeccionesBacterianas;
    }

    public void setInfeccionesBacterianas(Character infeccionesBacterianas) {
        this.infeccionesBacterianas = infeccionesBacterianas;
    }

    public Character getCandidiasis() {
        return candidiasis;
    }

    public void setCandidiasis(Character candidiasis) {
        this.candidiasis = candidiasis;
    }

    public Character getTubePulmExtr() {
        return tubePulmExtr;
    }

    public void setTubePulmExtr(Character tubePulmExtr) {
        this.tubePulmExtr = tubePulmExtr;
    }

    public Character getCancerCervixInvasivo() {
        return cancerCervixInvasivo;
    }

    public void setCancerCervixInvasivo(Character cancerCervixInvasivo) {
        this.cancerCervixInvasivo = cancerCervixInvasivo;
    }

    public Character getCoccidioidomicosis() {
        return coccidioidomicosis;
    }

    public void setCoccidioidomicosis(Character coccidioidomicosis) {
        this.coccidioidomicosis = coccidioidomicosis;
    }

    public String getCitomegalovirus() {
        return citomegalovirus;
    }

    public void setCitomegalovirus(String citomegalovirus) {
        this.citomegalovirus = citomegalovirus;
    }

    public Character getRetinitis() {
        return retinitis;
    }

    public void setRetinitis(Character retinitis) {
        this.retinitis = retinitis;
    }

    public Character getHerpes() {
        return herpes;
    }

    public void setHerpes(Character herpes) {
        this.herpes = herpes;
    }

    public Character getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(Character diarrea) {
        this.diarrea = diarrea;
    }

    public Character getHistoplasmosis() {
        return histoplasmosis;
    }

    public void setHistoplasmosis(Character histoplasmosis) {
        this.histoplasmosis = histoplasmosis;
    }

    public Character getLinfoma() {
        return linfoma;
    }

    public void setLinfoma(Character linfoma) {
        this.linfoma = linfoma;
    }

    public Character getNeumon├şaPneumocystis() {
        return neumon├şaPneumocystis;
    }

    public void setNeumon├şaPneumocystis(Character neumon├şaPneumocystis) {
        this.neumon├şaPneumocystis = neumon├şaPneumocystis;
    }

    public Character getNeumon├şaRecurrente() {
        return neumon├şaRecurrente;
    }

    public void setNeumon├şaRecurrente(Character neumon├şaRecurrente) {
        this.neumon├şaRecurrente = neumon├şaRecurrente;
    }

    public Character getSepticemiaSalmonella() {
        return septicemiaSalmonella;
    }

    public void setSepticemiaSalmonella(Character septicemiaSalmonella) {
        this.septicemiaSalmonella = septicemiaSalmonella;
    }

    public Character getInfecci├│nDiseminada() {
        return infecci├│nDiseminada;
    }

    public void setInfecci├│nDiseminada(Character infecci├│nDiseminada) {
        this.infecci├│nDiseminada = infecci├│nDiseminada;
    }

    public Character getCriptococosisExtrapulmonar() {
        return criptococosisExtrapulmonar;
    }

    public void setCriptococosisExtrapulmonar(Character criptococosisExtrapulmonar) {
        this.criptococosisExtrapulmonar = criptococosisExtrapulmonar;
    }

    public Character getSarcomakaposi() {
        return sarcomakaposi;
    }

    public void setSarcomakaposi(Character sarcomakaposi) {
        this.sarcomakaposi = sarcomakaposi;
    }

    public Character getSindromeDesgaste() {
        return sindromeDesgaste;
    }

    public void setSindromeDesgaste(Character sindromeDesgaste) {
        this.sindromeDesgaste = sindromeDesgaste;
    }

    public Character getLeucoencefalopatia() {
        return leucoencefalopatia;
    }

    public void setLeucoencefalopatia(Character leucoencefalopatia) {
        this.leucoencefalopatia = leucoencefalopatia;
    }

    public Character getToxoplasmosisCerebral() {
        return toxoplasmosisCerebral;
    }

    public void setToxoplasmosisCerebral(Character toxoplasmosisCerebral) {
        this.toxoplasmosisCerebral = toxoplasmosisCerebral;
    }

    public Character getDemenciaAsociadaVih() {
        return demenciaAsociadaVih;
    }

    public void setDemenciaAsociadaVih(Character demenciaAsociadaVih) {
        this.demenciaAsociadaVih = demenciaAsociadaVih;
    }

    public Character getNeumon├şaIntersticial() {
        return neumon├şaIntersticial;
    }

    public void setNeumon├şaIntersticial(Character neumon├şaIntersticial) {
        this.neumon├şaIntersticial = neumon├şaIntersticial;
    }

    public String getCodigoSedeIps() {
        return codigoSedeIps;
    }

    public void setCodigoSedeIps(String codigoSedeIps) {
        this.codigoSedeIps = codigoSedeIps;
    }

    public Date getFechaIngresoIps() {
        return fechaIngresoIps;
    }

    public void setFechaIngresoIps(Date fechaIngresoIps) {
        this.fechaIngresoIps = fechaIngresoIps;
    }

    public int getMunicipioIps() {
        return municipioIps;
    }

    public void setMunicipioIps(int municipioIps) {
        this.municipioIps = municipioIps;
    }

    public String getTipoPersonaAtiende() {
        return tipoPersonaAtiende;
    }

    public void setTipoPersonaAtiende(String tipoPersonaAtiende) {
        this.tipoPersonaAtiende = tipoPersonaAtiende;
    }

    public Character getValoracionInfectologo() {
        return valoracionInfectologo;
    }

    public void setValoracionInfectologo(Character valoracionInfectologo) {
        this.valoracionInfectologo = valoracionInfectologo;
    }

    public Date getFechaUltimaGenotipificaci├│n() {
        return fechaUltimaGenotipificaci├│n;
    }

    public void setFechaUltimaGenotipificaci├│n(Date fechaUltimaGenotipificaci├│n) {
        this.fechaUltimaGenotipificaci├│n = fechaUltimaGenotipificaci├│n;
    }

    public Character getEstadioClinicoActual() {
        return estadioClinicoActual;
    }

    public void setEstadioClinicoActual(Character estadioClinicoActual) {
        this.estadioClinicoActual = estadioClinicoActual;
    }

    public Date getFechaUltimoColesterol() {
        return fechaUltimoColesterol;
    }

    public void setFechaUltimoColesterol(Date fechaUltimoColesterol) {
        this.fechaUltimoColesterol = fechaUltimoColesterol;
    }

    public int getResultadoUltimoColesterol() {
        return resultadoUltimoColesterol;
    }

    public void setResultadoUltimoColesterol(int resultadoUltimoColesterol) {
        this.resultadoUltimoColesterol = resultadoUltimoColesterol;
    }

    public Date getFechaNivelTrigliceridos() {
        return fechaNivelTrigliceridos;
    }

    public void setFechaNivelTrigliceridos(Date fechaNivelTrigliceridos) {
        this.fechaNivelTrigliceridos = fechaNivelTrigliceridos;
    }

    public int getResultadoNivelTrigliceridos() {
        return resultadoNivelTrigliceridos;
    }

    public void setResultadoNivelTrigliceridos(int resultadoNivelTrigliceridos) {
        this.resultadoNivelTrigliceridos = resultadoNivelTrigliceridos;
    }

    public Date getFechaHemoglobinaSerica() {
        return fechaHemoglobinaSerica;
    }

    public void setFechaHemoglobinaSerica(Date fechaHemoglobinaSerica) {
        this.fechaHemoglobinaSerica = fechaHemoglobinaSerica;
    }

    public float getResultadoHemoglobinaSerica() {
        return resultadoHemoglobinaSerica;
    }

    public void setResultadoHemoglobinaSerica(float resultadoHemoglobinaSerica) {
        this.resultadoHemoglobinaSerica = resultadoHemoglobinaSerica;
    }

    public Date getFechaAtl() {
        return fechaAtl;
    }

    public void setFechaAtl(Date fechaAtl) {
        this.fechaAtl = fechaAtl;
    }

    public int getResultadoAtl() {
        return resultadoAtl;
    }

    public void setResultadoAtl(int resultadoAtl) {
        this.resultadoAtl = resultadoAtl;
    }

    public Date getFechUltiCreaSeri() {
        return fechUltiCreaSeri;
    }

    public void setFechUltiCreaSeri(Date fechUltiCreaSeri) {
        this.fechUltiCreaSeri = fechUltiCreaSeri;
    }

    public String getResuUltiCreaSeri() {
        return resuUltiCreaSeri;
    }

    public void setResuUltiCreaSeri(String resuUltiCreaSeri) {
        this.resuUltiCreaSeri = resuUltiCreaSeri;
    }

    public Date getFechUltiGlucSeriEnAyun() {
        return fechUltiGlucSeriEnAyun;
    }

    public void setFechUltiGlucSeriEnAyun(Date fechUltiGlucSeriEnAyun) {
        this.fechUltiGlucSeriEnAyun = fechUltiGlucSeriEnAyun;
    }

    public String getResuUltiGlucSeriEnAyun() {
        return resuUltiGlucSeriEnAyun;
    }

    public void setResuUltiGlucSeriEnAyun(String resuUltiGlucSeriEnAyun) {
        this.resuUltiGlucSeriEnAyun = resuUltiGlucSeriEnAyun;
    }

    public Date getFechUltiMediPesoCorpPeri() {
        return fechUltiMediPesoCorpPeri;
    }

    public void setFechUltiMediPesoCorpPeri(Date fechUltiMediPesoCorpPeri) {
        this.fechUltiMediPesoCorpPeri = fechUltiMediPesoCorpPeri;
    }

    public String getResuUltiMediPesoCorp() {
        return resuUltiMediPesoCorp;
    }

    public void setResuUltiMediPesoCorp(String resuUltiMediPesoCorp) {
        this.resuUltiMediPesoCorp = resuUltiMediPesoCorp;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public Character getNeuropatiaPeriferica() {
        return neuropatiaPeriferica;
    }

    public void setNeuropatiaPeriferica(Character neuropatiaPeriferica) {
        this.neuropatiaPeriferica = neuropatiaPeriferica;
    }

    public Character getLipoatrofiaOLiodistrofia() {
        return lipoatrofiaOLiodistrofia;
    }

    public void setLipoatrofiaOLiodistrofia(Character lipoatrofiaOLiodistrofia) {
        this.lipoatrofiaOLiodistrofia = lipoatrofiaOLiodistrofia;
    }

    public Character getCoinHepaBCron() {
        return coinHepaBCron;
    }

    public void setCoinHepaBCron(Character coinHepaBCron) {
        this.coinHepaBCron = coinHepaBCron;
    }

    public Character getCoinHepaCCron() {
        return coinHepaCCron;
    }

    public void setCoinHepaCCron(Character coinHepaCCron) {
        this.coinHepaCCron = coinHepaCCron;
    }

    public String getOTuvoCoinTubeActi() {
        return otuvoCoinTubeActi;
    }

    public void setOTuvoCoinTubeActi(String oTuvoCoinTubeActi) {
        this.otuvoCoinTubeActi = oTuvoCoinTubeActi;
    }

    public Character getTipoTuberculosisActiva() {
        return tipoTuberculosisActiva;
    }

    public void setTipoTuberculosisActiva(Character tipoTuberculosisActiva) {
        this.tipoTuberculosisActiva = tipoTuberculosisActiva;
    }

    public Character getPersonaCoinfeccionTbVih() {
        return personaCoinfeccionTbVih;
    }

    public void setPersonaCoinfeccionTbVih(Character personaCoinfeccionTbVih) {
        this.personaCoinfeccionTbVih = personaCoinfeccionTbVih;
    }

    public Date getFechInicTratAnti() {
        return fechInicTratAnti;
    }

    public void setFechInicTratAnti(Date fechInicTratAnti) {
        this.fechInicTratAnti = fechInicTratAnti;
    }

    public String getMediUnoTratAntiCoin() {
        return mediUnoTratAntiCoin;
    }

    public void setMediUnoTratAntiCoin(String mediUnoTratAntiCoin) {
        this.mediUnoTratAntiCoin = mediUnoTratAntiCoin;
    }

    public String getMediDosTratAntiCoin() {
        return mediDosTratAntiCoin;
    }

    public void setMediDosTratAntiCoin(String mediDosTratAntiCoin) {
        this.mediDosTratAntiCoin = mediDosTratAntiCoin;
    }

    public String getMediTresTratAntiCoin() {
        return mediTresTratAntiCoin;
    }

    public void setMediTresTratAntiCoin(String mediTresTratAntiCoin) {
        this.mediTresTratAntiCoin = mediTresTratAntiCoin;
    }

    public String getMediCuatTratAntiCoin() {
        return mediCuatTratAntiCoin;
    }

    public void setMediCuatTratAntiCoin(String mediCuatTratAntiCoin) {
        this.mediCuatTratAntiCoin = mediCuatTratAntiCoin;
    }

    public String getMediCincTratAntiCoin() {
        return mediCincTratAntiCoin;
    }

    public void setMediCincTratAntiCoin(String mediCincTratAntiCoin) {
        this.mediCincTratAntiCoin = mediCincTratAntiCoin;
    }

    public String getMediSeisTratAntiCoin() {
        return mediSeisTratAntiCoin;
    }

    public void setMediSeisTratAntiCoin(String mediSeisTratAntiCoin) {
        this.mediSeisTratAntiCoin = mediSeisTratAntiCoin;
    }

    public String getMediSietTratAntiCoin() {
        return mediSietTratAntiCoin;
    }

    public void setMediSietTratAntiCoin(String mediSietTratAntiCoin) {
        this.mediSietTratAntiCoin = mediSietTratAntiCoin;
    }

    public String getMediOchoTratAntiCoin() {
        return mediOchoTratAntiCoin;
    }

    public void setMediOchoTratAntiCoin(String mediOchoTratAntiCoin) {
        this.mediOchoTratAntiCoin = mediOchoTratAntiCoin;
    }

    public String getMediNuevTratAntiCoin() {
        return mediNuevTratAntiCoin;
    }

    public void setMediNuevTratAntiCoin(String mediNuevTratAntiCoin) {
        this.mediNuevTratAntiCoin = mediNuevTratAntiCoin;
    }

    public Date getFechEnTermElTratAnti() {
        return fechEnTermElTratAnti;
    }

    public void setFechEnTermElTratAnti(Date fechEnTermElTratAnti) {
        this.fechEnTermElTratAnti = fechEnTermElTratAnti;
    }

    public String getCondEgreTratAnti() {
        return condEgreTratAnti;
    }

    public void setCondEgreTratAnti(String condEgreTratAnti) {
        this.condEgreTratAnti = condEgreTratAnti;
    }

    public Character getCirrosisHepatica() {
        return cirrosisHepatica;
    }

    public void setCirrosisHepatica(Character cirrosisHepatica) {
        this.cirrosisHepatica = cirrosisHepatica;
    }

    public Character getEnfeRenaCronVihb() {
        return enfeRenaCronVihb;
    }

    public void setEnfeRenaCronVihb(Character enfeRenaCronVihb) {
        this.enfeRenaCronVihb = enfeRenaCronVihb;
    }

    public Character getEnfermedadCoronaria() {
        return enfermedadCoronaria;
    }

    public void setEnfermedadCoronaria(Character enfermedadCoronaria) {
        this.enfermedadCoronaria = enfermedadCoronaria;
    }

    public Character getOtrInfTraSexDifSifHep() {
        return otrInfTraSexDifSifHep;
    }

    public void setOtrInfTraSexDifSifHep(Character otrInfTraSexDifSifHep) {
        this.otrInfTraSexDifSifHep = otrInfTraSexDifSifHep;
    }

    public Character getNeoplasiaNoRelacionadaSida() {
        return neoplasiaNoRelacionadaSida;
    }

    public void setNeoplasiaNoRelacionadaSida(Character neoplasiaNoRelacionadaSida) {
        this.neoplasiaNoRelacionadaSida = neoplasiaNoRelacionadaSida;
    }

    public Character getDiscapacidadFuncional() {
        return discapacidadFuncional;
    }

    public void setDiscapacidadFuncional(Character discapacidadFuncional) {
        this.discapacidadFuncional = discapacidadFuncional;
    }

    public Date getFecUltConLinCd4PerObs() {
        return fecUltConLinCd4PerObs;
    }

    public void setFecUltConLinCd4PerObs(Date fecUltConLinCd4PerObs) {
        this.fecUltConLinCd4PerObs = fecUltConLinCd4PerObs;
    }

    public String getValUltConLinCd4PerObs() {
        return valUltConLinCd4PerObs;
    }

    public void setValUltConLinCd4PerObs(String valUltConLinCd4PerObs) {
        this.valUltConLinCd4PerObs = valUltConLinCd4PerObs;
    }

    public Date getFehaUltiCargViraPeriObse() {
        return fehaUltiCargViraPeriObse;
    }

    public void setFehaUltiCargViraPeriObse(Date fehaUltiCargViraPeriObse) {
        this.fehaUltiCargViraPeriObse = fehaUltiCargViraPeriObse;
    }

    public String getValoUltiCargViraPeriObse() {
        return valoUltiCargViraPeriObse;
    }

    public void setValoUltiCargViraPeriObse(String valoUltiCargViraPeriObse) {
        this.valoUltiCargViraPeriObse = valoUltiCargViraPeriObse;
    }

    public Character getRecibeTar() {
        return recibeTar;
    }

    public void setRecibeTar(Character recibeTar) {
        this.recibeTar = recibeTar;
    }

    public Date getFehaInicMediReciPersVive() {
        return fehaInicMediReciPersVive;
    }

    public void setFehaInicMediReciPersVive(Date fehaInicMediReciPersVive) {
        this.fehaInicMediReciPersVive = fehaInicMediReciPersVive;
    }

    public String getMedicamentoUnoTarActual() {
        return medicamentoUnoTarActual;
    }

    public void setMedicamentoUnoTarActual(String medicamentoUnoTarActual) {
        this.medicamentoUnoTarActual = medicamentoUnoTarActual;
    }

    public String getMedicamentoDosTarActual() {
        return medicamentoDosTarActual;
    }

    public void setMedicamentoDosTarActual(String medicamentoDosTarActual) {
        this.medicamentoDosTarActual = medicamentoDosTarActual;
    }

    public String getMedicamentoTresTarActual() {
        return medicamentoTresTarActual;
    }

    public void setMedicamentoTresTarActual(String medicamentoTresTarActual) {
        this.medicamentoTresTarActual = medicamentoTresTarActual;
    }

    public String getMedicamentoCuatroTarActual() {
        return medicamentoCuatroTarActual;
    }

    public void setMedicamentoCuatroTarActual(String medicamentoCuatroTarActual) {
        this.medicamentoCuatroTarActual = medicamentoCuatroTarActual;
    }

    public String getMedicamentoCincoTarActual() {
        return medicamentoCincoTarActual;
    }

    public void setMedicamentoCincoTarActual(String medicamentoCincoTarActual) {
        this.medicamentoCincoTarActual = medicamentoCincoTarActual;
    }

    public String getMedicamentoSeisTarActual() {
        return medicamentoSeisTarActual;
    }

    public void setMedicamentoSeisTarActual(String medicamentoSeisTarActual) {
        this.medicamentoSeisTarActual = medicamentoSeisTarActual;
    }

    public String getNumeMeseDispFormCompTar() {
        return numeMeseDispFormCompTar;
    }

    public void setNumeMeseDispFormCompTar(String numeMeseDispFormCompTar) {
        this.numeMeseDispFormCompTar = numeMeseDispFormCompTar;
    }

    public Integer getNumeCondSumiUltiAnio() {
        return numeCondSumiUltiAnio;
    }

    public void setNumeCondSumiUltiAnio(Integer numeCondSumiUltiAnio) {
        this.numeCondSumiUltiAnio = numeCondSumiUltiAnio;
    }

    public Character getMetoPlanFamiPersViveVih() {
        return metoPlanFamiPersViveVih;
    }

    public void setMetoPlanFamiPersViveVih(Character metoPlanFamiPersViveVih) {
        this.metoPlanFamiPersViveVih = metoPlanFamiPersViveVih;
    }

    public Character getVacunacionContraHepatitsA() {
        return vacunacionContraHepatitsA;
    }

    public void setVacunacionContraHepatitsA(Character vacunacionContraHepatitsA) {
        this.vacunacionContraHepatitsA = vacunacionContraHepatitsA;
    }

    public Character getVacunacionContraHepatitsB() {
        return vacunacionContraHepatitsB;
    }

    public void setVacunacionContraHepatitsB(Character vacunacionContraHepatitsB) {
        this.vacunacionContraHepatitsB = vacunacionContraHepatitsB;
    }

    public Character getVacunacionContraNeumococo() {
        return vacunacionContraNeumococo;
    }

    public void setVacunacionContraNeumococo(Character vacunacionContraNeumococo) {
        this.vacunacionContraNeumococo = vacunacionContraNeumococo;
    }

    public Character getTamiTubeActiUltiCons() {
        return tamiTubeActiUltiCons;
    }

    public void setTamiTubeActiUltiCons(Character tamiTubeActiUltiCons) {
        this.tamiTubeActiUltiCons = tamiTubeActiUltiCons;
    }

    public Character getPpdPrueEquiIdenTube() {
        return ppdPrueEquiIdenTube;
    }

    public void setPpdPrueEquiIdenTube(Character ppdPrueEquiIdenTube) {
        this.ppdPrueEquiIdenTube = ppdPrueEquiIdenTube;
    }

    public String getReciTratTubeLate() {
        return reciTratTubeLate;
    }

    public void setReciTratTubeLate(String reciTratTubeLate) {
        this.reciTratTubeLate = reciTratTubeLate;
    }

    public Character getTamiSifiEnPersViveVih() {
        return tamiSifiEnPersViveVih;
    }

    public void setTamiSifiEnPersViveVih(Character tamiSifiEnPersViveVih) {
        this.tamiSifiEnPersViveVih = tamiSifiEnPersViveVih;
    }

    public Character getRecibioTratamientoSifilis() {
        return recibioTratamientoSifilis;
    }

    public void setRecibioTratamientoSifilis(Character recibioTratamientoSifilis) {
        this.recibioTratamientoSifilis = recibioTratamientoSifilis;
    }

    public String getTamiVihAnogPersViveVih() {
        return tamiVihAnogPersViveVih;
    }

    public void setTamiVihAnogPersViveVih(String tamiVihAnogPersViveVih) {
        this.tamiVihAnogPersViveVih = tamiVihAnogPersViveVih;
    }

    public Character getTamiHepaBPersViveVih() {
        return tamiHepaBPersViveVih;
    }

    public void setTamiHepaBPersViveVih(Character tamiHepaBPersViveVih) {
        this.tamiHepaBPersViveVih = tamiHepaBPersViveVih;
    }

    public Character getTamiHepaCPersViveVih() {
        return tamiHepaCPersViveVih;
    }

    public void setTamiHepaCPersViveVih(Character tamiHepaCPersViveVih) {
        this.tamiHepaCPersViveVih = tamiHepaCPersViveVih;
    }

    public String getResuEvalRiesCardPersVive() {
        return resuEvalRiesCardPersVive;
    }

    public void setResuEvalRiesCardPersVive(String resuEvalRiesCardPersVive) {
        this.resuEvalRiesCardPersVive = resuEvalRiesCardPersVive;
    }

    public Character getProfilaxisMac() {
        return profilaxisMac;
    }

    public void setProfilaxisMac(Character profilaxisMac) {
        this.profilaxisMac = profilaxisMac;
    }

    public Character getProfCripNeof() {
        return profCripNeof;
    }

    public void setProfCripNeof(Character profCripNeof) {
        this.profCripNeof = profCripNeof;
    }

    public Character getProfPneuJiro() {
        return profPneuJiro;
    }

    public void setProfPneuJiro(Character profPneuJiro) {
        this.profPneuJiro = profPneuJiro;
    }

    public Integer getCostTotaAtenNoHosp() {
        return costTotaAtenNoHosp;
    }

    public void setCostTotaAtenNoHosp(Integer costTotaAtenNoHosp) {
        this.costTotaAtenNoHosp = costTotaAtenNoHosp;
    }

    public Integer getCostTotaAtenHosp() {
        return costTotaAtenHosp;
    }

    public void setCostTotaAtenHosp(Integer costTotaAtenHosp) {
        this.costTotaAtenHosp = costTotaAtenHosp;
    }

    public Integer getNumeHospPeriRelaElVih() {
        return numeHospPeriRelaElVih;
    }

    public void setNumeHospPeriRelaElVih(Integer numeHospPeriRelaElVih) {
        this.numeHospPeriRelaElVih = numeHospPeriRelaElVih;
    }

    public String getNoveUsuaRespAlRepoAnte() {
        return noveUsuaRespAlRepoAnte;
    }

    public void setNoveUsuaRespAlRepoAnte(String noveUsuaRespAlRepoAnte) {
        this.noveUsuaRespAlRepoAnte = noveUsuaRespAlRepoAnte;
    }

    public Date getFechasafiliacionEntidad() {
        return fechasafiliacionEntidad;
    }

    public void setFechasafiliacionEntidad(Date fechasafiliacionEntidad) {
        this.fechasafiliacionEntidad = fechasafiliacionEntidad;
    }

    public String getEntiTrasUsuaVihDesa() {
        return entiTrasUsuaVihDesa;
    }

    public void setEntiTrasUsuaVihDesa(String entiTrasUsuaVihDesa) {
        this.entiTrasUsuaVihDesa = entiTrasUsuaVihDesa;
    }

    public WriteCmPaciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(WriteCmPaciente idPaciente) {
        this.idPaciente = idPaciente;
    }


    
}
