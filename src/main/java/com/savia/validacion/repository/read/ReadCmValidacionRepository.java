package com.savia.validacion.repository.read;

import com.savia.validacion.model.read.ReadCmValidacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadCmValidacionRepository extends JpaRepository<ReadCmValidacion, Integer> {
    @Query(value = "SELECT * FROM `cm_validacion` WHERE enfermedad=:idEnfermedad And estado=1 ORDER By secuencia_validacion;", nativeQuery = true)
    List<ReadCmValidacion> listValidaciones(int idEnfermedad);

}
