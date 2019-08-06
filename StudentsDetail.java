package com.java.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentsDetail {
	

	public void displayStudentDetails(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavidb","root","");
			Statement sts = con.createStatement();
			ResultSet rs = sts.executeQuery("SELECT * FROM student_detail");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getInt(3)+" ");
				System.out.print(rs.getInt(4)+" ");
				System.out.println(rs.getInt(5));
				
				int sno = rs.getInt(1);
				String name = rs.getString(2);
				int m1 =rs.getInt(3);
				int m2 = rs.getInt(4);
				int m3 = rs.getInt(5);		
				
			}
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
	}
	
	public void insertStudentDetails()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the regno : ");
		int sno = scan.nextInt();
		
		System.out.println("Enter Student Name : ");
		String sname = scan.next();

		System.out.println("Enter Subject 1 Mark : ");
		int m1 = scan.nextInt();

		System.out.println("Enter Subject 2 Mark : ");
		int m2 = scan.nextInt();

		System.out.println("Enter Subject 3 Mark : ");
		int m3 = scan.nextInt();
		
		
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavidb","root","");
			Statement sts = con.createStatement();
	int status = sts.executeUpdate("INSERT INTO student_detail VALUES("+sno+",'"+sname+"',"+m1+","+m2+","+m3+")");
			if( status != -1)
			{
				System.out.println("Inserted Successful");
			}else{
				System.out.println("Insertion Failed");
			}
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

}



