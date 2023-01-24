package com.savia.validacion.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@Service
public class EliminacionPacientePaso {
    @Value("${allowed.origin}")
    private String server;
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Modifying
    public  void eliminarPacientePaso(int idEnfermedad, int idPaciente){
        String message = "";
        HttpClient httpClient = HttpClient.newHttpClient();
        String rutaServicio =  this.server + "/api/v1/nombre/paso/" + idEnfermedad;
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(rutaServicio)).GET().build();

    }
}
