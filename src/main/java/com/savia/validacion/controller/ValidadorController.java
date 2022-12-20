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
public class ValidadorController {
    @Autowired
    HemofiliaReadService hemofiliaService;
    @Autowired
    ValidacionService validacionService;
    @GetMapping("/validacion")
    public ResponseEntity<Message> validacionEnfermedad(@RequestParam("idPaciente") int idPaciente
     ,@RequestParam("idEnfermedad") int idEnfermedad){
        return validacionService.resultValidacion(idPaciente,idEnfermedad);
    }
    @GetMapping("/all/validacion")
    public List<TblReadHemofiliaPasoModel> allHemofilia(){
        return hemofiliaService.listHemofiliaModels();
    }

    @GetMapping("/validacion/{id_hemofilia}")
    public ResponseEntity<Message> oneHemofilia(@PathVariable("id_hemofilia") Integer id_hemofilia){
        return hemofiliaService.hemofiliaModelOne(id_hemofilia);
    }
}
