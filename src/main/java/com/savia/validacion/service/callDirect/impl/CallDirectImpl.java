package com.savia.validacion.service.callDirect.impl;

import org.springframework.stereotype.Service;

import com.savia.validacion.service.callDirect.CallDirectService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Service
public class CallDirectImpl implements CallDirectService {

    private final Logger logger = LoggerFactory.getLogger(CallDirectImpl.class);

    @Value("${allowed.origin}")
    private String server;

    private RestTemplate rest;
    private HttpHeaders headers;

    @Override
    public void callDirectService() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        this.post("/api/v1/notificacion/evento");
    }

    public void post(String uri) {
        try {
            String ruta = server + uri;
            HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
            ResponseEntity<String> responseEntity = rest.exchange(ruta, HttpMethod.POST, requestEntity, String.class);
            String response = responseEntity.getBody();
            this.logger.info(response);
        } catch (Exception e) {
            this.logger.info("Error al momento de realizar el llamado al servicio de directo : " + e.getMessage());
        }
    }

}
