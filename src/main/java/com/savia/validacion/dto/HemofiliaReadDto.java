package com.savia.validacion.dto;
import java.util.Date;

public class HemofiliaReadDto {
    private Integer idHemofiliaPaso;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String tipoIdentificacionUsuario;
    private String numeroIdentificacionUsuario;
    private Date fechaNacimientoUsuario;
    private String sexoUsuario;
    private short ocupacionUsuario;
    private String sgsss;
    private String codigoEapb;
    private short codigoPertenenciaEtnica;
    private short grupoPoblacional;
    private short municipioResidencia;
    private String numeroTelefonicoUsuario;
    private Date fechaAfilicionEps;
    private String estadoGestacionUsuario;
    private String usuarioProgramaPlanificacion;
    private int edadUsuarioConsulta;
    private String motivoPruebaDiagnostico;
    private Date fechaDiagnostico;
    private long codigoValidoHabilitacionIps;
    private String tipoDeficienciaDiagnosticada;
    private String clasificacionSeveridadNivelFactor;
    private double actividadCoagulanteFactor;
    private String antecedentesFamiliaresAsociadosHemofilia;
    private String factorRecibidoPrimerTratamiento;
    private String esquemaPrimerTratamiento;
    private Date fechaInicioPrimerTratamiento;
    private short factorRecibidoActualTratamieno;
    private String esquemaActualTratamiento;
    private double pesoUsuario;
    private double dosis;
    private String frecuenciaSemana;
    private int numeroDosisTotalesPeriodo;
    private long numeroAplicacionesTotalesPeriodo;
    private String modalidadAplicacionTratamiento;
    private String viaAdministracion;
    private String cum1;
    private String cum2;
    private String cum3;
    private String cum4;
    private long codigoHabilitacionEps;
    private String hermartrosis;
    private short hemorragiailioPsoas;
    private short numeroHermatrosisEspontaneasUltimoAno;
    private short numeroHermatrosisTraumaticasUltimoAno;
    private short hemorragiaIntracraneal;
    private short hemorragiaCuello;
    private short hemorragiaOral;
    private short hemorragiaOtrasLocalizaciones;
    private short hemorragiaOtrasDiferentesHematrosisEspontaneas;
    private short hemorragiaOtrasDiferentesHematrosisTraumaticas;
    private short hemorragiaAsociadaProcesosDiferentesHematrosis;
    private String presenciaInhibidorFechaCorte;
    private Date fechaDeterminacionTitulosInhibidor;
    private String recibidoItiUsuario;
    private String recibioItiPeriodo;
    private short tiempoUsuarioIti;
    private String artropatiaHemofilicaCronica;
    private short numArticulacionesComprometidas;
    private String usuarioInfectadoVhc;
    private String usuarioInfectadoVhb;
    private String usuarioInfectadoVih;
    private String pseudotumores;
    private String fracturas;
    private String anafilaxis;
    private String factorAnacfiliactica;
    private short reemplazoArticularesVida;
    private short reemplazoArticularesPeriodo;
    private String profesionalAtencionUsuario;
    private short consultasPresencialesHematologo;
    private short consultasPresencialesOrtopedista;
    private short intervencionProfesionalEnfermeria;
    private short consultasOdontologo;
    private short consultaNutricionista;
    private short intervencionTrabajoSocial;
    private short consultaFisiatria;
    private short consultaPsicologia;
    private short intervencionQuimicoFarmaceutico;
    private short intervencionFisioterapia;
    private String primerNombreMedicoPrincipal;
    private String segundoNombreMedicoPrincipal;
    private String primerApellidoMedicoPrincipal;
    private String segundoApellidoMedicoPrincipal;
    private short numeroAtencionesServicioUrgenciasHemofilia;
    private short numeroEventosHospitalariosHemofilia;
    private double costoTotalUnidadesFactor;
    private double costosAgentePuente;
    private double costosCoagulopatia;
    private double costosIncapacidadesCoagulopatia;
    private String novedades;
    private String causaMuerte;
    private Date fechaMuerte;
    private int bdua;
    private Date fechaCorte;

