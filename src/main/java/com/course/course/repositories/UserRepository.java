package com.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
