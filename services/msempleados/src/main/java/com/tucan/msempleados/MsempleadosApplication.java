package com.tucan.msempleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsempleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsempleadosApplication.class, args); 
	}

}
