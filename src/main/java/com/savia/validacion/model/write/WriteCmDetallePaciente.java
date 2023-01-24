/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.write;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "cm_detalle_paciente")
public class WriteCmDetallePaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regimen_afiliacion")
    private Character regimenAfiliacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "municipio_residencia")
    private int municipioResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "codigo_eapb")
    private String codigoEapb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_afilicion_eapb")
    @Temporal(TemporalType.DATE)
    private Date fechaAfilicionEapb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_muerte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMuerte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "causa_muerte")
    private String causaMuerte;
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
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmDetallePaciente() {
    }

    public WriteCmDetallePaciente(Long id) {
        this.id = id;
    }

    public WriteCmDetallePaciente(Long id, Character regimenAfiliacion, int municipioResidencia, String telefono, String codigoEapb, Date fechaAfilicionEapb, Date fechaMuerte, String causaMuerte, Date fechaCorte, String codigoSerial) {
        this.id = id;
        this.regimenAfiliacion = regimenAfiliacion;
        this.municipioResidencia = municipioResidencia;
        this.telefono = telefono;
        this.codigoEapb = codigoEapb;
        this.fechaAfilicionEapb = fechaAfilicionEapb;
        this.fechaMuerte = fechaMuerte;
        this.causaMuerte = causaMuerte;
        this.fechaCorte = fechaCorte;
        this.codigoSerial = codigoSerial;
    }

    public WriteCmDetallePaciente(Character regimenAfiliacion, int municipioResidencia, String telefono, String codigoEapb, Date fechaAfilicionEapb, Date fechaMuerte, String causaMuerte, Date fechaCorte, String codigoSerial, WriteCmPaciente idPaciente) {
        this.regimenAfiliacion = regimenAfiliacion;
        this.municipioResidencia = municipioResidencia;
        this.telefono = telefono;
        this.codigoEapb = codigoEapb;
        this.fechaAfilicionEapb = fechaAfilicionEapb;
        this.fechaMuerte = fechaMuerte;
        this.causaMuerte = causaMuerte;
        this.fechaCorte = fechaCorte;
        this.codigoSerial = codigoSerial;
        this.idPaciente = idPaciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRegimenAfiliacion() {
        return regimenAfiliacion;
    }

    public void setRegimenAfiliacion(Character regimenAfiliacion) {
        this.regimenAfiliacion = regimenAfiliacion;
    }

    public int getMunicipioResidencia() {
        return municipioResidencia;
    }

    public void setMunicipioResidencia(int municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoEapb() {
        return codigoEapb;
    }

    public void setCodigoEapb(String codigoEapb) {
        this.codigoEapb = codigoEapb;
    }

    public Date getFechaAfilicionEapb() {
        return fechaAfilicionEapb;
    }

    public void setFechaAfilicionEapb(Date fechaAfilicionEapb) {
        this.fechaAfilicionEapb = fechaAfilicionEapb;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
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
        
        if (!(object instanceof WriteCmDetallePaciente)) {
            return false;
        }
        WriteCmDetallePaciente other = (WriteCmDetallePaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmDetallePaciente[ id=" + id + " ]";
    }
    
}
