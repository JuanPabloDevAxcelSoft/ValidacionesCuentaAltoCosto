package com.savia.validacion.controller;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.ValidacionService;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@RestController
@RequestMapping("/api/v1")
public class ValidadorController {

    @Autowired
    private HemofiliaReadService hemofiliaService;

    @Autowired
    private ValidacionService validacionService;

    @GetMapping("/validacion")
    public ResponseEntity<Message> validacionEnfermedad(@RequestParam("idPaciente") int idPaciente,
            @RequestParam("idEnfermedad") int idEnfermedad) {
        return validacionService.resultValidacion(idPaciente, idEnfermedad);
    }

    @GetMapping("/all/validacion")
    public List<TblReadHemofiliaPasoModel> allHemofilia() {
        return hemofiliaService.listHemofiliaModels();
    }

    @GetMapping("/validacion/{id_hemofilia}")
    public ResponseEntity<Message> oneHemofilia(@PathVariable("id_hemofilia") Integer id_hemofilia) {
        // return hemofiliaService.hemofiliaModelOne(id_hemofilia);
        return null;
    }

    @GetMapping("/test")
    public Object oneHemofilia1() throws ScriptException, IOException, NoSuchMethodException {

        int parametro1 = 1;
        int parametro2 = 2;
        String operador = ">";

        String condicion = "";

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        boolean result = (boolean) scriptEngine.eval(condicion);

        return "La respuesta es : " + result;
    }
}
