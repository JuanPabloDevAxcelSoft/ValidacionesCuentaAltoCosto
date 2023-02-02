package com.savia.validacion.valueobject;

public class RequestData {

    private Integer idEnfermedad;
    private Integer idPaciente;
    private String claveValor;

    public Integer getIdEnfermedad() {
        return idEnfermedad;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public String getClaveValor() {
        return claveValor;
    }

    public void setIdEnfermedad(Integer idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setClaveValor(String claveValor) {
        this.claveValor = claveValor;
    }

}
