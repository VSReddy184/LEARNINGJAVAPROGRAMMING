package com.KodNest.JDBC;
import java.sql.*;
public class JDBCProgram6 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="select * from student";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			Statement stmt=con.createStatement();
			System.out.println("Statement is created");
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			System.out.println("Query executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
