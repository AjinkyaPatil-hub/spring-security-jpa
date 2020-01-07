package com.ajay;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ajay.Entity.MyUserDetails;
import com.ajay.Entity.UserEntity;
import com.ajay.repo.UserRespository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRespository userRespository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserEntity> user = userRespository.findByUsername(username);

		//for checking if user database sends null
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+username));
		
		//return user.map(MyUserDetails::new).get();
		return new MyUserDetails(user.get());
	}

}
