//package com.kodnest.jdbc;
//
//import java.sql.Statement;
//import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class BankInsert {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		String url = "jdbc:mysql://localhost/kodnest";
//		String username = "root";
//		String password = "Bsiv@nji17";
//		
//		//Establishing connection
//		Connection connection = DriverManager.getConnection(url, username, password);
//		
//		//Creating the Statement
//		Statement stmt = connection.createStatement();
//		
//		String s1  = "insert into bank value(1,'John',10000)";
//		String s2 = "insert into bank value(2,'Jack',20000)";
//		String s3  = "insert into bank value(3,'Ria',30000)";
//		String s4 = "insert into bank value(4,'Ryan',40000)";
//		String s5 = "insert into bank value(5,'Anish',50000)";
//		
//		stmt.addBatch(s1);
//		stmt.addBatch(s2);
//		stmt.addBatch(s3);
//		stmt.addBatch(s4);
//		stmt.addBatch(s5);
//		
//		stmt.executeBatch();
//		System.out.println("Insertion Success");
//		
//
//		/*for(int i=1;i<=5;i++) {
//			String s  = "insert into bank(acc_no,name,balance) values(?,?,?)";
//			PreparedStatement pt = connection.prepareStatement(s);
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the Account No: ");
//			int acno = scan.nextInt();
//			System.out.println("ENter the Name:");
//			String name = scan.next();
//			System.out.println("Enter the Balance :");
//			int balance = scan.nextInt();
//			pt.setInt(1,acno);
//			pt.setString(2,name);
//			pt.setInt(3,balance);
//			
//			int executeUpdate = pt.executeUpdate();
//			System.out.println(executeUpdate+" - Insertion Success");
//		}*/
//	}
//}
