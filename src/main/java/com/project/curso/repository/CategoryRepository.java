package com.project.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
