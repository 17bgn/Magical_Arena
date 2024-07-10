package com.kodnest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int pid;
	String pname;
	
	@ManyToMany
	List<Customer> c;
//	Customer c;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, List<Customer> c) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.c = c;
}


	@Override
	public String toString() {
		return "Product []";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Customer> getC() {
		return c;
	}

	public void setC(List<Customer> c) {
		this.c = c;
	}

	
	
}
