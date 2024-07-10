package com.kodnest.jdbc;

import java.sql.SQLException;
import java.util.Scanner;
public class MainApp {
	
	public static void printMenu() {
		System.out.println("\nChoose any given below Options to perform SQL Operations :");
		System.out.println("1.Insertion\n2.Updation\n3.Deletion\n4.Exit from the App");
	}

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
			System.out.println("\nStudent Table Data:");
			DisplayApp.displayRecords();
			System.out.println("___________________________________________________________");
			printMenu();
			System.out.println("\nEnter your Option");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				InsertionApp.insertRecords();
				break;
			case 2:
				UpdationApp.updateRecords();
				break;
			case 3:
				DeletionApp.deleteRecords();
				break;
			case 4:
				System.out.println("Application Successfully Closed :)");
				flag = false;
				break;
			default:
				System.out.println("InValid Option\nChoose a Proper option to perform specific task.");
			}
		}
		scan.close();
	}
}
