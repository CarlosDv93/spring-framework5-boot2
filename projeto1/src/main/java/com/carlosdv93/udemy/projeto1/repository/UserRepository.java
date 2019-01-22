package com.carlosdv93.udemy.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.carlosdv93.udemy.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{

	User findByNomeIgnoreCase(String nome);
	
	User findByEmailContaining(String email);
	
	@Query("{ 'email' : ?0 }")
	User findByEmailQualquerCoisa(String email);
}
