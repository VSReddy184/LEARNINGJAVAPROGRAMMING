package com.KodNest.JDBC.UserInputs;
import java.sql.*;
import java.util.*;
public class HospiJDBC 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		String query="insert into Hospital values(?,?,?)";
		try
		{
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter no.of rows to insert");
			int rows=scan.nextInt();
			for(int i=1;i<=rows;i++)
			{
				System.out.println("Enter the patient id");
				int P_id=scan.nextInt();
				System.out.println("Enter the patient name");
				String P_name=scan.next();
				System.out.println("Enter the patient age");
				int P_Age=scan.nextInt();
				pstmt.setInt(1, P_Age);
				pstmt.setString(2, P_name);
				pstmt.setInt(3,P_Age);
				pstmt.execute();
				System.out.println();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
