package com.udemy.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.workshopspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
