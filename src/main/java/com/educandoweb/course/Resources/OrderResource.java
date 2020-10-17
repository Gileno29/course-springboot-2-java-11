package com.educandoweb.course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderServices;

@RestController //indica que é um recurso web implementado por um controlador Rest
@RequestMapping(value="/orders") //caminho do recurso
public class OrderResource {
	
	@Autowired
	private OrderServices service;
	@GetMapping //indica que responde a um GET do htttp
	public ResponseEntity<List<Order>> findAll(){ //cria um metodo generico que retorna usuário(todos)
		List<Order> list= service.findAll();
		return ResponseEntity.ok().body(list);//retorna um ok e o conteudo desejado
		
	}

	@GetMapping(value="/{id}")//indica que a requisição tem um parammetro o ID
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}

