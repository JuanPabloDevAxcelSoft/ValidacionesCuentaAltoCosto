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
@Table(name = "cm_paciente_hepatitis_dos")
public class WriteCmPacienteHepatitisDos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ips_atendido")
    private int codigoIpsAtendido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tecnologia_salud")
    private Character tecnologiaSalud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_procedimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaProcedimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "diagnosticos_relacionados")
    private String diagnosticosRelacionados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_procedimiento")
    private int codigoProcedimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_resultado_num")
    private float valorResultadoNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor_resultado_text")
    private String valorResultadoText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_medicamento")
    private int codigoMedicamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lote_medicamento")
    private int loteMedicamento;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WriteCmPaciente idPaciente;

    public WriteCmPacienteHepatitisDos() {
    }

    public WriteCmPacienteHepatitisDos(Long id) {
        this.id = id;
    }

    public WriteCmPacienteHepatitisDos(Long id, int codigoIpsAtendido, Character tecnologiaSalud, Date fechaProcedimiento, String diagnosticosRelacionados, int codigoProcedimiento, float valorResultadoNum, String valorResultadoText, int codigoMedicamento, int loteMedicamento) {
        this.id = id;
        this.codigoIpsAtendido = codigoIpsAtendido;
        this.tecnologiaSalud = tecnologiaSalud;
        this.fechaProcedimiento = fechaProcedimiento;
        this.diagnosticosRelacionados = diagnosticosRelacionados;
        this.codigoProcedimiento = codigoProcedimiento;
        this.valorResultadoNum = valorResultadoNum;
        this.valorResultadoText = valorResultadoText;
        this.codigoMedicamento = codigoMedicamento;
        this.loteMedicamento = loteMedicamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigoIpsAtendido() {
        return codigoIpsAtendido;
    }

    public void setCodigoIpsAtendido(int codigoIpsAtendido) {
        this.codigoIpsAtendido = codigoIpsAtendido;
    }

    public Character getTecnologiaSalud() {
        return tecnologiaSalud;
    }

    public void setTecnologiaSalud(Character tecnologiaSalud) {
        this.tecnologiaSalud = tecnologiaSalud;
    }

    public Date getFechaProcedimiento() {
        return fechaProcedimiento;
    }

    public void setFechaProcedimiento(Date fechaProcedimiento) {
        this.fechaProcedimiento = fechaProcedimiento;
    }

    public String getDiagnosticosRelacionados() {
        return diagnosticosRelacionados;
    }

    public void setDiagnosticosRelacionados(String diagnosticosRelacionados) {
        this.diagnosticosRelacionados = diagnosticosRelacionados;
    }

    public int getCodigoProcedimiento() {
        return codigoProcedimiento;
    }

    public void setCodigoProcedimiento(int codigoProcedimiento) {
        this.codigoProcedimiento = codigoProcedimiento;
    }

    public float getValorResultadoNum() {
        return valorResultadoNum;
    }

    public void setValorResultadoNum(float valorResultadoNum) {
        this.valorResultadoNum = valorResultadoNum;
    }

    public String getValorResultadoText() {
        return valorResultadoText;
    }

    public void setValorResultadoText(String valorResultadoText) {
        this.valorResultadoText = valorResultadoText;
    }

    public int getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(int codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public int getLoteMedicamento() {
        return loteMedicamento;
    }

    public void setLoteMedicamento(int loteMedicamento) {
        this.loteMedicamento = loteMedicamento;
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
        if (!(object instanceof WriteCmPacienteHepatitisDos)) {
            return false;
        }
        WriteCmPacienteHepatitisDos other = (WriteCmPacienteHepatitisDos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.WriteCmPacienteHepatitisDos[ id=" + id + " ]";
    }
    
}
