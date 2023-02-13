/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "cm_renales_paso")
public class CmRenalesPaso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Size(max = 20)
    @Column(name = "numero_identificacion_usuario")
    private String numeroIdentificacionUsuario;
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
    private Character sgsss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigo_eapb")
    private String codigoEapb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_pertenencia_etnica")
    private int codigoPertenenciaEtnica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grupo_poblacional")
    private int grupoPoblacional;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "municipio_residencia")
    private String municipioResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_afilicion_eps")
    @Temporal(TemporalType.DATE)
    private Date fechaAfilicionEps;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_seguimiento")
    private long codigoSeguimiento;
    @Column(name = "fech_ingr_prog_aten_rena")
    @Temporal(TemporalType.DATE)
    private Date fechIngrProgAtenRena;
    @Column(name = "diag_conf_hipe_arte")
    private Integer diagConfHipeArte;
    @Column(name = "fech_diag_hipe_arte")
    @Temporal(TemporalType.DATE)
    private Date fechDiagHipeArte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cost_hta_dura_peri_repo")
    private Double costHtaDuraPeriRepo;
    @Column(name = "diag_conf_diab_mell")
    private Character diagConfDiabMell;
    @Column(name = "fech_diag_diab_mell")
    @Temporal(TemporalType.DATE)
    private Date fechDiagDiabMell;
    @Column(name = "cost_dm_dura_peri_repo")
    private Double costDmDuraPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "etiologia_erc")
    private String etiologiaErc;
    @Basic(optional = false)
    @NotNull
    private double peso;
    @Basic(optional = false)
    @NotNull
    private double talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tension_arterial_sistolica")
    private double tensionArterialSistolica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tension_arterial_diastolica")
    private double tensionArterialDiastolica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creatinina_sangre")
    private double creatininaSangre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_creatinina")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaCreatinina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemoglobina_glicosilada")
    private double hemoglobinaGlicosilada;
    @Column(name = "fech_ulti_glic")
    @Temporal(TemporalType.DATE)
    private Date fechUltiGlic;
    @Basic(optional = false)
    @NotNull
    private float albuminuria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_albuminuria")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaAlbuminuria;
    @Column(name = "rela_albu_crea")
    private Integer relaAlbuCrea;
    @Column(name = "fech_ulti_albu_crea")
    @Temporal(TemporalType.DATE)
    private Date fechUltiAlbuCrea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colesterol_total")
    private double colesterolTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultimo_colesterol_total")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoColesterolTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colesterol_hdl")
    private double colesterolHdl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_colesterol_hdl")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaColesterolHdl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colesterol_ldl")
    private double colesterolLdl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultimo_colesterol_ldl")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoColesterolLdl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parathormona_pth")
    private double parathormonaPth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_parathormona_pth")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaParathormonaPth;
    @Column(name = "tasa_filt_glom_esti")
    private Double tasaFiltGlomEsti;
    @Size(max = 2)
    @Column(name = "reci_inhi_enzi_conv_angi")
    private String reciInhiEnziConvAngi;
    @Size(max = 2)
    @Column(name = "reci_anta_rece_angi_ii")
    private String reciAntaReceAngiIi;
    @Column(name = "tien_diag_erc_cual_esta")
    private Character tienDiagErcCualEsta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estadio_erc")
    private String estadioErc;
    @Column(name = "fech_diag_esta_erc5")
    @Temporal(TemporalType.DATE)
    private Date fechDiagEstaErc5;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "programa_atencion_renal")
    private String programaAtencionRenal;
    @Column(name = "tfg_med_fec_usu_ini_pri_trr")
    private Double tfgMedFecUsuIniPriTrr;
    @Size(max = 2)
    @Column(name = "modo_inic_prim_tera_reem_rena")
    private String modoInicPrimTeraReemRena;
    @Column(name = "fech_inic_tera_reem_rena")
    @Temporal(TemporalType.DATE)
    private Date fechInicTeraReemRena;
    @Column(name = "fech_ingr_unid_rena_actu")
    @Temporal(TemporalType.DATE)
    private Date fechIngrUnidRenaActu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String hemodialisis;
    @Column(name = "dosi_dial_ktv_sing_pool")
    private Double dosiDialKtvSingPool;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_total_hemodialisis")
    private double costoTotalHemodialisis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "dialisis_peritoneal")
    private String dialisisPeritoneal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dosis_dialisis_ktv_dpd")
    private double dosisDialisisKtvDpd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_hemodialisis")
    private float horasHemodialisis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peritonitis_infecciosa")
    private int peritonitisInfecciosa;
    @Column(name = "cost_tota_dp_peri_repo")
    private Integer costTotaDpPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "vacuna_hepatitis_b")
    private String vacunaHepatitisB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico_hepatitis_b")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnosticoHepatitisB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico_hepatitis_c")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnosticoHepatitisC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tratamiento_no_dialitico_erc")
    private Character tratamientoNoDialiticoErc;
    @Column(name = "cost_tota_tmnd_peri_cort")
    private Integer costTotaTmndPeriCort;
    @Basic(optional = false)
    @NotNull
    private float hemoglobina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "albumina_serica")
    private float albuminaSerica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fosforo_serico")
    private float fosforoSerico;
    @Size(max = 2)
    @Column(name = "valo_nefr_peri_repo")
    private String valoNefrPeriRepo;
    @Size(max = 2)
    @Column(name = "canc_cont_tras")
    private String cancContTras;
    @Size(max = 2)
    @Column(name = "infe_cron_cont_tras")
    private String infeCronContTras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "no_desea_trasplante")
    private String noDeseaTrasplante;
    @Size(max = 2)
    @Column(name = "vida_meno_seis_mese_cont_tras")
    private String vidaMenoSeisMeseContTras;
    @Size(max = 2)
    @Column(name = "limi_auto_cont_tras")
    private String limiAutoContTras;
    @Size(max = 2)
    @Column(name = "enfe_card_cont_tras")
    private String enfeCardContTras;
    @Size(max = 2)
    @Column(name = "vih_cont_tras")
    private String vihContTras;
    @Size(max = 2)
    @Column(name = "vhc_cont_tras")
    private String vhcContTras;
    @Size(max = 2)
    @Column(name = "enfe_inmu_cont_tras")
    private String enfeInmuContTras;
    @Size(max = 2)
    @Column(name = "enfe_pulm_cont_tras")
    private String enfePulmContTras;
    @Size(max = 2)
    @Column(name = "enfe_cron_cont_tras")
    private String enfeCronContTras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso_trasplante")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoTrasplante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "codigo_ips_lista_espera")
    private String codigoIpsListaEspera;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibido_trasplante_renal")
    private Character recibidoTrasplanteRenal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "codigo_eps_ultimo_trasplante")
    private String codigoEpsUltimoTrasplante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "codigo_ips_ultimo_trasplante")
    private String codigoIpsUltimoTrasplante;
    @Size(max = 2)
    @Column(name = "tipo_dona_ulti_tras")
    private String tipoDonaUltiTras;
    @Column(name = "cost_ulti_tras_peri_repo")
    private Integer costUltiTrasPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "complicacion_pos_trasplante")
    private String complicacionPosTrasplante;
    @Column(name = "fech_diag_cmv_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagCmvTras;
    @Column(name = "fech_diag_hong_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagHongTras;
    @Column(name = "fech_diag_tube_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagTubeTras;
    @Column(name = "fech_diag_vasc_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagVascTras;
    @Column(name = "fech_diag_urol_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagUrolTras;
    @Column(name = "fech_diag_heri_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagHeriTras;
    @Column(name = "fech_diag_canc_tras")
    @Temporal(TemporalType.DATE)
    private Date fechDiagCancTras;
    @Column(name = "num_medi_inmu")
    private Integer numMediInmu;
    @Size(max = 2)
    @Column(name = "meti_peri_repo")
    private String metiPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "azatioprina_periodo_reporte")
    private String azatioprinaPeriodoReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ciclosporina_periodo_reporte")
    private String ciclosporinaPeriodoReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "micofenolato_periodo_reporte")
    private String micofenolatoPeriodoReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tacrolimus_periodo_reporte")
    private String tacrolimusPeriodoReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "prednisona_periodo_reporte")
    private String prednisonaPeriodoReporte;
    @Column(name = "inmu_uno_peri_repo")
    private Integer inmuUnoPeriRepo;
    @Column(name = "inmu_dos_peri_repo")
    private Integer inmuDosPeriRepo;
    @Column(name = "inmu_tres_peri_repo")
    private Integer inmuTresPeriRepo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rechazos_trasplante_biopsia")
    private int rechazosTrasplanteBiopsia;
    @Column(name = "fech_prim_rech_tras")
    @Temporal(TemporalType.DATE)
    private Date fechPrimRechTras;
    @Column(name = "fech_reto_dial_perd_tras")
    @Temporal(TemporalType.DATE)
    private Date fechRetoDialPerdTras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_trasplantes_recibidos")
    private int numeroTrasplantesRecibidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_terapia_pos_trasplante")
    private int costoTerapiaPosTrasplante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "meses_prestacion_servicio")
    private int mesesPrestacionServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coto_total")
    private int cotoTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "codigo_eps_origen")
    private String codigoEpsOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "novedades_reporte_anterior")
    private String novedadesReporteAnterior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "causa_muerte")
    private String causaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_muerte")
    @Temporal(TemporalType.DATE)
    private Date fechaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_unico_identificacion")
    private int codigoUnicoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_corte_reporte")
    @Temporal(TemporalType.DATE)
    private Date fechaCorteReporte;
    @NotNull
    @Column(name = "campo_leido")
    private boolean campoLeido;
    @Column(name = "clave_archivo")
    private String claveArchvio;
    @Column(name = "error_validacion")
    private String errorValidacion;

    public CmRenalesPaso() {
    }

    public CmRenalesPaso(Integer idEnfermedadesRenales) {
        this.id = id;
    }

    public CmRenalesPaso(Integer id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacion, Date fechaNacimiento, Character sexo, Character sgsss, String codigoEapb, int codigoPertenenciaEtnica, int grupoPoblacional, String municipioResidencia, String telefono, Date fechaAfilicionEps, long codigoSeguimiento, String etiologiaErc, double peso, double talla, double tensionArterialSistolica, double tensionArterialDiastolica, double creatininaSangre, Date fechaUltimaCreatinina, double hemoglobinaGlicosilada, float albuminuria, Date fechaUltimaAlbuminuria, double colesterolTotal, Date fechaUltimoColesterolTotal, double colesterolHdl, Date fechaUltimaColesterolHdl, double colesterolLdl, Date fechaUltimoColesterolLdl, double parathormonaPth, Date fechaUltimaParathormonaPth, String estadioErc, String programaAtencionRenal, String hemodialisis, double costoTotalHemodialisis, String dialisisPeritoneal, double dosisDialisisKtvDpd, float horasHemodialisis, int peritonitisInfecciosa, String vacunaHepatitisB, Date fechaDiagnosticoHepatitisB, Date fechaDiagnosticoHepatitisC, Character tratamientoNoDialiticoErc, float hemoglobina, float albuminaSerica, float fosforoSerico, String noDeseaTrasplante, Date fechaIngresoTrasplante, String codigoIpsListaEspera, Character recibidoTrasplanteRenal, String codigoEpsUltimoTrasplante, String codigoIpsUltimoTrasplante, String complicacionPosTrasplante, String azatioprinaPeriodoReporte, String ciclosporinaPeriodoReporte, String micofenolatoPeriodoReporte, String tacrolimusPeriodoReporte, String prednisonaPeriodoReporte, int rechazosTrasplanteBiopsia, int numeroTrasplantesRecibidos, int costoTerapiaPosTrasplante, int mesesPrestacionServicio, int cotoTotal, String codigoEpsOrigen, String novedadesReporteAnterior, String causaMuerte, Date fechaMuerte, int codigoUnicoIdentificacion, Date fechaCorteReporte) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.sgsss = sgsss;
        this.codigoEapb = codigoEapb;
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.grupoPoblacional = grupoPoblacional;
        this.municipioResidencia = municipioResidencia;
        this.telefono = telefono;
        this.fechaAfilicionEps = fechaAfilicionEps;
        this.codigoSeguimiento = codigoSeguimiento;
        this.etiologiaErc = etiologiaErc;
        this.peso = peso;
        this.talla = talla;
        this.tensionArterialSistolica = tensionArterialSistolica;
        this.tensionArterialDiastolica = tensionArterialDiastolica;
        this.creatininaSangre = creatininaSangre;
        this.fechaUltimaCreatinina = fechaUltimaCreatinina;
        this.hemoglobinaGlicosilada = hemoglobinaGlicosilada;
        this.albuminuria = albuminuria;
        this.fechaUltimaAlbuminuria = fechaUltimaAlbuminuria;
        this.colesterolTotal = colesterolTotal;
        this.fechaUltimoColesterolTotal = fechaUltimoColesterolTotal;
        this.colesterolHdl = colesterolHdl;
        this.fechaUltimaColesterolHdl = fechaUltimaColesterolHdl;
        this.colesterolLdl = colesterolLdl;
        this.fechaUltimoColesterolLdl = fechaUltimoColesterolLdl;
        this.parathormonaPth = parathormonaPth;
        this.fechaUltimaParathormonaPth = fechaUltimaParathormonaPth;
        this.estadioErc = estadioErc;
        this.programaAtencionRenal = programaAtencionRenal;
        this.hemodialisis = hemodialisis;
        this.costoTotalHemodialisis = costoTotalHemodialisis;
        this.dialisisPeritoneal = dialisisPeritoneal;
        this.dosisDialisisKtvDpd = dosisDialisisKtvDpd;
        this.horasHemodialisis = horasHemodialisis;
        this.peritonitisInfecciosa = peritonitisInfecciosa;
        this.vacunaHepatitisB = vacunaHepatitisB;
        this.fechaDiagnosticoHepatitisB = fechaDiagnosticoHepatitisB;
        this.fechaDiagnosticoHepatitisC = fechaDiagnosticoHepatitisC;
        this.tratamientoNoDialiticoErc = tratamientoNoDialiticoErc;
        this.hemoglobina = hemoglobina;
        this.albuminaSerica = albuminaSerica;
        this.fosforoSerico = fosforoSerico;
        this.noDeseaTrasplante = noDeseaTrasplante;
        this.fechaIngresoTrasplante = fechaIngresoTrasplante;
        this.codigoIpsListaEspera = codigoIpsListaEspera;
        this.recibidoTrasplanteRenal = recibidoTrasplanteRenal;
        this.codigoEpsUltimoTrasplante = codigoEpsUltimoTrasplante;
        this.codigoIpsUltimoTrasplante = codigoIpsUltimoTrasplante;
        this.complicacionPosTrasplante = complicacionPosTrasplante;
        this.azatioprinaPeriodoReporte = azatioprinaPeriodoReporte;
        this.ciclosporinaPeriodoReporte = ciclosporinaPeriodoReporte;
        this.micofenolatoPeriodoReporte = micofenolatoPeriodoReporte;
        this.tacrolimusPeriodoReporte = tacrolimusPeriodoReporte;
        this.prednisonaPeriodoReporte = prednisonaPeriodoReporte;
        this.rechazosTrasplanteBiopsia = rechazosTrasplanteBiopsia;
        this.numeroTrasplantesRecibidos = numeroTrasplantesRecibidos;
        this.costoTerapiaPosTrasplante = costoTerapiaPosTrasplante;
        this.mesesPrestacionServicio = mesesPrestacionServicio;
        this.cotoTotal = cotoTotal;
        this.codigoEpsOrigen = codigoEpsOrigen;
        this.novedadesReporteAnterior = novedadesReporteAnterior;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.codigoUnicoIdentificacion = codigoUnicoIdentificacion;
        this.fechaCorteReporte = fechaCorteReporte;
    }

    public Integer getIdEnfermedadesRenales() {
        return id;
    }

    public void setIdEnfermedadesRenales(Integer id) {
        this.id = id;
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacionUsuario() {
        return numeroIdentificacionUsuario;
    }

    public void setNumeroIdentificacionUsuario(String numeroIdentificacionUsuario) {
        this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
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

    public Character getSgsss() {
        return sgsss;
    }

    public void setSgsss(Character sgsss) {
        this.sgsss = sgsss;
    }

    public String getCodigoEapb() {
        return codigoEapb;
    }

    public void setCodigoEapb(String codigoEapb) {
        this.codigoEapb = codigoEapb;
    }

    public int getCodigoPertenenciaEtnica() {
        return codigoPertenenciaEtnica;
    }

    public void setCodigoPertenenciaEtnica(int codigoPertenenciaEtnica) {
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
    }

    public int getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(int grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public String getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(String municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaAfilicionEps() {
        return fechaAfilicionEps;
    }

    public void setFechaAfilicionEps(Date fechaAfilicionEps) {
        this.fechaAfilicionEps = fechaAfilicionEps;
    }

    public long getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(long codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public Date getFechIngrProgAtenRena() {
        return fechIngrProgAtenRena;
    }

    public void setFechIngrProgAtenRena(Date fechIngrProgAtenRena) {
        this.fechIngrProgAtenRena = fechIngrProgAtenRena;
    }

    public Integer getDiagConfHipeArte() {
        return diagConfHipeArte;
    }

    public void setDiagConfHipeArte(Integer diagConfHipeArte) {
        this.diagConfHipeArte = diagConfHipeArte;
    }

    public Date getFechDiagHipeArte() {
        return fechDiagHipeArte;
    }

    public void setFechDiagHipeArte(Date fechDiagHipeArte) {
        this.fechDiagHipeArte = fechDiagHipeArte;
    }

    public Double getCostHtaDuraPeriRepo() {
        return costHtaDuraPeriRepo;
    }

    public void setCostHtaDuraPeriRepo(Double costHtaDuraPeriRepo) {
        this.costHtaDuraPeriRepo = costHtaDuraPeriRepo;
    }

    public Character getDiagConfDiabMell() {
        return diagConfDiabMell;
    }

    public void setDiagConfDiabMell(Character diagConfDiabMell) {
        this.diagConfDiabMell = diagConfDiabMell;
    }

    public Date getFechDiagDiabMell() {
        return fechDiagDiabMell;
    }

    public void setFechDiagDiabMell(Date fechDiagDiabMell) {
        this.fechDiagDiabMell = fechDiagDiabMell;
    }

    public Double getCostDmDuraPeriRepo() {
        return costDmDuraPeriRepo;
    }

    public void setCostDmDuraPeriRepo(Double costDmDuraPeriRepo) {
        this.costDmDuraPeriRepo = costDmDuraPeriRepo;
    }

    public String getEtiologiaErc() {
        return etiologiaErc;
    }

    public void setEtiologiaErc(String etiologiaErc) {
        this.etiologiaErc = etiologiaErc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getTensionArterialSistolica() {
        return tensionArterialSistolica;
    }

    public void setTensionArterialSistolica(double tensionArterialSistolica) {
        this.tensionArterialSistolica = tensionArterialSistolica;
    }

    public double getTensionArterialDiastolica() {
        return tensionArterialDiastolica;
    }

    public void setTensionArterialDiastolica(double tensionArterialDiastolica) {
        this.tensionArterialDiastolica = tensionArterialDiastolica;
    }

    public double getCreatininaSangre() {
        return creatininaSangre;
    }

    public void setCreatininaSangre(double creatininaSangre) {
        this.creatininaSangre = creatininaSangre;
    }

    public Date getFechaUltimaCreatinina() {
        return fechaUltimaCreatinina;
    }

    public void setFechaUltimaCreatinina(Date fechaUltimaCreatinina) {
        this.fechaUltimaCreatinina = fechaUltimaCreatinina;
    }

    public double getHemoglobinaGlicosilada() {
        return hemoglobinaGlicosilada;
    }

    public void setHemoglobinaGlicosilada(double hemoglobinaGlicosilada) {
        this.hemoglobinaGlicosilada = hemoglobinaGlicosilada;
    }

    public Date getFechUltiGlic() {
        return fechUltiGlic;
    }

    public void setFechUltiGlic(Date fechUltiGlic) {
        this.fechUltiGlic = fechUltiGlic;
    }

    public float getAlbuminuria() {
        return albuminuria;
    }

    public void setAlbuminuria(float albuminuria) {
        this.albuminuria = albuminuria;
    }

    public Date getFechaUltimaAlbuminuria() {
        return fechaUltimaAlbuminuria;
    }

    public void setFechaUltimaAlbuminuria(Date fechaUltimaAlbuminuria) {
        this.fechaUltimaAlbuminuria = fechaUltimaAlbuminuria;
    }

    public Integer getRelaAlbuCrea() {
        return relaAlbuCrea;
    }

    public void setRelaAlbuCrea(Integer relaAlbuCrea) {
        this.relaAlbuCrea = relaAlbuCrea;
    }

    public Date getFechUltiAlbuCrea() {
        return fechUltiAlbuCrea;
    }

    public void setFechUltiAlbuCrea(Date fechUltiAlbuCrea) {
        this.fechUltiAlbuCrea = fechUltiAlbuCrea;
    }

    public double getColesterolTotal() {
        return colesterolTotal;
    }

    public void setColesterolTotal(double colesterolTotal) {
        this.colesterolTotal = colesterolTotal;
    }

    public Date getFechaUltimoColesterolTotal() {
        return fechaUltimoColesterolTotal;
    }

    public void setFechaUltimoColesterolTotal(Date fechaUltimoColesterolTotal) {
        this.fechaUltimoColesterolTotal = fechaUltimoColesterolTotal;
    }

    public double getColesterolHdl() {
        return colesterolHdl;
    }

    public void setColesterolHdl(double colesterolHdl) {
        this.colesterolHdl = colesterolHdl;
    }

    public Date getFechaUltimaColesterolHdl() {
        return fechaUltimaColesterolHdl;
    }

    public void setFechaUltimaColesterolHdl(Date fechaUltimaColesterolHdl) {
        this.fechaUltimaColesterolHdl = fechaUltimaColesterolHdl;
    }

    public double getColesterolLdl() {
        return colesterolLdl;
    }

    public void setColesterolLdl(double colesterolLdl) {
        this.colesterolLdl = colesterolLdl;
    }

    public Date getFechaUltimoColesterolLdl() {
        return fechaUltimoColesterolLdl;
    }

    public void setFechaUltimoColesterolLdl(Date fechaUltimoColesterolLdl) {
        this.fechaUltimoColesterolLdl = fechaUltimoColesterolLdl;
    }

    public double getParathormonaPth() {
        return parathormonaPth;
    }

    public void setParathormonaPth(double parathormonaPth) {
        this.parathormonaPth = parathormonaPth;
    }

    public Date getFechaUltimaParathormonaPth() {
        return fechaUltimaParathormonaPth;
    }

    public void setFechaUltimaParathormonaPth(Date fechaUltimaParathormonaPth) {
        this.fechaUltimaParathormonaPth = fechaUltimaParathormonaPth;
    }

    public Double getTasaFiltGlomEsti() {
        return tasaFiltGlomEsti;
    }

    public void setTasaFiltGlomEsti(Double tasaFiltGlomEsti) {
        this.tasaFiltGlomEsti = tasaFiltGlomEsti;
    }

    public String getReciInhiEnziConvAngi() {
        return reciInhiEnziConvAngi;
    }

    public void setReciInhiEnziConvAngi(String reciInhiEnziConvAngi) {
        this.reciInhiEnziConvAngi = reciInhiEnziConvAngi;
    }

    public String getReciAntaReceAngiIi() {
        return reciAntaReceAngiIi;
    }

    public void setReciAntaReceAngiIi(String reciAntaReceAngiIi) {
        this.reciAntaReceAngiIi = reciAntaReceAngiIi;
    }

    public Character getTienDiagErcCualEsta() {
        return tienDiagErcCualEsta;
    }

    public void setTienDiagErcCualEsta(Character tienDiagErcCualEsta) {
        this.tienDiagErcCualEsta = tienDiagErcCualEsta;
    }

    public String getEstadioErc() {
        return estadioErc;
    }

    public void setEstadioErc(String estadioErc) {
        this.estadioErc = estadioErc;
    }

    public Date getFechDiagEstaErc5() {
        return fechDiagEstaErc5;
    }

    public void setFechDiagEstaErc5(Date fechDiagEstaErc5) {
        this.fechDiagEstaErc5 = fechDiagEstaErc5;
    }

    public String getProgramaAtencionRenal() {
        return programaAtencionRenal;
    }

    public void setProgramaAtencionRenal(String programaAtencionRenal) {
        this.programaAtencionRenal = programaAtencionRenal;
    }

    public Double getTfgMedFecUsuIniPriTrr() {
        return tfgMedFecUsuIniPriTrr;
    }

    public void setTfgMedFecUsuIniPriTrr(Double tfgMedFecUsuIniPriTrr) {
        this.tfgMedFecUsuIniPriTrr = tfgMedFecUsuIniPriTrr;
    }

    public String getModoInicPrimTeraReemRena() {
        return modoInicPrimTeraReemRena;
    }

    public void setModoInicPrimTeraReemRena(String modoInicPrimTeraReemRena) {
        this.modoInicPrimTeraReemRena = modoInicPrimTeraReemRena;
    }

    public Date getFechInicTeraReemRena() {
        return fechInicTeraReemRena;
    }

    public void setFechInicTeraReemRena(Date fechInicTeraReemRena) {
        this.fechInicTeraReemRena = fechInicTeraReemRena;
    }

    public Date getFechIngrUnidRenaActu() {
        return fechIngrUnidRenaActu;
    }

    public void setFechIngrUnidRenaActu(Date fechIngrUnidRenaActu) {
        this.fechIngrUnidRenaActu = fechIngrUnidRenaActu;
    }

    public String getHemodialisis() {
        return hemodialisis;
    }

    public void setHemodialisis(String hemodialisis) {
        this.hemodialisis = hemodialisis;
    }

    public Double getDosiDialKtvSingPool() {
        return dosiDialKtvSingPool;
    }

    public void setDosiDialKtvSingPool(Double dosiDialKtvSingPool) {
        this.dosiDialKtvSingPool = dosiDialKtvSingPool;
    }

    public double getCostoTotalHemodialisis() {
        return costoTotalHemodialisis;
    }

    public void setCostoTotalHemodialisis(double costoTotalHemodialisis) {
        this.costoTotalHemodialisis = costoTotalHemodialisis;
    }

    public String getDialisisPeritoneal() {
        return dialisisPeritoneal;
    }

    public void setDialisisPeritoneal(String dialisisPeritoneal) {
        this.dialisisPeritoneal = dialisisPeritoneal;
    }

    public double getDosisDialisisKtvDpd() {
        return dosisDialisisKtvDpd;
    }

    public void setDosisDialisisKtvDpd(double dosisDialisisKtvDpd) {
        this.dosisDialisisKtvDpd = dosisDialisisKtvDpd;
    }

    public float getHorasHemodialisis() {
        return horasHemodialisis;
    }

    public void setHorasHemodialisis(float horasHemodialisis) {
        this.horasHemodialisis = horasHemodialisis;
    }

    public int getPeritonitisInfecciosa() {
        return peritonitisInfecciosa;
    }

    public void setPeritonitisInfecciosa(int peritonitisInfecciosa) {
        this.peritonitisInfecciosa = peritonitisInfecciosa;
    }

    public Integer getCostTotaDpPeriRepo() {
        return costTotaDpPeriRepo;
    }

    public void setCostTotaDpPeriRepo(Integer costTotaDpPeriRepo) {
        this.costTotaDpPeriRepo = costTotaDpPeriRepo;
    }

    public String getVacunaHepatitisB() {
        return vacunaHepatitisB;
    }

    public void setVacunaHepatitisB(String vacunaHepatitisB) {
        this.vacunaHepatitisB = vacunaHepatitisB;
    }

    public Date getFechaDiagnosticoHepatitisB() {
        return fechaDiagnosticoHepatitisB;
    }

    public void setFechaDiagnosticoHepatitisB(Date fechaDiagnosticoHepatitisB) {
        this.fechaDiagnosticoHepatitisB = fechaDiagnosticoHepatitisB;
    }

    public Date getFechaDiagnosticoHepatitisC() {
        return fechaDiagnosticoHepatitisC;
    }

    public void setFechaDiagnosticoHepatitisC(Date fechaDiagnosticoHepatitisC) {
        this.fechaDiagnosticoHepatitisC = fechaDiagnosticoHepatitisC;
    }

    public Character getTratamientoNoDialiticoErc() {
        return tratamientoNoDialiticoErc;
    }

    public void setTratamientoNoDialiticoErc(Character tratamientoNoDialiticoErc) {
        this.tratamientoNoDialiticoErc = tratamientoNoDialiticoErc;
    }

    public Integer getCostTotaTmndPeriCort() {
        return costTotaTmndPeriCort;
    }

    public void setCostTotaTmndPeriCort(Integer costTotaTmndPeriCort) {
        this.costTotaTmndPeriCort = costTotaTmndPeriCort;
    }

    public float getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(float hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public float getAlbuminaSerica() {
        return albuminaSerica;
    }

    public void setAlbuminaSerica(float albuminaSerica) {
        this.albuminaSerica = albuminaSerica;
    }

    public float getFosforoSerico() {
        return fosforoSerico;
    }

    public void setFosforoSerico(float fosforoSerico) {
        this.fosforoSerico = fosforoSerico;
    }

    public String getValoNefrPeriRepo() {
        return valoNefrPeriRepo;
    }

    public void setValoNefrPeriRepo(String valoNefrPeriRepo) {
        this.valoNefrPeriRepo = valoNefrPeriRepo;
    }

    public String getCancContTras() {
        return cancContTras;
    }

    public void setCancContTras(String cancContTras) {
        this.cancContTras = cancContTras;
    }

    public String getInfeCronContTras() {
        return infeCronContTras;
    }

    public void setInfeCronContTras(String infeCronContTras) {
        this.infeCronContTras = infeCronContTras;
    }

    public String getNoDeseaTrasplante() {
        return noDeseaTrasplante;
    }

    public void setNoDeseaTrasplante(String noDeseaTrasplante) {
        this.noDeseaTrasplante = noDeseaTrasplante;
    }

    public String getVidaMenoSeisMeseContTras() {
        return vidaMenoSeisMeseContTras;
    }

    public void setVidaMenoSeisMeseContTras(String vidaMenoSeisMeseContTras) {
        this.vidaMenoSeisMeseContTras = vidaMenoSeisMeseContTras;
    }

    public String getLimiAutoContTras() {
        return limiAutoContTras;
    }

    public void setLimiAutoContTras(String limiAutoContTras) {
        this.limiAutoContTras = limiAutoContTras;
    }

    public String getEnfeCardContTras() {
        return enfeCardContTras;
    }

    public void setEnfeCardContTras(String enfeCardContTras) {
        this.enfeCardContTras = enfeCardContTras;
    }

    public String getVihContTras() {
        return vihContTras;
    }

    public void setVihContTras(String vihContTras) {
        this.vihContTras = vihContTras;
    }

    public String getVhcContTras() {
        return vhcContTras;
    }

    public void setVhcContTras(String vhcContTras) {
        this.vhcContTras = vhcContTras;
    }

    public String getEnfeInmuContTras() {
        return enfeInmuContTras;
    }

    public void setEnfeInmuContTras(String enfeInmuContTras) {
        this.enfeInmuContTras = enfeInmuContTras;
    }

    public String getEnfePulmContTras() {
        return enfePulmContTras;
    }

    public void setEnfePulmContTras(String enfePulmContTras) {
        this.enfePulmContTras = enfePulmContTras;
    }

    public String getEnfeCronContTras() {
        return enfeCronContTras;
    }

    public void setEnfeCronContTras(String enfeCronContTras) {
        this.enfeCronContTras = enfeCronContTras;
    }

    public Date getFechaIngresoTrasplante() {
        return fechaIngresoTrasplante;
    }

    public void setFechaIngresoTrasplante(Date fechaIngresoTrasplante) {
        this.fechaIngresoTrasplante = fechaIngresoTrasplante;
    }

    public String getCodigoIpsListaEspera() {
        return codigoIpsListaEspera;
    }

    public void setCodigoIpsListaEspera(String codigoIpsListaEspera) {
        this.codigoIpsListaEspera = codigoIpsListaEspera;
    }

    public Character getRecibidoTrasplanteRenal() {
        return recibidoTrasplanteRenal;
    }

    public void setRecibidoTrasplanteRenal(Character recibidoTrasplanteRenal) {
        this.recibidoTrasplanteRenal = recibidoTrasplanteRenal;
    }

    public String getCodigoEpsUltimoTrasplante() {
        return codigoEpsUltimoTrasplante;
    }

    public void setCodigoEpsUltimoTrasplante(String codigoEpsUltimoTrasplante) {
        this.codigoEpsUltimoTrasplante = codigoEpsUltimoTrasplante;
    }

    public String getCodigoIpsUltimoTrasplante() {
        return codigoIpsUltimoTrasplante;
    }

    public void setCodigoIpsUltimoTrasplante(String codigoIpsUltimoTrasplante) {
        this.codigoIpsUltimoTrasplante = codigoIpsUltimoTrasplante;
    }

    public String getTipoDonaUltiTras() {
        return tipoDonaUltiTras;
    }

    public void setTipoDonaUltiTras(String tipoDonaUltiTras) {
        this.tipoDonaUltiTras = tipoDonaUltiTras;
    }

    public Integer getCostUltiTrasPeriRepo() {
        return costUltiTrasPeriRepo;
    }

    public void setCostUltiTrasPeriRepo(Integer costUltiTrasPeriRepo) {
        this.costUltiTrasPeriRepo = costUltiTrasPeriRepo;
    }

    public String getComplicacionPosTrasplante() {
        return complicacionPosTrasplante;
    }

    public void setComplicacionPosTrasplante(String complicacionPosTrasplante) {
        this.complicacionPosTrasplante = complicacionPosTrasplante;
    }

    public Date getFechDiagCmvTras() {
        return fechDiagCmvTras;
    }

    public void setFechDiagCmvTras(Date fechDiagCmvTras) {
        this.fechDiagCmvTras = fechDiagCmvTras;
    }

    public Date getFechDiagHongTras() {
        return fechDiagHongTras;
    }

    public void setFechDiagHongTras(Date fechDiagHongTras) {
        this.fechDiagHongTras = fechDiagHongTras;
    }

    public Date getFechDiagTubeTras() {
        return fechDiagTubeTras;
    }

    public void setFechDiagTubeTras(Date fechDiagTubeTras) {
        this.fechDiagTubeTras = fechDiagTubeTras;
    }

    public Date getFechDiagVascTras() {
        return fechDiagVascTras;
    }

    public void setFechDiagVascTras(Date fechDiagVascTras) {
        this.fechDiagVascTras = fechDiagVascTras;
    }

    public Date getFechDiagUrolTras() {
        return fechDiagUrolTras;
    }

    public void setFechDiagUrolTras(Date fechDiagUrolTras) {
        this.fechDiagUrolTras = fechDiagUrolTras;
    }

    public Date getFechDiagHeriTras() {
        return fechDiagHeriTras;
    }

    public void setFechDiagHeriTras(Date fechDiagHeriTras) {
        this.fechDiagHeriTras = fechDiagHeriTras;
    }

    public Date getFechDiagCancTras() {
        return fechDiagCancTras;
    }

    public void setFechDiagCancTras(Date fechDiagCancTras) {
        this.fechDiagCancTras = fechDiagCancTras;
    }

    public Integer getNumMediInmu() {
        return numMediInmu;
    }

    public void setNumMediInmu(Integer numMediInmu) {
        this.numMediInmu = numMediInmu;
    }

    public String getMetiPeriRepo() {
        return metiPeriRepo;
    }

    public void setMetiPeriRepo(String metiPeriRepo) {
        this.metiPeriRepo = metiPeriRepo;
    }

    public String getAzatioprinaPeriodoReporte() {
        return azatioprinaPeriodoReporte;
    }

    public void setAzatioprinaPeriodoReporte(String azatioprinaPeriodoReporte) {
        this.azatioprinaPeriodoReporte = azatioprinaPeriodoReporte;
    }

    public String getCiclosporinaPeriodoReporte() {
        return ciclosporinaPeriodoReporte;
    }

    public void setCiclosporinaPeriodoReporte(String ciclosporinaPeriodoReporte) {
        this.ciclosporinaPeriodoReporte = ciclosporinaPeriodoReporte;
    }

    public String getMicofenolatoPeriodoReporte() {
        return micofenolatoPeriodoReporte;
    }

    public void setMicofenolatoPeriodoReporte(String micofenolatoPeriodoReporte) {
        this.micofenolatoPeriodoReporte = micofenolatoPeriodoReporte;
    }

    public String getTacrolimusPeriodoReporte() {
        return tacrolimusPeriodoReporte;
    }

    public void setTacrolimusPeriodoReporte(String tacrolimusPeriodoReporte) {
        this.tacrolimusPeriodoReporte = tacrolimusPeriodoReporte;
    }

    public String getPrednisonaPeriodoReporte() {
        return prednisonaPeriodoReporte;
    }

    public void setPrednisonaPeriodoReporte(String prednisonaPeriodoReporte) {
        this.prednisonaPeriodoReporte = prednisonaPeriodoReporte;
    }

    public Integer getInmuUnoPeriRepo() {
        return inmuUnoPeriRepo;
    }

    public void setInmuUnoPeriRepo(Integer inmuUnoPeriRepo) {
        this.inmuUnoPeriRepo = inmuUnoPeriRepo;
    }

    public Integer getInmuDosPeriRepo() {
        return inmuDosPeriRepo;
    }

    public void setInmuDosPeriRepo(Integer inmuDosPeriRepo) {
        this.inmuDosPeriRepo = inmuDosPeriRepo;
    }

    public Integer getInmuTresPeriRepo() {
        return inmuTresPeriRepo;
    }

    public void setInmuTresPeriRepo(Integer inmuTresPeriRepo) {
        this.inmuTresPeriRepo = inmuTresPeriRepo;
    }

    public int getRechazosTrasplanteBiopsia() {
        return rechazosTrasplanteBiopsia;
    }

    public void setRechazosTrasplanteBiopsia(int rechazosTrasplanteBiopsia) {
        this.rechazosTrasplanteBiopsia = rechazosTrasplanteBiopsia;
    }

    public Date getFechPrimRechTras() {
        return fechPrimRechTras;
    }

    public void setFechPrimRechTras(Date fechPrimRechTras) {
        this.fechPrimRechTras = fechPrimRechTras;
    }

    public Date getFechRetoDialPerdTras() {
        return fechRetoDialPerdTras;
    }

    public void setFechRetoDialPerdTras(Date fechRetoDialPerdTras) {
        this.fechRetoDialPerdTras = fechRetoDialPerdTras;
    }

    public int getNumeroTrasplantesRecibidos() {
        return numeroTrasplantesRecibidos;
    }

    public void setNumeroTrasplantesRecibidos(int numeroTrasplantesRecibidos) {
        this.numeroTrasplantesRecibidos = numeroTrasplantesRecibidos;
    }

    public int getCostoTerapiaPosTrasplante() {
        return costoTerapiaPosTrasplante;
    }

    public void setCostoTerapiaPosTrasplante(int costoTerapiaPosTrasplante) {
        this.costoTerapiaPosTrasplante = costoTerapiaPosTrasplante;
    }

    public int getMesesPrestacionServicio() {
        return mesesPrestacionServicio;
    }

    public void setMesesPrestacionServicio(int mesesPrestacionServicio) {
        this.mesesPrestacionServicio = mesesPrestacionServicio;
    }

    public int getCotoTotal() {
        return cotoTotal;
    }

    public void setCotoTotal(int cotoTotal) {
        this.cotoTotal = cotoTotal;
    }

    public String getCodigoEpsOrigen() {
        return codigoEpsOrigen;
    }

    public void setCodigoEpsOrigen(String codigoEpsOrigen) {
        this.codigoEpsOrigen = codigoEpsOrigen;
    }

    public String getNovedadesReporteAnterior() {
        return novedadesReporteAnterior;
    }

    public void setNovedadesReporteAnterior(String novedadesReporteAnterior) {
        this.novedadesReporteAnterior = novedadesReporteAnterior;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public int getCodigoUnicoIdentificacion() {
        return codigoUnicoIdentificacion;
    }

    public void setCodigoUnicoIdentificacion(int codigoUnicoIdentificacion) {
        this.codigoUnicoIdentificacion = codigoUnicoIdentificacion;
    }

    public Date getFechaCorteReporte() {
        return fechaCorteReporte;
    }

    public void setFechaCorteReporte(Date fechaCorteReporte) {
        this.fechaCorteReporte = fechaCorteReporte;
    }

    public boolean isCampoLeido() {
        return campoLeido;
    }

    public void setCampoLeido(boolean campoLeido) {
        this.campoLeido = campoLeido;
    }

    public String getClaveArchvio() {
        return claveArchvio;
    }

    public void setClaveArchvio(String claveArchvio) {
        this.claveArchvio = claveArchvio;
    }

    public String getErrorValidacion() {
        return errorValidacion;
    }

    public void setErrorValidacion(String errorValidacion) {
        this.errorValidacion = errorValidacion;
    }
}
