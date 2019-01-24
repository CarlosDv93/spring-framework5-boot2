package com.carlosdv93.udemy.aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carlosdv93.udemy.aulas.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByNome(String nome);
	
	User findByEmail(String email);
	
	@Query("select U from User U where U.nome like %?1%")
	User findByName(String nome);

}
