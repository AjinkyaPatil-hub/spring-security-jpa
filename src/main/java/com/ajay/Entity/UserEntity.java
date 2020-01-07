package com.ajay.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Info")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	private String username;
	private String password;
	private boolean active;
	private String role;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int id, String username, String password, boolean active, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
