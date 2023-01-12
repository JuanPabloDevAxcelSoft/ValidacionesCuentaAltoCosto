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
@Table(name = "cm_paciente_hepatitis_uno")
public class WriteCmPacienteHepatitisUno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "direccion_residencia")
    private int direccionResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo_ips_diagnostico")
    private String codigoIpsDiagnostico;
    @Basic(optional = false)
    @NotNull
    private Character cirrosis;
    @Basic(optional = false)
    @NotNull
    private boolean erc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trasplante_hepatico")
    private boolean trasplanteHepatico;
    @Basic(optional = false)
    @NotNull
    private Character vih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hepatitis_b")
    private Character hepatitisB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hepatitis_b_delta")
    private Character hepatitisBDelta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mecanismo_transmision")
    private Character mecanismoTransmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio_tratamiento")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioTratamiento;
    @Basic(optional = false)
    @NotNull
    private boolean interferon;
    @Basic(optional = false)
    @NotNull
    private boolean ribavirina;
    @Basic(optional = false)
    @NotNull
    private boolean boceprevir;
    @Basic(optional = false)
    @NotNull
    private boolean telaprevir;
    @Basic(optional = false)
    @NotNull
    private boolean simeprevir;
    @Basic(optional = false)
    @NotNull
    private boolean asunaprevir;
    @Basic(optional = false)
    @NotNull
    private boolean beclabuvir;
    @Basic(optional = false)
    @NotNull
    private boolean daclatasvir;
    @Basic(optional = false)
    @NotNull
    private boolean faldaprevir;
    @Basic(optional = false)
    @NotNull
    private boolean ledipasvir;
    @Basic(optional = false)
    @NotNull
    private boolean ombitasvir;
    @Basic(optional = false)
    @NotNull
    private boolean paritaprevir;
    @Basic(optional = false)
    @NotNull
    private boolean dasabuvir;
    @Basic(optional = false)
    @NotNull
    private boolean ritonavir;
    @Basic(optional = false)
    @NotNull
    private boolean sofosbuvir;
    @Basic(optional = false)
    @NotNull
    private boolean velpatasvir;
    @Column(name = "fech_fina_trat")
    @Temporal(TemporalType.DATE)
    private Date fechFinaTrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado_ultimo_tratamiento")
    private Character resultadoUltimoTratamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_diagnostico")
    @Temporal(TemporalType.DATE)
    private Date fechaDiagnostico;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteHepatitisUno() {
    }

    public WriteCmPacienteHepatitisUno(Long id) {
        this.id = id;
    }

    public WriteCmPacienteHepatitisUno(Long id, int direccionResidencia, String codigoIpsDiagnostico, Character cirrosis, boolean erc, boolean trasplanteHepatico, Character vih, Character hepatitisB, Character hepatitisBDelta, Character mecanismoTransmision, Date fechaInicioTratamiento, boolean interferon, boolean ribavirina, boolean boceprevir, boolean telaprevir, boolean simeprevir, boolean asunaprevir, boolean beclabuvir, boolean daclatasvir, boolean faldaprevir, boolean ledipasvir, boolean ombitasvir, boolean paritaprevir, boolean dasabuvir, boolean ritonavir, boolean sofosbuvir, boolean velpatasvir, Character resultadoUltimoTratamiento, Date fechaDiagnostico) {
        this.id = id;
        this.direccionResidencia = direccionResidencia;
        this.codigoIpsDiagnostico = codigoIpsDiagnostico;
        this.cirrosis = cirrosis;
        this.erc = erc;
        this.trasplanteHepatico = trasplanteHepatico;
        this.vih = vih;
        this.hepatitisB = hepatitisB;
        this.hepatitisBDelta = hepatitisBDelta;
        this.mecanismoTransmision = mecanismoTransmision;
        this.fechaInicioTratamiento = fechaInicioTratamiento;
        this.interferon = interferon;
        this.ribavirina = ribavirina;
        this.boceprevir = boceprevir;
        this.telaprevir = telaprevir;
        this.simeprevir = simeprevir;
        this.asunaprevir = asunaprevir;
        this.beclabuvir = beclabuvir;
        this.daclatasvir = daclatasvir;
        this.faldaprevir = faldaprevir;
        this.ledipasvir = ledipasvir;
        this.ombitasvir = ombitasvir;
        this.paritaprevir = paritaprevir;
        this.dasabuvir = dasabuvir;
        this.ritonavir = ritonavir;
        this.sofosbuvir = sofosbuvir;
        this.velpatasvir = velpatasvir;
        this.resultadoUltimoTratamiento = resultadoUltimoTratamiento;
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(int direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCodigoIpsDiagnostico() {
        return codigoIpsDiagnostico;
    }

    public void setCodigoIpsDiagnostico(String codigoIpsDiagnostico) {
        this.codigoIpsDiagnostico = codigoIpsDiagnostico;
    }

    public Character getCirrosis() {
        return cirrosis;
    }

    public void setCirrosis(Character cirrosis) {
        this.cirrosis = cirrosis;
    }

    public boolean getErc() {
        return erc;
    }

    public void setErc(boolean erc) {
        this.erc = erc;
    }

    public boolean getTrasplanteHepatico() {
        return trasplanteHepatico;
    }

    public void setTrasplanteHepatico(boolean trasplanteHepatico) {
        this.trasplanteHepatico = trasplanteHepatico;
    }

    public Character getVih() {
        return vih;
    }

    public void setVih(Character vih) {
        this.vih = vih;
    }

    public Character getHepatitisB() {
        return hepatitisB;
    }

    public void setHepatitisB(Character hepatitisB) {
        this.hepatitisB = hepatitisB;
    }

    public Character getHepatitisBDelta() {
        return hepatitisBDelta;
    }

    public void setHepatitisBDelta(Character hepatitisBDelta) {
        this.hepatitisBDelta = hepatitisBDelta;
    }

    public Character getMecanismoTransmision() {
        return mecanismoTransmision;
    }

    public void setMecanismoTransmision(Character mecanismoTransmision) {
        this.mecanismoTransmision = mecanismoTransmision;
    }

    public Date getFechaInicioTratamiento() {
        return fechaInicioTratamiento;
    }

    public void setFechaInicioTratamiento(Date fechaInicioTratamiento) {
        this.fechaInicioTratamiento = fechaInicioTratamiento;
    }

    public boolean getInterferon() {
        return interferon;
    }

    public void setInterferon(boolean interferon) {
        this.interferon = interferon;
    }

    public boolean getRibavirina() {
        return ribavirina;
    }

    public void setRibavirina(boolean ribavirina) {
        this.ribavirina = ribavirina;
    }

    public boolean getBoceprevir() {
        return boceprevir;
    }

    public void setBoceprevir(boolean boceprevir) {
        this.boceprevir = boceprevir;
    }

    public boolean getTelaprevir() {
        return telaprevir;
    }

    public void setTelaprevir(boolean telaprevir) {
        this.telaprevir = telaprevir;
    }

    public boolean getSimeprevir() {
        return simeprevir;
    }

    public void setSimeprevir(boolean simeprevir) {
        this.simeprevir = simeprevir;
    }

    public boolean getAsunaprevir() {
        return asunaprevir;
    }

    public void setAsunaprevir(boolean asunaprevir) {
        this.asunaprevir = asunaprevir;
    }

    public boolean getBeclabuvir() {
        return beclabuvir;
    }

    public void setBeclabuvir(boolean beclabuvir) {
        this.beclabuvir = beclabuvir;
    }

    public boolean getDaclatasvir() {
        return daclatasvir;
    }

    public void setDaclatasvir(boolean daclatasvir) {
        this.daclatasvir = daclatasvir;
    }

    public boolean getFaldaprevir() {
        return faldaprevir;
    }

    public void setFaldaprevir(boolean faldaprevir) {
        this.faldaprevir = faldaprevir;
    }

    public boolean getLedipasvir() {
        return ledipasvir;
    }

    public void setLedipasvir(boolean ledipasvir) {
        this.ledipasvir = ledipasvir;
    }

    public boolean getOmbitasvir() {
        return ombitasvir;
    }

    public void setOmbitasvir(boolean ombitasvir) {
        this.ombitasvir = ombitasvir;
    }

    public boolean getParitaprevir() {
        return paritaprevir;
    }

    public void setParitaprevir(boolean paritaprevir) {
        this.paritaprevir = paritaprevir;
    }

    public boolean getDasabuvir() {
        return dasabuvir;
    }

    public void setDasabuvir(boolean dasabuvir) {
        this.dasabuvir = dasabuvir;
    }

    public boolean getRitonavir() {
        return ritonavir;
    }

    public void setRitonavir(boolean ritonavir) {
        this.ritonavir = ritonavir;
    }

    public boolean getSofosbuvir() {
        return sofosbuvir;
    }

    public void setSofosbuvir(boolean sofosbuvir) {
        this.sofosbuvir = sofosbuvir;
    }

    public boolean getVelpatasvir() {
        return velpatasvir;
    }

    public void setVelpatasvir(boolean velpatasvir) {
        this.velpatasvir = velpatasvir;
    }

    public Date getFechFinaTrat() {
        return fechFinaTrat;
    }

    public void setFechFinaTrat(Date fechFinaTrat) {
        this.fechFinaTrat = fechFinaTrat;
    }

    public Character getResultadoUltimoTratamiento() {
        return resultadoUltimoTratamiento;
    }

    public void setResultadoUltimoTratamiento(Character resultadoUltimoTratamiento) {
        this.resultadoUltimoTratamiento = resultadoUltimoTratamiento;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
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
        if (!(object instanceof WriteCmPacienteHepatitisUno)) {
            return false;
        }
        WriteCmPacienteHepatitisUno other = (WriteCmPacienteHepatitisUno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteHepatitisUno[ id=" + id + " ]";
    }
    
}
