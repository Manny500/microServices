package com.revature.details.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.details.beans.Customer;
import com.revature.details.beans.FaceUser;
import com.revature.details.repo.FaceUserRepo;

@EnableEurekaClient
@Controller
public class LoginCtrl {
	
	@Autowired
	FaceUserRepo userRepo;
	
	private final static String POST_CUSTOMER_URL = "/login";

	@PostMapping(POST_CUSTOMER_URL)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		System.out.println("Creat Customer: " + customer);
		
		FaceUser user = new FaceUser();
		
		user.setFaceUsername("j");
		
		System.out.println("From database: "+ userRepo.findByfaceUsername(user.getFaceUsername()).getFaceFn());
		
		return ResponseEntity.ok(customer);
	}

}

