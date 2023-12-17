package com.hib.mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int techId;
	String techName;
	
	@ManyToMany
	List<Employee> emp;

	public Technology(int techId, String techName, List<Employee> emp) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.emp = emp;
	}

	public Technology() {
		super();
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", emp=" + emp + "]";
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	
	
}
