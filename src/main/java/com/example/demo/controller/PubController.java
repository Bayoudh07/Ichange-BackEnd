package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pub;
import com.example.demo.service.ICrudService;




@RestController
@RequestMapping("/api/pub")
@CrossOrigin
public class PubController {
	

	@Autowired
	private ICrudService<Pub, Long> pubService;
	
	@GetMapping
	public List<Pub> getAll() {
		return pubService.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody Pub pub) {
		pubService.add(pub);
	}
	
	@PutMapping
	public void update(@RequestBody Pub pub) {
		pubService.update(pub);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		pubService.delete(id);
	}

}
