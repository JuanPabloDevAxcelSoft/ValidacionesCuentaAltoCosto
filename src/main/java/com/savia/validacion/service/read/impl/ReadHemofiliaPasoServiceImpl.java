package com.savia.validacion.service.read.impl;

import com.savia.validacion.model.read.ReadCmHemofiliaPaso;
import com.savia.validacion.repository.read.ReadCmHemofiliaPasoRepository;
import com.savia.validacion.service.read.ReadHemofiliaPasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadHemofiliaPasoServiceImpl implements ReadHemofiliaPasoService {
    @Autowired
    ReadCmHemofiliaPasoRepository readCmHemofiliaPasoRepository;


    @Override
    public ReadCmHemofiliaPaso oneElement(Integer id) {
        try {
            return readCmHemofiliaPasoRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println("no  se encontro un usuario");
            return null;
        }
    }

}
