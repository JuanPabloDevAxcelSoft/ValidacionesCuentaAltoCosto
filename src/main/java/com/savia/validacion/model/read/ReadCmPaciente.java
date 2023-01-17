/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.read;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "cm_paciente")
public class ReadCmPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Size(max = 20)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 30)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Size(max = 20)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 30)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private Character sexo;
    @Column(name = "codigo_pertenencia_etnica")
    private Character codigoPertenenciaEtnica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteCancer> readCmPacienteCancerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmDetallePaciente> readCmDetallePacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteArtritisReumatoide> readCmPacienteArtritisReumatoideList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteHemofilia> readCmPacienteHemofiliaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteHepatitisDos> readCmPacienteHepatitisDosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteVih> readCmPacienteVihList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteHepatitisTres> readCmPacienteHepatitisTresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<ReadCmPacienteHepatitisUno> readCmPacienteHepatitisUnoList;

    public ReadCmPaciente() {
    }

    public ReadCmPaciente(Long id) {
        this.id = id;
    }

    public ReadCmPaciente(Long id, String tipoIdentificacion, String numeroIdentificacion) {
        this.id = id;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public ReadCmPaciente(Long id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacion, String numeroIdentificacion, Date fechaNacimiento, Character sexo, Character codigoPertenenciaEtnica, List<ReadCmPacienteCancer> readCmPacienteCancerList, List<ReadCmDetallePaciente> readCmDetallePacienteList, List<ReadCmPacienteArtritisReumatoide> readCmPacienteArtritisReumatoideList, List<ReadCmPacienteHemofilia> readCmPacienteHemofiliaList, List<ReadCmPacienteHepatitisDos> readCmPacienteHepatitisDosList, List<ReadCmPacienteVih> readCmPacienteVihList, List<ReadCmPacienteHepatitisTres> readCmPacienteHepatitisTresList, List<ReadCmPacienteHepatitisUno> readCmPacienteHepatitisUnoList) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
        this.readCmPacienteCancerList = readCmPacienteCancerList;
        this.readCmDetallePacienteList = readCmDetallePacienteList;
        this.readCmPacienteArtritisReumatoideList = readCmPacienteArtritisReumatoideList;
        this.readCmPacienteHemofiliaList = readCmPacienteHemofiliaList;
        this.readCmPacienteHepatitisDosList = readCmPacienteHepatitisDosList;
        this.readCmPacienteVihList = readCmPacienteVihList;
        this.readCmPacienteHepatitisTresList = readCmPacienteHepatitisTresList;
        this.readCmPacienteHepatitisUnoList = readCmPacienteHepatitisUnoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getCodigoPertenenciaEtnica() {
        return codigoPertenenciaEtnica;
    }

    public void setCodigoPertenenciaEtnica(Character codigoPertenenciaEtnica) {
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
    }

    @XmlTransient
    public List<ReadCmPacienteCancer> getCmPacienteCancerList() {
        return readCmPacienteCancerList;
    }

    public void setCmPacienteCancerList(List<ReadCmPacienteCancer> readCmPacienteCancerList) {
        this.readCmPacienteCancerList = readCmPacienteCancerList;
    }

    @XmlTransient
    public List<ReadCmDetallePaciente> getCmDetallePacienteList() {
        return readCmDetallePacienteList;
    }

    public void setCmDetallePacienteList(List<ReadCmDetallePaciente> readCmDetallePacienteList) {
        this.readCmDetallePacienteList = readCmDetallePacienteList;
    }

    @XmlTransient
    public List<ReadCmPacienteArtritisReumatoide> getCmPacienteArtritisReumatoideList() {
        return readCmPacienteArtritisReumatoideList;
    }

    public void setCmPacienteArtritisReumatoideList(List<ReadCmPacienteArtritisReumatoide> readCmPacienteArtritisReumatoideList) {
        this.readCmPacienteArtritisReumatoideList = readCmPacienteArtritisReumatoideList;
    }

    @XmlTransient
    public List<ReadCmPacienteHemofilia> getCmPacienteHemofiliaList() {
        return readCmPacienteHemofiliaList;
    }

    public void setCmPacienteHemofiliaList(List<ReadCmPacienteHemofilia> readCmPacienteHemofiliaList) {
        this.readCmPacienteHemofiliaList = readCmPacienteHemofiliaList;
    }

    @XmlTransient
    public List<ReadCmPacienteHepatitisDos> getCmPacienteHepatitisDosList() {
        return readCmPacienteHepatitisDosList;
    }

    public void setCmPacienteHepatitisDosList(List<ReadCmPacienteHepatitisDos> readCmPacienteHepatitisDosList) {
        this.readCmPacienteHepatitisDosList = readCmPacienteHepatitisDosList;
    }

    @XmlTransient
    public List<ReadCmPacienteVih> getCmPacienteVihList() {
        return readCmPacienteVihList;
    }

    public void setCmPacienteVihList(List<ReadCmPacienteVih> readCmPacienteVihList) {
        this.readCmPacienteVihList = readCmPacienteVihList;
    }

    @XmlTransient
    public List<ReadCmPacienteHepatitisTres> getCmPacienteHepatitisTresList() {
        return readCmPacienteHepatitisTresList;
    }

    public void setCmPacienteHepatitisTresList(List<ReadCmPacienteHepatitisTres> readCmPacienteHepatitisTresList) {
        this.readCmPacienteHepatitisTresList = readCmPacienteHepatitisTresList;
    }

    @XmlTransient
    public List<ReadCmPacienteHepatitisUno> getCmPacienteHepatitisUnoList() {
        return readCmPacienteHepatitisUnoList;
    }

    public void setCmPacienteHepatitisUnoList(List<ReadCmPacienteHepatitisUno> readCmPacienteHepatitisUnoList) {
        this.readCmPacienteHepatitisUnoList = readCmPacienteHepatitisUnoList;
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
        if (!(object instanceof ReadCmPaciente)) {
            return false;
        }
        ReadCmPaciente other = (ReadCmPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ReadCmPaciente[ id=" + id + " ]";
    }
    
}
