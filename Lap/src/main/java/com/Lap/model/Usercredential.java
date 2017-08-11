package com.Lap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
@Entity(name="usercredential")
@Component
public class Usercredential {
	
@Id
	private String userid;
	
	@Column
	private String password;
	
	@Column
	boolean enabled=true;
	
	@Column
	private String role="ROLE_USER";
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	}
