package com.savia.validacion.service.callDirect.impl;

import com.savia.validacion.util.RequestHttp;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    RequestHttp requestHttp;

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
        this.requestHttp.getRequest("/api/v1/notificacion/evento",true,null);
    }


}
