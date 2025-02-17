package com.project.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
