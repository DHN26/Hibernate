package com.hib.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int pId;
	String pName;
	double pCost;

	@ManyToOne
	Customer cust;

	public Product(int pId, String pName, double pCost, Customer cust) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.cust = cust;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", cust=" + cust + "]";
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpCost() {
		return pCost;
	}

	public void setpCost(double pCost) {
		this.pCost = pCost;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

}
