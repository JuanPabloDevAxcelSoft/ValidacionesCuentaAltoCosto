/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.read;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "cm_validacion")
public class ReadCmValidacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer idValidacion;
    @Lob
    @Size(max = 1073741824)
    @Column(name = "json_validacion")
    private String jsonValidacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "clase_validacion")
    private String claseValidacion;
    @Basic(optional = false)
    @NotNull
    private int enfermedad;
    @Basic(optional = false)
    @NotNull
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_validacion")
    private String nombreValidacion;

    @Size(max = 255)
    private String error;

    public ReadCmValidacion() {
    }

    public ReadCmValidacion(Integer idValidacion) {
        this.idValidacion = idValidacion;
    }

    public ReadCmValidacion(Integer idValidacion,  String claseValidacion, int enfermedad, boolean estado, Date fechaIngreso, String nombreValidacion) {
        this.idValidacion = idValidacion;
        this.claseValidacion = claseValidacion;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.nombreValidacion = nombreValidacion;
    }

    public Integer getIdValidacion() {
        return idValidacion;
    }

    public void setIdValidacion(Integer idValidacion) {
        this.idValidacion = idValidacion;
    }

    public String getJsonValidacion() {
        return jsonValidacion;
    }

    public void setJsonValidacion(String jsonValidacion) {
        this.jsonValidacion = jsonValidacion;
    }

    public String getClaseValidacion() {
        return claseValidacion;
    }

    public void setClaseValidacion(String claseValidacion) {
        this.claseValidacion = claseValidacion;
    }

    public int getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(int enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreValidacion() {
        return nombreValidacion;
    }

    public void setNombreValidacion(String nombreValidacion) {
        this.nombreValidacion = nombreValidacion;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValidacion != null ? idValidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ReadCmValidacion)) {
            return false;
        }
        ReadCmValidacion other = (ReadCmValidacion) object;
        if ((this.idValidacion == null && other.idValidacion != null) || (this.idValidacion != null && !this.idValidacion.equals(other.idValidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ReadCmValidacion[ idValidacion=" + idValidacion + " ]";
    }
    
}
