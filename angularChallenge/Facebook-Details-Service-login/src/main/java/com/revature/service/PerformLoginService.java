package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.details.repo.FaceUserRepo;

@Service(value = "userDetailsService")
public class PerformLoginService {

	@Autowired
	FaceUserRepo userRepo;

}
