package com.kodnest.bean;
import org.springframework.beans.factory.annotation.Autowired;

public class University {
	
	int uid;
	String uname;
	
	@Autowired
	Trainer t;
	
	public University() {
		super();
		System.out.println("O param constr");
		// TODO Auto-generated constructor stub
	}
	
	
	public University(int uid, String uname, Trainer t) {
		super();
		System.out.println("Param Constr");
		this.uid = uid;
		this.uname = uname;
		this.t = t;
	}
	
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}
	
	public int getUid() {
		System.out.println("Getter Uid");
		return uid;
	}
	public void setUid(int uid) {
		System.out.println("Setter Uid");
		this.uid = uid;
	}
	public String getUname() {
		System.out.println("Getter Uname");
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("Setter Uname");
		this.uname = uname;
	}
	public Trainer getT() {
		System.out.println("Getter T");
		return t;
	}
	public void setT(Trainer t) {
		System.out.println("Setter autowired");
		this.t = t;
	}
	
}
