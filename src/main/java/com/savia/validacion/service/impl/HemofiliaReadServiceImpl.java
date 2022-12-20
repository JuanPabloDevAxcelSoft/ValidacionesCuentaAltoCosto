package com.savia.validacion.service.impl;


import com.savia.validacion.dto.HemofiliaReadDto;
import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.repository.HemofiliaRepository;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.impl.validaciones.ValidacionesHemofilia;
import com.savia.validacion.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HemofiliaReadServiceImpl implements HemofiliaReadService {
    @Autowired
    HemofiliaRepository hemofiliaRepository;
    @Autowired
    ValidacionesHemofilia validacionesHemofilia;


    @Override
    public List<TblReadHemofiliaPasoModel> listHemofiliaModels(){
            return  hemofiliaRepository.findAll();
    }

    @Override
    @Deprecated
    public ResponseEntity<Message>  hemofiliaModelOne(Integer id){
        try{
            return validacionesHemofilia.validacionV5(hemofiliaRepository.getById(id));
        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("no se en encontró el usuario"+e.getMessage()));
        }
    }

    @Override
    public Object oneElement(Integer id) {
        try{
            Object result=hemofiliaRepository.findById(id).get();
            return result ;
        }catch (Exception e){
            System.out.println("no  se encontro un usuario");
            return null;
        }
    }

}
