package com.carlosdv93.udemy.aulas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdv93.udemy.aulas.entity.User;

public interface UserRepositiry extends JpaRepository<User, Long>{

}
