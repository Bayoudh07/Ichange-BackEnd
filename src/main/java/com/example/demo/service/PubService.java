package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pub;
import com.example.demo.repository.PubRepository;


@Service
@Primary
public class PubService implements ICrudService<Pub,Long> {

	@Autowired
	private PubRepository pubRepository;
	
	@Override
	public List<Pub> getAll() {
		
		return pubRepository.findAll();
	}

	@Override
	public void add(Pub pub) {
		pubRepository.save(pub);		
	}

	@Override
	public void update(Pub pub) {
		pubRepository.save(pub);
		
	}

	@Override
	public void delete(Long id) {
		Pub pub = new Pub();
		pub.setId(id);
		pubRepository.delete(pub);
		
	}

}
