package com.KodNest.JDBC.UserInputs;
import java.sql.*;
import java.util.*;
public class EmpJDBC1 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			Statement stmt=con.createStatement();
			Scanner scan=new Scanner(System.in);
			while(true)
			{
				System.out.println("Press-1 to insert");
				System.out.println("Press-2 to update");
				System.out.println("Press-3 to delete");
				System.out.println("Press-4 to fetchData");
				int choice=scan.nextInt();
				switch(choice)
				{
				case 1:
					insert(stmt);
					break;
				case 2:
					update(stmt);
					break;
				case 3:
					delete(stmt);
					break;
				case 4:
					fetchData(stmt);
					break;
				default:
					System.out.println("Go to Vasan eye care");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void insert(Statement stmt) throws Exception
	{
		String query="insert into Employee values(1,'Venky',45000.65),(2,'Viswa',40000.65),"
				+ "(3,'Valu',65000.56),(4,'Vina',75000.76)";
		stmt.execute(query);
		System.out.println("Query is executed");
		fetchData(stmt);
	}
	public static void update(Statement stmt)throws Exception
	{
		String query="update Employee set Emp_salary=60000.80 where Emp_id=1";
		stmt.executeUpdate(query);
		System.out.println("Query is executed");
		fetchData(stmt);
	}
	public static void delete(Statement stmt)throws Exception
	{
		String query="delete from Employee where Emp_Name='Venky'";
		stmt.executeUpdate(query);
		System.out.println("Query is executed");
		fetchData(stmt);
	}
	public static void fetchData(Statement stmt)throws Exception
	{
		String query ="select * from Employee";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getDouble(3));
		}
		System.out.println("Query is executed");
	}
}
