package com.savia.validacion.repository;

import com.savia.validacion.model.ReadCmHemofiliaPaso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadCmHemofiliaPasoRepository extends JpaRepository<ReadCmHemofiliaPaso,Integer> {

}
