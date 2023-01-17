/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savia.validacion.model.write;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Angel Gonzalez
 */
@Entity
@Table(name = "cm_paciente")
public class WriteCmPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private List<WriteCmPacienteCancer> writeCmPacienteCancerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmDetallePaciente> writeCmDetallePacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmPacienteArtritisReumatoide> writeCmPacienteArtritisReumatoideList;
    @OneToMany(mappedBy = "idPaciente")
    private List<WriteCmPacienteHemofilia> writeCmPacienteHemofiliaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmPacienteHepatitisDos> writeCmPacienteHepatitisDosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmPacienteVih> writeCmPacienteVihList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmPacienteHepatitisTres> writeCmPacienteHepatitisTresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<WriteCmPacienteHepatitisUno> writeCmPacienteHepatitisUnoList;

    public WriteCmPaciente() {
    }

    public WriteCmPaciente(Long id) {
        this.id = id;
    }

    public WriteCmPaciente(Long id, String tipoIdentificacion, String numeroIdentificacion) {
        this.id = id;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public WriteCmPaciente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoIdentificacion, String numeroIdentificacion, Date fechaNacimiento, Character sexo, Character codigoPertenenciaEtnica) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.codigoPertenenciaEtnica = codigoPertenenciaEtnica;
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
    public List<WriteCmPacienteCancer> getCmPacienteCancerList() {
        return writeCmPacienteCancerList;
    }

    public void setCmPacienteCancerList(List<WriteCmPacienteCancer> writeCmPacienteCancerList) {
        this.writeCmPacienteCancerList = writeCmPacienteCancerList;
    }

    @XmlTransient
    public List<WriteCmDetallePaciente> getCmDetallePacienteList() {
        return writeCmDetallePacienteList;
    }

    public void setCmDetallePacienteList(List<WriteCmDetallePaciente> writeCmDetallePacienteList) {
        this.writeCmDetallePacienteList = writeCmDetallePacienteList;
    }

    @XmlTransient
    public List<WriteCmPacienteArtritisReumatoide> getCmPacienteArtritisReumatoideList() {
        return writeCmPacienteArtritisReumatoideList;
    }

    public void setCmPacienteArtritisReumatoideList(List<WriteCmPacienteArtritisReumatoide> writeCmPacienteArtritisReumatoideList) {
        this.writeCmPacienteArtritisReumatoideList = writeCmPacienteArtritisReumatoideList;
    }

    @XmlTransient
    public List<WriteCmPacienteHemofilia> getCmPacienteHemofiliaList() {
        return writeCmPacienteHemofiliaList;
    }

    public void setCmPacienteHemofiliaList(List<WriteCmPacienteHemofilia> writeCmPacienteHemofiliaList) {
        this.writeCmPacienteHemofiliaList = writeCmPacienteHemofiliaList;
    }

    @XmlTransient
    public List<WriteCmPacienteHepatitisDos> getCmPacienteHepatitisDosList() {
        return writeCmPacienteHepatitisDosList;
    }

    public void setCmPacienteHepatitisDosList(List<WriteCmPacienteHepatitisDos> writeCmPacienteHepatitisDosList) {
        this.writeCmPacienteHepatitisDosList = writeCmPacienteHepatitisDosList;
    }

    @XmlTransient
    public List<WriteCmPacienteVih> getCmPacienteVihList() {
        return writeCmPacienteVihList;
    }

    public void setCmPacienteVihList(List<WriteCmPacienteVih> writeCmPacienteVihList) {
        this.writeCmPacienteVihList = writeCmPacienteVihList;
    }

    @XmlTransient
    public List<WriteCmPacienteHepatitisTres> getCmPacienteHepatitisTresList() {
        return writeCmPacienteHepatitisTresList;
    }

    public void setCmPacienteHepatitisTresList(List<WriteCmPacienteHepatitisTres> writeCmPacienteHepatitisTresList) {
        this.writeCmPacienteHepatitisTresList = writeCmPacienteHepatitisTresList;
    }

    @XmlTransient
    public List<WriteCmPacienteHepatitisUno> getCmPacienteHepatitisUnoList() {
        return writeCmPacienteHepatitisUnoList;
    }

    public void setCmPacienteHepatitisUnoList(List<WriteCmPacienteHepatitisUno> writeCmPacienteHepatitisUnoList) {
        this.writeCmPacienteHepatitisUnoList = writeCmPacienteHepatitisUnoList;
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
        if (!(object instanceof WriteCmPaciente)) {
            return false;
        }
        WriteCmPaciente other = (WriteCmPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteRepository[ id=" + id + " ]";
    }
    
}
