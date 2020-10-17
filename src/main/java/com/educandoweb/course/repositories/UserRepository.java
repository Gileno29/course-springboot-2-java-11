package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


// classe responsavel por realizar ações com o USER
public interface UserRepository extends JpaRepository<User, Long> {
	

}
