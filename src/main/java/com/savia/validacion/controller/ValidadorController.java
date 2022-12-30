package com.savia.validacion.controller;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ValidadorController {

    @Autowired
    private HemofiliaReadService hemofiliaService;

    @Autowired
    private ValidacionService validacionService;


    @GetMapping("/all/validacion")
    public List<TblReadHemofiliaPasoModel> allHemofilia() {
        return hemofiliaService.listHemofiliaModels();
    }

    @GetMapping("/validacion/{id_hemofilia}")
    public ResponseEntity<Message> oneHemofilia(@PathVariable("id_hemofilia") Integer id_hemofilia) {
        // return hemofiliaService.hemofiliaModelOne(id_hemofilia);
        return null;
    }

    @GetMapping("/prueba")
    public ResponseEntity<Message> prueba(@RequestParam("idPaciente") int idPaciente,
                                                        @RequestParam("idEnfermedad") int idEnfermedad) {
        return ResponseEntity.ok().body(new Message(validacionService.isPacienteCorrect(idPaciente, idEnfermedad)));
    }
}
