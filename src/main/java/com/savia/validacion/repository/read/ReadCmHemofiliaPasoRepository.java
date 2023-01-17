package com.savia.validacion.repository.read;

import com.savia.validacion.model.read.ReadCmHemofiliaPaso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadCmHemofiliaPasoRepository extends JpaRepository<ReadCmHemofiliaPaso,Integer> {

}
