package com.tucan.servicio_prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioPruebaApplication.class, args); 
	}

}
