//package com.kodnest.jdbc;
//
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class CreateTable {
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
//		
//		//Creating the Statement
//		Statement stmt = connection.createStatement();
//		
//		//executing the sql statement
//		stmt.execute("create table student(id int, name varchar(20))");
//		System.out.println("success");
//		
//	}
//
//}
