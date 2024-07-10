package com.kn.jdbcpractice;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Student {
	
	 String name;
	 int age;
	 
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Bsiv@nji17";

		//Establishing connection
		Connection connection = DriverManager.getConnection(url, username, password);
		//System.out.println(connection + "connection success");
		
		//executing the sql statement
		String s = "Insert into student values(?,?)";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scan.next();
		System.out.println("Enter the Age");
		int age = scan.nextInt();
		
		Student st = new Student(name,age);
		String n = st.getName();
		int a = st.getAge();

		//Creating the Statement
		PreparedStatement stmt = connection.prepareStatement(s);
		stmt.setString(1,n);
		stmt.setInt(2,a);
		
		int eu = stmt.executeUpdate();
		System.out.println(eu+" - Insertion Success");

	}
}
