package com.KodNest.JDBC.UserInputs;
import java.sql.*;
import java.util.*;
public class EmpJDBC2 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		try
		{
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
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
						insert(con);
						break;
					case 2:
						update(con);
						break;
					case 3:
						delete(con);
						break;
					case 4:
						fetchData(con);
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
	public static void insert(Connection con) throws Exception
	{
		String query="insert into Employee values (?,?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int Emp_id=scan.nextInt();
		System.out.println("Enter the employee name");
		String Emp_name=scan.next();
		System.out.println("Enter the employee salary");
		double Emp_salary=scan.nextDouble();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, Emp_id);
		pstmt.setString(2, Emp_name);
		pstmt.setDouble(3, Emp_salary);
		pstmt.execute();
		System.out.println("Rows are inserted");
		fetchData(con);
	}
	public static void update(Connection con)throws Exception
	{
		String query="update Employee set Emp_salary=? where Emp_id=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee salary");
		double Emp_salary=scan.nextDouble();
		System.out.println("Enter employee id");
		int Emp_id=scan.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setDouble(1, Emp_salary);
		pstmt.setInt(2, Emp_id);
		pstmt.executeUpdate();
		System.out.println("Query is executed");
		fetchData(con);
	}
	public static void delete(Connection con)throws Exception
	{
		String query="delete from Employee where Emp_Name=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee name");
		String Emp_name=scan.next();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, Emp_name);
		pstmt.executeUpdate();
		System.out.println("Query is executed");
		fetchData(con);
	}
	public static void fetchData(Connection con)throws Exception
	{
		String query ="select * from Employee where Emp_id=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int Emp_id=scan.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, Emp_id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		System.out.println("Query is executed");
	}
}

