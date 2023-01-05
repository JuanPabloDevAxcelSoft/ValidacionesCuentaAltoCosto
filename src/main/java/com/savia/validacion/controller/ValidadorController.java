package com.savia.validacion.controller;


import com.savia.validacion.service.ReadHemofiliaPasoService;
import com.savia.validacion.service.ReadValidacionService;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ValidadorController {

    @Autowired
    private ReadHemofiliaPasoService hemofiliaService;

    @Autowired
    private ReadValidacionService readValidacionService;


    @GetMapping("/validacion/{id_hemofilia}")
    public ResponseEntity<Message> oneHemofilia(@PathVariable("id_hemofilia") Integer id_hemofilia) {
        // return hemofiliaService.hemofiliaModelOne(id_hemofilia);
        return null;
    }

    @GetMapping("/prueba")
    public ResponseEntity<Message> prueba(@RequestParam("idPaciente") int idPaciente,
                                                        @RequestParam("idEnfermedad") int idEnfermedad) {
        return ResponseEntity.ok().body(new Message(readValidacionService.isPacienteCorrect(idPaciente, idEnfermedad)));
    }
}
