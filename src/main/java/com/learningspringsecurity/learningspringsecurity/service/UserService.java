package com.learningspringsecurity.learningspringsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learningspringsecurity.learningspringsecurity.model.Users;
import com.learningspringsecurity.learningspringsecurity.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public Users getUser(String username) {
		return repository.findByUsername(username);
	}
}
