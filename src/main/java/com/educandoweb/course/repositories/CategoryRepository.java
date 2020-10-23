package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;


// classe responsavel por realizar ações com o Category
public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
