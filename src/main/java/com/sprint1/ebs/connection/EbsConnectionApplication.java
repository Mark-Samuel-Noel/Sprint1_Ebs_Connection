package com.sprint1.ebs.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EbsConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbsConnectionApplication.class, args);
	}

}
