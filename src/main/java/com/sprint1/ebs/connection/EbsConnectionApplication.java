package com.sprint1.ebs.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
<<<<<<< HEAD
=======
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
<<<<<<< HEAD
@EnableSwagger2
@EnableFeignClients
=======
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
public class EbsConnectionApplication {
	public static void main(String[] args) {
		SpringApplication.run(EbsConnectionApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}