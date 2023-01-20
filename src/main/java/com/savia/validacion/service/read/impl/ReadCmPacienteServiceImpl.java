package com.savia.validacion.service.read.impl;


import com.savia.validacion.repository.read.ReadCmPacienteRepository;
import com.savia.validacion.service.read.ReadCmPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadCmPacienteServiceImpl implements ReadCmPacienteService {
    @Autowired
    ReadCmPacienteRepository readCmPacienteRepository;
    @Override
    public List<String> readCmPacienteList() {
        try {
            return readCmPacienteRepository.paciente();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
