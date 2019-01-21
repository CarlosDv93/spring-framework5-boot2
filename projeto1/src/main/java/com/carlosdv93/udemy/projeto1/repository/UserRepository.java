package com.carlosdv93.udemy.projeto1.repository;

import org.springframework.data.jpa.repository.*;

import com.carlosdv93.udemy.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
