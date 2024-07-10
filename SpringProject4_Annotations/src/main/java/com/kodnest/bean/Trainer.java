package com.kodnest.bean;

public class Trainer {
	int tid;
	String tname;
	public Trainer() {
		super();
		System.out.println("O param constr");
		// TODO Auto-generated constructor stub
	}
	public Trainer(int tid, String tname) {
		super();
		System.out.println("param const");
		this.tid = tid;
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + "]";
	}
	public int getTid() {
		System.out.println("Getter Tid");
		return tid;
	}
	public void setTid(int tid) {
		System.out.println("Setter Tid");
		this.tid = tid;
	}
	public String getTname() {
		System.out.println("Getter Tname");
		return tname;
	}
	public void setTname(String tname) {
		System.out.println("Setter Tname");
		this.tname = tname;
	}
	
	
}
