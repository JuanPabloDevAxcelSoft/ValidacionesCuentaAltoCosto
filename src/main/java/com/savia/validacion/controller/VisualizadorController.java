package com.savia.validacion.controller;

import com.savia.validacion.model.read.ReadCmPaciente;
import com.savia.validacion.service.read.ReadCmPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VisualizadorController {
    @Autowired
    ReadCmPacienteService readCmPacienteService;

    @GetMapping("/paciente")
    public List<ReadCmPaciente> readCmPacienteList() {
        List<ReadCmPaciente> readCmPacientes = readCmPacienteService.readCmPacienteList();
        return readCmPacientes;
    }
}
