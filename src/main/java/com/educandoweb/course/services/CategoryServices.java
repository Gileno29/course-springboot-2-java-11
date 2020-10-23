package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service //Registra a classe como component do spring e permite ser injetada com o Autowired
public class CategoryServices {
	
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category>findAll(){
		return repository.findAll();// Busca todos os CategoryS no BD
	}
	
	public Category findByID(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //retorna o Objeto Category do optional
		
	}
		
}
