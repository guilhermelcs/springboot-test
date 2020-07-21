package com.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.entities.Product;

//Interface que automaticamente implementa tarefas realcionadas ao banco de dados

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
}
