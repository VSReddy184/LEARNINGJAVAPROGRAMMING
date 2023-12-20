package com.KodNest.JDBC2;
import java.sql.*;
import java.util.*;
public class StudentApp 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="insert into student1 values(?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the no.of rows to be iserted");
			int rows=scan.nextInt();
			for(int i=1;i<=rows;i++)
			{
				Student s=new Student();
				System.out.println("Enter the rollNo of Student "+i);
				int rollNo=scan.nextInt();
				s.rollNo=rollNo;
				System.out.println("Enter the name of the Student "+i);
				String name=scan.next();
				s.name=name;
				System.out.println("Enter the marks of Student "+i);
				int marks=scan.nextInt();
				s.marks=marks;
				pstmt.setInt(1, rollNo);
				pstmt.setString(2, name);
				pstmt.setInt(3,marks);
				pstmt.addBatch();
			}
				pstmt.executeBatch();
				System.out.println("Rows are inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
