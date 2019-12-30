package com.learningspringsecurity.learningspringsecurity.config;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.learningspringsecurity.learningspringsecurity.model.Users;
import com.learningspringsecurity.learningspringsecurity.service.UserService;

@Component
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userService;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = userService.getUser(username);
		if(users == null) {
			throw new UsernameNotFoundException("Not Found: "+ username);
		}
		return new MyUserDetails(users);
	}

}
