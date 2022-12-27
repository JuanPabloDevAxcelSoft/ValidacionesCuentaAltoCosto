package com.savia.validacion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "tbl_configuracion_validacion")
@XmlRootElement
public class TblConfiguracionValidacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private Boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "id_validacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblValidacionDependencia idValidacion;
    @JoinColumn(name = "id_constante", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblValidacionContatante idConstante;

    public TblConfiguracionValidacion() {
    }

    public TblConfiguracionValidacion(Integer id) {
        this.id = id;
    }

    public TblConfiguracionValidacion(Integer id, Date fechaCreacion) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public TblValidacionDependencia getIdValidacion() {
        return idValidacion;
    }

    public void setIdValidacion(TblValidacionDependencia idValidacion) {
        this.idValidacion = idValidacion;
    }

    public TblValidacionContatante getIdConstante() {
        return idConstante;
    }

    public void setIdConstante(TblValidacionContatante idConstante) {
        this.idConstante = idConstante;
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
        if (!(object instanceof TblConfiguracionValidacion)) {
            return false;
        }
        TblConfiguracionValidacion other = (TblConfiguracionValidacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TblConfiguracionValidacion[ id=" + id + " ]";
    }

}
