package com.udemy.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.workshopspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
