package com.revature.details.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.details.beans.Customer;

@EnableEurekaClient
@Controller
public class NewsFeedCtrl {

	private final static String POST_CUSTOMER_URL = "/news";

	@PostMapping(POST_CUSTOMER_URL)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		System.out.println("Creat Customer: " + customer);
		
		return ResponseEntity.ok(customer);
	}

}
