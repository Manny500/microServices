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
	
	private final static String POST_FACEUSER_URL = "/login";

	@PostMapping(POST_FACEUSER_URL)
	public ResponseEntity<FaceUser> authenticateFaceuser(@RequestBody FaceUser user) {
						
		FaceUser fu = userRepo.findByfaceUsername(user.getFaceUsername());
		
		if(fu != null) {
				
			if(user.getFaceUsername().equals(fu.getFaceUsername()) && user.getFacePassword().equals(fu.getFacePassword())) {
				
				user = fu;
			}else {
				user = new FaceUser();
			}
		}else {
			user = new FaceUser();
		}
	
		return ResponseEntity.ok(user);
	}

}

