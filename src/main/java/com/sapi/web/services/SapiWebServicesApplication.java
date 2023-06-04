package com.sapi.web.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@SpringBootApplication
public class SapiWebServicesApplication {
    
    private static final Logger LOGGER = LogManager.getLogger(SapiWebServicesApplication.class);

	public static void main(String[] args) {
            SpringApplication.run(SapiWebServicesApplication.class, args);
            LOGGER.info("Inicio SapiWebServicesApplication");
            LOGGER.debug("Inicio SapiWebServicesApplication");
            LOGGER.error("Error en Inicio SapiWebServicesApplication");
	}

}
