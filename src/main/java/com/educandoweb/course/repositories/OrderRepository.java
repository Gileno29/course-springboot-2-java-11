package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;


// classe responsavel por realizar ações com o USER
public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
