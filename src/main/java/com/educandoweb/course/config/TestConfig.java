package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

//classe especifica de configuração
@Configuration //indica para o Sspring que é uma classe de configuração
@Profile("test")//Spring só roda essa config no perfil de test
public class TestConfig implements CommandLineRunner{
	
	@Autowired  //resolve a dependência e associa uma instancia de user repository
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception { // tudo que for colocado aqui vai ser executado quando a aplicação for iniciada
		// TODO Auto-generated method stub
		
		User u1= new User(null, "João","joao@gmail.com","98888888", "123456");
		User u2= new User(null, "Alex","Alex@gmail.com","97777777", "123456");
		
		Order o1= new Order(null, Instant.parse("2019-06-20T19:53:07z"), u1, OrderStatus.PAID);
		Order o2= new Order(null, Instant.parse("2019-07-20T19:43:07z"), u2, OrderStatus.WAITING_PAYMENT);
		Order o3= new Order(null, Instant.parse("2019-08-20T19:32:07z"), u1, OrderStatus.WAITING_PAYMENT);
		
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
