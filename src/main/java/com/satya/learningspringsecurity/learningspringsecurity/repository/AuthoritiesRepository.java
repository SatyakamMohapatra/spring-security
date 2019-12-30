package com.satya.learningspringsecurity.learningspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.learningspringsecurity.learningspringsecurity.model.Authorities;

public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {

}
