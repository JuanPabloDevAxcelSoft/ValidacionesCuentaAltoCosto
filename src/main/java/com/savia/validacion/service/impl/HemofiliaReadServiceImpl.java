package com.savia.validacion.service.impl;

import com.savia.validacion.model.ReadCmHemofiliaPaso;
import com.savia.validacion.repository.ReadCmHemofiliaPasoRepository;
import com.savia.validacion.service.HemofiliaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HemofiliaReadServiceImpl implements HemofiliaReadService {
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
