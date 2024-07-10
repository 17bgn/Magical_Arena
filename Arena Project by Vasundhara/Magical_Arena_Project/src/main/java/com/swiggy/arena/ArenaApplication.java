package com.swiggy.arena;

import java.util.Scanner;

public class ArenaApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("\n-----WELCOME to the Magical_Arena_Battle_Field-----\n");
		
		System.out.println("Dear Player-1 Please Enter the your Name:");
		String player1Name = scanner.nextLine();
		System.out.println("Enter the Player-1 Health:");
		int player1Health = scanner.nextInt();
		System.out.println("Enter the Player-1 Stength:");
		int player1Strength = scanner.nextInt();
		System.out.println("Enter the Player-1 Attack:");
		int player1Attack = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("\nDear Player-2 Please Enter the your Name:");
		String player2Name = scanner.nextLine();
		System.out.println("Enter the Player-2 Health:");
		int player2Health = scanner.nextInt();
		System.out.println("Enter the Player-2 Stength:");
		int player2Strength = scanner.nextInt();
		System.out.println("Enter the Player-2 Attack:");
		int player2Attack = scanner.nextInt();

//		Sample Data:
//		Player player1 = new Player("Player A", 100, 5, 10);
//		Player player2 = new Player("Player B", 50, 10, 5);
		
		Player player1 = new Player(player1Name,player1Health,player1Strength,player1Attack);
		Player player2 = new Player(player2Name,player2Health,player2Strength,player2Attack);
		Player players[] = {player1,player2};
		Game game = new Game(player1, player2);
		
		System.out.println("\nLet's Welcome Our Today's Arena Battle Players\n");
		System.out.println("Here is the Stats of Our Players");
		
		for(int i=0;i<players.length;i++) {
			System.out.println("\nPlayer-"+(i+1)+" Details:");
			System.out.println("Name: "+players[i].getName());
			System.out.println("Health: "+players[i].getHealth());
			System.out.println("Strength: "+players[i].getStrength());
			System.out.println("Attack: "+players[i].getAttack());
		}
		
		System.out.println("\nLet's Start the Game.!!!");
		game.start();
		
		

	}

}
