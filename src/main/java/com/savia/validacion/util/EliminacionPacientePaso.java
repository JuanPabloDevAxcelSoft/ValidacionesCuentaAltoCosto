package com.savia.validacion.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class EliminacionPacientePaso {
    private final Logger logger = LoggerFactory.getLogger(Errores.class);
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Modifying
    public  void setEliminarPacientePaso(String nombreTablaPaso, int idPaciente){
        try {
            String pureSql="DELETE FROM "+nombreTablaPaso+" WHERE id=:idPaciente";
            Query query=entityManager.createNativeQuery(pureSql);
            query.setParameter("idPaciente",idPaciente);
            query.executeUpdate();
        }catch (Exception e){
            logger.error(e.getMessage());
        }

    }
}
