package com.kodnest.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletionApp {

	public static void deleteRecords()throws ClassNotFoundException, SQLException{

		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Bsiv@nji17";

		//Establishing connection
		Connection connection = DriverManager.getConnection(url, username, password);

		//System.out.println(connection + "connection success");
		String s  = "delete from student where id =?";

		System.out.println("Enter the ID to be deleted:");
		Scanner scan = new Scanner(System.in);
		int id= scan.nextInt();

		//Creating the Statement
		PreparedStatement stmt = connection.prepareStatement(s);
		stmt.setInt(1, id);

		//executing the sql statement
		//stmt.execute(s);
		int executeUpdate = stmt.executeUpdate();
		System.out.println(executeUpdate+" - Deletion Success");

	}

}
