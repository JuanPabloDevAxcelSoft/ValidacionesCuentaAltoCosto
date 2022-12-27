package com.savia.validacion.service;

import com.savia.validacion.interfaces.ValidacionInterfaces;
import com.savia.validacion.valueobject.Message;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ValidacionService {
    public ResponseEntity<Message> resultValidacion(int idPaciente, int idEnfermedad);

    public List<ValidacionInterfaces> findAllValidacionesByIdEnfermedad(int enfermedadId);
}
