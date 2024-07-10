package com.swiggy.codingtest;

public class Player {

	private String name;
	private int health;
	private int strength;
	private int attack;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(String name, int health, int strength, int attack) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", strength=" + strength + ", attack=" + attack
				+ "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void reduceHealth(int damage) {
		this.health = Math.max(0,this.health - damage);
	}
	
	public boolean isAlive() {
		return this.health>0;
	}
	
	
}
