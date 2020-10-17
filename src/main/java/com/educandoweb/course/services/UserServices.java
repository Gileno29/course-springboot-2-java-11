package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service //Registra a classe como component do spring e permite ser injetada com o Autowired
public class UserServices {
	
	
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();// Busca todos os USERS no BD
	}
	
	public User findByID(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); //retorna o Objeto User do optional
		
	}
		
}
