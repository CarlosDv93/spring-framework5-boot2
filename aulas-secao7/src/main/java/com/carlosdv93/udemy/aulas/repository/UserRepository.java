package com.carlosdv93.udemy.aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosdv93.udemy.aulas.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
