package com.savia.validacion.controller;

import com.savia.validacion.service.callDirect.CallDirectService;
import com.savia.validacion.service.read.ReadValidacionService;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ValidadorController {

    @Autowired
    private ReadValidacionService readValidacionService;

    @Autowired
    private CallDirectService callDirectService;


    @GetMapping("/validacion")
    public ResponseEntity<Message> prueba(
        @RequestParam("idPaciente") int idPaciente,
        @RequestParam("idEnfermedad") int idEnfermedad,
        @RequestParam("claveArchivo") String claveArchivo) {
        return ResponseEntity.ok().body(new Message(readValidacionService.isPacienteCorrect(idPaciente, idEnfermedad,claveArchivo)));
    }

    @GetMapping("/test")
    public void test () {
        callDirectService.callDirectService();
    }

}
