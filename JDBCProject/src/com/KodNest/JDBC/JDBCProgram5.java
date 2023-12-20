package com.KodNest.JDBC;
import java.sql.*;
public class JDBCProgram5 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="Delete from student";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
