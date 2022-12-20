package com.savia.validacion.repository;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HemofiliaRepository extends JpaRepository<TblReadHemofiliaPasoModel,Integer> {

}
