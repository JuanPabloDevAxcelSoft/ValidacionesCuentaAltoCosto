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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_validacion")
public class TblReadValidacionModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_validacion")
    private Integer idValidacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_validacion")
    private String nombreValidacion;
    @Basic(optional = false)
    @NotNull
    private int enfermedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String parametros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "secuencia_validacion")
    private int secuenciaValidacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "buscar_elemento")
    private String buscarElemento;
    @Basic(optional = false)
    @NotNull
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    public TblReadValidacionModel() {
    }

    public TblReadValidacionModel(Integer idValidacion, String nombreValidacion, int enfermedad, String parametros, int secuenciaValidacion, String buscarElemento, boolean estado, Date fechaIngreso) {
        this.idValidacion = idValidacion;
        this.nombreValidacion = nombreValidacion;
        this.enfermedad = enfermedad;
        this.parametros = parametros;
        this.secuenciaValidacion = secuenciaValidacion;
        this.buscarElemento = buscarElemento;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
    }

    public String getBuscarElemento() {
        return buscarElemento;
    }

    public void setBuscarElemento(String buscarElemento) {
        this.buscarElemento = buscarElemento;
    }

    public boolean isEstado() {
        return estado;
    }

    public Integer getIdValidacion() {
        return idValidacion;
    }

    public void setIdValidacion(Integer idValidacion) {
        this.idValidacion = idValidacion;
    }

    public String getNombreValidacion() {
        return nombreValidacion;
    }

    public void setNombreValidacion(String nombreValidacion) {
        this.nombreValidacion = nombreValidacion;
    }

    public int getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(int enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public int getSecuenciaValidacion() {
        return secuenciaValidacion;
    }

    public void setSecuenciaValidacion(int secuenciaValidacion) {
        this.secuenciaValidacion = secuenciaValidacion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValidacion != null ? idValidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblReadValidacionModel)) {
            return false;
        }
        TblReadValidacionModel other = (TblReadValidacionModel) object;
        if ((this.idValidacion == null && other.idValidacion != null) || (this.idValidacion != null && !this.idValidacion.equals(other.idValidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "savia.generatedenttiys.entity.TblReadValidacionModel[ idValidacion=" + idValidacion + " ]";
    }
    
}
