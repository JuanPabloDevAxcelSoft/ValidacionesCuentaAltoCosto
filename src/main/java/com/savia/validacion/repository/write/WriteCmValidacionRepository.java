package com.savia.validacion.repository.write;

import com.savia.validacion.model.write.WriteCmValidacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WriteCmValidacionRepository extends JpaRepository<WriteCmValidacion, Integer> {

}
