package com.savia.validacion.service;

import com.savia.validacion.valueobject.Message;
import org.springframework.http.ResponseEntity;

public interface ValidacionService {
    ResponseEntity<Message> resultValidacion(int idPaciente, int idEnfermedad);
}
