package com.savia.validacion.service.callDirect.impl;

import com.savia.validacion.util.RequestHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savia.validacion.service.callDirect.CallDirectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

@Service
public class CallDirectImpl implements CallDirectService {
    @Autowired
    RequestHttp requestHttp;

    @Value("${allowed.origin}")
    private String server;

    private HttpHeaders headers;

    @Override
    public void callDirectService() {
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        this.requestHttp.getRequest("/api/v1/notificacion/evento",true,null);
    }


}
