/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.write;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cm_paciente_cancer")
public class WriteCmPacienteCancer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    private int ocupacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "grupo_poblacional")
    private String grupoPoblacional;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "codigo_cie")
    private String codigoCie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico_cancer")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnosticoCancer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_interconsulta_medico")
    @Temporal(TemporalType.DATE)
    private Date fechaInterconsultaMedico;
    @Column(name = "fech_ingr_inst_diag")
    @Temporal(TemporalType.DATE)
    private Date fechIngrInstDiag;
    @Size(max = 2)
    @Column(name = "tipo_estu_diag_canc")
    private String tipoEstuDiagCanc;
    @Size(max = 2)
    @Column(name = "moti_no_diag_hist")
    private String motiNoDiagHist;
    @Column(name = "fech_reco_hist")
    @Temporal(TemporalType.DATE)
    private Date fechRecoHist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_primero_histopatologico")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimeroHistopatologico;
    @Column(name = "codi_habi_ips_diag")
    private Integer codiHabiIpsDiag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_primera_consulta_medico")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimeraConsultaMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "histologia_tumor_biopsia")
    private String histologiaTumorBiopsia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "grado_diferenciacion_tumor")
    private String gradoDiferenciacionTumor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tumor_solido")
    private int tumorSolido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_estadificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaEstadificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String her2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_realizacion_her2")
    @Temporal(TemporalType.DATE)
    private Date fechaRealizacionHer2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_her2")
    private String resultadoHer2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estadificacion_dukes")
    private String estadificacionDukes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_estadificacion_dukes")
    @Temporal(TemporalType.DATE)
    private Date fechaEstadificacionDukes;
    @Size(max = 2)
    @Column(name = "esta_linf_hodg")
    private String estaLinfHodg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "gleason_diagnostico")
    private String gleasonDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "riesgo_linfomas_leucemias")
    private int riesgoLinfomasLeucemias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_clasificacion_riesgo")
    @Temporal(TemporalType.DATE)
    private Date fechaClasificacionRiesgo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "objetivo_tratamiento_medico")
    private String objetivoTratamientoMedico;
    @Size(max = 2)
    @Column(name = "inte_medi_peri_repo")
    private String inteMediPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "antecedentes_cancer_primario")
    private String antecedentesCancerPrimario;
    @Column(name = "fech_diag_canc_prim")
    @Temporal(TemporalType.DATE)
    private Date fechDiagCancPrim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "tipo_cancer_antecedente")
    private String tipoCancerAntecedente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String quimioterapia;
    @Size(max = 2)
    @Column(name = "fase_quim_peri_repo")
    private String faseQuimPeriRepo;
    @Size(max = 2)
    @Column(name = "quim_cito_leuc_linf")
    private String quimCitoLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_indu_leuc_linf")
    private String quimInduLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_inte_leuc_linf")
    private String quimInteLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_cons_leuc_linf")
    private String quimConsLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_rein_leuc_linf")
    private String quimReinLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_mant_leuc_linf")
    private String quimMantLeucLinf;
    @Size(max = 2)
    @Column(name = "quim_mant_larg_leuc_linf")
    private String quimMantLargLeucLinf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "quimio_otro_leucemia_linfoma")
    private String quimioOtroLeucemiaLinfoma;
    @Column(name = "cicl_inic_peri_repo")
    private Integer ciclInicPeriRepo;
    @Size(max = 2)
    @Column(name = "ubic_esqu_quim_onco")
    private String ubicEsquQuimOnco;
    @Column(name = "fech_inic_prim_esqu_quim")
    @Temporal(TemporalType.DATE)
    private Date fechInicPrimEsquQuim;
    @Column(name = "nume_ips_prim_esqu_quim")
    private Integer numeIpsPrimEsquQuim;
    @Column(name = "codi_ips1_prim_esqu_quim")
    private Integer codiIps1PrimEsquQuim;
    @Column(name = "codi_ips2_prim_esqu_quim")
    private Integer codiIps2PrimEsquQuim;
    @Size(max = 7)
    @Column(name = "num_medi_inic_anti_espe")
    private String numMediInicAntiEspe;
    @Size(max = 7)
    @Column(name = "prim_medi_inic_anti")
    private String primMediInicAnti;
    @Size(max = 7)
    @Column(name = "segu_medi_inic_anti")
    private String seguMediInicAnti;
    @Size(max = 7)
    @Column(name = "terc_medi_inic_anti")
    private String tercMediInicAnti;
    @Size(max = 7)
    @Column(name = "cuar_medi_inic_anti")
    private String cuarMediInicAnti;
    @Size(max = 7)
    @Column(name = "quin_medi_inic_anti")
    private String quinMediInicAnti;
    @Size(max = 7)
    @Column(name = "sext_medi_inic_anti")
    private String sextMediInicAnti;
    @Size(max = 7)
    @Column(name = "sept_medi_inic_anti")
    private String septMediInicAnti;
    @Size(max = 7)
    @Column(name = "octa_medi_inic_anti")
    private String octaMediInicAnti;
    @Size(max = 7)
    @Column(name = "nove_medi_inic_anti")
    private String noveMediInicAnti;
    @Size(max = 7)
    @Column(name = "prim_medi_tera_horm")
    private String primMediTeraHorm;
    @Size(max = 7)
    @Column(name = "segu_medi_tera_horm")
    private String seguMediTeraHorm;
    @Size(max = 7)
    @Column(name = "terc_medi_tera_horm")
    private String tercMediTeraHorm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "quimio_intratecal")
    private String quimioIntratecal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_final_esquema_quimio")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalEsquemaQuimio;
    @Size(max = 2)
    @Column(name = "cara_actu_esqu_quim")
    private String caraActuEsquQuim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "motivo_finalizacion_esquema")
    private String motivoFinalizacionEsquema;
    @Size(max = 2)
    @Column(name = "ubic_temp_ulti_esqu")
    private String ubicTempUltiEsqu;
    @Column(name = "fech_inic_ulti_esqu_quim")
    @Temporal(TemporalType.DATE)
    private Date fechInicUltiEsquQuim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_ips_suministra_esquema")
    private int numeroIpsSuministraEsquema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips1_ultimo_esquema")
    private int codigoIps1UltimoEsquema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips2_ultimo_esquema")
    private int codigoIps2UltimoEsquema;
    @Size(max = 7)
    @Column(name = "num_medi_fin_anti_espe")
    private String numMediFinAntiEspe;
    @Size(max = 7)
    @Column(name = "prim_medi_fin_anti")
    private String primMediFinAnti;
    @Size(max = 7)
    @Column(name = "segu_medi_fin_anti")
    private String seguMediFinAnti;
    @Size(max = 7)
    @Column(name = "terc_medi_fin_anti")
    private String tercMediFinAnti;
    @Size(max = 7)
    @Column(name = "cuar_medi_fin_anti")
    private String cuarMediFinAnti;
    @Size(max = 7)
    @Column(name = "quin_medi_fin_anti")
    private String quinMediFinAnti;
    @Size(max = 7)
    @Column(name = "sext_medi_fin_anti")
    private String sextMediFinAnti;
    @Size(max = 7)
    @Column(name = "sept_medi_fin_anti")
    private String septMediFinAnti;
    @Size(max = 7)
    @Column(name = "octa_medi_fin_anti")
    private String octaMediFinAnti;
    @Size(max = 7)
    @Column(name = "nove_medi_fin_anti")
    private String noveMediFinAnti;
    @Size(max = 7)
    @Column(name = "prim_medi_fin_tera_horm")
    private String primMediFinTeraHorm;
    @Size(max = 7)
    @Column(name = "segu_medi_fin_tera_horm")
    private String seguMediFinTeraHorm;
    @Size(max = 7)
    @Column(name = "terc_medi_fin_tera_horm")
    private String tercMediFinTeraHorm;
    @Size(max = 2)
    @Column(name = "quim_intr_ulti_peri_repo")
    private String quimIntrUltiPeriRepo;
    @Column(name = "fech_fina_ulti_esqu_quim")
    @Temporal(TemporalType.DATE)
    private Date fechFinaUltiEsquQuim;
    @Size(max = 2)
    @Column(name = "cara_actu_ulti_esqu")
    private String caraActuUltiEsqu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "motivo_final_ultimo_esquema")
    private String motivoFinalUltimoEsquema;
    @Size(max = 2)
    @Column(name = "ciru_pale_peri_repo")
    private String ciruPalePeriRepo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_cirugias_periodo_reporte")
    private int numCirugiasPeriodoReporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_primera_cirugia")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimeraCirugia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_primera_cirugia")
    private int codigoIpsPrimeraCirugia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_primera_cirugia")
    private int codigoPrimeraCirugia;
    @Size(max = 2)
    @Column(name = "ubic_prim_ciru_onco")
    private String ubicPrimCiruOnco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_cirugia")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaCirugia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "motivo_ultima_cirugia")
    private String motivoUltimaCirugia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_ultima_cirugia")
    private int codigoIpsUltimaCirugia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ultima_cirugia")
    private int codigoUltimaCirugia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ubicacion_ultima_cirugia")
    private String ubicacionUltimaCirugia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado_vital_cirugia")
    private String estadoVitalCirugia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "radioterapia_reporte_actual")
    private String radioterapiaReporteActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_sesiones_radioterapia")
    private int numSesionesRadioterapia;
    @Column(name = "fech_prim_esqu_radi")
    @Temporal(TemporalType.DATE)
    private Date fechPrimEsquRadi;
    @Size(max = 2)
    @Column(name = "ubic_prim_esqu_radi")
    private String ubicPrimEsquRadi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_radioterapia")
    private int tipoRadioterapia;
    @Column(name = "nume_ips_prim_esqu_radi")
    private Integer numeIpsPrimEsquRadi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips1_radioterapia")
    private int codigoIps1Radioterapia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips2_radioterapia")
    private int codigoIps2Radioterapia;
    @Column(name = "fech_fin_prim_esqu_radi")
    @Temporal(TemporalType.DATE)
    private Date fechFinPrimEsquRadi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "carac_actuales_radioterapia")
    private String caracActualesRadioterapia;
    @Size(max = 2)
    @Column(name = "moti_fin_prim_radi")
    private String motiFinPrimRadi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_radioterapia")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioRadioterapia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ubicacion_ultimo_radioterapia")
    private String ubicacionUltimoRadioterapia;
    @Column(name = "tipo_radi_ulti_esqu")
    private Integer tipoRadiUltiEsqu;
    @Column(name = "nume_ips_ulti_esqu_radi")
    private Integer numeIpsUltiEsquRadi;
    @Column(name = "codi_ips1_ulti_radi")
    private Integer codiIps1UltiRadi;
    @Column(name = "codi_ips2_ulti_radi")
    private Integer codiIps2UltiRadi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin_radioterapia")
    @Temporal(TemporalType.DATE)
    private Date fechaFinRadioterapia;
    @Size(max = 2)
    @Column(name = "cara_actu__ulti_radi")
    private String caraActuUltiRadi;
    @Size(max = 2)
    @Column(name = "moti_fina_ulti_radi")
    private String motiFinaUltiRadi;
    @Size(max = 2)
    @Column(name = "tras_celu_hema")
    private String trasCeluHema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_trasplante")
    private String tipoTrasplante;
    @Size(max = 2)
    @Column(name = "ubic_tras_onco")
    private String ubicTrasOnco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_trasplante")
    @Temporal(TemporalType.DATE)
    private Date fechaTrasplante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_trasplante")
    private int codigoIpsTrasplante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "cirugia_reconstructiva")
    private String cirugiaReconstructiva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cirugia_reconstructiva")
    @Temporal(TemporalType.DATE)
    private Date fechaCirugiaReconstructiva;
    @Column(name = "codi_ips_ciru_reco")
    private Integer codiIpsCiruReco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "valorado_cuidado_paliativo")
    private String valoradoCuidadoPaliativo;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_medi")
    private String reciCuidPaliMedi;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_espe")
    private String reciCuidPaliEspe;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_medi_espe")
    private String reciCuidPaliMediEspe;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_medi_gene")
    private String reciCuidPaliMediGene;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_trab_soci")
    private String reciCuidPaliTrabSoci;
    @Size(max = 2)
    @Column(name = "reci_cuid_pali_prof_salu")
    private String reciCuidPaliProfSalu;
    @Column(name = "fech_prim_cuid_pali")
    @Temporal(TemporalType.DATE)
    private Date fechPrimCuidPali;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_cuidado_paliativo")
    private int codigoIpsCuidadoPaliativo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "valorado_psiquiatria")
    private String valoradoPsiquiatria;
    @Column(name = "fech_prim_cons_psiq")
    @Temporal(TemporalType.DATE)
    private Date fechPrimConsPsiq;
    @Column(name = "codi_ips_prim_psiq")
    private Integer codiIpsPrimPsiq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "valorado_nutricion")
    private String valoradoNutricion;
    @Column(name = "fech_prim_cons_nutr")
    @Temporal(TemporalType.DATE)
    private Date fechPrimConsNutr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_primera_nutricion")
    private int codigoIpsPrimeraNutricion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "soporte_nutricional")
    private String soporteNutricional;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "terapias_complementarias")
    private String terapiasComplementarias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_tratamiento")
    private String tipoTratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_oncologico")
    private String resultadoOncologico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado_vital_final")
    private String estadoVitalFinal;
    @Size(max = 2)
    @Column(name = "nove_admi_repo_ante")
    private String noveAdmiRepoAnte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "novedad_clinica_fecha_reporte")
    private String novedadClinicaFechaReporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_desafiliacion_eapb")
    @Temporal(TemporalType.DATE)
    private Date fechaDesafiliacionEapb;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteCancer() {
    }

    public WriteCmPacienteCancer(Long id) {
        this.id = id;
    }

    public WriteCmPacienteCancer(Long id, int ocupacion, String grupoPoblacional, String codigoCie, Date fechaDiagnosticoCancer, Date fechaInterconsultaMedico, Date fechaPrimeroHistopatologico, Date fechaPrimeraConsultaMedico, String histologiaTumorBiopsia, String gradoDiferenciacionTumor, int tumorSolido, Date fechaEstadificacion, String her2, Date fechaRealizacionHer2, String resultadoHer2, String estadificacionDukes, Date fechaEstadificacionDukes, String gleasonDiagnostico, int riesgoLinfomasLeucemias, Date fechaClasificacionRiesgo, String objetivoTratamientoMedico, String antecedentesCancerPrimario, String tipoCancerAntecedente, String quimioterapia, String quimioOtroLeucemiaLinfoma, String quimioIntratecal, Date fechaFinalEsquemaQuimio, String motivoFinalizacionEsquema, int numeroIpsSuministraEsquema, int codigoIps1UltimoEsquema, int codigoIps2UltimoEsquema, String motivoFinalUltimoEsquema, int numCirugiasPeriodoReporte, Date fechaPrimeraCirugia, int codigoIpsPrimeraCirugia, int codigoPrimeraCirugia, Date fechaUltimaCirugia, String motivoUltimaCirugia, int codigoIpsUltimaCirugia, int codigoUltimaCirugia, String ubicacionUltimaCirugia, String estadoVitalCirugia, String radioterapiaReporteActual, int numSesionesRadioterapia, int tipoRadioterapia, int codigoIps1Radioterapia, int codigoIps2Radioterapia, String caracActualesRadioterapia, Date fechaInicioRadioterapia, String ubicacionUltimoRadioterapia, Date fechaFinRadioterapia, String tipoTrasplante, Date fechaTrasplante, int codigoIpsTrasplante, String cirugiaReconstructiva, Date fechaCirugiaReconstructiva, String valoradoCuidadoPaliativo, int codigoIpsCuidadoPaliativo, String valoradoPsiquiatria, String valoradoNutricion, int codigoIpsPrimeraNutricion, String soporteNutricional, String terapiasComplementarias, String tipoTratamiento, String resultadoOncologico, String estadoVitalFinal, String novedadClinicaFechaReporte, Date fechaDesafiliacionEapb) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.grupoPoblacional = grupoPoblacional;
        this.codigoCie = codigoCie;
        this.fechaDiagnosticoCancer = fechaDiagnosticoCancer;
        this.fechaInterconsultaMedico = fechaInterconsultaMedico;
        this.fechaPrimeroHistopatologico = fechaPrimeroHistopatologico;
        this.fechaPrimeraConsultaMedico = fechaPrimeraConsultaMedico;
        this.histologiaTumorBiopsia = histologiaTumorBiopsia;
        this.gradoDiferenciacionTumor = gradoDiferenciacionTumor;
        this.tumorSolido = tumorSolido;
        this.fechaEstadificacion = fechaEstadificacion;
        this.her2 = her2;
        this.fechaRealizacionHer2 = fechaRealizacionHer2;
        this.resultadoHer2 = resultadoHer2;
        this.estadificacionDukes = estadificacionDukes;
        this.fechaEstadificacionDukes = fechaEstadificacionDukes;
        this.gleasonDiagnostico = gleasonDiagnostico;
        this.riesgoLinfomasLeucemias = riesgoLinfomasLeucemias;
        this.fechaClasificacionRiesgo = fechaClasificacionRiesgo;
        this.objetivoTratamientoMedico = objetivoTratamientoMedico;
        this.antecedentesCancerPrimario = antecedentesCancerPrimario;
        this.tipoCancerAntecedente = tipoCancerAntecedente;
        this.quimioterapia = quimioterapia;
        this.quimioOtroLeucemiaLinfoma = quimioOtroLeucemiaLinfoma;
        this.quimioIntratecal = quimioIntratecal;
        this.fechaFinalEsquemaQuimio = fechaFinalEsquemaQuimio;
        this.motivoFinalizacionEsquema = motivoFinalizacionEsquema;
        this.numeroIpsSuministraEsquema = numeroIpsSuministraEsquema;
        this.codigoIps1UltimoEsquema = codigoIps1UltimoEsquema;
        this.codigoIps2UltimoEsquema = codigoIps2UltimoEsquema;
        this.motivoFinalUltimoEsquema = motivoFinalUltimoEsquema;
        this.numCirugiasPeriodoReporte = numCirugiasPeriodoReporte;
        this.fechaPrimeraCirugia = fechaPrimeraCirugia;
        this.codigoIpsPrimeraCirugia = codigoIpsPrimeraCirugia;
        this.codigoPrimeraCirugia = codigoPrimeraCirugia;
        this.fechaUltimaCirugia = fechaUltimaCirugia;
        this.motivoUltimaCirugia = motivoUltimaCirugia;
        this.codigoIpsUltimaCirugia = codigoIpsUltimaCirugia;
        this.codigoUltimaCirugia = codigoUltimaCirugia;
        this.ubicacionUltimaCirugia = ubicacionUltimaCirugia;
        this.estadoVitalCirugia = estadoVitalCirugia;
        this.radioterapiaReporteActual = radioterapiaReporteActual;
        this.numSesionesRadioterapia = numSesionesRadioterapia;
        this.tipoRadioterapia = tipoRadioterapia;
        this.codigoIps1Radioterapia = codigoIps1Radioterapia;
        this.codigoIps2Radioterapia = codigoIps2Radioterapia;
        this.caracActualesRadioterapia = caracActualesRadioterapia;
        this.fechaInicioRadioterapia = fechaInicioRadioterapia;
        this.ubicacionUltimoRadioterapia = ubicacionUltimoRadioterapia;
        this.fechaFinRadioterapia = fechaFinRadioterapia;
        this.tipoTrasplante = tipoTrasplante;
        this.fechaTrasplante = fechaTrasplante;
        this.codigoIpsTrasplante = codigoIpsTrasplante;
        this.cirugiaReconstructiva = cirugiaReconstructiva;
        this.fechaCirugiaReconstructiva = fechaCirugiaReconstructiva;
        this.valoradoCuidadoPaliativo = valoradoCuidadoPaliativo;
        this.codigoIpsCuidadoPaliativo = codigoIpsCuidadoPaliativo;
        this.valoradoPsiquiatria = valoradoPsiquiatria;
        this.valoradoNutricion = valoradoNutricion;
        this.codigoIpsPrimeraNutricion = codigoIpsPrimeraNutricion;
        this.soporteNutricional = soporteNutricional;
        this.terapiasComplementarias = terapiasComplementarias;
        this.tipoTratamiento = tipoTratamiento;
        this.resultadoOncologico = resultadoOncologico;
        this.estadoVitalFinal = estadoVitalFinal;
        this.novedadClinicaFechaReporte = novedadClinicaFechaReporte;
        this.fechaDesafiliacionEapb = fechaDesafiliacionEapb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(String grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public String getCodigoCie() {
        return codigoCie;
    }

    public void setCodigoCie(String codigoCie) {
        this.codigoCie = codigoCie;
    }

    public Date getFechaDiagnosticoCancer() {
        return fechaDiagnosticoCancer;
    }

    public void setFechaDiagnosticoCancer(Date fechaDiagnosticoCancer) {
        this.fechaDiagnosticoCancer = fechaDiagnosticoCancer;
    }

    public Date getFechaInterconsultaMedico() {
        return fechaInterconsultaMedico;
    }

    public void setFechaInterconsultaMedico(Date fechaInterconsultaMedico) {
        this.fechaInterconsultaMedico = fechaInterconsultaMedico;
    }

    public Date getFechIngrInstDiag() {
        return fechIngrInstDiag;
    }

    public void setFechIngrInstDiag(Date fechIngrInstDiag) {
        this.fechIngrInstDiag = fechIngrInstDiag;
    }

    public String getTipoEstuDiagCanc() {
        return tipoEstuDiagCanc;
    }

    public void setTipoEstuDiagCanc(String tipoEstuDiagCanc) {
        this.tipoEstuDiagCanc = tipoEstuDiagCanc;
    }

    public String getMotiNoDiagHist() {
        return motiNoDiagHist;
    }

    public void setMotiNoDiagHist(String motiNoDiagHist) {
        this.motiNoDiagHist = motiNoDiagHist;
    }

    public Date getFechRecoHist() {
        return fechRecoHist;
    }

    public void setFechRecoHist(Date fechRecoHist) {
        this.fechRecoHist = fechRecoHist;
    }

    public Date getFechaPrimeroHistopatologico() {
        return fechaPrimeroHistopatologico;
    }

    public void setFechaPrimeroHistopatologico(Date fechaPrimeroHistopatologico) {
        this.fechaPrimeroHistopatologico = fechaPrimeroHistopatologico;
    }

    public Integer getCodiHabiIpsDiag() {
        return codiHabiIpsDiag;
    }

    public void setCodiHabiIpsDiag(Integer codiHabiIpsDiag) {
        this.codiHabiIpsDiag = codiHabiIpsDiag;
    }

    public Date getFechaPrimeraConsultaMedico() {
        return fechaPrimeraConsultaMedico;
    }

    public void setFechaPrimeraConsultaMedico(Date fechaPrimeraConsultaMedico) {
        this.fechaPrimeraConsultaMedico = fechaPrimeraConsultaMedico;
    }

    public String getHistologiaTumorBiopsia() {
        return histologiaTumorBiopsia;
    }

    public void setHistologiaTumorBiopsia(String histologiaTumorBiopsia) {
        this.histologiaTumorBiopsia = histologiaTumorBiopsia;
    }

    public String getGradoDiferenciacionTumor() {
        return gradoDiferenciacionTumor;
    }

    public void setGradoDiferenciacionTumor(String gradoDiferenciacionTumor) {
        this.gradoDiferenciacionTumor = gradoDiferenciacionTumor;
    }

    public int getTumorSolido() {
        return tumorSolido;
    }

    public void setTumorSolido(int tumorSolido) {
        this.tumorSolido = tumorSolido;
    }

    public Date getFechaEstadificacion() {
        return fechaEstadificacion;
    }

    public void setFechaEstadificacion(Date fechaEstadificacion) {
        this.fechaEstadificacion = fechaEstadificacion;
    }

    public String getHer2() {
        return her2;
    }

    public void setHer2(String her2) {
        this.her2 = her2;
    }

    public Date getFechaRealizacionHer2() {
        return fechaRealizacionHer2;
    }

    public void setFechaRealizacionHer2(Date fechaRealizacionHer2) {
        this.fechaRealizacionHer2 = fechaRealizacionHer2;
    }

    public String getResultadoHer2() {
        return resultadoHer2;
    }

    public void setResultadoHer2(String resultadoHer2) {
        this.resultadoHer2 = resultadoHer2;
    }

    public String getEstadificacionDukes() {
        return estadificacionDukes;
    }

    public void setEstadificacionDukes(String estadificacionDukes) {
        this.estadificacionDukes = estadificacionDukes;
    }

    public Date getFechaEstadificacionDukes() {
        return fechaEstadificacionDukes;
    }

    public void setFechaEstadificacionDukes(Date fechaEstadificacionDukes) {
        this.fechaEstadificacionDukes = fechaEstadificacionDukes;
    }

    public String getEstaLinfHodg() {
        return estaLinfHodg;
    }

    public void setEstaLinfHodg(String estaLinfHodg) {
        this.estaLinfHodg = estaLinfHodg;
    }

    public String getGleasonDiagnostico() {
        return gleasonDiagnostico;
    }

    public void setGleasonDiagnostico(String gleasonDiagnostico) {
        this.gleasonDiagnostico = gleasonDiagnostico;
    }

    public int getRiesgoLinfomasLeucemias() {
        return riesgoLinfomasLeucemias;
    }

    public void setRiesgoLinfomasLeucemias(int riesgoLinfomasLeucemias) {
        this.riesgoLinfomasLeucemias = riesgoLinfomasLeucemias;
    }

    public Date getFechaClasificacionRiesgo() {
        return fechaClasificacionRiesgo;
    }

    public void setFechaClasificacionRiesgo(Date fechaClasificacionRiesgo) {
        this.fechaClasificacionRiesgo = fechaClasificacionRiesgo;
    }

    public String getObjetivoTratamientoMedico() {
        return objetivoTratamientoMedico;
    }

    public void setObjetivoTratamientoMedico(String objetivoTratamientoMedico) {
        this.objetivoTratamientoMedico = objetivoTratamientoMedico;
    }

    public String getInteMediPeriRepo() {
        return inteMediPeriRepo;
    }

    public void setInteMediPeriRepo(String inteMediPeriRepo) {
        this.inteMediPeriRepo = inteMediPeriRepo;
    }

    public String getAntecedentesCancerPrimario() {
        return antecedentesCancerPrimario;
    }

    public void setAntecedentesCancerPrimario(String antecedentesCancerPrimario) {
        this.antecedentesCancerPrimario = antecedentesCancerPrimario;
    }

    public Date getFechDiagCancPrim() {
        return fechDiagCancPrim;
    }

    public void setFechDiagCancPrim(Date fechDiagCancPrim) {
        this.fechDiagCancPrim = fechDiagCancPrim;
    }

    public String getTipoCancerAntecedente() {
        return tipoCancerAntecedente;
    }

    public void setTipoCancerAntecedente(String tipoCancerAntecedente) {
        this.tipoCancerAntecedente = tipoCancerAntecedente;
    }

    public String getQuimioterapia() {
        return quimioterapia;
    }

    public void setQuimioterapia(String quimioterapia) {
        this.quimioterapia = quimioterapia;
    }

    public String getFaseQuimPeriRepo() {
        return faseQuimPeriRepo;
    }

    public void setFaseQuimPeriRepo(String faseQuimPeriRepo) {
        this.faseQuimPeriRepo = faseQuimPeriRepo;
    }

    public String getQuimCitoLeucLinf() {
        return quimCitoLeucLinf;
    }

    public void setQuimCitoLeucLinf(String quimCitoLeucLinf) {
        this.quimCitoLeucLinf = quimCitoLeucLinf;
    }

    public String getQuimInduLeucLinf() {
        return quimInduLeucLinf;
    }

    public void setQuimInduLeucLinf(String quimInduLeucLinf) {
        this.quimInduLeucLinf = quimInduLeucLinf;
    }

    public String getQuimInteLeucLinf() {
        return quimInteLeucLinf;
    }

    public void setQuimInteLeucLinf(String quimInteLeucLinf) {
        this.quimInteLeucLinf = quimInteLeucLinf;
    }

    public String getQuimConsLeucLinf() {
        return quimConsLeucLinf;
    }

    public void setQuimConsLeucLinf(String quimConsLeucLinf) {
        this.quimConsLeucLinf = quimConsLeucLinf;
    }

    public String getQuimReinLeucLinf() {
        return quimReinLeucLinf;
    }

    public void setQuimReinLeucLinf(String quimReinLeucLinf) {
        this.quimReinLeucLinf = quimReinLeucLinf;
    }

    public String getQuimMantLeucLinf() {
        return quimMantLeucLinf;
    }

    public void setQuimMantLeucLinf(String quimMantLeucLinf) {
        this.quimMantLeucLinf = quimMantLeucLinf;
    }

    public String getQuimMantLargLeucLinf() {
        return quimMantLargLeucLinf;
    }

    public void setQuimMantLargLeucLinf(String quimMantLargLeucLinf) {
        this.quimMantLargLeucLinf = quimMantLargLeucLinf;
    }

    public String getQuimioOtroLeucemiaLinfoma() {
        return quimioOtroLeucemiaLinfoma;
    }

    public void setQuimioOtroLeucemiaLinfoma(String quimioOtroLeucemiaLinfoma) {
        this.quimioOtroLeucemiaLinfoma = quimioOtroLeucemiaLinfoma;
    }

    public Integer getCiclInicPeriRepo() {
        return ciclInicPeriRepo;
    }

    public void setCiclInicPeriRepo(Integer ciclInicPeriRepo) {
        this.ciclInicPeriRepo = ciclInicPeriRepo;
    }

    public String getUbicEsquQuimOnco() {
        return ubicEsquQuimOnco;
    }

    public void setUbicEsquQuimOnco(String ubicEsquQuimOnco) {
        this.ubicEsquQuimOnco = ubicEsquQuimOnco;
    }

    public Date getFechInicPrimEsquQuim() {
        return fechInicPrimEsquQuim;
    }

    public void setFechInicPrimEsquQuim(Date fechInicPrimEsquQuim) {
        this.fechInicPrimEsquQuim = fechInicPrimEsquQuim;
    }

    public Integer getNumeIpsPrimEsquQuim() {
        return numeIpsPrimEsquQuim;
    }

    public void setNumeIpsPrimEsquQuim(Integer numeIpsPrimEsquQuim) {
        this.numeIpsPrimEsquQuim = numeIpsPrimEsquQuim;
    }

    public Integer getCodiIps1PrimEsquQuim() {
        return codiIps1PrimEsquQuim;
    }

    public void setCodiIps1PrimEsquQuim(Integer codiIps1PrimEsquQuim) {
        this.codiIps1PrimEsquQuim = codiIps1PrimEsquQuim;
    }

    public Integer getCodiIps2PrimEsquQuim() {
        return codiIps2PrimEsquQuim;
    }

    public void setCodiIps2PrimEsquQuim(Integer codiIps2PrimEsquQuim) {
        this.codiIps2PrimEsquQuim = codiIps2PrimEsquQuim;
    }

    public String getNumMediInicAntiEspe() {
        return numMediInicAntiEspe;
    }

    public void setNumMediInicAntiEspe(String numMediInicAntiEspe) {
        this.numMediInicAntiEspe = numMediInicAntiEspe;
    }

    public String getPrimMediInicAnti() {
        return primMediInicAnti;
    }

    public void setPrimMediInicAnti(String primMediInicAnti) {
        this.primMediInicAnti = primMediInicAnti;
    }

    public String getSeguMediInicAnti() {
        return seguMediInicAnti;
    }

    public void setSeguMediInicAnti(String seguMediInicAnti) {
        this.seguMediInicAnti = seguMediInicAnti;
    }

    public String getTercMediInicAnti() {
        return tercMediInicAnti;
    }

    public void setTercMediInicAnti(String tercMediInicAnti) {
        this.tercMediInicAnti = tercMediInicAnti;
    }

    public String getCuarMediInicAnti() {
        return cuarMediInicAnti;
    }

    public void setCuarMediInicAnti(String cuarMediInicAnti) {
        this.cuarMediInicAnti = cuarMediInicAnti;
    }

    public String getQuinMediInicAnti() {
        return quinMediInicAnti;
    }

    public void setQuinMediInicAnti(String quinMediInicAnti) {
        this.quinMediInicAnti = quinMediInicAnti;
    }

    public String getSextMediInicAnti() {
        return sextMediInicAnti;
    }

    public void setSextMediInicAnti(String sextMediInicAnti) {
        this.sextMediInicAnti = sextMediInicAnti;
    }

    public String getSeptMediInicAnti() {
        return septMediInicAnti;
    }

    public void setSeptMediInicAnti(String septMediInicAnti) {
        this.septMediInicAnti = septMediInicAnti;
    }

    public String getOctaMediInicAnti() {
        return octaMediInicAnti;
    }

    public void setOctaMediInicAnti(String octaMediInicAnti) {
        this.octaMediInicAnti = octaMediInicAnti;
    }

    public String getNoveMediInicAnti() {
        return noveMediInicAnti;
    }

    public void setNoveMediInicAnti(String noveMediInicAnti) {
        this.noveMediInicAnti = noveMediInicAnti;
    }

    public String getPrimMediTeraHorm() {
        return primMediTeraHorm;
    }

    public void setPrimMediTeraHorm(String primMediTeraHorm) {
        this.primMediTeraHorm = primMediTeraHorm;
    }

    public String getSeguMediTeraHorm() {
        return seguMediTeraHorm;
    }

    public void setSeguMediTeraHorm(String seguMediTeraHorm) {
        this.seguMediTeraHorm = seguMediTeraHorm;
    }

    public String getTercMediTeraHorm() {
        return tercMediTeraHorm;
    }

    public void setTercMediTeraHorm(String tercMediTeraHorm) {
        this.tercMediTeraHorm = tercMediTeraHorm;
    }

    public String getQuimioIntratecal() {
        return quimioIntratecal;
    }

    public void setQuimioIntratecal(String quimioIntratecal) {
        this.quimioIntratecal = quimioIntratecal;
    }

    public Date getFechaFinalEsquemaQuimio() {
        return fechaFinalEsquemaQuimio;
    }

    public void setFechaFinalEsquemaQuimio(Date fechaFinalEsquemaQuimio) {
        this.fechaFinalEsquemaQuimio = fechaFinalEsquemaQuimio;
    }

    public String getCaraActuEsquQuim() {
        return caraActuEsquQuim;
    }

    public void setCaraActuEsquQuim(String caraActuEsquQuim) {
        this.caraActuEsquQuim = caraActuEsquQuim;
    }

    public String getMotivoFinalizacionEsquema() {
        return motivoFinalizacionEsquema;
    }

    public void setMotivoFinalizacionEsquema(String motivoFinalizacionEsquema) {
        this.motivoFinalizacionEsquema = motivoFinalizacionEsquema;
    }

    public String getUbicTempUltiEsqu() {
        return ubicTempUltiEsqu;
    }

    public void setUbicTempUltiEsqu(String ubicTempUltiEsqu) {
        this.ubicTempUltiEsqu = ubicTempUltiEsqu;
    }

    public Date getFechInicUltiEsquQuim() {
        return fechInicUltiEsquQuim;
    }

    public void setFechInicUltiEsquQuim(Date fechInicUltiEsquQuim) {
        this.fechInicUltiEsquQuim = fechInicUltiEsquQuim;
    }

    public int getNumeroIpsSuministraEsquema() {
        return numeroIpsSuministraEsquema;
    }

    public void setNumeroIpsSuministraEsquema(int numeroIpsSuministraEsquema) {
        this.numeroIpsSuministraEsquema = numeroIpsSuministraEsquema;
    }

    public int getCodigoIps1UltimoEsquema() {
        return codigoIps1UltimoEsquema;
    }

    public void setCodigoIps1UltimoEsquema(int codigoIps1UltimoEsquema) {
        this.codigoIps1UltimoEsquema = codigoIps1UltimoEsquema;
    }

    public int getCodigoIps2UltimoEsquema() {
        return codigoIps2UltimoEsquema;
    }

    public void setCodigoIps2UltimoEsquema(int codigoIps2UltimoEsquema) {
        this.codigoIps2UltimoEsquema = codigoIps2UltimoEsquema;
    }

    public String getNumMediFinAntiEspe() {
        return numMediFinAntiEspe;
    }

    public void setNumMediFinAntiEspe(String numMediFinAntiEspe) {
        this.numMediFinAntiEspe = numMediFinAntiEspe;
    }

    public String getPrimMediFinAnti() {
        return primMediFinAnti;
    }

    public void setPrimMediFinAnti(String primMediFinAnti) {
        this.primMediFinAnti = primMediFinAnti;
    }

    public String getSeguMediFinAnti() {
        return seguMediFinAnti;
    }

    public void setSeguMediFinAnti(String seguMediFinAnti) {
        this.seguMediFinAnti = seguMediFinAnti;
    }

    public String getTercMediFinAnti() {
        return tercMediFinAnti;
    }

    public void setTercMediFinAnti(String tercMediFinAnti) {
        this.tercMediFinAnti = tercMediFinAnti;
    }

    public String getCuarMediFinAnti() {
        return cuarMediFinAnti;
    }

    public void setCuarMediFinAnti(String cuarMediFinAnti) {
        this.cuarMediFinAnti = cuarMediFinAnti;
    }

    public String getQuinMediFinAnti() {
        return quinMediFinAnti;
    }

    public void setQuinMediFinAnti(String quinMediFinAnti) {
        this.quinMediFinAnti = quinMediFinAnti;
    }

    public String getSextMediFinAnti() {
        return sextMediFinAnti;
    }

    public void setSextMediFinAnti(String sextMediFinAnti) {
        this.sextMediFinAnti = sextMediFinAnti;
    }

    public String getSeptMediFinAnti() {
        return septMediFinAnti;
    }

    public void setSeptMediFinAnti(String septMediFinAnti) {
        this.septMediFinAnti = septMediFinAnti;
    }

    public String getOctaMediFinAnti() {
        return octaMediFinAnti;
    }

    public void setOctaMediFinAnti(String octaMediFinAnti) {
        this.octaMediFinAnti = octaMediFinAnti;
    }

    public String getNoveMediFinAnti() {
        return noveMediFinAnti;
    }

    public void setNoveMediFinAnti(String noveMediFinAnti) {
        this.noveMediFinAnti = noveMediFinAnti;
    }

    public String getPrimMediFinTeraHorm() {
        return primMediFinTeraHorm;
    }

    public void setPrimMediFinTeraHorm(String primMediFinTeraHorm) {
        this.primMediFinTeraHorm = primMediFinTeraHorm;
    }

    public String getSeguMediFinTeraHorm() {
        return seguMediFinTeraHorm;
    }

    public void setSeguMediFinTeraHorm(String seguMediFinTeraHorm) {
        this.seguMediFinTeraHorm = seguMediFinTeraHorm;
    }

    public String getTercMediFinTeraHorm() {
        return tercMediFinTeraHorm;
    }

    public void setTercMediFinTeraHorm(String tercMediFinTeraHorm) {
        this.tercMediFinTeraHorm = tercMediFinTeraHorm;
    }

    public String getQuimIntrUltiPeriRepo() {
        return quimIntrUltiPeriRepo;
    }

    public void setQuimIntrUltiPeriRepo(String quimIntrUltiPeriRepo) {
        this.quimIntrUltiPeriRepo = quimIntrUltiPeriRepo;
    }

    public Date getFechFinaUltiEsquQuim() {
        return fechFinaUltiEsquQuim;
    }

    public void setFechFinaUltiEsquQuim(Date fechFinaUltiEsquQuim) {
        this.fechFinaUltiEsquQuim = fechFinaUltiEsquQuim;
    }

    public String getCaraActuUltiEsqu() {
        return caraActuUltiEsqu;
    }

    public void setCaraActuUltiEsqu(String caraActuUltiEsqu) {
        this.caraActuUltiEsqu = caraActuUltiEsqu;
    }

    public String getMotivoFinalUltimoEsquema() {
        return motivoFinalUltimoEsquema;
    }

    public void setMotivoFinalUltimoEsquema(String motivoFinalUltimoEsquema) {
        this.motivoFinalUltimoEsquema = motivoFinalUltimoEsquema;
    }

    public String getCiruPalePeriRepo() {
        return ciruPalePeriRepo;
    }

    public void setCiruPalePeriRepo(String ciruPalePeriRepo) {
        this.ciruPalePeriRepo = ciruPalePeriRepo;
    }

    public int getNumCirugiasPeriodoReporte() {
        return numCirugiasPeriodoReporte;
    }

    public void setNumCirugiasPeriodoReporte(int numCirugiasPeriodoReporte) {
        this.numCirugiasPeriodoReporte = numCirugiasPeriodoReporte;
    }

    public Date getFechaPrimeraCirugia() {
        return fechaPrimeraCirugia;
    }

    public void setFechaPrimeraCirugia(Date fechaPrimeraCirugia) {
        this.fechaPrimeraCirugia = fechaPrimeraCirugia;
    }

    public int getCodigoIpsPrimeraCirugia() {
        return codigoIpsPrimeraCirugia;
    }

    public void setCodigoIpsPrimeraCirugia(int codigoIpsPrimeraCirugia) {
        this.codigoIpsPrimeraCirugia = codigoIpsPrimeraCirugia;
    }

    public int getCodigoPrimeraCirugia() {
        return codigoPrimeraCirugia;
    }

    public void setCodigoPrimeraCirugia(int codigoPrimeraCirugia) {
        this.codigoPrimeraCirugia = codigoPrimeraCirugia;
    }

    public String getUbicPrimCiruOnco() {
        return ubicPrimCiruOnco;
    }

    public void setUbicPrimCiruOnco(String ubicPrimCiruOnco) {
        this.ubicPrimCiruOnco = ubicPrimCiruOnco;
    }

    public Date getFechaUltimaCirugia() {
        return fechaUltimaCirugia;
    }

    public void setFechaUltimaCirugia(Date fechaUltimaCirugia) {
        this.fechaUltimaCirugia = fechaUltimaCirugia;
    }

    public String getMotivoUltimaCirugia() {
        return motivoUltimaCirugia;
    }

    public void setMotivoUltimaCirugia(String motivoUltimaCirugia) {
        this.motivoUltimaCirugia = motivoUltimaCirugia;
    }

    public int getCodigoIpsUltimaCirugia() {
        return codigoIpsUltimaCirugia;
    }

    public void setCodigoIpsUltimaCirugia(int codigoIpsUltimaCirugia) {
        this.codigoIpsUltimaCirugia = codigoIpsUltimaCirugia;
    }

    public int getCodigoUltimaCirugia() {
        return codigoUltimaCirugia;
    }

    public void setCodigoUltimaCirugia(int codigoUltimaCirugia) {
        this.codigoUltimaCirugia = codigoUltimaCirugia;
    }

    public String getUbicacionUltimaCirugia() {
        return ubicacionUltimaCirugia;
    }

    public void setUbicacionUltimaCirugia(String ubicacionUltimaCirugia) {
        this.ubicacionUltimaCirugia = ubicacionUltimaCirugia;
    }

    public String getEstadoVitalCirugia() {
        return estadoVitalCirugia;
    }

    public void setEstadoVitalCirugia(String estadoVitalCirugia) {
        this.estadoVitalCirugia = estadoVitalCirugia;
    }

    public String getRadioterapiaReporteActual() {
        return radioterapiaReporteActual;
    }

    public void setRadioterapiaReporteActual(String radioterapiaReporteActual) {
        this.radioterapiaReporteActual = radioterapiaReporteActual;
    }

    public int getNumSesionesRadioterapia() {
        return numSesionesRadioterapia;
    }

    public void setNumSesionesRadioterapia(int numSesionesRadioterapia) {
        this.numSesionesRadioterapia = numSesionesRadioterapia;
    }

    public Date getFechPrimEsquRadi() {
        return fechPrimEsquRadi;
    }

    public void setFechPrimEsquRadi(Date fechPrimEsquRadi) {
        this.fechPrimEsquRadi = fechPrimEsquRadi;
    }

    public String getUbicPrimEsquRadi() {
        return ubicPrimEsquRadi;
    }

    public void setUbicPrimEsquRadi(String ubicPrimEsquRadi) {
        this.ubicPrimEsquRadi = ubicPrimEsquRadi;
    }

    public int getTipoRadioterapia() {
        return tipoRadioterapia;
    }

    public void setTipoRadioterapia(int tipoRadioterapia) {
        this.tipoRadioterapia = tipoRadioterapia;
    }

    public Integer getNumeIpsPrimEsquRadi() {
        return numeIpsPrimEsquRadi;
    }

    public void setNumeIpsPrimEsquRadi(Integer numeIpsPrimEsquRadi) {
        this.numeIpsPrimEsquRadi = numeIpsPrimEsquRadi;
    }

    public int getCodigoIps1Radioterapia() {
        return codigoIps1Radioterapia;
    }

    public void setCodigoIps1Radioterapia(int codigoIps1Radioterapia) {
        this.codigoIps1Radioterapia = codigoIps1Radioterapia;
    }

    public int getCodigoIps2Radioterapia() {
        return codigoIps2Radioterapia;
    }

    public void setCodigoIps2Radioterapia(int codigoIps2Radioterapia) {
        this.codigoIps2Radioterapia = codigoIps2Radioterapia;
    }

    public Date getFechFinPrimEsquRadi() {
        return fechFinPrimEsquRadi;
    }

    public void setFechFinPrimEsquRadi(Date fechFinPrimEsquRadi) {
        this.fechFinPrimEsquRadi = fechFinPrimEsquRadi;
    }

    public String getCaracActualesRadioterapia() {
        return caracActualesRadioterapia;
    }

    public void setCaracActualesRadioterapia(String caracActualesRadioterapia) {
        this.caracActualesRadioterapia = caracActualesRadioterapia;
    }

    public String getMotiFinPrimRadi() {
        return motiFinPrimRadi;
    }

    public void setMotiFinPrimRadi(String motiFinPrimRadi) {
        this.motiFinPrimRadi = motiFinPrimRadi;
    }

    public Date getFechaInicioRadioterapia() {
        return fechaInicioRadioterapia;
    }

    public void setFechaInicioRadioterapia(Date fechaInicioRadioterapia) {
        this.fechaInicioRadioterapia = fechaInicioRadioterapia;
    }

    public String getUbicacionUltimoRadioterapia() {
        return ubicacionUltimoRadioterapia;
    }

    public void setUbicacionUltimoRadioterapia(String ubicacionUltimoRadioterapia) {
        this.ubicacionUltimoRadioterapia = ubicacionUltimoRadioterapia;
    }

    public Integer getTipoRadiUltiEsqu() {
        return tipoRadiUltiEsqu;
    }

    public void setTipoRadiUltiEsqu(Integer tipoRadiUltiEsqu) {
        this.tipoRadiUltiEsqu = tipoRadiUltiEsqu;
    }

    public Integer getNumeIpsUltiEsquRadi() {
        return numeIpsUltiEsquRadi;
    }

    public void setNumeIpsUltiEsquRadi(Integer numeIpsUltiEsquRadi) {
        this.numeIpsUltiEsquRadi = numeIpsUltiEsquRadi;
    }

    public Integer getCodiIps1UltiRadi() {
        return codiIps1UltiRadi;
    }

    public void setCodiIps1UltiRadi(Integer codiIps1UltiRadi) {
        this.codiIps1UltiRadi = codiIps1UltiRadi;
    }

    public Integer getCodiIps2UltiRadi() {
        return codiIps2UltiRadi;
    }

    public void setCodiIps2UltiRadi(Integer codiIps2UltiRadi) {
        this.codiIps2UltiRadi = codiIps2UltiRadi;
    }

    public Date getFechaFinRadioterapia() {
        return fechaFinRadioterapia;
    }

    public void setFechaFinRadioterapia(Date fechaFinRadioterapia) {
        this.fechaFinRadioterapia = fechaFinRadioterapia;
    }

    public String getCaraActuUltiRadi() {
        return caraActuUltiRadi;
    }

    public void setCaraActuUltiRadi(String caraActuUltiRadi) {
        this.caraActuUltiRadi = caraActuUltiRadi;
    }

    public String getMotiFinaUltiRadi() {
        return motiFinaUltiRadi;
    }

    public void setMotiFinaUltiRadi(String motiFinaUltiRadi) {
        this.motiFinaUltiRadi = motiFinaUltiRadi;
    }

    public String getTrasCeluHema() {
        return trasCeluHema;
    }

    public void setTrasCeluHema(String trasCeluHema) {
        this.trasCeluHema = trasCeluHema;
    }

    public String getTipoTrasplante() {
        return tipoTrasplante;
    }

    public void setTipoTrasplante(String tipoTrasplante) {
        this.tipoTrasplante = tipoTrasplante;
    }

    public String getUbicTrasOnco() {
        return ubicTrasOnco;
    }

    public void setUbicTrasOnco(String ubicTrasOnco) {
        this.ubicTrasOnco = ubicTrasOnco;
    }

    public Date getFechaTrasplante() {
        return fechaTrasplante;
    }

    public void setFechaTrasplante(Date fechaTrasplante) {
        this.fechaTrasplante = fechaTrasplante;
    }

    public int getCodigoIpsTrasplante() {
        return codigoIpsTrasplante;
    }

    public void setCodigoIpsTrasplante(int codigoIpsTrasplante) {
        this.codigoIpsTrasplante = codigoIpsTrasplante;
    }

    public String getCirugiaReconstructiva() {
        return cirugiaReconstructiva;
    }

    public void setCirugiaReconstructiva(String cirugiaReconstructiva) {
        this.cirugiaReconstructiva = cirugiaReconstructiva;
    }

    public Date getFechaCirugiaReconstructiva() {
        return fechaCirugiaReconstructiva;
    }

    public void setFechaCirugiaReconstructiva(Date fechaCirugiaReconstructiva) {
        this.fechaCirugiaReconstructiva = fechaCirugiaReconstructiva;
    }

    public Integer getCodiIpsCiruReco() {
        return codiIpsCiruReco;
    }

    public void setCodiIpsCiruReco(Integer codiIpsCiruReco) {
        this.codiIpsCiruReco = codiIpsCiruReco;
    }

    public String getValoradoCuidadoPaliativo() {
        return valoradoCuidadoPaliativo;
    }

    public void setValoradoCuidadoPaliativo(String valoradoCuidadoPaliativo) {
        this.valoradoCuidadoPaliativo = valoradoCuidadoPaliativo;
    }

    public String getReciCuidPaliMedi() {
        return reciCuidPaliMedi;
    }

    public void setReciCuidPaliMedi(String reciCuidPaliMedi) {
        this.reciCuidPaliMedi = reciCuidPaliMedi;
    }

    public String getReciCuidPaliEspe() {
        return reciCuidPaliEspe;
    }

    public void setReciCuidPaliEspe(String reciCuidPaliEspe) {
        this.reciCuidPaliEspe = reciCuidPaliEspe;
    }

    public String getReciCuidPaliMediEspe() {
        return reciCuidPaliMediEspe;
    }

    public void setReciCuidPaliMediEspe(String reciCuidPaliMediEspe) {
        this.reciCuidPaliMediEspe = reciCuidPaliMediEspe;
    }

    public String getReciCuidPaliMediGene() {
        return reciCuidPaliMediGene;
    }

    public void setReciCuidPaliMediGene(String reciCuidPaliMediGene) {
        this.reciCuidPaliMediGene = reciCuidPaliMediGene;
    }

    public String getReciCuidPaliTrabSoci() {
        return reciCuidPaliTrabSoci;
    }

    public void setReciCuidPaliTrabSoci(String reciCuidPaliTrabSoci) {
        this.reciCuidPaliTrabSoci = reciCuidPaliTrabSoci;
    }

    public String getReciCuidPaliProfSalu() {
        return reciCuidPaliProfSalu;
    }

    public void setReciCuidPaliProfSalu(String reciCuidPaliProfSalu) {
        this.reciCuidPaliProfSalu = reciCuidPaliProfSalu;
    }

    public Date getFechPrimCuidPali() {
        return fechPrimCuidPali;
    }

    public void setFechPrimCuidPali(Date fechPrimCuidPali) {
        this.fechPrimCuidPali = fechPrimCuidPali;
    }

    public int getCodigoIpsCuidadoPaliativo() {
        return codigoIpsCuidadoPaliativo;
    }

    public void setCodigoIpsCuidadoPaliativo(int codigoIpsCuidadoPaliativo) {
        this.codigoIpsCuidadoPaliativo = codigoIpsCuidadoPaliativo;
    }

    public String getValoradoPsiquiatria() {
        return valoradoPsiquiatria;
    }

    public void setValoradoPsiquiatria(String valoradoPsiquiatria) {
        this.valoradoPsiquiatria = valoradoPsiquiatria;
    }

    public Date getFechPrimConsPsiq() {
        return fechPrimConsPsiq;
    }

    public void setFechPrimConsPsiq(Date fechPrimConsPsiq) {
        this.fechPrimConsPsiq = fechPrimConsPsiq;
    }

    public Integer getCodiIpsPrimPsiq() {
        return codiIpsPrimPsiq;
    }

    public void setCodiIpsPrimPsiq(Integer codiIpsPrimPsiq) {
        this.codiIpsPrimPsiq = codiIpsPrimPsiq;
    }

    public String getValoradoNutricion() {
        return valoradoNutricion;
    }

    public void setValoradoNutricion(String valoradoNutricion) {
        this.valoradoNutricion = valoradoNutricion;
    }

    public Date getFechPrimConsNutr() {
        return fechPrimConsNutr;
    }

    public void setFechPrimConsNutr(Date fechPrimConsNutr) {
        this.fechPrimConsNutr = fechPrimConsNutr;
    }

    public int getCodigoIpsPrimeraNutricion() {
        return codigoIpsPrimeraNutricion;
    }

    public void setCodigoIpsPrimeraNutricion(int codigoIpsPrimeraNutricion) {
        this.codigoIpsPrimeraNutricion = codigoIpsPrimeraNutricion;
    }

    public String getSoporteNutricional() {
        return soporteNutricional;
    }

    public void setSoporteNutricional(String soporteNutricional) {
        this.soporteNutricional = soporteNutricional;
    }

    public String getTerapiasComplementarias() {
        return terapiasComplementarias;
    }

    public void setTerapiasComplementarias(String terapiasComplementarias) {
        this.terapiasComplementarias = terapiasComplementarias;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getResultadoOncologico() {
        return resultadoOncologico;
    }

    public void setResultadoOncologico(String resultadoOncologico) {
        this.resultadoOncologico = resultadoOncologico;
    }

    public String getEstadoVitalFinal() {
        return estadoVitalFinal;
    }

    public void setEstadoVitalFinal(String estadoVitalFinal) {
        this.estadoVitalFinal = estadoVitalFinal;
    }

    public String getNoveAdmiRepoAnte() {
        return noveAdmiRepoAnte;
    }

    public void setNoveAdmiRepoAnte(String noveAdmiRepoAnte) {
        this.noveAdmiRepoAnte = noveAdmiRepoAnte;
    }

    public String getNovedadClinicaFechaReporte() {
        return novedadClinicaFechaReporte;
    }

    public void setNovedadClinicaFechaReporte(String novedadClinicaFechaReporte) {
        this.novedadClinicaFechaReporte = novedadClinicaFechaReporte;
    }

    public Date getFechaDesafiliacionEapb() {
        return fechaDesafiliacionEapb;
    }

    public void setFechaDesafiliacionEapb(Date fechaDesafiliacionEapb) {
        this.fechaDesafiliacionEapb = fechaDesafiliacionEapb;
    }

    public WriteCmPaciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(WriteCmPaciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WriteCmPacienteCancer)) {
            return false;
        }
        WriteCmPacienteCancer other = (WriteCmPacienteCancer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteCancer[ id=" + id + " ]";
    }
    
}
