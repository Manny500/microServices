package com.revature.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FacebookDetailsServiceNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacebookDetailsServiceNewsApplication.class, args);
	}
}
