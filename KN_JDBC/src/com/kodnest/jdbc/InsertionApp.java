package com.kodnest.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertionApp {
	public static void insertRecords() throws SQLException, ClassNotFoundException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Bsiv@nji17";

		//Establishing connection
		Connection connection = DriverManager.getConnection(url, username, password);

		String s  = "insert into student(id,name) values (?,?)";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID :");
		int id=scan.nextInt();

		System.out.println("Enter the Name: ");
		String name= scan.next();
		//Creating the Statement
		PreparedStatement stmt = connection.prepareStatement(s);
		stmt.setInt(1,id);
		stmt.setString(2,name);

		int executeUpdate = stmt.executeUpdate();
		System.out.println(executeUpdate+" - Insertion Success");
	}
}
