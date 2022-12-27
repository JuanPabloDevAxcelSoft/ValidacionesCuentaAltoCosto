package com.savia.validacion.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "tbl_vih_paso")
public class TblReadVIHPasoModel {

    // private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "entidad_reporte")
    private String entidadReporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entidad_reportante_sgsss")
    private Character entidadReportanteSgsss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 30)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 30)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    private Character sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_etnia")
    private Character codigoEtnia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poblacion_clave")
    private Character poblacionClave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_municipio_residencia")
    private int codigoMunicipioResidencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_afiliacion_entidad_reporte")
    @Temporal(TemporalType.DATE)
    private Date fechaAfiliacionEntidadReporte;
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
    private Character diagnosticoInfecciónVih;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "mujer_diagnostico_vih_gestacion")
    private Character mujerDiagnosticoVihGestacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad_gestacional_diagnostico_vih")
    private int edadGestacionalDiagnosticoVih;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_culminacion_gestacion_vih")
    @Temporal(TemporalType.DATE)
    private Date fechaCulminacionGestacionVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supresion_lactancia_vih")
    private Character supresionLactanciaVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion_recien_nacido")
    private String tipoIdentificacionRecienNacido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_identificacion_recien_nacido")
    private String numeroIdentificacionRecienNacido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion_madre_vih")
    private String tipoIdentificacionMadreVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_identificacion_madre_vih")
    private String numeroIdentificacionMadreVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "madre_diagnostico_confirmado_vih")
    private Character madreDiagnosticoConfirmadoVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profilaxis_recien_nacido_expuesto_vih")
    private Character profilaxisRecienNacidoExpuestoVih;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico_turberculosis")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnosticoTurberculosis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tamizaje_turberculosis_vih")
    @Temporal(TemporalType.DATE)
    private Date fechaTamizajeTurberculosisVih;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_linfocitos_tcd4_diagnostico")
    private int valorLinfocitosTcd4Diagnostico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "realizo_carga_viral_diagnostico")
    private Character realizoCargaViralDiagnostico;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "coinfeccion_tuberculosis_inicio_tar")
    private Character coinfeccionTuberculosisInicioTar;
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
    @Column(name = "num_fallas_tar")
    private Integer numFallasTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "infecciones_bacterianas")
    private Character infeccionesBacterianas;
    @Basic(optional = false)
    @NotNull
    private Character candidiasis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tuberculosis_pulmonar_extrapulmonar")
    private Character tuberculosisPulmonarExtrapulmonar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cancer_cervix_invasivo")
    private Character cancerCervixInvasivo;
    @Basic(optional = false)
    @NotNull
    private Character coccidioidomicosis;
    @Basic(optional = false)
    @NotNull
    private Character citomegalovirus;
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
    private Character neumoníaPneumocystis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neumon\u00eda_recurrente")
    private Character neumoníaRecurrente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "septicemia_salmonella")
    private Character septicemiaSalmonella;
    @Basic(optional = false)
    @NotNull
    @Column(name = "infecci\u00f3n_diseminada")
    private Character infecciónDiseminada;
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
    private Character neumoníaIntersticial;
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
    private Date fechaUltimaGenotipificación;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_creatinina_serica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaCreatininaSerica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "resultaado_ultima_creatininca_serica")
    private String resultaadoUltimaCreatinincaSerica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultim_glucemia_serica_en_ayuno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimGlucemiaSericaEnAyuno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "resultado_ultima_glucemia_serica_en_ayuno")
    private String resultadoUltimaGlucemiaSericaEnAyuno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_medicion_peso_corporal_periodo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMedicionPesoCorporalPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "resultado_ultima_medicion_peso_corporal")
    private String resultadoUltimaMedicionPesoCorporal;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "coinfeccion_hepatits_b_cronica")
    private Character coinfeccionHepatitsBCronica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coinfeccion_hepatits_c_cronica")
    private Character coinfeccionHepatitsCCronica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "o_tuvo_coinfeccion_tuberculosis_activa")
    private Character oTuvoCoinfeccionTuberculosisActiva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_tuberculosis_activa")
    private Character tipoTuberculosisActiva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "persona_coinfeccion_tb_vih")
    private Character personaCoinfeccionTbVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_tratamiento_antituberculoso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioTratamientoAntituberculoso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_uno_tratamiento_antituberculoso_coinvih")
    private String medicamentoUnoTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_dos_tratamiento_antituberculoso_coinvih")
    private String medicamentoDosTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_tres_tratamiento_antituberculoso_coinvih")
    private String medicamentoTresTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_cuatro_tratamiento_antituberculoso_coinvih")
    private String medicamentoCuatroTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_cinco_tratamiento_antituberculoso_coinvih")
    private String medicamentoCincoTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_seis_tratamiento_antituberculoso_coinvih")
    private String medicamentoSeisTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_siete_tratamiento_antituberculoso_coinvih")
    private String medicamentoSieteTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_ocho_tratamiento_antituberculoso_coinvih")
    private String medicamentoOchoTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "medicamento_nueve_tratamiento_antituberculoso_coinvih")
    private String medicamentoNueveTratamientoAntituberculosoCoinvih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_en_termino_el_tratamiento_antituberculoso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnTerminoElTratamientoAntituberculoso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "condicion_egreso_tratamiento_antituberculoso")
    private String condicionEgresoTratamientoAntituberculoso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cirrosis_hepatica")
    private Character cirrosisHepatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enfermedad_renal_cronica_vihbo")
    private Character enfermedadRenalCronicaVihbo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enfermedad_coronaria")
    private Character enfermedadCoronaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "otras_infec_transmision_sexual_diferentes_sifilis_hepatitis_b")
    private Character otrasInfecTransmisionSexualDiferentesSifilisHepatitisB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neoplasia_no_relacionada_sida")
    private Character neoplasiaNoRelacionadaSida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discapacidad_funcional")
    private Character discapacidadFuncional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultimo_conteo_linfocitos_t_cd4_periodo_observacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoConteoLinfocitosTCd4PeriodoObservacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "valor_ultimo_conteo_linfoitos_t_cd4_periodo_observacion")
    private String valorUltimoConteoLinfoitosTCd4PeriodoObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feha_ultima_carga_viral_vih_periodo_observaion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehaUltimaCargaViralVihPeriodoObservaion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "valor_ultima_carga_viral_vih_periodo_observaion")
    private String valorUltimaCargaViralVihPeriodoObservaion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibe_tar")
    private Character recibeTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feha_inicio_medicamentos_recibe_persona_viven_vih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehaInicioMedicamentosRecibePersonaVivenVih;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "numero_meses_se_dispensi_formula_completa_tar")
    private String numeroMesesSeDispensiFormulaCompletaTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_condones_suministrados_ultimo_anio")
    private int numeroCondonesSuministradosUltimoAnio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "metodo_planificacion_familiar_persona_vive_vih")
    private Character metodoPlanificacionFamiliarPersonaViveVih;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "tamizaje_tuberculosis_activa_ultima_consulta")
    private Character tamizajeTuberculosisActivaUltimaConsulta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ppd_pruebas_equivalente_identificacion_tuberculosis")
    private Character ppdPruebasEquivalenteIdentificacionTuberculosis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "recibio_tratamiento_tuberculosis_latente")
    private String recibioTratamientoTuberculosisLatente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tamizaje_sifilis_en_persona_vive_vih")
    private Character tamizajeSifilisEnPersonaViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibio_tratamiento_sifilis")
    private Character recibioTratamientoSifilis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tamizaje_vih_anogenital_persona_vive_vih")
    private String tamizajeVihAnogenitalPersonaViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tamizaje_hepatitis_b_persona_vive_vih")
    private Character tamizajeHepatitisBPersonaViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tamizaje_hepatitis_c_persona_vive_vih")
    private Character tamizajeHepatitisCPersonaViveVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "resul_evaluacion_riesgo_cardiovascular_pers_vive_vih")
    private String resulEvaluacionRiesgoCardiovascularPersViveVih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profilaxis_mac")
    private Character profilaxisMac;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profilaxis_criptococo_neoformans")
    private Character profilaxisCriptococoNeoformans;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profilaxis_pneumoccysis_jirovecii")
    private Character profilaxisPneumoccysisJirovecii;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_total_atencion_no_hospitalaria")
    private int costoTotalAtencionNoHospitalaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_total_atencion_hospitalaria")
    private int costoTotalAtencionHospitalaria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_hospitalizaciones_periodo_relacionadas_el_vih")
    private int numeroHospitalizacionesPeriodoRelacionadasElVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "novedad_usuario_respecto_al_reporte_anterior")
    private String novedadUsuarioRespectoAlReporteAnterior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechasafiliacion_entidad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasafiliacionEntidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "entidad_traslado_usuario_vih_desafiliado")
    private String entidadTrasladoUsuarioVihDesafiliado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_muerte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "causa_muerte")
    private Character causaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_corte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCorte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo_serial")
    private String codigoSerial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntidadReporte() {
        return entidadReporte;
    }

    public void setEntidadReporte(String entidadReporte) {
        this.entidadReporte = entidadReporte;
    }

    public Character getEntidadReportanteSgsss() {
        return entidadReportanteSgsss;
    }

    public void setEntidadReportanteSgsss(Character entidadReportanteSgsss) {
        this.entidadReportanteSgsss = entidadReportanteSgsss;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getCodigoEtnia() {
        return codigoEtnia;
    }

    public void setCodigoEtnia(Character codigoEtnia) {
        this.codigoEtnia = codigoEtnia;
    }

    public Character getPoblacionClave() {
        return poblacionClave;
    }

    public void setPoblacionClave(Character poblacionClave) {
        this.poblacionClave = poblacionClave;
    }

    public int getCodigoMunicipioResidencia() {
        return codigoMunicipioResidencia;
    }

    public void setCodigoMunicipioResidencia(int codigoMunicipioResidencia) {
        this.codigoMunicipioResidencia = codigoMunicipioResidencia;
    }

    public Date getFechaAfiliacionEntidadReporte() {
        return fechaAfiliacionEntidadReporte;
    }

    public void setFechaAfiliacionEntidadReporte(Date fechaAfiliacionEntidadReporte) {
        this.fechaAfiliacionEntidadReporte = fechaAfiliacionEntidadReporte;
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

    public Character getDiagnosticoInfecciónVih() {
        return diagnosticoInfecciónVih;
    }

    public void setDiagnosticoInfecciónVih(Character diagnosticoInfecciónVih) {
        this.diagnosticoInfecciónVih = diagnosticoInfecciónVih;
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

    public Character getMujerDiagnosticoVihGestacion() {
        return mujerDiagnosticoVihGestacion;
    }

    public void setMujerDiagnosticoVihGestacion(Character mujerDiagnosticoVihGestacion) {
        this.mujerDiagnosticoVihGestacion = mujerDiagnosticoVihGestacion;
    }

    public int getEdadGestacionalDiagnosticoVih() {
        return edadGestacionalDiagnosticoVih;
    }

    public void setEdadGestacionalDiagnosticoVih(int edadGestacionalDiagnosticoVih) {
        this.edadGestacionalDiagnosticoVih = edadGestacionalDiagnosticoVih;
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

    public Date getFechaCulminacionGestacionVih() {
        return fechaCulminacionGestacionVih;
    }

    public void setFechaCulminacionGestacionVih(Date fechaCulminacionGestacionVih) {
        this.fechaCulminacionGestacionVih = fechaCulminacionGestacionVih;
    }

    public Character getSupresionLactanciaVih() {
        return supresionLactanciaVih;
    }

    public void setSupresionLactanciaVih(Character supresionLactanciaVih) {
        this.supresionLactanciaVih = supresionLactanciaVih;
    }

    public String getTipoIdentificacionRecienNacido() {
        return tipoIdentificacionRecienNacido;
    }

    public void setTipoIdentificacionRecienNacido(String tipoIdentificacionRecienNacido) {
        this.tipoIdentificacionRecienNacido = tipoIdentificacionRecienNacido;
    }

    public String getNumeroIdentificacionRecienNacido() {
        return numeroIdentificacionRecienNacido;
    }

    public void setNumeroIdentificacionRecienNacido(String numeroIdentificacionRecienNacido) {
        this.numeroIdentificacionRecienNacido = numeroIdentificacionRecienNacido;
    }

    public String getTipoIdentificacionMadreVih() {
        return tipoIdentificacionMadreVih;
    }

    public void setTipoIdentificacionMadreVih(String tipoIdentificacionMadreVih) {
        this.tipoIdentificacionMadreVih = tipoIdentificacionMadreVih;
    }

    public String getNumeroIdentificacionMadreVih() {
        return numeroIdentificacionMadreVih;
    }

    public void setNumeroIdentificacionMadreVih(String numeroIdentificacionMadreVih) {
        this.numeroIdentificacionMadreVih = numeroIdentificacionMadreVih;
    }

    public Character getMadreDiagnosticoConfirmadoVih() {
        return madreDiagnosticoConfirmadoVih;
    }

    public void setMadreDiagnosticoConfirmadoVih(Character madreDiagnosticoConfirmadoVih) {
        this.madreDiagnosticoConfirmadoVih = madreDiagnosticoConfirmadoVih;
    }

    public Character getProfilaxisRecienNacidoExpuestoVih() {
        return profilaxisRecienNacidoExpuestoVih;
    }

    public void setProfilaxisRecienNacidoExpuestoVih(Character profilaxisRecienNacidoExpuestoVih) {
        this.profilaxisRecienNacidoExpuestoVih = profilaxisRecienNacidoExpuestoVih;
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

    public Date getFechaDiagnosticoTurberculosis() {
        return fechaDiagnosticoTurberculosis;
    }

    public void setFechaDiagnosticoTurberculosis(Date fechaDiagnosticoTurberculosis) {
        this.fechaDiagnosticoTurberculosis = fechaDiagnosticoTurberculosis;
    }

    public Date getFechaTamizajeTurberculosisVih() {
        return fechaTamizajeTurberculosisVih;
    }

    public void setFechaTamizajeTurberculosisVih(Date fechaTamizajeTurberculosisVih) {
        this.fechaTamizajeTurberculosisVih = fechaTamizajeTurberculosisVih;
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

    public int getValorLinfocitosTcd4Diagnostico() {
        return valorLinfocitosTcd4Diagnostico;
    }

    public void setValorLinfocitosTcd4Diagnostico(int valorLinfocitosTcd4Diagnostico) {
        this.valorLinfocitosTcd4Diagnostico = valorLinfocitosTcd4Diagnostico;
    }

    public Character getRealizoCargaViralDiagnostico() {
        return realizoCargaViralDiagnostico;
    }

    public void setRealizoCargaViralDiagnostico(Character realizoCargaViralDiagnostico) {
        this.realizoCargaViralDiagnostico = realizoCargaViralDiagnostico;
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

    public Character getCoinfeccionTuberculosisInicioTar() {
        return coinfeccionTuberculosisInicioTar;
    }

    public void setCoinfeccionTuberculosisInicioTar(Character coinfeccionTuberculosisInicioTar) {
        this.coinfeccionTuberculosisInicioTar = coinfeccionTuberculosisInicioTar;
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

    public Integer getNumFallasTar() {
        return numFallasTar;
    }

    public void setNumFallasTar(Integer numFallasTar) {
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

    public Character getTuberculosisPulmonarExtrapulmonar() {
        return tuberculosisPulmonarExtrapulmonar;
    }

    public void setTuberculosisPulmonarExtrapulmonar(Character tuberculosisPulmonarExtrapulmonar) {
        this.tuberculosisPulmonarExtrapulmonar = tuberculosisPulmonarExtrapulmonar;
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

    public Character getCitomegalovirus() {
        return citomegalovirus;
    }

    public void setCitomegalovirus(Character citomegalovirus) {
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

    public Character getNeumoníaPneumocystis() {
        return neumoníaPneumocystis;
    }

    public void setNeumoníaPneumocystis(Character neumoníaPneumocystis) {
        this.neumoníaPneumocystis = neumoníaPneumocystis;
    }

    public Character getNeumoníaRecurrente() {
        return neumoníaRecurrente;
    }

    public void setNeumoníaRecurrente(Character neumoníaRecurrente) {
        this.neumoníaRecurrente = neumoníaRecurrente;
    }

    public Character getSepticemiaSalmonella() {
        return septicemiaSalmonella;
    }

    public void setSepticemiaSalmonella(Character septicemiaSalmonella) {
        this.septicemiaSalmonella = septicemiaSalmonella;
    }

    public Character getInfecciónDiseminada() {
        return infecciónDiseminada;
    }

    public void setInfecciónDiseminada(Character infecciónDiseminada) {
        this.infecciónDiseminada = infecciónDiseminada;
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

    public Character getNeumoníaIntersticial() {
        return neumoníaIntersticial;
    }

    public void setNeumoníaIntersticial(Character neumoníaIntersticial) {
        this.neumoníaIntersticial = neumoníaIntersticial;
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

    public Date getFechaUltimaGenotipificación() {
        return fechaUltimaGenotipificación;
    }

    public void setFechaUltimaGenotipificación(Date fechaUltimaGenotipificación) {
        this.fechaUltimaGenotipificación = fechaUltimaGenotipificación;
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

    public Date getFechaUltimaCreatininaSerica() {
        return fechaUltimaCreatininaSerica;
    }

    public void setFechaUltimaCreatininaSerica(Date fechaUltimaCreatininaSerica) {
        this.fechaUltimaCreatininaSerica = fechaUltimaCreatininaSerica;
    }

    public String getResultaadoUltimaCreatinincaSerica() {
        return resultaadoUltimaCreatinincaSerica;
    }

    public void setResultaadoUltimaCreatinincaSerica(String resultaadoUltimaCreatinincaSerica) {
        this.resultaadoUltimaCreatinincaSerica = resultaadoUltimaCreatinincaSerica;
    }

    public Date getFechaUltimGlucemiaSericaEnAyuno() {
        return fechaUltimGlucemiaSericaEnAyuno;
    }

    public void setFechaUltimGlucemiaSericaEnAyuno(Date fechaUltimGlucemiaSericaEnAyuno) {
        this.fechaUltimGlucemiaSericaEnAyuno = fechaUltimGlucemiaSericaEnAyuno;
    }

    public String getResultadoUltimaGlucemiaSericaEnAyuno() {
        return resultadoUltimaGlucemiaSericaEnAyuno;
    }

    public void setResultadoUltimaGlucemiaSericaEnAyuno(String resultadoUltimaGlucemiaSericaEnAyuno) {
        this.resultadoUltimaGlucemiaSericaEnAyuno = resultadoUltimaGlucemiaSericaEnAyuno;
    }

    public Date getFechaUltimaMedicionPesoCorporalPeriodo() {
        return fechaUltimaMedicionPesoCorporalPeriodo;
    }

    public void setFechaUltimaMedicionPesoCorporalPeriodo(Date fechaUltimaMedicionPesoCorporalPeriodo) {
        this.fechaUltimaMedicionPesoCorporalPeriodo = fechaUltimaMedicionPesoCorporalPeriodo;
    }

    public String getResultadoUltimaMedicionPesoCorporal() {
        return resultadoUltimaMedicionPesoCorporal;
    }

    public void setResultadoUltimaMedicionPesoCorporal(String resultadoUltimaMedicionPesoCorporal) {
        this.resultadoUltimaMedicionPesoCorporal = resultadoUltimaMedicionPesoCorporal;
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

    public Character getCoinfeccionHepatitsBCronica() {
        return coinfeccionHepatitsBCronica;
    }

    public void setCoinfeccionHepatitsBCronica(Character coinfeccionHepatitsBCronica) {
        this.coinfeccionHepatitsBCronica = coinfeccionHepatitsBCronica;
    }

    public Character getCoinfeccionHepatitsCCronica() {
        return coinfeccionHepatitsCCronica;
    }

    public void setCoinfeccionHepatitsCCronica(Character coinfeccionHepatitsCCronica) {
        this.coinfeccionHepatitsCCronica = coinfeccionHepatitsCCronica;
    }

    public Character getOTuvoCoinfeccionTuberculosisActiva() {
        return oTuvoCoinfeccionTuberculosisActiva;
    }

    public void setOTuvoCoinfeccionTuberculosisActiva(Character oTuvoCoinfeccionTuberculosisActiva) {
        this.oTuvoCoinfeccionTuberculosisActiva = oTuvoCoinfeccionTuberculosisActiva;
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

    public Date getFechaInicioTratamientoAntituberculoso() {
        return fechaInicioTratamientoAntituberculoso;
    }

    public void setFechaInicioTratamientoAntituberculoso(Date fechaInicioTratamientoAntituberculoso) {
        this.fechaInicioTratamientoAntituberculoso = fechaInicioTratamientoAntituberculoso;
    }

    public String getMedicamentoUnoTratamientoAntituberculosoCoinvih() {
        return medicamentoUnoTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoUnoTratamientoAntituberculosoCoinvih(
            String medicamentoUnoTratamientoAntituberculosoCoinvih) {
        this.medicamentoUnoTratamientoAntituberculosoCoinvih = medicamentoUnoTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoDosTratamientoAntituberculosoCoinvih() {
        return medicamentoDosTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoDosTratamientoAntituberculosoCoinvih(
            String medicamentoDosTratamientoAntituberculosoCoinvih) {
        this.medicamentoDosTratamientoAntituberculosoCoinvih = medicamentoDosTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoTresTratamientoAntituberculosoCoinvih() {
        return medicamentoTresTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoTresTratamientoAntituberculosoCoinvih(
            String medicamentoTresTratamientoAntituberculosoCoinvih) {
        this.medicamentoTresTratamientoAntituberculosoCoinvih = medicamentoTresTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoCuatroTratamientoAntituberculosoCoinvih() {
        return medicamentoCuatroTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoCuatroTratamientoAntituberculosoCoinvih(
            String medicamentoCuatroTratamientoAntituberculosoCoinvih) {
        this.medicamentoCuatroTratamientoAntituberculosoCoinvih = medicamentoCuatroTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoCincoTratamientoAntituberculosoCoinvih() {
        return medicamentoCincoTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoCincoTratamientoAntituberculosoCoinvih(
            String medicamentoCincoTratamientoAntituberculosoCoinvih) {
        this.medicamentoCincoTratamientoAntituberculosoCoinvih = medicamentoCincoTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoSeisTratamientoAntituberculosoCoinvih() {
        return medicamentoSeisTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoSeisTratamientoAntituberculosoCoinvih(
            String medicamentoSeisTratamientoAntituberculosoCoinvih) {
        this.medicamentoSeisTratamientoAntituberculosoCoinvih = medicamentoSeisTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoSieteTratamientoAntituberculosoCoinvih() {
        return medicamentoSieteTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoSieteTratamientoAntituberculosoCoinvih(
            String medicamentoSieteTratamientoAntituberculosoCoinvih) {
        this.medicamentoSieteTratamientoAntituberculosoCoinvih = medicamentoSieteTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoOchoTratamientoAntituberculosoCoinvih() {
        return medicamentoOchoTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoOchoTratamientoAntituberculosoCoinvih(
            String medicamentoOchoTratamientoAntituberculosoCoinvih) {
        this.medicamentoOchoTratamientoAntituberculosoCoinvih = medicamentoOchoTratamientoAntituberculosoCoinvih;
    }

    public String getMedicamentoNueveTratamientoAntituberculosoCoinvih() {
        return medicamentoNueveTratamientoAntituberculosoCoinvih;
    }

    public void setMedicamentoNueveTratamientoAntituberculosoCoinvih(
            String medicamentoNueveTratamientoAntituberculosoCoinvih) {
        this.medicamentoNueveTratamientoAntituberculosoCoinvih = medicamentoNueveTratamientoAntituberculosoCoinvih;
    }

    public Date getFechaEnTerminoElTratamientoAntituberculoso() {
        return fechaEnTerminoElTratamientoAntituberculoso;
    }

    public void setFechaEnTerminoElTratamientoAntituberculoso(Date fechaEnTerminoElTratamientoAntituberculoso) {
        this.fechaEnTerminoElTratamientoAntituberculoso = fechaEnTerminoElTratamientoAntituberculoso;
    }

    public String getCondicionEgresoTratamientoAntituberculoso() {
        return condicionEgresoTratamientoAntituberculoso;
    }

    public void setCondicionEgresoTratamientoAntituberculoso(String condicionEgresoTratamientoAntituberculoso) {
        this.condicionEgresoTratamientoAntituberculoso = condicionEgresoTratamientoAntituberculoso;
    }

    public Character getCirrosisHepatica() {
        return cirrosisHepatica;
    }

    public void setCirrosisHepatica(Character cirrosisHepatica) {
        this.cirrosisHepatica = cirrosisHepatica;
    }

    public Character getEnfermedadRenalCronicaVihbo() {
        return enfermedadRenalCronicaVihbo;
    }

    public void setEnfermedadRenalCronicaVihbo(Character enfermedadRenalCronicaVihbo) {
        this.enfermedadRenalCronicaVihbo = enfermedadRenalCronicaVihbo;
    }

    public Character getEnfermedadCoronaria() {
        return enfermedadCoronaria;
    }

    public void setEnfermedadCoronaria(Character enfermedadCoronaria) {
        this.enfermedadCoronaria = enfermedadCoronaria;
    }

    public Character getOtrasInfecTransmisionSexualDiferentesSifilisHepatitisB() {
        return otrasInfecTransmisionSexualDiferentesSifilisHepatitisB;
    }

    public void setOtrasInfecTransmisionSexualDiferentesSifilisHepatitisB(
            Character otrasInfecTransmisionSexualDiferentesSifilisHepatitisB) {
        this.otrasInfecTransmisionSexualDiferentesSifilisHepatitisB = otrasInfecTransmisionSexualDiferentesSifilisHepatitisB;
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

    public Date getFechaUltimoConteoLinfocitosTCd4PeriodoObservacion() {
        return fechaUltimoConteoLinfocitosTCd4PeriodoObservacion;
    }

    public void setFechaUltimoConteoLinfocitosTCd4PeriodoObservacion(
            Date fechaUltimoConteoLinfocitosTCd4PeriodoObservacion) {
        this.fechaUltimoConteoLinfocitosTCd4PeriodoObservacion = fechaUltimoConteoLinfocitosTCd4PeriodoObservacion;
    }

    public String getValorUltimoConteoLinfoitosTCd4PeriodoObservacion() {
        return valorUltimoConteoLinfoitosTCd4PeriodoObservacion;
    }

    public void setValorUltimoConteoLinfoitosTCd4PeriodoObservacion(
            String valorUltimoConteoLinfoitosTCd4PeriodoObservacion) {
        this.valorUltimoConteoLinfoitosTCd4PeriodoObservacion = valorUltimoConteoLinfoitosTCd4PeriodoObservacion;
    }

    public Date getFehaUltimaCargaViralVihPeriodoObservaion() {
        return fehaUltimaCargaViralVihPeriodoObservaion;
    }

    public void setFehaUltimaCargaViralVihPeriodoObservaion(Date fehaUltimaCargaViralVihPeriodoObservaion) {
        this.fehaUltimaCargaViralVihPeriodoObservaion = fehaUltimaCargaViralVihPeriodoObservaion;
    }

    public String getValorUltimaCargaViralVihPeriodoObservaion() {
        return valorUltimaCargaViralVihPeriodoObservaion;
    }

    public void setValorUltimaCargaViralVihPeriodoObservaion(String valorUltimaCargaViralVihPeriodoObservaion) {
        this.valorUltimaCargaViralVihPeriodoObservaion = valorUltimaCargaViralVihPeriodoObservaion;
    }

    public Character getRecibeTar() {
        return recibeTar;
    }

    public void setRecibeTar(Character recibeTar) {
        this.recibeTar = recibeTar;
    }

    public Date getFehaInicioMedicamentosRecibePersonaVivenVih() {
        return fehaInicioMedicamentosRecibePersonaVivenVih;
    }

    public void setFehaInicioMedicamentosRecibePersonaVivenVih(Date fehaInicioMedicamentosRecibePersonaVivenVih) {
        this.fehaInicioMedicamentosRecibePersonaVivenVih = fehaInicioMedicamentosRecibePersonaVivenVih;
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

    public String getNumeroMesesSeDispensiFormulaCompletaTar() {
        return numeroMesesSeDispensiFormulaCompletaTar;
    }

    public void setNumeroMesesSeDispensiFormulaCompletaTar(String numeroMesesSeDispensiFormulaCompletaTar) {
        this.numeroMesesSeDispensiFormulaCompletaTar = numeroMesesSeDispensiFormulaCompletaTar;
    }

    public int getNumeroCondonesSuministradosUltimoAnio() {
        return numeroCondonesSuministradosUltimoAnio;
    }

    public void setNumeroCondonesSuministradosUltimoAnio(int numeroCondonesSuministradosUltimoAnio) {
        this.numeroCondonesSuministradosUltimoAnio = numeroCondonesSuministradosUltimoAnio;
    }

    public Character getMetodoPlanificacionFamiliarPersonaViveVih() {
        return metodoPlanificacionFamiliarPersonaViveVih;
    }

    public void setMetodoPlanificacionFamiliarPersonaViveVih(Character metodoPlanificacionFamiliarPersonaViveVih) {
        this.metodoPlanificacionFamiliarPersonaViveVih = metodoPlanificacionFamiliarPersonaViveVih;
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

    public Character getTamizajeTuberculosisActivaUltimaConsulta() {
        return tamizajeTuberculosisActivaUltimaConsulta;
    }

    public void setTamizajeTuberculosisActivaUltimaConsulta(Character tamizajeTuberculosisActivaUltimaConsulta) {
        this.tamizajeTuberculosisActivaUltimaConsulta = tamizajeTuberculosisActivaUltimaConsulta;
    }

    public Character getPpdPruebasEquivalenteIdentificacionTuberculosis() {
        return ppdPruebasEquivalenteIdentificacionTuberculosis;
    }

    public void setPpdPruebasEquivalenteIdentificacionTuberculosis(
            Character ppdPruebasEquivalenteIdentificacionTuberculosis) {
        this.ppdPruebasEquivalenteIdentificacionTuberculosis = ppdPruebasEquivalenteIdentificacionTuberculosis;
    }

    public String getRecibioTratamientoTuberculosisLatente() {
        return recibioTratamientoTuberculosisLatente;
    }

    public void setRecibioTratamientoTuberculosisLatente(String recibioTratamientoTuberculosisLatente) {
        this.recibioTratamientoTuberculosisLatente = recibioTratamientoTuberculosisLatente;
    }

    public Character getTamizajeSifilisEnPersonaViveVih() {
        return tamizajeSifilisEnPersonaViveVih;
    }

    public void setTamizajeSifilisEnPersonaViveVih(Character tamizajeSifilisEnPersonaViveVih) {
        this.tamizajeSifilisEnPersonaViveVih = tamizajeSifilisEnPersonaViveVih;
    }

    public Character getRecibioTratamientoSifilis() {
        return recibioTratamientoSifilis;
    }

    public void setRecibioTratamientoSifilis(Character recibioTratamientoSifilis) {
        this.recibioTratamientoSifilis = recibioTratamientoSifilis;
    }

    public String getTamizajeVihAnogenitalPersonaViveVih() {
        return tamizajeVihAnogenitalPersonaViveVih;
    }

    public void setTamizajeVihAnogenitalPersonaViveVih(String tamizajeVihAnogenitalPersonaViveVih) {
        this.tamizajeVihAnogenitalPersonaViveVih = tamizajeVihAnogenitalPersonaViveVih;
    }

    public Character getTamizajeHepatitisBPersonaViveVih() {
        return tamizajeHepatitisBPersonaViveVih;
    }

    public void setTamizajeHepatitisBPersonaViveVih(Character tamizajeHepatitisBPersonaViveVih) {
        this.tamizajeHepatitisBPersonaViveVih = tamizajeHepatitisBPersonaViveVih;
    }

    public Character getTamizajeHepatitisCPersonaViveVih() {
        return tamizajeHepatitisCPersonaViveVih;
    }

    public void setTamizajeHepatitisCPersonaViveVih(Character tamizajeHepatitisCPersonaViveVih) {
        this.tamizajeHepatitisCPersonaViveVih = tamizajeHepatitisCPersonaViveVih;
    }

    public String getResulEvaluacionRiesgoCardiovascularPersViveVih() {
        return resulEvaluacionRiesgoCardiovascularPersViveVih;
    }

    public void setResulEvaluacionRiesgoCardiovascularPersViveVih(
            String resulEvaluacionRiesgoCardiovascularPersViveVih) {
        this.resulEvaluacionRiesgoCardiovascularPersViveVih = resulEvaluacionRiesgoCardiovascularPersViveVih;
    }

    public Character getProfilaxisMac() {
        return profilaxisMac;
    }

    public void setProfilaxisMac(Character profilaxisMac) {
        this.profilaxisMac = profilaxisMac;
    }

    public Character getProfilaxisCriptococoNeoformans() {
        return profilaxisCriptococoNeoformans;
    }

    public void setProfilaxisCriptococoNeoformans(Character profilaxisCriptococoNeoformans) {
        this.profilaxisCriptococoNeoformans = profilaxisCriptococoNeoformans;
    }

    public Character getProfilaxisPneumoccysisJirovecii() {
        return profilaxisPneumoccysisJirovecii;
    }

    public void setProfilaxisPneumoccysisJirovecii(Character profilaxisPneumoccysisJirovecii) {
        this.profilaxisPneumoccysisJirovecii = profilaxisPneumoccysisJirovecii;
    }

    public int getCostoTotalAtencionNoHospitalaria() {
        return costoTotalAtencionNoHospitalaria;
    }

    public void setCostoTotalAtencionNoHospitalaria(int costoTotalAtencionNoHospitalaria) {
        this.costoTotalAtencionNoHospitalaria = costoTotalAtencionNoHospitalaria;
    }

    public int getCostoTotalAtencionHospitalaria() {
        return costoTotalAtencionHospitalaria;
    }

    public void setCostoTotalAtencionHospitalaria(int costoTotalAtencionHospitalaria) {
        this.costoTotalAtencionHospitalaria = costoTotalAtencionHospitalaria;
    }

    public int getNumeroHospitalizacionesPeriodoRelacionadasElVih() {
        return numeroHospitalizacionesPeriodoRelacionadasElVih;
    }

    public void setNumeroHospitalizacionesPeriodoRelacionadasElVih(
            int numeroHospitalizacionesPeriodoRelacionadasElVih) {
        this.numeroHospitalizacionesPeriodoRelacionadasElVih = numeroHospitalizacionesPeriodoRelacionadasElVih;
    }

    public String getNovedadUsuarioRespectoAlReporteAnterior() {
        return novedadUsuarioRespectoAlReporteAnterior;
    }

    public void setNovedadUsuarioRespectoAlReporteAnterior(String novedadUsuarioRespectoAlReporteAnterior) {
        this.novedadUsuarioRespectoAlReporteAnterior = novedadUsuarioRespectoAlReporteAnterior;
    }

    public Date getFechasafiliacionEntidad() {
        return fechasafiliacionEntidad;
    }

    public void setFechasafiliacionEntidad(Date fechasafiliacionEntidad) {
        this.fechasafiliacionEntidad = fechasafiliacionEntidad;
    }

    public String getEntidadTrasladoUsuarioVihDesafiliado() {
        return entidadTrasladoUsuarioVihDesafiliado;
    }

    public void setEntidadTrasladoUsuarioVihDesafiliado(String entidadTrasladoUsuarioVihDesafiliado) {
        this.entidadTrasladoUsuarioVihDesafiliado = entidadTrasladoUsuarioVihDesafiliado;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public Character getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(Character causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public void setCodigoSerial(String codigoSerial) {
        this.codigoSerial = codigoSerial;
    }

}
