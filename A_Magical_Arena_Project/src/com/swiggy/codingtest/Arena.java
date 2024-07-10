package com.swiggy.codingtest;

public class Arena {

	private Player player1;
	private Player player2;
	private Dice dice;

	public Arena(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.dice = new Dice();
	}

	public void startBattle() {
		Player attacker = player1.getHealth() < player2.getHealth() ? player1:player2;
		Player defender = (attacker==player1) ? player2:player1;

		while(attacker.isAlive() && defender.isAlive()) {

			System.out.println(attacker.getName()+" attacks "+defender.getName());
			performAttack(attacker, defender);
			if(!defender.isAlive()) {
				break;
			}

			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		System.out.println((attacker.isAlive() ? attacker.getName() : defender.getName())+" wins!");
	}

	private void performAttack(Player attacker, Player defender) {

		int attackerRoll = dice.rollDice();
		int defenderRoll = dice.rollDice();

		int attackDamage = attacker.getAttack() * attackerRoll;
		int defendStrength = defender.getStrength() * defenderRoll;

		int damage = Math.max(0,(attackDamage - defendStrength));
		defender.reduceHealth(damage);

		System.out.println(attacker.getName()+" rolled "+attackerRoll+" and did "+damage+" damage.");
		System.out.println(defender.getName()+" now has "+defender.getHealth()+" health.");
		System.out.println();

	}


}
