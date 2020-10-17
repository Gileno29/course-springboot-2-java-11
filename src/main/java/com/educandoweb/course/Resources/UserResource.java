package com.educandoweb.course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserServices;

@RestController //indica que é um recurso web implementado por um controlador Rest
@RequestMapping(value="/users") //caminho do recurso
public class UserResource {
	
	@Autowired
	private UserServices service;
	@GetMapping //indica que responde a um GET do htttp
	public ResponseEntity<List<User>> findAll(){ //cria um metodo generico que retorna usuário(todos)
		List<User> list= service.findAll();
		return ResponseEntity.ok().body(list);//retorna um ok e o conteudo desejado
		
	}

	@GetMapping(value="/{id}")//indica que a requisição tem um parammetro o ID
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}

