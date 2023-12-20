package com.KodNest.JDBC;

//importing java.sql package
import java.sql.*;
public class JDBCProgram2 
{
	public static void main(String[] args) 
	{
		//url, username and password for connecting with DB
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		//query to be executed
		String query="Create table student(Roll_no int,Name varchar(30),Email_id varchar(50))";
		try
		{
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			//Establish the connection
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			//Creating the statement
			Statement stmt=con.createStatement();
			//Executing the query
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
