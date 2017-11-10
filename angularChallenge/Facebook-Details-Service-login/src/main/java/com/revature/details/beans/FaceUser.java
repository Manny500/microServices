package com.revature.details.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "FACE_USER")
@Component
public class FaceUser {
	
	@Id
	@Column(name = "FACE_ID")
	private int faceId;
	
	@Column(name = "FACE_FN")
	private String faceFn;

	@Column(name = "FACE_LS")
	private String faceLs;

	@Column(name = "FACE_USERNAME")
	private String faceUsername;

	@Column(name = "FACE_PASSWORD")
	private String facePassword;

	@Column(name = "FACE_RT_ID")
	private int roleId;

	@Column(name = "FACE_EMAIL")
	private String faceEmail;
	
	public FaceUser() {
		
	}

	public FaceUser(int faceId, String faceFn, String faceLs, String faceUsername, String facePassword, int roleId,
			String faceEmail) {
		super();
		this.faceId = faceId;
		this.faceFn = faceFn;
		this.faceLs = faceLs;
		this.faceUsername = faceUsername;
		this.facePassword = facePassword;
		this.roleId = roleId;
		this.faceEmail = faceEmail;
	}

	public int getFaceId() {
		return faceId;
	}

	public void setFaceId(int faceId) {
		this.faceId = faceId;
	}

	public String getFaceFn() {
		return faceFn;
	}

	public void setFaceFn(String faceFn) {
		this.faceFn = faceFn;
	}

	public String getFaceLs() {
		return faceLs;
	}

	public void setFaceLs(String faceLs) {
		this.faceLs = faceLs;
	}

	public String getFaceUsername() {
		return faceUsername;
	}

	public void setFaceUsername(String faceUsername) {
		this.faceUsername = faceUsername;
	}

	public String getFacePassword() {
		return facePassword;
	}

	public void setFacePassword(String facePassword) {
		this.facePassword = facePassword;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getFaceEmail() {
		return faceEmail;
	}

	public void setFaceEmail(String faceEmail) {
		this.faceEmail = faceEmail;
	}
	
	

}
