package com.savia.validacion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "tbl_validacion_dependencia")
@XmlRootElement
public class TblValidacionDependencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enfermedad_id")
    private int enfermedadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nombre_metodo")
    private String nombreMetodo;

    @Basic(optional = false)
    @NotNull
    @Column(name = "secuencia")
    private Integer secuencia;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "variable_independiente")
    private String variableIndependiente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "variable_dependiente")
    private String variableDependiente;
    @Size(max = 200)
    private String parametros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String operador;
    @Size(max = 500)
    private String contantes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    private String errores;
    @Size(max = 20)
    @Column(name = "valor_defecto")
    private String valorDefecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_metodo")
    private int tipoMetodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "ruta_validaciones")
    private String rutaValidaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "ruta_implementaciones")
    private String rutaImplementaciones;
    private Boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idValidacion")
    private List<TblConfiguracionValidacion> tblConfiguracionValidacionList;

    public TblValidacionDependencia() {
    }

    public TblValidacionDependencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEnfermedadId() {
        return enfermedadId;
    }

    public void setEnfermedadId(int enfermedadId) {
        this.enfermedadId = enfermedadId;
    }

    public String getNombreMetodo() {
        return nombreMetodo;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public void setNombreMetodo(String nombreMetodo) {
        this.nombreMetodo = nombreMetodo;
    }

    public String getVariableIndependiente() {
        return variableIndependiente;
    }

    public void setVariableIndependiente(String variableIndependiente) {
        this.variableIndependiente = variableIndependiente;
    }

    public String getVariableDependiente() {
        return variableDependiente;
    }

    public void setVariableDependiente(String variableDependiente) {
        this.variableDependiente = variableDependiente;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getContantes() {
        return contantes;
    }

    public void setContantes(String contantes) {
        this.contantes = contantes;
    }

    public String getErrores() {
        return errores;
    }

    public void setErrores(String errores) {
        this.errores = errores;
    }

    public String getValorDefecto() {
        return valorDefecto;
    }

    public void setValorDefecto(String valorDefecto) {
        this.valorDefecto = valorDefecto;
    }

    public int getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(int tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public String getRutaValidaciones() {
        return rutaValidaciones;
    }

    public void setRutaValidaciones(String rutaValidaciones) {
        this.rutaValidaciones = rutaValidaciones;
    }

    public String getRutaImplementaciones() {
        return rutaImplementaciones;
    }

    public void setRutaImplementaciones(String rutaImplementaciones) {
        this.rutaImplementaciones = rutaImplementaciones;
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

    @XmlTransient
    public List<TblConfiguracionValidacion> getTblConfiguracionValidacionList() {
        return tblConfiguracionValidacionList;
    }

    public void setTblConfiguracionValidacionList(List<TblConfiguracionValidacion> tblConfiguracionValidacionList) {
        this.tblConfiguracionValidacionList = tblConfiguracionValidacionList;
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
        if (!(object instanceof TblValidacionDependencia)) {
            return false;
        }
        TblValidacionDependencia other = (TblValidacionDependencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TblValidacionDependencia[ id=" + id + " ]";
    }

}
