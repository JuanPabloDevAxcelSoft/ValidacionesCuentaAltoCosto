package com.savia.validacion.util;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class EliminacionPacientePaso {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Modifying
    public  void setEliminarPacientePaso(String nombreTablaPaso, int idPaciente){
        String pureSql="DELETE FROM "+nombreTablaPaso+" WHERE id="+idPaciente;
        Query query=entityManager.createNativeQuery(pureSql);
        query.executeUpdate();
    }
}
