package com.carlosdv93.udemy.aulas;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.carlosdv93.udemy.aulas.entity.Funcionality;
import com.carlosdv93.udemy.aulas.entity.Role;
import com.carlosdv93.udemy.aulas.entity.User;
import com.carlosdv93.udemy.aulas.enums.StatusRole;
import com.carlosdv93.udemy.aulas.repository.RoleRepository;
import com.carlosdv93.udemy.aulas.repository.UserRepository;

@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRP;

	@Autowired
	private RoleRepository roleRP;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Funcionality funcionalities = new Funcionality();
		funcionalities.setNome("Add");
		
		Funcionality funcionalities2 = new Funcionality();
		funcionalities2.setNome("Delete");
		
		Role role = new Role("Admin", StatusRole.ATIVO, Arrays.asList(funcionalities));
		/*roleRP.save(role);*/
		Role role3 = new Role("Usuario", StatusRole.ATIVO, Arrays.asList(funcionalities2));
		 
		
		User user = new User("carlos", "carlos@carlos.com");
		user.setRoles(Arrays.asList(role, role3));
		
		userRP.save(user);
		
		User user2 = new User("João", "joão@joao.com");
		userRP.save(user2);
		
		User userR = this.userRP.findByNome("carlos");
		
		User userEmail = this.userRP.findByEmail("joão@joao.com");
		
		User UserNomeQuery = this.userRP.findByName("os");
		
		System.out.println(userR.getNome());
		System.out.println(userEmail.getNome());
		System.out.println(UserNomeQuery.getNome());

	}

}
