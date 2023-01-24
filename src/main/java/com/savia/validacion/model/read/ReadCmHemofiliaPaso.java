/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.read;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "cm_hemofilia_paso")
public class ReadCmHemofiliaPaso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer idHemofilia;
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
    @Column(name = "tipo_identificacion_usuario")
    private String tipoIdentificacionUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_identificacion_usuario")
    private String numeroIdentificacionUsuario;
    @Column(name = "fecha_nacimiento_usuario")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sexo_usuario")
    private Character sexoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocupacion_usuario")
    private int ocupacionUsuario;
    @Basic(optional = false)
    @NotNull
    private Character sgsss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
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
    @Column(name = "municipio_residencia")
    private int municipioResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "numero_telefonico_usuario")
    private String numeroTelefonicoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_afilicion_eps")
    @Temporal(TemporalType.DATE)
    private Date fechaAfilicionEps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado_gestacion_usuario")
    private String estadoGestacionUsuario;
    @Size(max = 2)
    @Column(name = "usua_prog_plan")
    private String usuaProgPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad_usuario_consulta")
    private int edadUsuarioConsulta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "motivo_prueba_diagnostico")
    private String motivoPruebaDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnostico;
    @Column(name = "codi_vali_habi_ips")
    private BigInteger codiValiHabiIps;
    @Size(max = 2)
    @Column(name = "tipo_defi_diag")
    private String tipoDefiDiag;
    @Size(max = 4)
    @Column(name = "clas_seve_nive_fact")
    private String clasSeveNiveFact;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actividad_coagulante_factor")
    private float actividadCoagulanteFactor;
    @Size(max = 4)
    @Column(name = "ante_fami_asoc_hemo")
    private String anteFamiAsocHemo;
    @Size(max = 4)
    @Column(name = "fact_reci_prim_trat")
    private String factReciPrimTrat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "esquema_primer_tratamiento")
    private String esquemaPrimerTratamiento;
    @Column(name = "fech_inic_prim_trat")
    @Temporal(TemporalType.DATE)
    private Date fechInicPrimTrat;
    @Column(name = "fact_reci_actu_trat")
    private Integer factReciActuTrat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "esquema_actual_tratamiento")
    private String esquemaActualTratamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso_usuario")
    private float pesoUsuario;
    @Basic(optional = false)
    @NotNull
    private float dosis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "frecuencia_semana")
    private String frecuenciaSemana;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_dosis_totales_periodo")
    private int numeroDosisTotalesPeriodo;
    @Column(name = "nume_apli_tota_peri")
    private Integer numeApliTotaPeri;
    @Size(max = 4)
    @Column(name = "moda_apli_trat")
    private String modaApliTrat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "via_administracion")
    private String viaAdministracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cum_1")
    private String cum1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cum_2")
    private String cum2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cum_3")
    private String cum3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cum_4")
    private String cum4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_habilitacion_eps")
    private long codigoHabilitacionEps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    private String hermartrosis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemorragia_ilio_psoas")
    private int hemorragiaIlioPsoas;
    @Column(name = "nume_herm_espo_ulti_año")
    private Integer numeHermEspoUltiAño;
    @Column(name = "nume_herm_trau_ulti_año")
    private Integer numeHermTrauUltiAño;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemorragia_muscular")
    private int hemorragiaMuscular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemorragia_intracraneal")
    private int hemorragiaIntracraneal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemorragia_cuello")
    private int hemorragiaCuello;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hemorragia_oral")
    private int hemorragiaOral;
    @Column(name = "hemo_otra_loca")
    private Integer hemoOtraLoca;
    @Column(name = "hemo_otra_dife_hema_espo")
    private Integer hemoOtraDifeHemaEspo;
    @Column(name = "hemo_otra_dife_hema_trau")
    private Integer hemoOtraDifeHemaTrau;
    @Column(name = "hemo_asoc_proc_dife_hema")
    private Integer hemoAsocProcDifeHema;
    @Size(max = 4)
    @Column(name = "pres_inhi_fech_cort")
    private String presInhiFechCort;
    @Column(name = "fech_dete_titu_inhi")
    @Temporal(TemporalType.DATE)
    private Date fechDeteTituInhi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "recibido_iti_usuario")
    private String recibidoItiUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "recibio_iti_periodo")
    private String recibioItiPeriodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiempo_usuario_iti")
    private int tiempoUsuarioIti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "artropatia_hemofilica_cronica")
    private String artropatiaHemofilicaCronica;
    @Column(name = "num_arti_comp")
    private Integer numArtiComp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "usuario_infectado_vhc")
    private String usuarioInfectadoVhc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "usuario_infectado_vhb")
    private String usuarioInfectadoVhb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "usuario_infectado_vih")
    private String usuarioInfectadoVih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    private String pseudotumores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    private String fracturas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    private String anafilaxis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "factor_anacfiliactica")
    private String factorAnacfiliactica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemplazo_articulares_vida")
    private int reemplazoArticularesVida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reemplazo_articulares_periodo")
    private int reemplazoArticularesPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "profesional_atencion_usuario")
    private String profesionalAtencionUsuario;
    @Column(name = "cons_pres_hema")
    private Integer consPresHema;
    @Column(name = "cons_pres_orto")
    private Integer consPresOrto;
    @Column(name = "inte_prof_enfe")
    private Integer inteProfEnfe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consultas_odontologo")
    private int consultasOdontologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consulta_nutricionista")
    private int consultaNutricionista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "intervencion_trabajo_social")
    private int intervencionTrabajoSocial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consulta_fisiatria")
    private int consultaFisiatria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consulta_psicologia")
    private int consultaPsicologia;
    @Column(name = "inte_quim_farm")
    private Integer inteQuimFarm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "intervencion_fisioterapia")
    private int intervencionFisioterapia;
    @Size(max = 20)
    @Column(name = "prim_nomb_medi_prin")
    private String primNombMediPrin;
    @Size(max = 30)
    @Column(name = "segu_nomb_medi_prin")
    private String seguNombMediPrin;
    @Size(max = 20)
    @Column(name = "prim_apel_medi_prin")
    private String primApelMediPrin;
    @Size(max = 30)
    @Column(name = "segu_apel_medi_prin")
    private String seguApelMediPrin;
    @Column(name = "nume_aten_serv_urge_hemo")
    private Integer numeAtenServUrgeHemo;
    @Column(name = "nume_even_hosp_hemo")
    private Integer numeEvenHospHemo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_total_unidades_factor")
    private double costoTotalUnidadesFactor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costos_agente_puente")
    private double costosAgentePuente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costos_coagulopatia")
    private double costosCoagulopatia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cost_inca_coag")
    private Double costIncaCoag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String novedades;
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
    private long bdua;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_corte")
    @Temporal(TemporalType.DATE)
    private Date fechaCorte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "campo_leido")
    private boolean campoLeido;
    @Column(name = "clave_archivo")
    private String claveArchvio;
    @Column(name = "error_validacion")
    private String errorValidacion;

    public ReadCmHemofiliaPaso() {
    }

    public ReadCmHemofiliaPaso(Integer idHemofilia) {
        this.idHemofilia = idHemofilia;
    }

    public ReadCmHemofiliaPaso(Integer idHemofilia, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacionUsuario, String numeroIdentificacionUsuario, Character sexoUsuario, int ocupacionUsuario, Character sgsss, String codigoEapb, int codigoPertenenciaEtnica, int grupoPoblacional, int municipioResidencia, String numeroTelefonicoUsuario, Date fechaAfilicionEps, String estadoGestacionUsuario, int edadUsuarioConsulta, String motivoPruebaDiagnostico, Date fechaDiagnostico, float actividadCoagulanteFactor, String esquemaPrimerTratamiento, String esquemaActualTratamiento, float pesoUsuario, float dosis, String frecuenciaSemana, int numeroDosisTotalesPeriodo, String viaAdministracion, String cum1, String cum2, String cum3, String cum4, long codigoHabilitacionEps, String hermartrosis, int hemorragiaIlioPsoas, int hemorragiaMuscular, int hemorragiaIntracraneal, int hemorragiaCuello, int hemorragiaOral, String recibidoItiUsuario, String recibioItiPeriodo, int tiempoUsuarioIti, String artropatiaHemofilicaCronica, String usuarioInfectadoVhc, String usuarioInfectadoVhb, String usuarioInfectadoVih, String pseudotumores, String fracturas, String anafilaxis, String factorAnacfiliactica, int reemplazoArticularesVida, int reemplazoArticularesPeriodo, String profesionalAtencionUsuario, int consultasOdontologo, int consultaNutricionista, int intervencionTrabajoSocial, int consultaFisiatria, int consultaPsicologia, int intervencionFisioterapia, double costoTotalUnidadesFactor, double costosAgentePuente, double costosCoagulopatia, String novedades, String causaMuerte, Date fechaMuerte, long bdua, Date fechaCorte) {
        this.idHemofilia = idHemofilia;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
        this.sexoUsuario = sexoUsuario;
        this.ocupacionUsuario = ocupacionUsuario;
        this.sgsss = sgsss;
        this.codigoEapb = codigoEapb;
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.grupoPoblacional = grupoPoblacional;
        this.municipioResidencia = municipioResidencia;
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
        this.fechaAfilicionEps = fechaAfilicionEps;
        this.estadoGestacionUsuario = estadoGestacionUsuario;
        this.edadUsuarioConsulta = edadUsuarioConsulta;
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
        this.esquemaActualTratamiento = esquemaActualTratamiento;
        this.pesoUsuario = pesoUsuario;
        this.dosis = dosis;
        this.frecuenciaSemana = frecuenciaSemana;
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
        this.viaAdministracion = viaAdministracion;
        this.cum1 = cum1;
        this.cum2 = cum2;
        this.cum3 = cum3;
        this.cum4 = cum4;
        this.codigoHabilitacionEps = codigoHabilitacionEps;
        this.hermartrosis = hermartrosis;
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
        this.hemorragiaMuscular = hemorragiaMuscular;
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
        this.hemorragiaCuello = hemorragiaCuello;
        this.hemorragiaOral = hemorragiaOral;
        this.recibidoItiUsuario = recibidoItiUsuario;
        this.recibioItiPeriodo = recibioItiPeriodo;
        this.tiempoUsuarioIti = tiempoUsuarioIti;
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
        this.usuarioInfectadoVih = usuarioInfectadoVih;
        this.pseudotumores = pseudotumores;
        this.fracturas = fracturas;
        this.anafilaxis = anafilaxis;
        this.factorAnacfiliactica = factorAnacfiliactica;
        this.reemplazoArticularesVida = reemplazoArticularesVida;
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
        this.consultasOdontologo = consultasOdontologo;
        this.consultaNutricionista = consultaNutricionista;
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
        this.consultaFisiatria = consultaFisiatria;
        this.consultaPsicologia = consultaPsicologia;
        this.intervencionFisioterapia = intervencionFisioterapia;
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
        this.costosAgentePuente = costosAgentePuente;
        this.costosCoagulopatia = costosCoagulopatia;
        this.novedades = novedades;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.bdua = bdua;
        this.fechaCorte = fechaCorte;
    }

    public Integer getIdHemofilia() {
        return idHemofilia;
    }

    public void setIdHemofilia(Integer idHemofilia) {
        this.idHemofilia = idHemofilia;
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

    public String getTipoIdentificacionUsuario() {
        return tipoIdentificacionUsuario;
    }

    public void setTipoIdentificacionUsuario(String tipoIdentificacionUsuario) {
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
    }

    public String getNumeroIdentificacionUsuario() {
        return numeroIdentificacionUsuario;
    }

    public void setNumeroIdentificacionUsuario(String numeroIdentificacionUsuario) {
        this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public Character getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(Character sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public int getOcupacionUsuario() {
        return ocupacionUsuario;
    }

    public void setOcupacionUsuario(int ocupacionUsuario) {
        this.ocupacionUsuario = ocupacionUsuario;
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

    public int getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(int municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public String getNumeroTelefonicoUsuario() {
        return numeroTelefonicoUsuario;
    }

    public void setNumeroTelefonicoUsuario(String numeroTelefonicoUsuario) {
        this.numeroTelefonicoUsuario = numeroTelefonicoUsuario;
    }

    public Date getFechaAfilicionEps() {
        return fechaAfilicionEps;
    }

    public void setFechaAfilicionEps(Date fechaAfilicionEps) {
        this.fechaAfilicionEps = fechaAfilicionEps;
    }

    public String getEstadoGestacionUsuario() {
        return estadoGestacionUsuario;
    }

    public void setEstadoGestacionUsuario(String estadoGestacionUsuario) {
        this.estadoGestacionUsuario = estadoGestacionUsuario;
    }

    public String getUsuaProgPlan() {
        return usuaProgPlan;
    }

    public void setUsuaProgPlan(String usuaProgPlan) {
        this.usuaProgPlan = usuaProgPlan;
    }

    public int getEdadUsuarioConsulta() {
        return edadUsuarioConsulta;
    }

    public void setEdadUsuarioConsulta(int edadUsuarioConsulta) {
        this.edadUsuarioConsulta = edadUsuarioConsulta;
    }

    public String getMotivoPruebaDiagnostico() {
        return motivoPruebaDiagnostico;
    }

    public void setMotivoPruebaDiagnostico(String motivoPruebaDiagnostico) {
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public BigInteger getCodiValiHabiIps() {
        return codiValiHabiIps;
    }

    public void setCodiValiHabiIps(BigInteger codiValiHabiIps) {
        this.codiValiHabiIps = codiValiHabiIps;
    }

    public String getTipoDefiDiag() {
        return tipoDefiDiag;
    }

    public void setTipoDefiDiag(String tipoDefiDiag) {
        this.tipoDefiDiag = tipoDefiDiag;
    }

    public String getClasSeveNiveFact() {
        return clasSeveNiveFact;
    }

    public void setClasSeveNiveFact(String clasSeveNiveFact) {
        this.clasSeveNiveFact = clasSeveNiveFact;
    }

    public float getActividadCoagulanteFactor() {
        return actividadCoagulanteFactor;
    }

    public void setActividadCoagulanteFactor(float actividadCoagulanteFactor) {
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
    }

    public String getAnteFamiAsocHemo() {
        return anteFamiAsocHemo;
    }

    public void setAnteFamiAsocHemo(String anteFamiAsocHemo) {
        this.anteFamiAsocHemo = anteFamiAsocHemo;
    }

    public String getFactReciPrimTrat() {
        return factReciPrimTrat;
    }

    public void setFactReciPrimTrat(String factReciPrimTrat) {
        this.factReciPrimTrat = factReciPrimTrat;
    }

    public String getEsquemaPrimerTratamiento() {
        return esquemaPrimerTratamiento;
    }

    public void setEsquemaPrimerTratamiento(String esquemaPrimerTratamiento) {
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
    }

    public Date getFechInicPrimTrat() {
        return fechInicPrimTrat;
    }

    public void setFechInicPrimTrat(Date fechInicPrimTrat) {
        this.fechInicPrimTrat = fechInicPrimTrat;
    }

    public Integer getFactReciActuTrat() {
        return factReciActuTrat;
    }

    public void setFactReciActuTrat(Integer factReciActuTrat) {
        this.factReciActuTrat = factReciActuTrat;
    }

    public String getEsquemaActualTratamiento() {
        return esquemaActualTratamiento;
    }

    public void setEsquemaActualTratamiento(String esquemaActualTratamiento) {
        this.esquemaActualTratamiento = esquemaActualTratamiento;
    }

    public float getPesoUsuario() {
        return pesoUsuario;
    }

    public void setPesoUsuario(float pesoUsuario) {
        this.pesoUsuario = pesoUsuario;
    }

    public float getDosis() {
        return dosis;
    }

    public void setDosis(float dosis) {
        this.dosis = dosis;
    }

    public String getFrecuenciaSemana() {
        return frecuenciaSemana;
    }

    public void setFrecuenciaSemana(String frecuenciaSemana) {
        this.frecuenciaSemana = frecuenciaSemana;
    }

    public int getNumeroDosisTotalesPeriodo() {
        return numeroDosisTotalesPeriodo;
    }

    public void setNumeroDosisTotalesPeriodo(int numeroDosisTotalesPeriodo) {
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
    }

    public Integer getNumeApliTotaPeri() {
        return numeApliTotaPeri;
    }

    public void setNumeApliTotaPeri(Integer numeApliTotaPeri) {
        this.numeApliTotaPeri = numeApliTotaPeri;
    }

    public String getModaApliTrat() {
        return modaApliTrat;
    }

    public void setModaApliTrat(String modaApliTrat) {
        this.modaApliTrat = modaApliTrat;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getCum1() {
        return cum1;
    }

    public void setCum1(String cum1) {
        this.cum1 = cum1;
    }

    public String getCum2() {
        return cum2;
    }

    public void setCum2(String cum2) {
        this.cum2 = cum2;
    }

    public String getCum3() {
        return cum3;
    }

    public void setCum3(String cum3) {
        this.cum3 = cum3;
    }

    public String getCum4() {
        return cum4;
    }

    public void setCum4(String cum4) {
        this.cum4 = cum4;
    }

    public long getCodigoHabilitacionEps() {
        return codigoHabilitacionEps;
    }

    public void setCodigoHabilitacionEps(long codigoHabilitacionEps) {
        this.codigoHabilitacionEps = codigoHabilitacionEps;
    }

    public String getHermartrosis() {
        return hermartrosis;
    }

    public void setHermartrosis(String hermartrosis) {
        this.hermartrosis = hermartrosis;
    }

    public int getHemorragiaIlioPsoas() {
        return hemorragiaIlioPsoas;
    }

    public void setHemorragiaIlioPsoas(int hemorragiaIlioPsoas) {
        this.hemorragiaIlioPsoas = hemorragiaIlioPsoas;
    }

    public Integer getNumeHermEspoUltiAño() {
        return numeHermEspoUltiAño;
    }

    public void setNumeHermEspoUltiAño(Integer numeHermEspoUltiAño) {
        this.numeHermEspoUltiAño = numeHermEspoUltiAño;
    }

    public Integer getNumeHermTrauUltiAño() {
        return numeHermTrauUltiAño;
    }

    public void setNumeHermTrauUltiAño(Integer numeHermTrauUltiAño) {
        this.numeHermTrauUltiAño = numeHermTrauUltiAño;
    }

    public int getHemorragiaMuscular() {
        return hemorragiaMuscular;
    }

    public void setHemorragiaMuscular(int hemorragiaMuscular) {
        this.hemorragiaMuscular = hemorragiaMuscular;
    }

    public int getHemorragiaIntracraneal() {
        return hemorragiaIntracraneal;
    }

    public void setHemorragiaIntracraneal(int hemorragiaIntracraneal) {
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
    }

    public int getHemorragiaCuello() {
        return hemorragiaCuello;
    }

    public void setHemorragiaCuello(int hemorragiaCuello) {
        this.hemorragiaCuello = hemorragiaCuello;
    }

    public int getHemorragiaOral() {
        return hemorragiaOral;
    }

    public void setHemorragiaOral(int hemorragiaOral) {
        this.hemorragiaOral = hemorragiaOral;
    }

    public Integer getHemoOtraLoca() {
        return hemoOtraLoca;
    }

    public void setHemoOtraLoca(Integer hemoOtraLoca) {
        this.hemoOtraLoca = hemoOtraLoca;
    }

    public Integer getHemoOtraDifeHemaEspo() {
        return hemoOtraDifeHemaEspo;
    }

    public void setHemoOtraDifeHemaEspo(Integer hemoOtraDifeHemaEspo) {
        this.hemoOtraDifeHemaEspo = hemoOtraDifeHemaEspo;
    }

    public Integer getHemoOtraDifeHemaTrau() {
        return hemoOtraDifeHemaTrau;
    }

    public void setHemoOtraDifeHemaTrau(Integer hemoOtraDifeHemaTrau) {
        this.hemoOtraDifeHemaTrau = hemoOtraDifeHemaTrau;
    }

    public Integer getHemoAsocProcDifeHema() {
        return hemoAsocProcDifeHema;
    }

    public void setHemoAsocProcDifeHema(Integer hemoAsocProcDifeHema) {
        this.hemoAsocProcDifeHema = hemoAsocProcDifeHema;
    }

    public String getPresInhiFechCort() {
        return presInhiFechCort;
    }

    public void setPresInhiFechCort(String presInhiFechCort) {
        this.presInhiFechCort = presInhiFechCort;
    }

    public Date getFechDeteTituInhi() {
        return fechDeteTituInhi;
    }

    public void setFechDeteTituInhi(Date fechDeteTituInhi) {
        this.fechDeteTituInhi = fechDeteTituInhi;
    }

    public String getRecibidoItiUsuario() {
        return recibidoItiUsuario;
    }

    public void setRecibidoItiUsuario(String recibidoItiUsuario) {
        this.recibidoItiUsuario = recibidoItiUsuario;
    }

    public String getRecibioItiPeriodo() {
        return recibioItiPeriodo;
    }

    public void setRecibioItiPeriodo(String recibioItiPeriodo) {
        this.recibioItiPeriodo = recibioItiPeriodo;
    }

    public int getTiempoUsuarioIti() {
        return tiempoUsuarioIti;
    }

    public void setTiempoUsuarioIti(int tiempoUsuarioIti) {
        this.tiempoUsuarioIti = tiempoUsuarioIti;
    }

    public String getArtropatiaHemofilicaCronica() {
        return artropatiaHemofilicaCronica;
    }

    public void setArtropatiaHemofilicaCronica(String artropatiaHemofilicaCronica) {
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
    }

    public Integer getNumArtiComp() {
        return numArtiComp;
    }

    public void setNumArtiComp(Integer numArtiComp) {
        this.numArtiComp = numArtiComp;
    }

    public String getUsuarioInfectadoVhc() {
        return usuarioInfectadoVhc;
    }

    public void setUsuarioInfectadoVhc(String usuarioInfectadoVhc) {
        this.usuarioInfectadoVhc = usuarioInfectadoVhc;
    }

    public String getUsuarioInfectadoVhb() {
        return usuarioInfectadoVhb;
    }

    public void setUsuarioInfectadoVhb(String usuarioInfectadoVhb) {
        this.usuarioInfectadoVhb = usuarioInfectadoVhb;
    }

    public String getUsuarioInfectadoVih() {
        return usuarioInfectadoVih;
    }

    public void setUsuarioInfectadoVih(String usuarioInfectadoVih) {
        this.usuarioInfectadoVih = usuarioInfectadoVih;
    }

    public String getPseudotumores() {
        return pseudotumores;
    }

    public void setPseudotumores(String pseudotumores) {
        this.pseudotumores = pseudotumores;
    }

    public String getFracturas() {
        return fracturas;
    }

    public void setFracturas(String fracturas) {
        this.fracturas = fracturas;
    }

    public String getAnafilaxis() {
        return anafilaxis;
    }

    public void setAnafilaxis(String anafilaxis) {
        this.anafilaxis = anafilaxis;
    }

    public String getFactorAnacfiliactica() {
        return factorAnacfiliactica;
    }

    public void setFactorAnacfiliactica(String factorAnacfiliactica) {
        this.factorAnacfiliactica = factorAnacfiliactica;
    }

    public int getReemplazoArticularesVida() {
        return reemplazoArticularesVida;
    }

    public void setReemplazoArticularesVida(int reemplazoArticularesVida) {
        this.reemplazoArticularesVida = reemplazoArticularesVida;
    }

    public int getReemplazoArticularesPeriodo() {
        return reemplazoArticularesPeriodo;
    }

    public void setReemplazoArticularesPeriodo(int reemplazoArticularesPeriodo) {
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
    }

    public String getProfesionalAtencionUsuario() {
        return profesionalAtencionUsuario;
    }

    public void setProfesionalAtencionUsuario(String profesionalAtencionUsuario) {
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
    }

    public Integer getConsPresHema() {
        return consPresHema;
    }

    public void setConsPresHema(Integer consPresHema) {
        this.consPresHema = consPresHema;
    }

    public Integer getConsPresOrto() {
        return consPresOrto;
    }

    public void setConsPresOrto(Integer consPresOrto) {
        this.consPresOrto = consPresOrto;
    }

    public Integer getInteProfEnfe() {
        return inteProfEnfe;
    }

    public void setInteProfEnfe(Integer inteProfEnfe) {
        this.inteProfEnfe = inteProfEnfe;
    }

    public int getConsultasOdontologo() {
        return consultasOdontologo;
    }

    public void setConsultasOdontologo(int consultasOdontologo) {
        this.consultasOdontologo = consultasOdontologo;
    }

    public int getConsultaNutricionista() {
        return consultaNutricionista;
    }

    public void setConsultaNutricionista(int consultaNutricionista) {
        this.consultaNutricionista = consultaNutricionista;
    }

    public int getIntervencionTrabajoSocial() {
        return intervencionTrabajoSocial;
    }

    public void setIntervencionTrabajoSocial(int intervencionTrabajoSocial) {
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
    }

    public int getConsultaFisiatria() {
        return consultaFisiatria;
    }

    public void setConsultaFisiatria(int consultaFisiatria) {
        this.consultaFisiatria = consultaFisiatria;
    }

    public int getConsultaPsicologia() {
        return consultaPsicologia;
    }

    public void setConsultaPsicologia(int consultaPsicologia) {
        this.consultaPsicologia = consultaPsicologia;
    }

    public Integer getInteQuimFarm() {
        return inteQuimFarm;
    }

    public void setInteQuimFarm(Integer inteQuimFarm) {
        this.inteQuimFarm = inteQuimFarm;
    }

    public int getIntervencionFisioterapia() {
        return intervencionFisioterapia;
    }

    public void setIntervencionFisioterapia(int intervencionFisioterapia) {
        this.intervencionFisioterapia = intervencionFisioterapia;
    }

    public String getPrimNombMediPrin() {
        return primNombMediPrin;
    }

    public void setPrimNombMediPrin(String primNombMediPrin) {
        this.primNombMediPrin = primNombMediPrin;
    }

    public String getSeguNombMediPrin() {
        return seguNombMediPrin;
    }

    public void setSeguNombMediPrin(String seguNombMediPrin) {
        this.seguNombMediPrin = seguNombMediPrin;
    }

    public String getPrimApelMediPrin() {
        return primApelMediPrin;
    }

    public void setPrimApelMediPrin(String primApelMediPrin) {
        this.primApelMediPrin = primApelMediPrin;
    }

    public String getSeguApelMediPrin() {
        return seguApelMediPrin;
    }

    public void setSeguApelMediPrin(String seguApelMediPrin) {
        this.seguApelMediPrin = seguApelMediPrin;
    }

    public Integer getNumeAtenServUrgeHemo() {
        return numeAtenServUrgeHemo;
    }

    public void setNumeAtenServUrgeHemo(Integer numeAtenServUrgeHemo) {
        this.numeAtenServUrgeHemo = numeAtenServUrgeHemo;
    }

    public Integer getNumeEvenHospHemo() {
        return numeEvenHospHemo;
    }

    public void setNumeEvenHospHemo(Integer numeEvenHospHemo) {
        this.numeEvenHospHemo = numeEvenHospHemo;
    }

    public double getCostoTotalUnidadesFactor() {
        return costoTotalUnidadesFactor;
    }

    public void setCostoTotalUnidadesFactor(double costoTotalUnidadesFactor) {
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
    }

    public double getCostosAgentePuente() {
        return costosAgentePuente;
    }

    public void setCostosAgentePuente(double costosAgentePuente) {
        this.costosAgentePuente = costosAgentePuente;
    }

    public double getCostosCoagulopatia() {
        return costosCoagulopatia;
    }

    public void setCostosCoagulopatia(double costosCoagulopatia) {
        this.costosCoagulopatia = costosCoagulopatia;
    }

    public Double getCostIncaCoag() {
        return costIncaCoag;
    }

    public void setCostIncaCoag(Double costIncaCoag) {
        this.costIncaCoag = costIncaCoag;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
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

    public long getBdua() {
        return bdua;
    }

    public void setBdua(long bdua) {
        this.bdua = bdua;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHemofilia != null ? idHemofilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReadCmHemofiliaPaso)) {
            return false;
        }
        ReadCmHemofiliaPaso other = (ReadCmHemofiliaPaso) object;
        if ((this.idHemofilia == null && other.idHemofilia != null) || (this.idHemofilia != null && !this.idHemofilia.equals(other.idHemofilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ReadCmHemofiliaPaso[ idHemofilia=" + idHemofilia + " ]";
    }
    
}
