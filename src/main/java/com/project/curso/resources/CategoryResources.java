package com.project.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.curso.entites.Category;
import com.project.curso.services.CategoryService;

@RestController
@RequestMapping(value = "/Categories")
public class CategoryResources {
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{Id}")
	public ResponseEntity<Category> findById(@PathVariable("Id") Long id) {
		Category obj = categoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
