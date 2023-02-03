package com.savia.validacion.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class SacarNombreTablaPaso {
    private final Logger logger = LoggerFactory.getLogger(SacarNombreTablaPaso.class);
    @Value("${allowed.origin}")
    private String server;
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Modifying
    public  String getNombreTablaPaso(int idEnfermedad){
        String message = "";
        HttpClient httpClient = HttpClient.newHttpClient();
        String rutaServicio =  this.server + "/api/v1/nombre/paso/" + idEnfermedad;
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(rutaServicio)).GET().build();
        try {
            HttpResponse<String> stringHttpResponse = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());
            message= stringHttpResponse.body();
        } catch (IOException e) {
            message = "Ocurrion un error : 'IOException 2' : " + e.getMessage();
            e.printStackTrace();
        } catch (InterruptedException e) {
            message = "Ocurrion un error : 'InterruptedException' : " + e.getMessage();
            e.printStackTrace();
        }
        this.logger.info(message);
        return message;
    }

}
