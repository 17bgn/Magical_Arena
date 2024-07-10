//package com.kodnest.jdbc;
//
//import java.sql.Statement;
//
//import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//public class UpdateRecords {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		//loading the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		String url = "jdbc:mysql://localhost/kodnest";
//		String username = "root";
//		String password = "Bsiv@nji17";
//		
//		//Establishing connection
//		Connection connection = DriverManager.getConnection(url, username, password);
//		//System.out.println(connection + "connection success");
//		
//		String s  = "update student set name=? where id=?";
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the ID :");
//		int id=scan.nextInt();
//		
//		System.out.println("Enter the Name: ");
//		String name= scan.next();
//		
//		//Creating the Statement
//		PreparedStatement stmt = connection.prepareStatement(s);
//		stmt.setInt(2,id);
//		stmt.setString(1,name);
//		
//		int executeUpdate = stmt.executeUpdate();
//		System.out.println("success-"+executeUpdate);
//		
//	}
//}
//
