package com.kodnest.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the Driver/
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="Bsiv@nji17";
		
		//Establishing the Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection+" Success");
		
		//Creating a statement
		//String query ="create table product(pid int,pname varchar(20))";
		//String query ="insert into product values(?,?)";
		//String query ="update product set pname='Electronics' where pid=1";
		//String query ="delete from product where pid=1";
		String query ="select * from product where pid>?";
		//Statement st = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Product ID");
		int pid = scanner.nextInt();
//		System.out.println("Enter the Product Name");
//		String pname = scanner.next();
		
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1,pid);
		//pst.setString(2,pname);
		//Executing the Statement
//		int executeUpdate = pst.executeUpdate();
//		System.out.println(executeUpdate+" - Success");
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
	}

}
