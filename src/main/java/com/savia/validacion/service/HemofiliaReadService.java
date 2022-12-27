package com.savia.validacion.service;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.valueobject.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HemofiliaReadService {
    List<TblReadHemofiliaPasoModel> listHemofiliaModels();
<<<<<<< HEAD
=======

    ResponseEntity<Message> hemofiliaModelOne(Integer id);

>>>>>>> 6d169b22d7b4658d6aecf176207cf19fde6c3aae
    Object oneElement(Integer id);

}
