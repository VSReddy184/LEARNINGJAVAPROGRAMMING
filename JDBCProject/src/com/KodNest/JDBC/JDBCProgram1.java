package com.KodNest.JDBC;
//1.import java.sql package
import java.sql.*;
public class JDBCProgram1 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		try
		{
			//2.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successufully");
			//3.Establish the connection
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
