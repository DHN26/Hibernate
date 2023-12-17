package com.hib.mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int id;
	String name;
	String team;
	
	@ManyToMany
	List<Technology> tech;
	

	public Employee(int id, String name, String team, List<Technology> tech) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.tech = tech;
	}

	public Employee() {
		super();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", team=" + team + "]";
	}
	
	
}
