package com.carlosdv93.udemy.workshopmongo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Iniciando Carro");
	}

	@Override
	public void stop() {
		System.out.println("Parando o carro");
	}
	
	

}