    public HemofiliaReadDto(Integer idHemofiliaPaso, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacionUsuario, String numeroIdentificacionUsuario, Date fechaNacimientoUsuario, String sexoUsuario, short ocupacionUsuario, String sgsss, String codigoEapb, short codigoPertenenciaEtnica, short grupoPoblacional, short municipioResidencia, String numeroTelefonicoUsuario, Date fechaAfilicionEps, String estadoGestacionUsuario, String usuarioProgramaPlanificacion, int edadUsuarioConsulta, String motivoPruebaDiagnostico, Date fechaDiagnostico, long codigoValidoHabilitacionIps, String tipoDeficienciaDiagnosticada, String clasificacionSeveridadNivelFactor, double actividadCoagulanteFactor, String antecedentesFamiliaresAsociadosHemofilia, String factorRecibidoPrimerTratamiento, String esquemaPrimerTratamiento, Date fechaInicioPrimerTratamiento, short factorRecibidoActualTratamieno, String esquemaActualTratamiento, double pesoUsuario, double dosis, String frecuenciaSemana, int numeroDosisTotalesPeriodo, long numeroAplicacionesTotalesPeriodo, String modalidadAplicacionTratamiento, String viaAdministracion, String cum1, String cum2, String cum3, String cum4, long codigoHabilitacionEps, String hermartrosis, short hemorragiailioPsoas, short numeroHermatrosisEspontaneasUltimoAno, short numeroHermatrosisTraumaticasUltimoAno, short hemorragiaIntracraneal, short hemorragiaCuello, short hemorragiaOral, short hemorragiaOtrasLocalizaciones, short hemorragiaOtrasDiferentesHematrosisEspontaneas, short hemorragiaOtrasDiferentesHematrosisTraumaticas, short hemorragiaAsociadaProcesosDiferentesHematrosis, String presenciaInhibidorFechaCorte, Date fechaDeterminacionTitulosInhibidor, String recibidoItiUsuario, String recibioItiPeriodo, short tiempoUsuarioIti, String artropatiaHemofilicaCronica, short numArticulacionesComprometidas, String usuarioInfectadoVhc, String usuarioInfectadoVhb, String usuarioInfectadoVih, String pseudotumores, String fracturas, String anafilaxis, String factorAnacfiliactica, short reemplazoArticularesVida, short reemplazoArticularesPeriodo, String profesionalAtencionUsuario, short consultasPresencialesHematologo, short consultasPresencialesOrtopedista, short intervencionProfesionalEnfermeria, short consultasOdontologo, short consultaNutricionista, short intervencionTrabajoSocial, short consultaFisiatria, short consultaPsicologia, short intervencionQuimicoFarmaceutico, short intervencionFisioterapia, String primerNombreMedicoPrincipal, String segundoNombreMedicoPrincipal, String primerApellidoMedicoPrincipal, String segundoApellidoMedicoPrincipal, short numeroAtencionesServicioUrgenciasHemofilia, short numeroEventosHospitalariosHemofilia, double costoTotalUnidadesFactor, double costosAgentePuente, double costosCoagulopatia, double costosIncapacidadesCoagulopatia, String novedades, String causaMuerte, Date fechaMuerte, int bdua, Date fechaCorte) {
        this.idHemofiliaPaso = idHemofiliaPaso;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
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
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
        this.edadUsuarioConsulta = edadUsuarioConsulta;
        this.motivoPruebaDiagnostico = motivoPruebaDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.codigoValidoHabilitacionIps = codigoValidoHabilitacionIps;
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
        this.esquemaActualTratamiento = esquemaActualTratamiento;
        this.pesoUsuario = pesoUsuario;
        this.dosis = dosis;
        this.frecuenciaSemana = frecuenciaSemana;
        this.numeroDosisTotalesPeriodo = numeroDosisTotalesPeriodo;
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
        this.viaAdministracion = viaAdministracion;
        this.cum1 = cum1;
        this.cum2 = cum2;
        this.cum3 = cum3;
        this.cum4 = cum4;
        this.codigoHabilitacionEps = codigoHabilitacionEps;
        this.hermartrosis = hermartrosis;
        this.hemorragiailioPsoas = hemorragiailioPsoas;
        this.numeroHermatrosisEspontaneasUltimoAno = numeroHermatrosisEspontaneasUltimoAno;
        this.numeroHermatrosisTraumaticasUltimoAno = numeroHermatrosisTraumaticasUltimoAno;
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
        this.hemorragiaCuello = hemorragiaCuello;
        this.hemorragiaOral = hemorragiaOral;
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
        this.recibidoItiUsuario = recibidoItiUsuario;
        this.recibioItiPeriodo = recibioItiPeriodo;
        this.tiempoUsuarioIti = tiempoUsuarioIti;
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
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
        this.consultasPresencialesHematologo = consultasPresencialesHematologo;
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
        this.consultasOdontologo = consultasOdontologo;
        this.consultaNutricionista = consultaNutricionista;
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
        this.consultaFisiatria = consultaFisiatria;
        this.consultaPsicologia = consultaPsicologia;
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
        this.intervencionFisioterapia = intervencionFisioterapia;
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
        this.costoTotalUnidadesFactor = costoTotalUnidadesFactor;
        this.costosAgentePuente = costosAgentePuente;
        this.costosCoagulopatia = costosCoagulopatia;
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
        this.novedades = novedades;
        this.causaMuerte = causaMuerte;
        this.fechaMuerte = fechaMuerte;
        this.bdua = bdua;
        this.fechaCorte = fechaCorte;
    }

