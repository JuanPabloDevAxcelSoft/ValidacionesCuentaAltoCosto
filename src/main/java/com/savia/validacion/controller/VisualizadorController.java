package com.savia.validacion.controller;

import com.savia.validacion.model.read.ReadCmPaciente;
import com.savia.validacion.service.read.ReadCmPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VisualizadorController {
    @Autowired
    ReadCmPacienteService readCmPacienteService;

    @GetMapping("/paciente")
    public List<String>readCmPacienteList(@Param("idEnfermedad") int idEnfermedad, @Param("idIps") int idIps,
                                          @Param("limit") int limit,@Param("page") int page, @Param("documento") String documento) {
        return readCmPacienteService.readCmPacienteList();
    }
}
