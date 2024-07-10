package com.swiggy.arena;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
    	
    	System.out.println("\nPlayer with lower health attacks first at the start of the match.\n");
    	if(player1.getHealth() <= player2.getHealth()) {
    		
    		while (player1.getHealth() > 0 && player2.getHealth() > 0) {
    			playBattle(player1, player2);
    			if (player2.getHealth() > 0) {
    				playBattle(player2, player1);
    			}
    		}
    	}else {
    		
    		while (player1.getHealth() > 0 && player2.getHealth() > 0) {
    			playBattle(player2, player1);
    			if (player1.getHealth() > 0) {
    				playBattle(player1, player2);
    			}
    		}
    		
    	}
    	
        if (player1.getHealth() <= 0) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println(player1.getName() + " wins!");
        }
    }

    private void playBattle(Player attacker, Player defender) {
        int attackRoll = attacker.rollAttackDice();
        int defendRoll = defender.rollDefendDice();

        int attackDamage = attacker.calculateDamage(attackRoll);
        int defendValue = defender.calculateDefense(defendRoll);

        int damage = attackDamage - defendValue;
        if (damage > 0) {
            defender.setHealth(defender.getHealth() - damage);
        }

        System.out.printf("%s rolls %d: Damage = %d%n", attacker.getName(), attackRoll, attackDamage);
        System.out.printf("%s rolls %d: Defense = %d%n", defender.getName(), defendRoll, defendValue);
        System.out.printf("%s's health is now %d%n%n", defender.getName(), defender.getHealth());
    }
}
