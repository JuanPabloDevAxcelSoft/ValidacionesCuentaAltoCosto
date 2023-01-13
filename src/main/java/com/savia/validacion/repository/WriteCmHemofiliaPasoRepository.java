package com.savia.validacion.repository;


import com.savia.validacion.model.WriteCmHemofiliaPaso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmHemofiliaPasoRepository extends JpaRepository<WriteCmHemofiliaPaso,Integer> {

}
