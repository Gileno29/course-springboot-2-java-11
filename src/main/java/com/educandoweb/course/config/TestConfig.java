package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//classe especifica de configuração
@Configuration //indica para o Sspring que é uma classe de configuração
@Profile("test")//Spring só roda essa config no perfil de test
public class TestConfig implements CommandLineRunner{
	
	@Autowired  //resolve a dependência e associa uma instancia de user repository
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // tudo que for colocado aqui vai ser executado quando a aplicação for iniciada
		// TODO Auto-generated method stub
		
		User u1= new User(null, "João","joao@gmail.com","98888888", "123456");
		User u2= new User(null, "Alex","Alex@gmail.com","97777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
