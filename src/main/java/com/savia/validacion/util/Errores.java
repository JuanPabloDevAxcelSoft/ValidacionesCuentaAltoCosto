package com.savia.validacion.util;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class Errores {
    public void guardarErrores(){
        HttpClient httpClient= HttpClient.newHttpClient();
        HttpRequest httpRequest=HttpRequest.newBuilder().uri(URI.create("http://localhost:8081/api/v1/enfermedades")).GET().build();
        try {
            HttpResponse<String> stringHttpResponse= httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(stringHttpResponse.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
