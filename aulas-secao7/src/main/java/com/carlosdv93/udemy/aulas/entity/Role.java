package com.carlosdv93.udemy.aulas.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.carlosdv93.udemy.aulas.enums.StatusRole;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private StatusRole status;
	
	public Role() {
	}

	public Role(String name, StatusRole status) {
		super();
		this.name = name;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StatusRole getStatus() {
		return status;
	}

	public void setStatus(StatusRole status) {
		this.status = status;
	}

	
}
