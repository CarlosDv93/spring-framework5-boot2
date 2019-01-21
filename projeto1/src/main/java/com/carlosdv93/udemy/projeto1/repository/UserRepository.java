package com.carlosdv93.udemy.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carlosdv93.udemy.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{

	User findByNomeIgnoreCase(String nome);
	
	User findByEmailContaining(String email);
}
