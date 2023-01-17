package com.savia.validacion.service.impl;

import com.savia.validacion.model.CmVihPaso;
import com.savia.validacion.repository.ReadCmHemofiliaPasoRepository;
import com.savia.validacion.repository.ReadCmVihPasoRepository;
import com.savia.validacion.service.ReadCmVihPasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadCmVihPasoServiceImpl implements ReadCmVihPasoService {
    @Autowired
    ReadCmVihPasoRepository readCmVihPasoRepository;
    @Autowired
    ReadCmHemofiliaPasoRepository readCmHemofiliaPasoRepository;
    @Override
    public CmVihPaso oneElement(Long id) {
        try {
            List<CmVihPaso>readCmVihPasos=readCmVihPasoRepository.findAll();
            for (CmVihPaso readCmVihPaso:readCmVihPasos) {
                System.out.println(readCmVihPaso.getCandidiasis());
            }

            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
