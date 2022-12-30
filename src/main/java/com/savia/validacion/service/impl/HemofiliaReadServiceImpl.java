package com.savia.validacion.service.impl;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.repository.ReadHemofiliaRepository;
import com.savia.validacion.service.HemofiliaReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HemofiliaReadServiceImpl implements HemofiliaReadService {
    @Autowired
    ReadHemofiliaRepository readHemofiliaRepository;

    @Override
    public List<TblReadHemofiliaPasoModel> listHemofiliaModels() {
        return readHemofiliaRepository.findAll();
    }

    @Override
    public TblReadHemofiliaPasoModel oneElement(Integer id) {
        try {
            return readHemofiliaRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println("no  se encontro un usuario");
            return null;
        }
    }

}
