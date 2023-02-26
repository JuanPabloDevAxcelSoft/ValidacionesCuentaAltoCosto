package com.savia.validacion.service.read.impl;

import com.savia.validacion.model.read.ReadCmVihPaso;
import com.savia.validacion.repository.read.ReadCmVihPasoRepository;
import com.savia.validacion.service.read.ReadCmVihPasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReadCmVihPasoServiceImpl implements ReadCmVihPasoService {
    @Autowired
    ReadCmVihPasoRepository readCmVihPasoRepository;
    @Override
    public ReadCmVihPaso oneElement(Long id) {
        try {
            return readCmVihPasoRepository.findById(id).get();
        }catch (Exception e){
            return null;
        }
    }
}
