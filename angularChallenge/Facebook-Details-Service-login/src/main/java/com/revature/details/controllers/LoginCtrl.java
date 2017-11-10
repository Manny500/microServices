package com.revature.details.controllers;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableEurekaClient
@Controller
public class LoginCtrl {

	@RequestMapping("/")
	public String loginPage(){
		System.out.println("LoginPage - GET");
		return "forward:login.html";
	}

}

