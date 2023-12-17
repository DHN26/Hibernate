package com.hib.mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Customer {

	@Id
	int cId;
	String cName;
	int cAge;
	
	@OneToMany
	List<Product> product;

	public Customer(int cId, String cName, int cAge, List<Product> product) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAge = cAge;
		this.product = product;
	}

	public Customer() {
		super();
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcAge() {
		return cAge;
	}

	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAge=" + cAge + "]";
	}
	
	

}
