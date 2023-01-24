package com.savia.validacion.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class Errores {

    private final Logger logger = LoggerFactory.getLogger(Errores.class);

    @Value("${allowed.origin}")
    private String server;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Modifying
    public void guardarErrores(String nomTablaPaso, int idPaciente, String errores, String claveArchivo) {
        String message = "";
        try {
            String pureSql = "UPDATE " + nomTablaPaso + " SET campo_leido=true, clave_archivo='" + claveArchivo + "', " +
                    "error_validacion='" + errores + "' WHERE id=" + idPaciente;
            Query nativeQuery = entityManager.createNativeQuery(pureSql);
            nativeQuery.executeUpdate();
            message = "Actualizacion de errores completado";
        } catch (Exception e) {
            message = "Ocurrion un error : 'Exception' : " + e.getMessage();
            e.printStackTrace();
        }
        this.logger.info(message);
    }
}
