package com.revature.details.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.details.beans.FaceUser;

@Repository(value="faceRepoImpl")
public interface FaceUserRepo extends CrudRepository<FaceUser,Integer>{

	FaceUser findByfaceUsername(String faceUsername);

}
