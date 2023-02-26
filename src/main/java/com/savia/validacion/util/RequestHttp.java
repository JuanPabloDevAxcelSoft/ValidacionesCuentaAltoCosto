package com.savia.validacion.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestHttp {
    private final Logger logger = LoggerFactory.getLogger(RequestHttp.class);

    @Value("${allowed.origin}")
    private String server;

    private RestTemplate rest;
    private HttpHeaders headers;

    public void getRequest(String uri,boolean metodo, String parametro) {
        try {
            String ruta = server + uri +((metodo)? "":"/?clave="+parametro);
            HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
            ResponseEntity<String> responseEntity = rest.exchange(ruta,(metodo)? HttpMethod.POST:HttpMethod.GET, requestEntity, String.class);
            responseEntity.getBody();
            // this.logger.info(response);
        } catch (Exception e) {
            this.logger.info("Error al momento de realizar el llamado al servicio de directo : " + e.getMessage());
        }
    }
}
