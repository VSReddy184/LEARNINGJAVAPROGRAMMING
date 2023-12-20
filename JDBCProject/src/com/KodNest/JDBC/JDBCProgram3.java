package com.KodNest.JDBC;
import java.sql.*;
public class JDBCProgram3 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="insert into student values(1,'Vimala','vimala@example.com'),(2,'Vinitha','vintha@example.com'),(3,'Venky','venky@example.com'),(4,'Viswa','viswa@example.com'),(5,'Varun','varun@example.com')";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connetion is established");
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
