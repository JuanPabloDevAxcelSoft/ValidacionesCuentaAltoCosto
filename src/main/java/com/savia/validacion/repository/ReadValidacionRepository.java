package com.savia.validacion.repository;

import com.savia.validacion.model.TblReadValidacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadValidacionRepository extends JpaRepository<TblReadValidacionModel, Integer> {
    @Query(value = "SELECT * FROM `tbl_validacion` WHERE enfermedad=:idEnfermedad And estado=1 ORDER By secuencia_validacion;", nativeQuery = true)
    List<TblReadValidacionModel> listValidaciones(int idEnfermedad);

}
