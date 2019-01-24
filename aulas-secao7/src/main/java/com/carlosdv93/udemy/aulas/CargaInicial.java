package com.carlosdv93.udemy.aulas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.carlosdv93.udemy.aulas.entity.Role;
import com.carlosdv93.udemy.aulas.enums.StatusRole;
import com.carlosdv93.udemy.aulas.repository.RoleRepository;

@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private RoleRepository roleRP;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		for(int i = 0; i< 100; i++) {
			this.saveRole("Admin", StatusRole.ATIVO);
		}
		
		for(int i = 0; i< 100; i++) {
			this.saveRole("User", StatusRole.INATIVO);
		}
		
		PageRequest page = PageRequest.of(1, 10);
		
		Page<Role> roles = this.roleRP.findAll(page);
		
		for(Role role : roles) {
			System.out.println(role.getName());
		}

	}
	
	public void saveRole(String nome, StatusRole status) {
		Role role = new Role(nome, status);
		
		roleRP.save(role);
	}

}
