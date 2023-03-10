package com.savia.validacion.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class PacienteFind {
    private final Logger logger = LoggerFactory.getLogger(PacienteFind.class);
    @PersistenceContext
    private EntityManager entityManager;
    public  Object getPacienteObj(String nombClaseValidacion, int idPaciente){
        Long id= Long.valueOf(idPaciente);
        String message = "";
        Class<?> claseEntity= null;
        try {
            if (!nombClaseValidacion.equals("")){
                claseEntity=Class.forName(nombClaseValidacion);
            }
        } catch (ClassNotFoundException e) {
            message= e.getMessage();
        }
        this.logger.info(message);
        return entityManager.find(claseEntity,id);
    }
}
