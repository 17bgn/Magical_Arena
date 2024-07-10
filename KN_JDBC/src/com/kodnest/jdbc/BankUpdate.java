package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankUpdate {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Bsiv@nji17";
		
		//Executing the SQL Statements
		String s1  = "update bank set balance =balance + 5000 where acc_no=1";
		String s2  = "updat bank set balance = balance + 5000 where acc_no=2";
		Connection conn =null;
		try {
			//Establishing connection
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			//Creating the Statement
			Statement stmt = conn.createStatement();
			stmt.addBatch(s1);
			stmt.addBatch(s2);
			stmt.executeBatch();
			conn.commit();
			
		}catch(Exception e) {
			System.out.println("Exception Occured");
			conn.rollback();
		}
		
		System.out.println("Updation Success");
		
		
	}
}
/*for(int i=1;i<=5;i++) {
String s  = "insert into bank(acc_no,name,balance) values(?,?,?)";
PreparedStatement pt = connection.prepareStatement(s);
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Account No: ");
int acno = scan.nextInt();
System.out.println("ENter the Name:");
String name = scan.next();
System.out.println("Enter the Balance :");
int balance = scan.nextInt();
pt.setInt(1,acno);
pt.setString(2,name);
pt.setInt(3,balance);

int executeUpdate = pt.executeUpdate();
System.out.println(executeUpdate+" - Update Success");
}*/
