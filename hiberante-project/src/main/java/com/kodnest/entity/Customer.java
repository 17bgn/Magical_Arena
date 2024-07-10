package com.kodnest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	
	@ManyToMany
	List<Product> p;
//	Product p;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, List<Product> p) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.p = p;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getP() {
		return p;
	}
	public void setP(List<Product> p) {
		this.p = p;
	}
	
	
}
