package com.project.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.curso.entites.Order;
import com.project.curso.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	@Autowired
	private OrderService orderService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{Id}")
	public ResponseEntity<Order> findById(@PathVariable("Id") Long id) {
		Order obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
