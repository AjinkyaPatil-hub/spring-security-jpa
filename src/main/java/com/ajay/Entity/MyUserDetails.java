package com.ajay.Entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails extends UserEntity implements UserDetails {

	private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;
	
	public MyUserDetails() {
	}

	public MyUserDetails(UserEntity user) {
		this.username = user.getUsername();
		this.password= user.getPassword();
		this.active = user.isActive();
		this.authorities = Arrays.stream(user.getRole().split(","))
							.map(SimpleGrantedAuthority::new)
							.collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}
}
