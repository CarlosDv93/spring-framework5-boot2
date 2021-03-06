package com.carlosdv93.udemy.aulas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Geral implements ApplicationListener<ContextRefreshedEvent>{

	@Value("${geral.nome}")
	private String nome;
	
	@Value("${my.server}")
	private String serve;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Qualquer Coisa");
		System.out.println(nome);
		System.out.println(serve);
	}

}
