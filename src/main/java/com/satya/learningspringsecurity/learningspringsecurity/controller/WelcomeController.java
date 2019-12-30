package com.satya.learningspringsecurity.learningspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomePage() {
		return "<h1> Welcome </h1>";
	}
	
	@GetMapping("/admin")
	public String getAdminWelcomePage() {
		
		System.out.println("Admin page");
		return "<h1> Admin Welcome </h1>";
	}
	
	@GetMapping("/user")
	public String getUserWelcomePage() {
		System.out.println("User page");
		return "<h1> User Welcome </h1>";
	}

}
