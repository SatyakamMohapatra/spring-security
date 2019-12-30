package com.learningspringsecurity.learningspringsecurity.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.learningspringsecurity.learningspringsecurity.model.Users;

public class MyUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;

	private Users users;
	
	public MyUserDetails(Users users) {
		this.users = users;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority(users.getAuthorities().getAuthority()));
	}

	@Override
	public String getPassword() {
		return users.getPassword();
	}

	@Override
	public String getUsername() {
		return users.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return users.getEnabled();
	}

	@Override
	public boolean isAccountNonLocked() {
		return users.getEnabled();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return users.getEnabled();
	}

	@Override
	public boolean isEnabled() {
		return users.getEnabled();
	}

}
