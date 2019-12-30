package com.learningspringsecurity.learningspringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.learningspringsecurity.learningspringsecurity.model.Authorities;
import com.learningspringsecurity.learningspringsecurity.model.Users;
import com.learningspringsecurity.learningspringsecurity.repository.AuthoritiesRepository;
import com.learningspringsecurity.learningspringsecurity.repository.UserRepository;

@SpringBootApplication
@EnableTransactionManagement
public class LearningSpringSecurityApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private AuthoritiesRepository authoritiesRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Users normaluser = new Users("normaluser", new BCryptPasswordEncoder().encode("user"), true);
		Users adminuser = new Users("adminuser", new BCryptPasswordEncoder().encode("user"), true);
		repository.save(normaluser);
		repository.save(adminuser);
		
		Authorities roleUsers = new Authorities("ROLE_USER");
		Authorities roleAdmin = new Authorities("ROLE_ADMIN");
		roleUsers.addUsers(normaluser);
		roleAdmin.addUsers(adminuser);
		
		authoritiesRepository.save(roleUsers);
		authoritiesRepository.save(roleAdmin);
		
		normaluser.setAuthorities(roleUsers);
		adminuser.setAuthorities(roleAdmin);
		
		repository.save(normaluser);
		repository.save(adminuser);
	}

}
