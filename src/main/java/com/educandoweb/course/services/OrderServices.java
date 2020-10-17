package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service //Registra a classe como component do spring e permite ser injetada com o Autowired
public class OrderServices {
	
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order>findAll(){
		return repository.findAll();// Busca todos os OrderS no BD
	}
	
	public Order findByID(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //retorna o Objeto Order do optional
		
	}
		
}
