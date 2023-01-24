package com.savia.validacion.util;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class Errores {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Modifying
    public void guardarErrores(int idEnfermedad,int idPaciente,String errores,String claveArchivo){
        HttpClient httpClient= HttpClient.newHttpClient();
        String rutaServicio="http://localhost:8081/api/v1/nombre/paso/"+idEnfermedad;
        HttpRequest httpRequest=HttpRequest.newBuilder().uri(URI.create(rutaServicio)).GET().build();
        try {
            HttpResponse<String> stringHttpResponse= httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String nomTabla= stringHttpResponse.body();
            String pureSql="UPDATE "+nomTabla+" SET campo_leido=true, clave_archivo='"+claveArchivo+"', " +
                    "error_validacion='"+errores+"' WHERE id="+idPaciente;
            Query nativeQuery= entityManager.createNativeQuery(pureSql);
            nativeQuery.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
