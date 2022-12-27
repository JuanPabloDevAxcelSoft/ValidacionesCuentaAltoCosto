package com.savia.validacion.repository;

import org.springframework.stereotype.Repository;

import com.savia.validacion.interfaces.ValidacionInterfaces;
import com.savia.validacion.model.TblConfiguracionValidacion;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ValidacionRepository extends CrudRepository<TblConfiguracionValidacion, Integer> {

    @Query(value = "select vd.nombre_metodo, vd.variable_independiente, vd.variable_dependiente,vd.parametros,vd.operador,vd.contantes,vd.errores,vd.valor_defecto,vd.tipo_metodo,vd.ruta_validaciones,vd.ruta_implementaciones, vc.nombre from tbl_configuracion_validacion tcv inner join tbl_validacion_dependencia vd on tcv.id_validacion= vd.id inner join tbl_validacion_contante vc on tcv.id_constante= vc.id where vd.enfermedad_id=:id", nativeQuery = true)
    public List<ValidacionInterfaces> findAllEnfermedadId(int id);

}