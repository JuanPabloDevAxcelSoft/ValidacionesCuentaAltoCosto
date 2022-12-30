package com.savia.validacion.service;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;

import java.util.List;

public interface HemofiliaReadService {
    List<TblReadHemofiliaPasoModel> listHemofiliaModels();

    TblReadHemofiliaPasoModel oneElement(Integer id);

}
