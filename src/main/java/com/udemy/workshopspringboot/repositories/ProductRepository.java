package com.udemy.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.workshopspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
