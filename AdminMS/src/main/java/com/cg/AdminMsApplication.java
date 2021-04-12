package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminMsApplication.class, args);
	}

}
