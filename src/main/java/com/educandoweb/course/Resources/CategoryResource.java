package com.educandoweb.course.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryServices;

@RestController //indica que é um recurso web implementado por um controlador Rest
@RequestMapping(value="/categories") //caminho do recurso
public class CategoryResource {
	
	@Autowired
	private CategoryServices service;
	@GetMapping //indica que responde a um GET do htttp
	public ResponseEntity<List<Category>> findAll(){ //cria um metodo generico que retorna usuário(todos)
		List<Category> list= service.findAll();
		return ResponseEntity.ok().body(list);//retorna um ok e o conteudo desejado
		
	}

	@GetMapping(value="/{id}")//indica que a requisição tem um parammetro o ID
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}

