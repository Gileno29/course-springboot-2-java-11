package com.educandoweb.course.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController //indica que é um recurso web implementado por um controlador Rest
@RequestMapping(value="/users") //caminho do recurso
public class UserResource {
	
	
	@GetMapping //indica que responde a um GET do htttp
	public ResponseEntity<User>findAll(){ //cria um metodo generico que retorna usuário
		User u= new User(1L, "Gileno", "gileno@gmail.com","999999", "12345");
		return ResponseEntity.ok().body(u);//retorna um ok e o conteudo desejado
		
	}

	
}

