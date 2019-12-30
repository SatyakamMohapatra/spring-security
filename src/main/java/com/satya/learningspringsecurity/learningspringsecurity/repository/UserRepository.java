package com.satya.learningspringsecurity.learningspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.satya.learningspringsecurity.learningspringsecurity.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	//https://vladmihalcea.com/the-best-way-to-handle-the-lazyinitializationexception/
	@Query("select u from Users u join fetch u.authorities where u.username = :username")
	Users findByUsername(@Param("username") String username);
	
}
