package com.savia.validacion.repository;

import com.savia.validacion.model.WriteCmValidacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WriteCmValidacionRepository extends JpaRepository<WriteCmValidacion, Integer> {

}
