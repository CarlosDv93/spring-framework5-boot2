package com.carlosdv93.udemy.projeto1.repository;

import org.springframework.data.jpa.repository.*;

import com.carlosdv93.udemy.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByNome(String nome);
	
	@Query("select u from User u where u.nome like %?1%")
	User findComNome(String nome);
	
	User findByEmailContaining(String email);
}
