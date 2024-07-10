
//package com.kodnest.jdbc;
//
//import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//public class DisplayRecords{
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
//		
//		//System.out.println(connection + "connection success");
//		String s  = "select * from student where id>?";
//		
//		System.out.println("Enter the ID");
//		Scanner scan = new Scanner(System.in);
//		int id = scan.nextInt();
//		
//		//Creating the Statement
//		PreparedStatement stmt = connection.prepareStatement(s);
//		stmt.setInt(1, id);
//		//executing the sql statement
//		//stmt.execute(s);
//		//stmt.executeUpdate(s);
//		ResultSet rs = stmt.executeQuery();
//		
//		while(rs.next()) {
//			
//			System.out.println(rs.getInt(1)+" "+rs.getString(2));
//		}
//		System.out.println("success");
//	}
//}
//
