package com.KodNest.JDBC.UserInputs;

import java.sql.*;
import java.util.*;
public class JDBCProgram7 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="Insert into Employee values(?,?,?)"; //PlaceHolders
		try
		{
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the employee id");
			int Emp_id=scan.nextInt();
			System.out.println("Enter the employee name");
			String Emp_name=scan.next();
			System.out.println("Enter the employee salary");
			double Emp_salary=scan.nextDouble();
			pstmt.setInt(1, Emp_id);
			pstmt.setString(2, Emp_name);
			pstmt.setDouble(3, Emp_salary);
			pstmt.execute();
			System.out.println("Rows are inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
