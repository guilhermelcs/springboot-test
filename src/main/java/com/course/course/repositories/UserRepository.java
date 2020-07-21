package com.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.entities.User;

//Interface que automaticamente implementa tarefas realcionadas ao banco de dados

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
