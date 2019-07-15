package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pub;

public interface PubRepository extends JpaRepository<Pub, Long>{

}
