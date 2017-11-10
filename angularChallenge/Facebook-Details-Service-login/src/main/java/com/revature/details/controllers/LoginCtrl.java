package com.revature.details.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtrl {

	@RequestMapping("/")
	public String loginPage(){
		System.out.println("LoginPage - GET");
		return "forward:login.html";
	}

}

