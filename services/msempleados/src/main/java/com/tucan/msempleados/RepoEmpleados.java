package com.tucan.msempleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RepoEmpleados {

	public static void main(String[] args) {
		SpringApplication.run(RepoEmpleados.class, args); 
	}

}
