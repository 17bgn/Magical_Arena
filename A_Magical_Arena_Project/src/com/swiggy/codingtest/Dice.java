package com.swiggy.codingtest;

import java.util.Random;

public class Dice {

	private Random random = new Random();

	public Dice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dice(Random random) {
		super();
		this.random = random;
	}
	
	public int rollDice() {
		return random.nextInt(6)+1;
	}
}
