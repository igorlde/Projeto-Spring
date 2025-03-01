package com.project.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
