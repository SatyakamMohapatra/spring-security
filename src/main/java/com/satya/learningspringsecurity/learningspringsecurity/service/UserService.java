package com.satya.learningspringsecurity.learningspringsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.satya.learningspringsecurity.learningspringsecurity.model.Users;
import com.satya.learningspringsecurity.learningspringsecurity.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public Users getUser(String username) {
		return repository.findByUsername(username);
	}
}
