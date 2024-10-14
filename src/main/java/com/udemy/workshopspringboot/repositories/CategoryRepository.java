package com.udemy.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.workshopspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
