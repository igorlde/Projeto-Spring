package com.project.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.curso.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
@GetMapping	
public ResponseEntity<User> findAll(){
	User u = new User(1L, "Igor", "igor@gmail.com", "33991135060", "654321");
	return ResponseEntity.ok().body(u);
}
}
