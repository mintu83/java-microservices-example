package com.microservice.eureka.eurekaRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author Mintu
 * A spring cloud - eureka server which is act as a service-registry
 */
@EnableEurekaServer
@SpringBootApplication
public class EurecaDemoApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "application");
		SpringApplication.run(EurecaDemoApplication.class, args);
	}
}
