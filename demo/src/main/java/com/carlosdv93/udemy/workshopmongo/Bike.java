package com.carlosdv93.udemy.workshopmongo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Iniciando a Bike");
	}

	@Override
	public void stop() {
		System.out.println("Parar a Bike");
	}
	
}
