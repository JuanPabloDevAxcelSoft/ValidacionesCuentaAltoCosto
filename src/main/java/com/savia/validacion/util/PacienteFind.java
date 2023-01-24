package com.savia.validacion.util;


import com.savia.validacion.service.read.ReadCmVihPasoService;
import com.savia.validacion.service.read.ReadHemofiliaPasoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class PacienteFind {
    private final Logger logger = LoggerFactory.getLogger(Errores.class);
    @Value("${allowed.origin}")
    private String server;
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    ReadHemofiliaPasoService readHemofiliaPasoService;
    @Autowired
    ReadCmVihPasoService readCmVihPasoService;
    public  Object paciente(int idPaciente,int idEnfermedad){
        Object objectPasciente;
        switch (idEnfermedad) {
            case 1: {
                objectPasciente = readHemofiliaPasoService.oneElement(idPaciente);
                return objectPasciente;
            }
            case 2:{
                objectPasciente=readCmVihPasoService.oneElement(Long.valueOf(idPaciente));
                return objectPasciente;
            }
            default:
                return null;
        }
    }
    public  Object pacienteObj(String nombClaseValidacion, int idPaciente){
        Long id= Long.valueOf(idPaciente);
        String message = "";
        Class c= null;
        try {
            if (!nombClaseValidacion.equals("")){
                c=Class.forName(nombClaseValidacion);
            }
        } catch (ClassNotFoundException e) {
            message= e.getMessage();
            e.printStackTrace();
        }
        this.logger.info(message);
        return entityManager.find(c,id);
    }
}