    public Integer getIdHemofiliaPaso() {
        return idHemofiliaPaso;
    }

    public void setIdHemofiliaPaso(Integer idHemofiliaPaso) {
        this.idHemofiliaPaso = idHemofiliaPaso;
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

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public short getOcupacionUsuario() {
        return ocupacionUsuario;
    }

    public void setOcupacionUsuario(short ocupacionUsuario) {
        this.ocupacionUsuario = ocupacionUsuario;
    }

    public String getSgsss() {
        return sgsss;
    }

    public void setSgsss(String sgsss) {
        this.sgsss = sgsss;
    }

    public String getCodigoEapb() {
        return codigoEapb;
    }

    public void setCodigoEapb(String codigoEapb) {
        this.codigoEapb = codigoEapb;
    }

    public short getCodigoPertenenciaEtnica() {
        return codigoPertenenciaEtnica;
    }

    public void setCodigoPertenenciaEtnica(short codigoPertenenciaEtnica) {
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
    }

    public short getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(short grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public short getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(short municipioResidencia) {
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

    public String getUsuarioProgramaPlanificacion() {
        return usuarioProgramaPlanificacion;
    }

    public void setUsuarioProgramaPlanificacion(String usuarioProgramaPlanificacion) {
        this.usuarioProgramaPlanificacion = usuarioProgramaPlanificacion;
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

    public long getCodigoValidoHabilitacionIps() {
        return codigoValidoHabilitacionIps;
    }

    public void setCodigoValidoHabilitacionIps(long codigoValidoHabilitacionIps) {
        this.codigoValidoHabilitacionIps = codigoValidoHabilitacionIps;
    }

    public String getTipoDeficienciaDiagnosticada() {
        return tipoDeficienciaDiagnosticada;
    }

    public void setTipoDeficienciaDiagnosticada(String tipoDeficienciaDiagnosticada) {
        this.tipoDeficienciaDiagnosticada = tipoDeficienciaDiagnosticada;
    }

    public String getClasificacionSeveridadNivelFactor() {
        return clasificacionSeveridadNivelFactor;
    }

    public void setClasificacionSeveridadNivelFactor(String clasificacionSeveridadNivelFactor) {
        this.clasificacionSeveridadNivelFactor = clasificacionSeveridadNivelFactor;
    }

    public double getActividadCoagulanteFactor() {
        return actividadCoagulanteFactor;
    }

    public void setActividadCoagulanteFactor(double actividadCoagulanteFactor) {
        this.actividadCoagulanteFactor = actividadCoagulanteFactor;
    }

    public String getAntecedentesFamiliaresAsociadosHemofilia() {
        return antecedentesFamiliaresAsociadosHemofilia;
    }

    public void setAntecedentesFamiliaresAsociadosHemofilia(String antecedentesFamiliaresAsociadosHemofilia) {
        this.antecedentesFamiliaresAsociadosHemofilia = antecedentesFamiliaresAsociadosHemofilia;
    }

    public String getFactorRecibidoPrimerTratamiento() {
        return factorRecibidoPrimerTratamiento;
    }

    public void setFactorRecibidoPrimerTratamiento(String factorRecibidoPrimerTratamiento) {
        this.factorRecibidoPrimerTratamiento = factorRecibidoPrimerTratamiento;
    }

    public String getEsquemaPrimerTratamiento() {
        return esquemaPrimerTratamiento;
    }

    public void setEsquemaPrimerTratamiento(String esquemaPrimerTratamiento) {
        this.esquemaPrimerTratamiento = esquemaPrimerTratamiento;
    }

    public Date getFechaInicioPrimerTratamiento() {
        return fechaInicioPrimerTratamiento;
    }

    public void setFechaInicioPrimerTratamiento(Date fechaInicioPrimerTratamiento) {
        this.fechaInicioPrimerTratamiento = fechaInicioPrimerTratamiento;
    }

    public short getFactorRecibidoActualTratamieno() {
        return factorRecibidoActualTratamieno;
    }

    public void setFactorRecibidoActualTratamieno(short factorRecibidoActualTratamieno) {
        this.factorRecibidoActualTratamieno = factorRecibidoActualTratamieno;
    }

    public String getEsquemaActualTratamiento() {
        return esquemaActualTratamiento;
    }

    public void setEsquemaActualTratamiento(String esquemaActualTratamiento) {
        this.esquemaActualTratamiento = esquemaActualTratamiento;
    }

    public double getPesoUsuario() {
        return pesoUsuario;
    }

    public void setPesoUsuario(double pesoUsuario) {
        this.pesoUsuario = pesoUsuario;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
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

    public long getNumeroAplicacionesTotalesPeriodo() {
        return numeroAplicacionesTotalesPeriodo;
    }

    public void setNumeroAplicacionesTotalesPeriodo(long numeroAplicacionesTotalesPeriodo) {
        this.numeroAplicacionesTotalesPeriodo = numeroAplicacionesTotalesPeriodo;
    }

    public String getModalidadAplicacionTratamiento() {
        return modalidadAplicacionTratamiento;
    }

    public void setModalidadAplicacionTratamiento(String modalidadAplicacionTratamiento) {
        this.modalidadAplicacionTratamiento = modalidadAplicacionTratamiento;
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

    public short getHemorragiailioPsoas() {
        return hemorragiailioPsoas;
    }

    public void setHemorragiailioPsoas(short hemorragiailioPsoas) {
        this.hemorragiailioPsoas = hemorragiailioPsoas;
    }

    public short getNumeroHermatrosisEspontaneasUltimoAno() {
        return numeroHermatrosisEspontaneasUltimoAno;
    }

    public void setNumeroHermatrosisEspontaneasUltimoAno(short numeroHermatrosisEspontaneasUltimoAno) {
        this.numeroHermatrosisEspontaneasUltimoAno = numeroHermatrosisEspontaneasUltimoAno;
    }

    public short getNumeroHermatrosisTraumaticasUltimoAno() {
        return numeroHermatrosisTraumaticasUltimoAno;
    }

    public void setNumeroHermatrosisTraumaticasUltimoAno(short numeroHermatrosisTraumaticasUltimoAno) {
        this.numeroHermatrosisTraumaticasUltimoAno = numeroHermatrosisTraumaticasUltimoAno;
    }

    public short getHemorragiaIntracraneal() {
        return hemorragiaIntracraneal;
    }

    public void setHemorragiaIntracraneal(short hemorragiaIntracraneal) {
        this.hemorragiaIntracraneal = hemorragiaIntracraneal;
    }

    public short getHemorragiaCuello() {
        return hemorragiaCuello;
    }

    public void setHemorragiaCuello(short hemorragiaCuello) {
        this.hemorragiaCuello = hemorragiaCuello;
    }

    public short getHemorragiaOral() {
        return hemorragiaOral;
    }

    public void setHemorragiaOral(short hemorragiaOral) {
        this.hemorragiaOral = hemorragiaOral;
    }

    public short getHemorragiaOtrasLocalizaciones() {
        return hemorragiaOtrasLocalizaciones;
    }

    public void setHemorragiaOtrasLocalizaciones(short hemorragiaOtrasLocalizaciones) {
        this.hemorragiaOtrasLocalizaciones = hemorragiaOtrasLocalizaciones;
    }

    public short getHemorragiaOtrasDiferentesHematrosisEspontaneas() {
        return hemorragiaOtrasDiferentesHematrosisEspontaneas;
    }

    public void setHemorragiaOtrasDiferentesHematrosisEspontaneas(short hemorragiaOtrasDiferentesHematrosisEspontaneas) {
        this.hemorragiaOtrasDiferentesHematrosisEspontaneas = hemorragiaOtrasDiferentesHematrosisEspontaneas;
    }

    public short getHemorragiaOtrasDiferentesHematrosisTraumaticas() {
        return hemorragiaOtrasDiferentesHematrosisTraumaticas;
    }

    public void setHemorragiaOtrasDiferentesHematrosisTraumaticas(short hemorragiaOtrasDiferentesHematrosisTraumaticas) {
        this.hemorragiaOtrasDiferentesHematrosisTraumaticas = hemorragiaOtrasDiferentesHematrosisTraumaticas;
    }

    public short getHemorragiaAsociadaProcesosDiferentesHematrosis() {
        return hemorragiaAsociadaProcesosDiferentesHematrosis;
    }

    public void setHemorragiaAsociadaProcesosDiferentesHematrosis(short hemorragiaAsociadaProcesosDiferentesHematrosis) {
        this.hemorragiaAsociadaProcesosDiferentesHematrosis = hemorragiaAsociadaProcesosDiferentesHematrosis;
    }

    public String getPresenciaInhibidorFechaCorte() {
        return presenciaInhibidorFechaCorte;
    }

    public void setPresenciaInhibidorFechaCorte(String presenciaInhibidorFechaCorte) {
        this.presenciaInhibidorFechaCorte = presenciaInhibidorFechaCorte;
    }

    public Date getFechaDeterminacionTitulosInhibidor() {
        return fechaDeterminacionTitulosInhibidor;
    }

    public void setFechaDeterminacionTitulosInhibidor(Date fechaDeterminacionTitulosInhibidor) {
        this.fechaDeterminacionTitulosInhibidor = fechaDeterminacionTitulosInhibidor;
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

    public short getTiempoUsuarioIti() {
        return tiempoUsuarioIti;
    }

    public void setTiempoUsuarioIti(short tiempoUsuarioIti) {
        this.tiempoUsuarioIti = tiempoUsuarioIti;
    }

    public String getArtropatiaHemofilicaCronica() {
        return artropatiaHemofilicaCronica;
    }

    public void setArtropatiaHemofilicaCronica(String artropatiaHemofilicaCronica) {
        this.artropatiaHemofilicaCronica = artropatiaHemofilicaCronica;
    }

    public short getNumArticulacionesComprometidas() {
        return numArticulacionesComprometidas;
    }

    public void setNumArticulacionesComprometidas(short numArticulacionesComprometidas) {
        this.numArticulacionesComprometidas = numArticulacionesComprometidas;
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

    public short getReemplazoArticularesVida() {
        return reemplazoArticularesVida;
    }

    public void setReemplazoArticularesVida(short reemplazoArticularesVida) {
        this.reemplazoArticularesVida = reemplazoArticularesVida;
    }

    public short getReemplazoArticularesPeriodo() {
        return reemplazoArticularesPeriodo;
    }

    public void setReemplazoArticularesPeriodo(short reemplazoArticularesPeriodo) {
        this.reemplazoArticularesPeriodo = reemplazoArticularesPeriodo;
    }

    public String getProfesionalAtencionUsuario() {
        return profesionalAtencionUsuario;
    }

    public void setProfesionalAtencionUsuario(String profesionalAtencionUsuario) {
        this.profesionalAtencionUsuario = profesionalAtencionUsuario;
    }

    public short getConsultasPresencialesHematologo() {
        return consultasPresencialesHematologo;
    }

    public void setConsultasPresencialesHematologo(short consultasPresencialesHematologo) {
        this.consultasPresencialesHematologo = consultasPresencialesHematologo;
    }

    public short getConsultasPresencialesOrtopedista() {
        return consultasPresencialesOrtopedista;
    }

    public void setConsultasPresencialesOrtopedista(short consultasPresencialesOrtopedista) {
        this.consultasPresencialesOrtopedista = consultasPresencialesOrtopedista;
    }

    public short getIntervencionProfesionalEnfermeria() {
        return intervencionProfesionalEnfermeria;
    }

    public void setIntervencionProfesionalEnfermeria(short intervencionProfesionalEnfermeria) {
        this.intervencionProfesionalEnfermeria = intervencionProfesionalEnfermeria;
    }

    public short getConsultasOdontologo() {
        return consultasOdontologo;
    }

    public void setConsultasOdontologo(short consultasOdontologo) {
        this.consultasOdontologo = consultasOdontologo;
    }

    public short getConsultaNutricionista() {
        return consultaNutricionista;
    }

    public void setConsultaNutricionista(short consultaNutricionista) {
        this.consultaNutricionista = consultaNutricionista;
    }

    public short getIntervencionTrabajoSocial() {
        return intervencionTrabajoSocial;
    }

    public void setIntervencionTrabajoSocial(short intervencionTrabajoSocial) {
        this.intervencionTrabajoSocial = intervencionTrabajoSocial;
    }

    public short getConsultaFisiatria() {
        return consultaFisiatria;
    }

    public void setConsultaFisiatria(short consultaFisiatria) {
        this.consultaFisiatria = consultaFisiatria;
    }

    public short getConsultaPsicologia() {
        return consultaPsicologia;
    }

    public void setConsultaPsicologia(short consultaPsicologia) {
        this.consultaPsicologia = consultaPsicologia;
    }

    public short getIntervencionQuimicoFarmaceutico() {
        return intervencionQuimicoFarmaceutico;
    }

    public void setIntervencionQuimicoFarmaceutico(short intervencionQuimicoFarmaceutico) {
        this.intervencionQuimicoFarmaceutico = intervencionQuimicoFarmaceutico;
    }

    public short getIntervencionFisioterapia() {
        return intervencionFisioterapia;
    }

    public void setIntervencionFisioterapia(short intervencionFisioterapia) {
        this.intervencionFisioterapia = intervencionFisioterapia;
    }

    public String getPrimerNombreMedicoPrincipal() {
        return primerNombreMedicoPrincipal;
    }

    public void setPrimerNombreMedicoPrincipal(String primerNombreMedicoPrincipal) {
        this.primerNombreMedicoPrincipal = primerNombreMedicoPrincipal;
    }

    public String getSegundoNombreMedicoPrincipal() {
        return segundoNombreMedicoPrincipal;
    }

    public void setSegundoNombreMedicoPrincipal(String segundoNombreMedicoPrincipal) {
        this.segundoNombreMedicoPrincipal = segundoNombreMedicoPrincipal;
    }

    public String getPrimerApellidoMedicoPrincipal() {
        return primerApellidoMedicoPrincipal;
    }

    public void setPrimerApellidoMedicoPrincipal(String primerApellidoMedicoPrincipal) {
        this.primerApellidoMedicoPrincipal = primerApellidoMedicoPrincipal;
    }

    public String getSegundoApellidoMedicoPrincipal() {
        return segundoApellidoMedicoPrincipal;
    }

    public void setSegundoApellidoMedicoPrincipal(String segundoApellidoMedicoPrincipal) {
        this.segundoApellidoMedicoPrincipal = segundoApellidoMedicoPrincipal;
    }

    public short getNumeroAtencionesServicioUrgenciasHemofilia() {
        return numeroAtencionesServicioUrgenciasHemofilia;
    }

    public void setNumeroAtencionesServicioUrgenciasHemofilia(short numeroAtencionesServicioUrgenciasHemofilia) {
        this.numeroAtencionesServicioUrgenciasHemofilia = numeroAtencionesServicioUrgenciasHemofilia;
    }

    public short getNumeroEventosHospitalariosHemofilia() {
        return numeroEventosHospitalariosHemofilia;
    }

    public void setNumeroEventosHospitalariosHemofilia(short numeroEventosHospitalariosHemofilia) {
        this.numeroEventosHospitalariosHemofilia = numeroEventosHospitalariosHemofilia;
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

    public double getCostosIncapacidadesCoagulopatia() {
        return costosIncapacidadesCoagulopatia;
    }

    public void setCostosIncapacidadesCoagulopatia(double costosIncapacidadesCoagulopatia) {
        this.costosIncapacidadesCoagulopatia = costosIncapacidadesCoagulopatia;
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

    public int getBdua() {
        return bdua;
    }

    public void setBdua(int bdua) {
        this.bdua = bdua;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
}
