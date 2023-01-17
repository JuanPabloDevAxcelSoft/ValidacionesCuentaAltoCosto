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
@Table(name = "cm_paciente_hepatitis_tres")
public class WriteCmPacienteHepatitisTres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fibroscan")
    @Temporal(TemporalType.DATE)
    private Date fechaFibroscan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_fibroscan")
    private String resultadoFibroscan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fibrotest")
    @Temporal(TemporalType.DATE)
    private Date fechaFibrotest;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_fibrotest")
    private String resultadoFibrotest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_apri")
    @Temporal(TemporalType.DATE)
    private Date fechaApri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_apri")
    private String resultadoApri;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fbi4")
    @Temporal(TemporalType.DATE)
    private Date fechaFbi4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "resultado_fbi4")
    private String resultadoFbi4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_tratamiento")
    private int codigoIpsTratamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_seguimiento")
    private int codigoIpsSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_tto")
    @Temporal(TemporalType.DATE)
    private Date fechaTto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "semanas_tto")
    private String semanasTto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_dosis_mes")
    private int numDosisMes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_finalizacion_tto")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacionTto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cambio_esquema_tto")
    @Temporal(TemporalType.DATE)
    private Date fechaCambioEsquemaTto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "razon_cambio_esquema")
    private String razonCambioEsquema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cierre_caso")
    @Temporal(TemporalType.DATE)
    private Date fechaCierreCaso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "curacion_fecha_cierre_caso")
    private Character curacionFechaCierreCaso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String novedades;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_desafiliacion_eps")
    @Temporal(TemporalType.DATE)
    private Date fechaDesafiliacionEps;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_muerte")
    @Temporal(TemporalType.DATE)
    private Date fechaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "causa_muerte")
    private Character causaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_seguimiento_tratamiento")
    private Character tipoSeguimientoTratamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "frecuencia_seguimiento")
    private Character frecuenciaSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_hepatologo")
    private boolean atendidoHepatologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_gastroenterologo")
    private boolean atendidoGastroenterologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_infectologo")
    private boolean atendidoInfectologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_medicina_interna")
    private boolean atendidoMedicinaInterna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_medicina_familiar")
    private boolean atendidoMedicinaFamiliar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "atendido_medicina_general")
    private boolean atendidoMedicinaGeneral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String genotipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_tto")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioTto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "origen_medicamento_suministrado")
    private String origenMedicamentoSuministrado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "eventos_adversos")
    private String eventosAdversos;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteHepatitisTres() {
    }

    public WriteCmPacienteHepatitisTres(Long id) {
        this.id = id;
    }

    public WriteCmPacienteHepatitisTres(Long id, Date fechaFibroscan, String resultadoFibroscan, Date fechaFibrotest, String resultadoFibrotest, Date fechaApri, String resultadoApri, Date fechaFbi4, String resultadoFbi4, int codigoIpsTratamiento, int codigoIpsSeguimiento, Date fechaTto, String semanasTto, int numDosisMes, Date fechaFinalizacionTto, Date fechaCambioEsquemaTto, String razonCambioEsquema, Date fechaCierreCaso, Character curacionFechaCierreCaso, String novedades, Date fechaDesafiliacionEps, Date fechaMuerte, Character causaMuerte, Character tipoSeguimientoTratamiento, Character frecuenciaSeguimiento, boolean atendidoHepatologo, boolean atendidoGastroenterologo, boolean atendidoInfectologo, boolean atendidoMedicinaInterna, boolean atendidoMedicinaFamiliar, boolean atendidoMedicinaGeneral, String genotipo, Date fechaInicioTto, String origenMedicamentoSuministrado, String eventosAdversos) {
        this.id = id;
        this.fechaFibroscan = fechaFibroscan;
        this.resultadoFibroscan = resultadoFibroscan;
        this.fechaFibrotest = fechaFibrotest;
        this.resultadoFibrotest = resultadoFibrotest;
        this.fechaApri = fechaApri;
        this.resultadoApri = resultadoApri;
        this.fechaFbi4 = fechaFbi4;
        this.resultadoFbi4 = resultadoFbi4;
        this.codigoIpsTratamiento = codigoIpsTratamiento;
        this.codigoIpsSeguimiento = codigoIpsSeguimiento;
        this.fechaTto = fechaTto;
        this.semanasTto = semanasTto;
        this.numDosisMes = numDosisMes;
        this.fechaFinalizacionTto = fechaFinalizacionTto;
        this.fechaCambioEsquemaTto = fechaCambioEsquemaTto;
        this.razonCambioEsquema = razonCambioEsquema;
        this.fechaCierreCaso = fechaCierreCaso;
        this.curacionFechaCierreCaso = curacionFechaCierreCaso;
        this.novedades = novedades;
        this.fechaDesafiliacionEps = fechaDesafiliacionEps;
        this.fechaMuerte = fechaMuerte;
        this.causaMuerte = causaMuerte;
        this.tipoSeguimientoTratamiento = tipoSeguimientoTratamiento;
        this.frecuenciaSeguimiento = frecuenciaSeguimiento;
        this.atendidoHepatologo = atendidoHepatologo;
        this.atendidoGastroenterologo = atendidoGastroenterologo;
        this.atendidoInfectologo = atendidoInfectologo;
        this.atendidoMedicinaInterna = atendidoMedicinaInterna;
        this.atendidoMedicinaFamiliar = atendidoMedicinaFamiliar;
        this.atendidoMedicinaGeneral = atendidoMedicinaGeneral;
        this.genotipo = genotipo;
        this.fechaInicioTto = fechaInicioTto;
        this.origenMedicamentoSuministrado = origenMedicamentoSuministrado;
        this.eventosAdversos = eventosAdversos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaFibroscan() {
        return fechaFibroscan;
    }

    public void setFechaFibroscan(Date fechaFibroscan) {
        this.fechaFibroscan = fechaFibroscan;
    }

    public String getResultadoFibroscan() {
        return resultadoFibroscan;
    }

    public void setResultadoFibroscan(String resultadoFibroscan) {
        this.resultadoFibroscan = resultadoFibroscan;
    }

    public Date getFechaFibrotest() {
        return fechaFibrotest;
    }

    public void setFechaFibrotest(Date fechaFibrotest) {
        this.fechaFibrotest = fechaFibrotest;
    }

    public String getResultadoFibrotest() {
        return resultadoFibrotest;
    }

    public void setResultadoFibrotest(String resultadoFibrotest) {
        this.resultadoFibrotest = resultadoFibrotest;
    }

    public Date getFechaApri() {
        return fechaApri;
    }

    public void setFechaApri(Date fechaApri) {
        this.fechaApri = fechaApri;
    }

    public String getResultadoApri() {
        return resultadoApri;
    }

    public void setResultadoApri(String resultadoApri) {
        this.resultadoApri = resultadoApri;
    }

    public Date getFechaFbi4() {
        return fechaFbi4;
    }

    public void setFechaFbi4(Date fechaFbi4) {
        this.fechaFbi4 = fechaFbi4;
    }

    public String getResultadoFbi4() {
        return resultadoFbi4;
    }

    public void setResultadoFbi4(String resultadoFbi4) {
        this.resultadoFbi4 = resultadoFbi4;
    }

    public int getCodigoIpsTratamiento() {
        return codigoIpsTratamiento;
    }

    public void setCodigoIpsTratamiento(int codigoIpsTratamiento) {
        this.codigoIpsTratamiento = codigoIpsTratamiento;
    }

    public int getCodigoIpsSeguimiento() {
        return codigoIpsSeguimiento;
    }

    public void setCodigoIpsSeguimiento(int codigoIpsSeguimiento) {
        this.codigoIpsSeguimiento = codigoIpsSeguimiento;
    }

    public Date getFechaTto() {
        return fechaTto;
    }

    public void setFechaTto(Date fechaTto) {
        this.fechaTto = fechaTto;
    }

    public String getSemanasTto() {
        return semanasTto;
    }

    public void setSemanasTto(String semanasTto) {
        this.semanasTto = semanasTto;
    }

    public int getNumDosisMes() {
        return numDosisMes;
    }

    public void setNumDosisMes(int numDosisMes) {
        this.numDosisMes = numDosisMes;
    }

    public Date getFechaFinalizacionTto() {
        return fechaFinalizacionTto;
    }

    public void setFechaFinalizacionTto(Date fechaFinalizacionTto) {
        this.fechaFinalizacionTto = fechaFinalizacionTto;
    }

    public Date getFechaCambioEsquemaTto() {
        return fechaCambioEsquemaTto;
    }

    public void setFechaCambioEsquemaTto(Date fechaCambioEsquemaTto) {
        this.fechaCambioEsquemaTto = fechaCambioEsquemaTto;
    }

    public String getRazonCambioEsquema() {
        return razonCambioEsquema;
    }

    public void setRazonCambioEsquema(String razonCambioEsquema) {
        this.razonCambioEsquema = razonCambioEsquema;
    }

    public Date getFechaCierreCaso() {
        return fechaCierreCaso;
    }

    public void setFechaCierreCaso(Date fechaCierreCaso) {
        this.fechaCierreCaso = fechaCierreCaso;
    }

    public Character getCuracionFechaCierreCaso() {
        return curacionFechaCierreCaso;
    }

    public void setCuracionFechaCierreCaso(Character curacionFechaCierreCaso) {
        this.curacionFechaCierreCaso = curacionFechaCierreCaso;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }

    public Date getFechaDesafiliacionEps() {
        return fechaDesafiliacionEps;
    }

    public void setFechaDesafiliacionEps(Date fechaDesafiliacionEps) {
        this.fechaDesafiliacionEps = fechaDesafiliacionEps;
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

    public Character getTipoSeguimientoTratamiento() {
        return tipoSeguimientoTratamiento;
    }

    public void setTipoSeguimientoTratamiento(Character tipoSeguimientoTratamiento) {
        this.tipoSeguimientoTratamiento = tipoSeguimientoTratamiento;
    }

    public Character getFrecuenciaSeguimiento() {
        return frecuenciaSeguimiento;
    }

    public void setFrecuenciaSeguimiento(Character frecuenciaSeguimiento) {
        this.frecuenciaSeguimiento = frecuenciaSeguimiento;
    }

    public boolean getAtendidoHepatologo() {
        return atendidoHepatologo;
    }

    public void setAtendidoHepatologo(boolean atendidoHepatologo) {
        this.atendidoHepatologo = atendidoHepatologo;
    }

    public boolean getAtendidoGastroenterologo() {
        return atendidoGastroenterologo;
    }

    public void setAtendidoGastroenterologo(boolean atendidoGastroenterologo) {
        this.atendidoGastroenterologo = atendidoGastroenterologo;
    }

    public boolean getAtendidoInfectologo() {
        return atendidoInfectologo;
    }

    public void setAtendidoInfectologo(boolean atendidoInfectologo) {
        this.atendidoInfectologo = atendidoInfectologo;
    }

    public boolean getAtendidoMedicinaInterna() {
        return atendidoMedicinaInterna;
    }

    public void setAtendidoMedicinaInterna(boolean atendidoMedicinaInterna) {
        this.atendidoMedicinaInterna = atendidoMedicinaInterna;
    }

    public boolean getAtendidoMedicinaFamiliar() {
        return atendidoMedicinaFamiliar;
    }

    public void setAtendidoMedicinaFamiliar(boolean atendidoMedicinaFamiliar) {
        this.atendidoMedicinaFamiliar = atendidoMedicinaFamiliar;
    }

    public boolean getAtendidoMedicinaGeneral() {
        return atendidoMedicinaGeneral;
    }

    public void setAtendidoMedicinaGeneral(boolean atendidoMedicinaGeneral) {
        this.atendidoMedicinaGeneral = atendidoMedicinaGeneral;
    }

    public String getGenotipo() {
        return genotipo;
    }

    public void setGenotipo(String genotipo) {
        this.genotipo = genotipo;
    }

    public Date getFechaInicioTto() {
        return fechaInicioTto;
    }

    public void setFechaInicioTto(Date fechaInicioTto) {
        this.fechaInicioTto = fechaInicioTto;
    }

    public String getOrigenMedicamentoSuministrado() {
        return origenMedicamentoSuministrado;
    }

    public void setOrigenMedicamentoSuministrado(String origenMedicamentoSuministrado) {
        this.origenMedicamentoSuministrado = origenMedicamentoSuministrado;
    }

    public String getEventosAdversos() {
        return eventosAdversos;
    }

    public void setEventosAdversos(String eventosAdversos) {
        this.eventosAdversos = eventosAdversos;
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
        if (!(object instanceof WriteCmPacienteHepatitisTres)) {
            return false;
        }
        WriteCmPacienteHepatitisTres other = (WriteCmPacienteHepatitisTres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteHepatitisTres[ id=" + id + " ]";
    }
    
}
