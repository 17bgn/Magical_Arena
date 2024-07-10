package com.swiggy.arena;

import java.util.Random;

public class Player {
	
    private String name;
   // private String description;
    private int health;
    private int strength;
    private int attack;
    private Random random;

    
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        //It ensures that the dice rolls for each player are independent and random.
        this.random = new Random();
    }

    // Getters and setters
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

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}


    /**
     * Simulates rolling a six-sided die for attack.
     * Generates a random number between 1 and 6 (inclusive).
     * It returns A random integer between 1 and 6.
     */
    public int rollAttackDice() {
        return random.nextInt(6) + 1;
    }

	public int rollDefendDice() {
        return random.nextInt(6) + 1;
    }

    public int calculateDamage(int diceRoll) {
        return attack * diceRoll;
    }

    public int calculateDefense(int diceRoll) {
        return strength * diceRoll;
    }
}
