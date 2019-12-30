package com.learningspringsecurity.learningspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspringsecurity.learningspringsecurity.model.Authorities;

public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {

}
