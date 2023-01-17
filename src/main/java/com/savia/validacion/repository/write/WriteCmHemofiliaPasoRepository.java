package com.savia.validacion.repository.write;


import com.savia.validacion.model.write.WriteCmHemofiliaPaso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmHemofiliaPasoRepository extends JpaRepository<WriteCmHemofiliaPaso,Integer> {

}
