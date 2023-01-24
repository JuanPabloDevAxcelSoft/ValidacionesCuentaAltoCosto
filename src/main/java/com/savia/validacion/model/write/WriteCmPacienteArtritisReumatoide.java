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
@Table(name = "cm_paciente_artritis_reumatoide")
public class WriteCmPacienteArtritisReumatoide implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "grupo_poblacional")
    private String grupoPoblacional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "direccion_residencia")
    private int direccionResidencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_sintomas")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioSintomas;
    @Column(name = "fech_prim_cons_espe")
    @Temporal(TemporalType.DATE)
    private Date fechPrimConsEspe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnostico;
    @Basic(optional = false)
    @NotNull
    private int talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso_inicial")
    private float pesoInicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "radiografia_manos")
    private String radiografiaManos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "radiografia_pies")
    private String radiografiaPies;
    @Basic(optional = false)
    @NotNull
    private int vsg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    private String pcr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "factor_reumatoideo_inicial")
    private String factorReumatoideoInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemoglobina_inicial")
    private float hemoglobinaInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "leucocitos_inicial")
    private int leucocitosInicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "creatina_inicial")
    private String creatinaInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tfg_inicial")
    private int tfgInicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "parcial_orina")
    private String parcialOrina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "alt_inicial")
    private String altInicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "anti_ccp_diagnostico")
    private String antiCcpDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "hta_diagnostico")
    private String htaDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "dm_diagnostico")
    private String dmDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ecv_diagnostico")
    private String ecvDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "erc_diagnostico")
    private String ercDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "osteoporosis_diagnostico")
    private String osteoporosisDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "sindrome_sjogren")
    private String sindromeSjogren;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_primer_das")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimerDas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "profesional_realizo_das")
    private String profesionalRealizoDas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "resultado_primer_das")
    private String resultadoPrimerDas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_primer_haq")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimerHaq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "resultado_haq")
    private String resultadoHaq;
    @Column(name = "fech_inic_trat_sin_dmar")
    @Temporal(TemporalType.DATE)
    private Date fechInicTratSinDmar;
    @Size(max = 2)
    @Column(name = "anal_no_opio_inic")
    private String analNoOpioInic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "analgesicos_opioides_inicio")
    private String analgesicosOpioidesInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "aines_inicio")
    private String ainesInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "corticoides_inicio")
    private String corticoidesInicio;
    @Column(name = "fech_inic_trat_dmar")
    @Temporal(TemporalType.DATE)
    private Date fechInicTratDmar;
    @Size(max = 3)
    @Column(name = "ante_linf_ante_dmar")
    private String anteLinfAnteDmar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String azatioprina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String ciclosporina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String ciclofosfamida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String cloroquina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "d_penicilamina")
    private String dPenicilamina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String etanercept;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String leflunomida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String metotrexate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String rituximab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String sulfasalazina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String abatacept;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String adalimumab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String certolizumab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String golimumab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String hidroxicloroquina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String infliximab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "sales_oro")
    private String salesOro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String tocilizumab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String tofacitinib;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String anakinra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_1")
    private int medicamentoDmard1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_2")
    private int medicamentoDmard2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_3")
    private int medicamentoDmard3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_4")
    private int medicamentoDmard4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tamizaje_tb")
    private String tamizajeTb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso_ultimo_semestre")
    private int pesoUltimoSemestre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "radiografia_manos_ultima")
    private String radiografiaManosUltima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "radiografia_pies_ultima")
    private String radiografiaPiesUltima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "proteina_c_seguimiento")
    private String proteinaCSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vsg_seguimiento")
    private float vsgSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemoglobina_seguimiento")
    private float hemoglobinaSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "leucocitos_seguimiento")
    private int leucocitosSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creatinina_seguimiento")
    private float creatininaSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tfg_seguimiento")
    private float tfgSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "parcial_orina_seguimiento")
    private String parcialOrinaSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "alt_seguimiento")
    private String altSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ath_actual")
    private String athActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "dm_actual")
    private String dmActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ecv_actual")
    private String ecvActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "erc_actual")
    private String ercActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "osteoporosis_actual")
    private String osteoporosisActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "sindrome_sjogren_actual")
    private String sindromeSjogrenActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ultima_das_28")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaDas28;
    @Size(max = 2)
    @Column(name = "prof_real_ulti_das_28")
    private String profRealUltiDas28;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_ultimo_das_28")
    private float resultadoUltimoDas28;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "estado_actividad_ar_das_28")
    private String estadoActividadArDas28;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha _ultimo_haq")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoHaq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_ultimo_haq")
    private float resultadoUltimoHaq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "analgesicos_no_opioides")
    private String analgesicosNoOpioides;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "analgesicos_opioides")
    private String analgesicosOpioides;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String aines;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String corticoides;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "meses_uso_glucocorticoides")
    private String mesesUsoGlucocorticoides;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String calcio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "vitamina_d")
    private String vitaminaD;
    @Column(name = "fech_inic_trat_actu_dmar")
    @Temporal(TemporalType.DATE)
    private Date fechInicTratActuDmar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "azatioprina_actual")
    private String azatioprinaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ciclosporina_actual")
    private String ciclosporinaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ciclofosfamida_actual")
    private String ciclofosfamidaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "cloroquina_actual")
    private String cloroquinaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "d_penicilaimina_actual")
    private String dPenicilaiminaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "etanercept_actual")
    private String etanerceptActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "leflunomida_actual")
    private String leflunomidaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "metotrexate_actual")
    private String metotrexateActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "rituximab_actual")
    private String rituximabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "sulfasalazina_actual")
    private String sulfasalazinaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "abatacept_actual")
    private String abataceptActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "adalimumab_actual")
    private String adalimumabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "certolizumab_actual")
    private String certolizumabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "golimumab_actual")
    private String golimumabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "hidroxicloroquina_actual")
    private String hidroxicloroquinaActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "infliximab_actual")
    private String infliximabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "sales_oro_actual")
    private String salesOroActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tocilizumab_actual")
    private String tocilizumabActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tofacitinib_actual")
    private String tofacitinibActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "anakinra_actual")
    private String anakinraActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_1_actual")
    private int medicamentoDmard1Actual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_2_actual")
    private int medicamentoDmard2Actual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_3_actual")
    private int medicamentoDmard3Actual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "medicamento_dmard_4_actual")
    private int medicamentoDmard4Actual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "numero_consultas_reumatologo")
    private String numeroConsultasReumatologo;
    @Size(max = 2)
    @Column(name = "nume_cons_inte_ar")
    private String numeConsInteAr;
    @Size(max = 2)
    @Column(name = "nume_cons_medi_fami_ar")
    private String numeConsMediFamiAr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reemplazo_articular_1_ar")
    private String reemplazoArticular1Ar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reemplazo_articular_2_ar")
    private String reemplazoArticular2Ar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reemplazo_articular_3_ar")
    private String reemplazoArticular3Ar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "reemplazo_articular_4_ar")
    private String reemplazoArticular4Ar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "numero_hospitalizaciones_ar")
    private String numeroHospitalizacionesAr;
    @Size(max = 12)
    @Column(name = "codi_habi_ips_segu_ar")
    private String codiHabiIpsSeguAr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "codigo_municipal_ips")
    private String codigoMunicipalIps;
    @Column(name = "fech_ingr_ips_segu_ar")
    @Temporal(TemporalType.DATE)
    private Date fechIngrIpsSeguAr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "atencion_clinica_ar_por")
    private String atencionClinicaArPor;
    @Size(max = 2)
    @Column(name = "nove_paci_repo_ante")
    private String novePaciRepoAnte;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteArtritisReumatoide() {
    }

    public WriteCmPacienteArtritisReumatoide(Long id) {
        this.id = id;
    }

    public WriteCmPacienteArtritisReumatoide(Long id, String grupoPoblacional, int direccionResidencia, Date fechaInicioSintomas, Date fechaDiagnostico, int talla, float pesoInicial, String radiografiaManos, String radiografiaPies, int vsg, String pcr, String factorReumatoideoInicial, float hemoglobinaInicial, int leucocitosInicial, String creatinaInicial, int tfgInicial, String parcialOrina, String altInicial, String antiCcpDiagnostico, String htaDiagnostico, String dmDiagnostico, String ecvDiagnostico, String ercDiagnostico, String osteoporosisDiagnostico, String sindromeSjogren, Date fechaPrimerDas, String profesionalRealizoDas, String resultadoPrimerDas, Date fechaPrimerHaq, String resultadoHaq, String analgesicosOpioidesInicio, String ainesInicio, String corticoidesInicio, String azatioprina, String ciclosporina, String ciclofosfamida, String cloroquina, String dPenicilamina, String etanercept, String leflunomida, String metotrexate, String rituximab, String sulfasalazina, String abatacept, String adalimumab, String certolizumab, String golimumab, String hidroxicloroquina, String infliximab, String salesOro, String tocilizumab, String tofacitinib, String anakinra, int medicamentoDmard1, int medicamentoDmard2, int medicamentoDmard3, int medicamentoDmard4, String tamizajeTb, int pesoUltimoSemestre, String radiografiaManosUltima, String radiografiaPiesUltima, String proteinaCSeguimiento, float vsgSeguimiento, float hemoglobinaSeguimiento, int leucocitosSeguimiento, float creatininaSeguimiento, float tfgSeguimiento, String parcialOrinaSeguimiento, String altSeguimiento, String athActual, String dmActual, String ecvActual, String ercActual, String osteoporosisActual, String sindromeSjogrenActual, Date fechaUltimaDas28, float resultadoUltimoDas28, String estadoActividadArDas28, Date fechaUltimoHaq, float resultadoUltimoHaq, String analgesicosNoOpioides, String analgesicosOpioides, String aines, String corticoides, String mesesUsoGlucocorticoides, String calcio, String vitaminaD, String azatioprinaActual, String ciclosporinaActual, String ciclofosfamidaActual, String cloroquinaActual, String dPenicilaiminaActual, String etanerceptActual, String leflunomidaActual, String metotrexateActual, String rituximabActual, String sulfasalazinaActual, String abataceptActual, String adalimumabActual, String certolizumabActual, String golimumabActual, String hidroxicloroquinaActual, String infliximabActual, String salesOroActual, String tocilizumabActual, String tofacitinibActual, String anakinraActual, int medicamentoDmard1Actual, int medicamentoDmard2Actual, int medicamentoDmard3Actual, int medicamentoDmard4Actual, String numeroConsultasReumatologo, String reemplazoArticular1Ar, String reemplazoArticular2Ar, String reemplazoArticular3Ar, String reemplazoArticular4Ar, String numeroHospitalizacionesAr, String codigoMunicipalIps, String atencionClinicaArPor) {
        this.id = id;
        this.grupoPoblacional = grupoPoblacional;
        this.direccionResidencia = direccionResidencia;
        this.fechaInicioSintomas = fechaInicioSintomas;
        this.fechaDiagnostico = fechaDiagnostico;
        this.talla = talla;
        this.pesoInicial = pesoInicial;
        this.radiografiaManos = radiografiaManos;
        this.radiografiaPies = radiografiaPies;
        this.vsg = vsg;
        this.pcr = pcr;
        this.factorReumatoideoInicial = factorReumatoideoInicial;
        this.hemoglobinaInicial = hemoglobinaInicial;
        this.leucocitosInicial = leucocitosInicial;
        this.creatinaInicial = creatinaInicial;
        this.tfgInicial = tfgInicial;
        this.parcialOrina = parcialOrina;
        this.altInicial = altInicial;
        this.antiCcpDiagnostico = antiCcpDiagnostico;
        this.htaDiagnostico = htaDiagnostico;
        this.dmDiagnostico = dmDiagnostico;
        this.ecvDiagnostico = ecvDiagnostico;
        this.ercDiagnostico = ercDiagnostico;
        this.osteoporosisDiagnostico = osteoporosisDiagnostico;
        this.sindromeSjogren = sindromeSjogren;
        this.fechaPrimerDas = fechaPrimerDas;
        this.profesionalRealizoDas = profesionalRealizoDas;
        this.resultadoPrimerDas = resultadoPrimerDas;
        this.fechaPrimerHaq = fechaPrimerHaq;
        this.resultadoHaq = resultadoHaq;
        this.analgesicosOpioidesInicio = analgesicosOpioidesInicio;
        this.ainesInicio = ainesInicio;
        this.corticoidesInicio = corticoidesInicio;
        this.azatioprina = azatioprina;
        this.ciclosporina = ciclosporina;
        this.ciclofosfamida = ciclofosfamida;
        this.cloroquina = cloroquina;
        this.dPenicilamina = dPenicilamina;
        this.etanercept = etanercept;
        this.leflunomida = leflunomida;
        this.metotrexate = metotrexate;
        this.rituximab = rituximab;
        this.sulfasalazina = sulfasalazina;
        this.abatacept = abatacept;
        this.adalimumab = adalimumab;
        this.certolizumab = certolizumab;
        this.golimumab = golimumab;
        this.hidroxicloroquina = hidroxicloroquina;
        this.infliximab = infliximab;
        this.salesOro = salesOro;
        this.tocilizumab = tocilizumab;
        this.tofacitinib = tofacitinib;
        this.anakinra = anakinra;
        this.medicamentoDmard1 = medicamentoDmard1;
        this.medicamentoDmard2 = medicamentoDmard2;
        this.medicamentoDmard3 = medicamentoDmard3;
        this.medicamentoDmard4 = medicamentoDmard4;
        this.tamizajeTb = tamizajeTb;
        this.pesoUltimoSemestre = pesoUltimoSemestre;
        this.radiografiaManosUltima = radiografiaManosUltima;
        this.radiografiaPiesUltima = radiografiaPiesUltima;
        this.proteinaCSeguimiento = proteinaCSeguimiento;
        this.vsgSeguimiento = vsgSeguimiento;
        this.hemoglobinaSeguimiento = hemoglobinaSeguimiento;
        this.leucocitosSeguimiento = leucocitosSeguimiento;
        this.creatininaSeguimiento = creatininaSeguimiento;
        this.tfgSeguimiento = tfgSeguimiento;
        this.parcialOrinaSeguimiento = parcialOrinaSeguimiento;
        this.altSeguimiento = altSeguimiento;
        this.athActual = athActual;
        this.dmActual = dmActual;
        this.ecvActual = ecvActual;
        this.ercActual = ercActual;
        this.osteoporosisActual = osteoporosisActual;
        this.sindromeSjogrenActual = sindromeSjogrenActual;
        this.fechaUltimaDas28 = fechaUltimaDas28;
        this.resultadoUltimoDas28 = resultadoUltimoDas28;
        this.estadoActividadArDas28 = estadoActividadArDas28;
        this.fechaUltimoHaq = fechaUltimoHaq;
        this.resultadoUltimoHaq = resultadoUltimoHaq;
        this.analgesicosNoOpioides = analgesicosNoOpioides;
        this.analgesicosOpioides = analgesicosOpioides;
        this.aines = aines;
        this.corticoides = corticoides;
        this.mesesUsoGlucocorticoides = mesesUsoGlucocorticoides;
        this.calcio = calcio;
        this.vitaminaD = vitaminaD;
        this.azatioprinaActual = azatioprinaActual;
        this.ciclosporinaActual = ciclosporinaActual;
        this.ciclofosfamidaActual = ciclofosfamidaActual;
        this.cloroquinaActual = cloroquinaActual;
        this.dPenicilaiminaActual = dPenicilaiminaActual;
        this.etanerceptActual = etanerceptActual;
        this.leflunomidaActual = leflunomidaActual;
        this.metotrexateActual = metotrexateActual;
        this.rituximabActual = rituximabActual;
        this.sulfasalazinaActual = sulfasalazinaActual;
        this.abataceptActual = abataceptActual;
        this.adalimumabActual = adalimumabActual;
        this.certolizumabActual = certolizumabActual;
        this.golimumabActual = golimumabActual;
        this.hidroxicloroquinaActual = hidroxicloroquinaActual;
        this.infliximabActual = infliximabActual;
        this.salesOroActual = salesOroActual;
        this.tocilizumabActual = tocilizumabActual;
        this.tofacitinibActual = tofacitinibActual;
        this.anakinraActual = anakinraActual;
        this.medicamentoDmard1Actual = medicamentoDmard1Actual;
        this.medicamentoDmard2Actual = medicamentoDmard2Actual;
        this.medicamentoDmard3Actual = medicamentoDmard3Actual;
        this.medicamentoDmard4Actual = medicamentoDmard4Actual;
        this.numeroConsultasReumatologo = numeroConsultasReumatologo;
        this.reemplazoArticular1Ar = reemplazoArticular1Ar;
        this.reemplazoArticular2Ar = reemplazoArticular2Ar;
        this.reemplazoArticular3Ar = reemplazoArticular3Ar;
        this.reemplazoArticular4Ar = reemplazoArticular4Ar;
        this.numeroHospitalizacionesAr = numeroHospitalizacionesAr;
        this.codigoMunicipalIps = codigoMunicipalIps;
        this.atencionClinicaArPor = atencionClinicaArPor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(String grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public int getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(int direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public Date getFechaInicioSintomas() {
        return fechaInicioSintomas;
    }

    public void setFechaInicioSintomas(Date fechaInicioSintomas) {
        this.fechaInicioSintomas = fechaInicioSintomas;
    }

    public Date getFechPrimConsEspe() {
        return fechPrimConsEspe;
    }

    public void setFechPrimConsEspe(Date fechPrimConsEspe) {
        this.fechPrimConsEspe = fechPrimConsEspe;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public String getRadiografiaManos() {
        return radiografiaManos;
    }

    public void setRadiografiaManos(String radiografiaManos) {
        this.radiografiaManos = radiografiaManos;
    }

    public String getRadiografiaPies() {
        return radiografiaPies;
    }

    public void setRadiografiaPies(String radiografiaPies) {
        this.radiografiaPies = radiografiaPies;
    }

    public int getVsg() {
        return vsg;
    }

    public void setVsg(int vsg) {
        this.vsg = vsg;
    }

    public String getPcr() {
        return pcr;
    }

    public void setPcr(String pcr) {
        this.pcr = pcr;
    }

    public String getFactorReumatoideoInicial() {
        return factorReumatoideoInicial;
    }

    public void setFactorReumatoideoInicial(String factorReumatoideoInicial) {
        this.factorReumatoideoInicial = factorReumatoideoInicial;
    }

    public float getHemoglobinaInicial() {
        return hemoglobinaInicial;
    }

    public void setHemoglobinaInicial(float hemoglobinaInicial) {
        this.hemoglobinaInicial = hemoglobinaInicial;
    }

    public int getLeucocitosInicial() {
        return leucocitosInicial;
    }

    public void setLeucocitosInicial(int leucocitosInicial) {
        this.leucocitosInicial = leucocitosInicial;
    }

    public String getCreatinaInicial() {
        return creatinaInicial;
    }

    public void setCreatinaInicial(String creatinaInicial) {
        this.creatinaInicial = creatinaInicial;
    }

    public int getTfgInicial() {
        return tfgInicial;
    }

    public void setTfgInicial(int tfgInicial) {
        this.tfgInicial = tfgInicial;
    }

    public String getParcialOrina() {
        return parcialOrina;
    }

    public void setParcialOrina(String parcialOrina) {
        this.parcialOrina = parcialOrina;
    }

    public String getAltInicial() {
        return altInicial;
    }

    public void setAltInicial(String altInicial) {
        this.altInicial = altInicial;
    }

    public String getAntiCcpDiagnostico() {
        return antiCcpDiagnostico;
    }

    public void setAntiCcpDiagnostico(String antiCcpDiagnostico) {
        this.antiCcpDiagnostico = antiCcpDiagnostico;
    }

    public String getHtaDiagnostico() {
        return htaDiagnostico;
    }

    public void setHtaDiagnostico(String htaDiagnostico) {
        this.htaDiagnostico = htaDiagnostico;
    }

    public String getDmDiagnostico() {
        return dmDiagnostico;
    }

    public void setDmDiagnostico(String dmDiagnostico) {
        this.dmDiagnostico = dmDiagnostico;
    }

    public String getEcvDiagnostico() {
        return ecvDiagnostico;
    }

    public void setEcvDiagnostico(String ecvDiagnostico) {
        this.ecvDiagnostico = ecvDiagnostico;
    }

    public String getErcDiagnostico() {
        return ercDiagnostico;
    }

    public void setErcDiagnostico(String ercDiagnostico) {
        this.ercDiagnostico = ercDiagnostico;
    }

    public String getOsteoporosisDiagnostico() {
        return osteoporosisDiagnostico;
    }

    public void setOsteoporosisDiagnostico(String osteoporosisDiagnostico) {
        this.osteoporosisDiagnostico = osteoporosisDiagnostico;
    }

    public String getSindromeSjogren() {
        return sindromeSjogren;
    }

    public void setSindromeSjogren(String sindromeSjogren) {
        this.sindromeSjogren = sindromeSjogren;
    }

    public Date getFechaPrimerDas() {
        return fechaPrimerDas;
    }

    public void setFechaPrimerDas(Date fechaPrimerDas) {
        this.fechaPrimerDas = fechaPrimerDas;
    }

    public String getProfesionalRealizoDas() {
        return profesionalRealizoDas;
    }

    public void setProfesionalRealizoDas(String profesionalRealizoDas) {
        this.profesionalRealizoDas = profesionalRealizoDas;
    }

    public String getResultadoPrimerDas() {
        return resultadoPrimerDas;
    }

    public void setResultadoPrimerDas(String resultadoPrimerDas) {
        this.resultadoPrimerDas = resultadoPrimerDas;
    }

    public Date getFechaPrimerHaq() {
        return fechaPrimerHaq;
    }

    public void setFechaPrimerHaq(Date fechaPrimerHaq) {
        this.fechaPrimerHaq = fechaPrimerHaq;
    }

    public String getResultadoHaq() {
        return resultadoHaq;
    }

    public void setResultadoHaq(String resultadoHaq) {
        this.resultadoHaq = resultadoHaq;
    }

    public Date getFechInicTratSinDmar() {
        return fechInicTratSinDmar;
    }

    public void setFechInicTratSinDmar(Date fechInicTratSinDmar) {
        this.fechInicTratSinDmar = fechInicTratSinDmar;
    }

    public String getAnalNoOpioInic() {
        return analNoOpioInic;
    }

    public void setAnalNoOpioInic(String analNoOpioInic) {
        this.analNoOpioInic = analNoOpioInic;
    }

    public String getAnalgesicosOpioidesInicio() {
        return analgesicosOpioidesInicio;
    }

    public void setAnalgesicosOpioidesInicio(String analgesicosOpioidesInicio) {
        this.analgesicosOpioidesInicio = analgesicosOpioidesInicio;
    }

    public String getAinesInicio() {
        return ainesInicio;
    }

    public void setAinesInicio(String ainesInicio) {
        this.ainesInicio = ainesInicio;
    }

    public String getCorticoidesInicio() {
        return corticoidesInicio;
    }

    public void setCorticoidesInicio(String corticoidesInicio) {
        this.corticoidesInicio = corticoidesInicio;
    }

    public Date getFechInicTratDmar() {
        return fechInicTratDmar;
    }

    public void setFechInicTratDmar(Date fechInicTratDmar) {
        this.fechInicTratDmar = fechInicTratDmar;
    }

    public String getAnteLinfAnteDmar() {
        return anteLinfAnteDmar;
    }

    public void setAnteLinfAnteDmar(String anteLinfAnteDmar) {
        this.anteLinfAnteDmar = anteLinfAnteDmar;
    }

    public String getAzatioprina() {
        return azatioprina;
    }

    public void setAzatioprina(String azatioprina) {
        this.azatioprina = azatioprina;
    }

    public String getCiclosporina() {
        return ciclosporina;
    }

    public void setCiclosporina(String ciclosporina) {
        this.ciclosporina = ciclosporina;
    }

    public String getCiclofosfamida() {
        return ciclofosfamida;
    }

    public void setCiclofosfamida(String ciclofosfamida) {
        this.ciclofosfamida = ciclofosfamida;
    }

    public String getCloroquina() {
        return cloroquina;
    }

    public void setCloroquina(String cloroquina) {
        this.cloroquina = cloroquina;
    }

    public String getDPenicilamina() {
        return dPenicilamina;
    }

    public void setDPenicilamina(String dPenicilamina) {
        this.dPenicilamina = dPenicilamina;
    }

    public String getEtanercept() {
        return etanercept;
    }

    public void setEtanercept(String etanercept) {
        this.etanercept = etanercept;
    }

    public String getLeflunomida() {
        return leflunomida;
    }

    public void setLeflunomida(String leflunomida) {
        this.leflunomida = leflunomida;
    }

    public String getMetotrexate() {
        return metotrexate;
    }

    public void setMetotrexate(String metotrexate) {
        this.metotrexate = metotrexate;
    }

    public String getRituximab() {
        return rituximab;
    }

    public void setRituximab(String rituximab) {
        this.rituximab = rituximab;
    }

    public String getSulfasalazina() {
        return sulfasalazina;
    }

    public void setSulfasalazina(String sulfasalazina) {
        this.sulfasalazina = sulfasalazina;
    }

    public String getAbatacept() {
        return abatacept;
    }

    public void setAbatacept(String abatacept) {
        this.abatacept = abatacept;
    }

    public String getAdalimumab() {
        return adalimumab;
    }

    public void setAdalimumab(String adalimumab) {
        this.adalimumab = adalimumab;
    }

    public String getCertolizumab() {
        return certolizumab;
    }

    public void setCertolizumab(String certolizumab) {
        this.certolizumab = certolizumab;
    }

    public String getGolimumab() {
        return golimumab;
    }

    public void setGolimumab(String golimumab) {
        this.golimumab = golimumab;
    }

    public String getHidroxicloroquina() {
        return hidroxicloroquina;
    }

    public void setHidroxicloroquina(String hidroxicloroquina) {
        this.hidroxicloroquina = hidroxicloroquina;
    }

    public String getInfliximab() {
        return infliximab;
    }

    public void setInfliximab(String infliximab) {
        this.infliximab = infliximab;
    }

    public String getSalesOro() {
        return salesOro;
    }

    public void setSalesOro(String salesOro) {
        this.salesOro = salesOro;
    }

    public String getTocilizumab() {
        return tocilizumab;
    }

    public void setTocilizumab(String tocilizumab) {
        this.tocilizumab = tocilizumab;
    }

    public String getTofacitinib() {
        return tofacitinib;
    }

    public void setTofacitinib(String tofacitinib) {
        this.tofacitinib = tofacitinib;
    }

    public String getAnakinra() {
        return anakinra;
    }

    public void setAnakinra(String anakinra) {
        this.anakinra = anakinra;
    }

    public int getMedicamentoDmard1() {
        return medicamentoDmard1;
    }

    public void setMedicamentoDmard1(int medicamentoDmard1) {
        this.medicamentoDmard1 = medicamentoDmard1;
    }

    public int getMedicamentoDmard2() {
        return medicamentoDmard2;
    }

    public void setMedicamentoDmard2(int medicamentoDmard2) {
        this.medicamentoDmard2 = medicamentoDmard2;
    }

    public int getMedicamentoDmard3() {
        return medicamentoDmard3;
    }

    public void setMedicamentoDmard3(int medicamentoDmard3) {
        this.medicamentoDmard3 = medicamentoDmard3;
    }

    public int getMedicamentoDmard4() {
        return medicamentoDmard4;
    }

    public void setMedicamentoDmard4(int medicamentoDmard4) {
        this.medicamentoDmard4 = medicamentoDmard4;
    }

    public String getTamizajeTb() {
        return tamizajeTb;
    }

    public void setTamizajeTb(String tamizajeTb) {
        this.tamizajeTb = tamizajeTb;
    }

    public int getPesoUltimoSemestre() {
        return pesoUltimoSemestre;
    }

    public void setPesoUltimoSemestre(int pesoUltimoSemestre) {
        this.pesoUltimoSemestre = pesoUltimoSemestre;
    }

    public String getRadiografiaManosUltima() {
        return radiografiaManosUltima;
    }

    public void setRadiografiaManosUltima(String radiografiaManosUltima) {
        this.radiografiaManosUltima = radiografiaManosUltima;
    }

    public String getRadiografiaPiesUltima() {
        return radiografiaPiesUltima;
    }

    public void setRadiografiaPiesUltima(String radiografiaPiesUltima) {
        this.radiografiaPiesUltima = radiografiaPiesUltima;
    }

    public String getProteinaCSeguimiento() {
        return proteinaCSeguimiento;
    }

    public void setProteinaCSeguimiento(String proteinaCSeguimiento) {
        this.proteinaCSeguimiento = proteinaCSeguimiento;
    }

    public float getVsgSeguimiento() {
        return vsgSeguimiento;
    }

    public void setVsgSeguimiento(float vsgSeguimiento) {
        this.vsgSeguimiento = vsgSeguimiento;
    }

    public float getHemoglobinaSeguimiento() {
        return hemoglobinaSeguimiento;
    }

    public void setHemoglobinaSeguimiento(float hemoglobinaSeguimiento) {
        this.hemoglobinaSeguimiento = hemoglobinaSeguimiento;
    }

    public int getLeucocitosSeguimiento() {
        return leucocitosSeguimiento;
    }

    public void setLeucocitosSeguimiento(int leucocitosSeguimiento) {
        this.leucocitosSeguimiento = leucocitosSeguimiento;
    }

    public float getCreatininaSeguimiento() {
        return creatininaSeguimiento;
    }

    public void setCreatininaSeguimiento(float creatininaSeguimiento) {
        this.creatininaSeguimiento = creatininaSeguimiento;
    }

    public float getTfgSeguimiento() {
        return tfgSeguimiento;
    }

    public void setTfgSeguimiento(float tfgSeguimiento) {
        this.tfgSeguimiento = tfgSeguimiento;
    }

    public String getParcialOrinaSeguimiento() {
        return parcialOrinaSeguimiento;
    }

    public void setParcialOrinaSeguimiento(String parcialOrinaSeguimiento) {
        this.parcialOrinaSeguimiento = parcialOrinaSeguimiento;
    }

    public String getAltSeguimiento() {
        return altSeguimiento;
    }

    public void setAltSeguimiento(String altSeguimiento) {
        this.altSeguimiento = altSeguimiento;
    }

    public String getAthActual() {
        return athActual;
    }

    public void setAthActual(String athActual) {
        this.athActual = athActual;
    }

    public String getDmActual() {
        return dmActual;
    }

    public void setDmActual(String dmActual) {
        this.dmActual = dmActual;
    }

    public String getEcvActual() {
        return ecvActual;
    }

    public void setEcvActual(String ecvActual) {
        this.ecvActual = ecvActual;
    }

    public String getErcActual() {
        return ercActual;
    }

    public void setErcActual(String ercActual) {
        this.ercActual = ercActual;
    }

    public String getOsteoporosisActual() {
        return osteoporosisActual;
    }

    public void setOsteoporosisActual(String osteoporosisActual) {
        this.osteoporosisActual = osteoporosisActual;
    }

    public String getSindromeSjogrenActual() {
        return sindromeSjogrenActual;
    }

    public void setSindromeSjogrenActual(String sindromeSjogrenActual) {
        this.sindromeSjogrenActual = sindromeSjogrenActual;
    }

    public Date getFechaUltimaDas28() {
        return fechaUltimaDas28;
    }

    public void setFechaUltimaDas28(Date fechaUltimaDas28) {
        this.fechaUltimaDas28 = fechaUltimaDas28;
    }

    public String getProfRealUltiDas28() {
        return profRealUltiDas28;
    }

    public void setProfRealUltiDas28(String profRealUltiDas28) {
        this.profRealUltiDas28 = profRealUltiDas28;
    }

    public float getResultadoUltimoDas28() {
        return resultadoUltimoDas28;
    }

    public void setResultadoUltimoDas28(float resultadoUltimoDas28) {
        this.resultadoUltimoDas28 = resultadoUltimoDas28;
    }

    public String getEstadoActividadArDas28() {
        return estadoActividadArDas28;
    }

    public void setEstadoActividadArDas28(String estadoActividadArDas28) {
        this.estadoActividadArDas28 = estadoActividadArDas28;
    }

    public Date getFechaUltimoHaq() {
        return fechaUltimoHaq;
    }

    public void setFechaUltimoHaq(Date fechaUltimoHaq) {
        this.fechaUltimoHaq = fechaUltimoHaq;
    }

    public float getResultadoUltimoHaq() {
        return resultadoUltimoHaq;
    }

    public void setResultadoUltimoHaq(float resultadoUltimoHaq) {
        this.resultadoUltimoHaq = resultadoUltimoHaq;
    }

    public String getAnalgesicosNoOpioides() {
        return analgesicosNoOpioides;
    }

    public void setAnalgesicosNoOpioides(String analgesicosNoOpioides) {
        this.analgesicosNoOpioides = analgesicosNoOpioides;
    }

    public String getAnalgesicosOpioides() {
        return analgesicosOpioides;
    }

    public void setAnalgesicosOpioides(String analgesicosOpioides) {
        this.analgesicosOpioides = analgesicosOpioides;
    }

    public String getAines() {
        return aines;
    }

    public void setAines(String aines) {
        this.aines = aines;
    }

    public String getCorticoides() {
        return corticoides;
    }

    public void setCorticoides(String corticoides) {
        this.corticoides = corticoides;
    }

    public String getMesesUsoGlucocorticoides() {
        return mesesUsoGlucocorticoides;
    }

    public void setMesesUsoGlucocorticoides(String mesesUsoGlucocorticoides) {
        this.mesesUsoGlucocorticoides = mesesUsoGlucocorticoides;
    }

    public String getCalcio() {
        return calcio;
    }

    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public String getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(String vitaminaD) {
        this.vitaminaD = vitaminaD;
    }

    public Date getFechInicTratActuDmar() {
        return fechInicTratActuDmar;
    }

    public void setFechInicTratActuDmar(Date fechInicTratActuDmar) {
        this.fechInicTratActuDmar = fechInicTratActuDmar;
    }

    public String getAzatioprinaActual() {
        return azatioprinaActual;
    }

    public void setAzatioprinaActual(String azatioprinaActual) {
        this.azatioprinaActual = azatioprinaActual;
    }

    public String getCiclosporinaActual() {
        return ciclosporinaActual;
    }

    public void setCiclosporinaActual(String ciclosporinaActual) {
        this.ciclosporinaActual = ciclosporinaActual;
    }

    public String getCiclofosfamidaActual() {
        return ciclofosfamidaActual;
    }

    public void setCiclofosfamidaActual(String ciclofosfamidaActual) {
        this.ciclofosfamidaActual = ciclofosfamidaActual;
    }

    public String getCloroquinaActual() {
        return cloroquinaActual;
    }

    public void setCloroquinaActual(String cloroquinaActual) {
        this.cloroquinaActual = cloroquinaActual;
    }

    public String getDPenicilaiminaActual() {
        return dPenicilaiminaActual;
    }

    public void setDPenicilaiminaActual(String dPenicilaiminaActual) {
        this.dPenicilaiminaActual = dPenicilaiminaActual;
    }

    public String getEtanerceptActual() {
        return etanerceptActual;
    }

    public void setEtanerceptActual(String etanerceptActual) {
        this.etanerceptActual = etanerceptActual;
    }

    public String getLeflunomidaActual() {
        return leflunomidaActual;
    }

    public void setLeflunomidaActual(String leflunomidaActual) {
        this.leflunomidaActual = leflunomidaActual;
    }

    public String getMetotrexateActual() {
        return metotrexateActual;
    }

    public void setMetotrexateActual(String metotrexateActual) {
        this.metotrexateActual = metotrexateActual;
    }

    public String getRituximabActual() {
        return rituximabActual;
    }

    public void setRituximabActual(String rituximabActual) {
        this.rituximabActual = rituximabActual;
    }

    public String getSulfasalazinaActual() {
        return sulfasalazinaActual;
    }

    public void setSulfasalazinaActual(String sulfasalazinaActual) {
        this.sulfasalazinaActual = sulfasalazinaActual;
    }

    public String getAbataceptActual() {
        return abataceptActual;
    }

    public void setAbataceptActual(String abataceptActual) {
        this.abataceptActual = abataceptActual;
    }

    public String getAdalimumabActual() {
        return adalimumabActual;
    }

    public void setAdalimumabActual(String adalimumabActual) {
        this.adalimumabActual = adalimumabActual;
    }

    public String getCertolizumabActual() {
        return certolizumabActual;
    }

    public void setCertolizumabActual(String certolizumabActual) {
        this.certolizumabActual = certolizumabActual;
    }

    public String getGolimumabActual() {
        return golimumabActual;
    }

    public void setGolimumabActual(String golimumabActual) {
        this.golimumabActual = golimumabActual;
    }

    public String getHidroxicloroquinaActual() {
        return hidroxicloroquinaActual;
    }

    public void setHidroxicloroquinaActual(String hidroxicloroquinaActual) {
        this.hidroxicloroquinaActual = hidroxicloroquinaActual;
    }

    public String getInfliximabActual() {
        return infliximabActual;
    }

    public void setInfliximabActual(String infliximabActual) {
        this.infliximabActual = infliximabActual;
    }

    public String getSalesOroActual() {
        return salesOroActual;
    }

    public void setSalesOroActual(String salesOroActual) {
        this.salesOroActual = salesOroActual;
    }

    public String getTocilizumabActual() {
        return tocilizumabActual;
    }

    public void setTocilizumabActual(String tocilizumabActual) {
        this.tocilizumabActual = tocilizumabActual;
    }

    public String getTofacitinibActual() {
        return tofacitinibActual;
    }

    public void setTofacitinibActual(String tofacitinibActual) {
        this.tofacitinibActual = tofacitinibActual;
    }

    public String getAnakinraActual() {
        return anakinraActual;
    }

    public void setAnakinraActual(String anakinraActual) {
        this.anakinraActual = anakinraActual;
    }

    public int getMedicamentoDmard1Actual() {
        return medicamentoDmard1Actual;
    }

    public void setMedicamentoDmard1Actual(int medicamentoDmard1Actual) {
        this.medicamentoDmard1Actual = medicamentoDmard1Actual;
    }

    public int getMedicamentoDmard2Actual() {
        return medicamentoDmard2Actual;
    }

    public void setMedicamentoDmard2Actual(int medicamentoDmard2Actual) {
        this.medicamentoDmard2Actual = medicamentoDmard2Actual;
    }

    public int getMedicamentoDmard3Actual() {
        return medicamentoDmard3Actual;
    }

    public void setMedicamentoDmard3Actual(int medicamentoDmard3Actual) {
        this.medicamentoDmard3Actual = medicamentoDmard3Actual;
    }

    public int getMedicamentoDmard4Actual() {
        return medicamentoDmard4Actual;
    }

    public void setMedicamentoDmard4Actual(int medicamentoDmard4Actual) {
        this.medicamentoDmard4Actual = medicamentoDmard4Actual;
    }

    public String getNumeroConsultasReumatologo() {
        return numeroConsultasReumatologo;
    }

    public void setNumeroConsultasReumatologo(String numeroConsultasReumatologo) {
        this.numeroConsultasReumatologo = numeroConsultasReumatologo;
    }

    public String getNumeConsInteAr() {
        return numeConsInteAr;
    }

    public void setNumeConsInteAr(String numeConsInteAr) {
        this.numeConsInteAr = numeConsInteAr;
    }

    public String getNumeConsMediFamiAr() {
        return numeConsMediFamiAr;
    }

    public void setNumeConsMediFamiAr(String numeConsMediFamiAr) {
        this.numeConsMediFamiAr = numeConsMediFamiAr;
    }

    public String getReemplazoArticular1Ar() {
        return reemplazoArticular1Ar;
    }

    public void setReemplazoArticular1Ar(String reemplazoArticular1Ar) {
        this.reemplazoArticular1Ar = reemplazoArticular1Ar;
    }

    public String getReemplazoArticular2Ar() {
        return reemplazoArticular2Ar;
    }

    public void setReemplazoArticular2Ar(String reemplazoArticular2Ar) {
        this.reemplazoArticular2Ar = reemplazoArticular2Ar;
    }

    public String getReemplazoArticular3Ar() {
        return reemplazoArticular3Ar;
    }

    public void setReemplazoArticular3Ar(String reemplazoArticular3Ar) {
        this.reemplazoArticular3Ar = reemplazoArticular3Ar;
    }

    public String getReemplazoArticular4Ar() {
        return reemplazoArticular4Ar;
    }

    public void setReemplazoArticular4Ar(String reemplazoArticular4Ar) {
        this.reemplazoArticular4Ar = reemplazoArticular4Ar;
    }

    public String getNumeroHospitalizacionesAr() {
        return numeroHospitalizacionesAr;
    }

    public void setNumeroHospitalizacionesAr(String numeroHospitalizacionesAr) {
        this.numeroHospitalizacionesAr = numeroHospitalizacionesAr;
    }

    public String getCodiHabiIpsSeguAr() {
        return codiHabiIpsSeguAr;
    }

    public void setCodiHabiIpsSeguAr(String codiHabiIpsSeguAr) {
        this.codiHabiIpsSeguAr = codiHabiIpsSeguAr;
    }

    public String getCodigoMunicipalIps() {
        return codigoMunicipalIps;
    }

    public void setCodigoMunicipalIps(String codigoMunicipalIps) {
        this.codigoMunicipalIps = codigoMunicipalIps;
    }

    public Date getFechIngrIpsSeguAr() {
        return fechIngrIpsSeguAr;
    }

    public void setFechIngrIpsSeguAr(Date fechIngrIpsSeguAr) {
        this.fechIngrIpsSeguAr = fechIngrIpsSeguAr;
    }

    public String getAtencionClinicaArPor() {
        return atencionClinicaArPor;
    }

    public void setAtencionClinicaArPor(String atencionClinicaArPor) {
        this.atencionClinicaArPor = atencionClinicaArPor;
    }

    public String getNovePaciRepoAnte() {
        return novePaciRepoAnte;
    }

    public void setNovePaciRepoAnte(String novePaciRepoAnte) {
        this.novePaciRepoAnte = novePaciRepoAnte;
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
        
        if (!(object instanceof WriteCmPacienteArtritisReumatoide)) {
            return false;
        }
        WriteCmPacienteArtritisReumatoide other = (WriteCmPacienteArtritisReumatoide) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteArtritisReumatoide[ id=" + id + " ]";
    }
    
}
