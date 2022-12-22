package com.savia.validacion.service;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.valueobject.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface HemofiliaReadService  {
    List<TblReadHemofiliaPasoModel> listHemofiliaModels();
    Object oneElement(Integer id);

}
