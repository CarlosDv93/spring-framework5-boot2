package com.carlosdv93.udemy.aulas.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosdv93.udemy.aulas.entity.Role;
import com.carlosdv93.udemy.aulas.enums.StatusRole;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	List<Role> findByStatus(StatusRole status);
	
	Page<Role> findAll(Pageable page);

}
