package com.savia.validacion.config;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Config {

    @Value("${allowed.origin}")
    private String allowedOrigin;

    @Autowired
    ServletContext context;

    @Bean /* Bean para configurar los CORS */
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/**")
                        .allowedOrigins(allowedOrigin)
                        .allowedMethods("GET", "POST")
                        .maxAge(3600)
                        .allowedHeaders("*");
            }
        };
    }
}
