package com.KodNest.JDBC.UserInputs;
import java.sql.*;
import java.util.*;
public class JDBCUserInput 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc2";
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
						System.out.println("Wrong Option");
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
		String query=null;
		PreparedStatement pstmt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Select the table to insert values");
		System.out.println("Press-1 to insert values into Employee table");
		System.out.println("Press-2 to insert values into Farmer table");
		System.out.println("Press-3 to insert values into Student table");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1: //Employee table
			System.out.println("Enter the Query to insert");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter the employee id");
			int Emp_id=scan.nextInt();
			System.out.println("Enter the employee name");
			String Emp_name=scan.next();
			System.out.println("Enter the employee salary");
			double Emp_salary=scan.nextDouble();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Emp_id);
			pstmt.setString(2, Emp_name);
			pstmt.setDouble(3, Emp_salary);
			pstmt.execute();
			System.out.println("Rows are inserted");
			break;
		case 2: //Farmer table
			System.out.println("Enter the Query to insert");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter the farmer id");
			int Farmer_id=scan.nextInt();
			System.out.println("Enter the farmer name");
			String Farmer_name=scan.next();
			System.out.println("Enter the crop");
			String crop=scan.next();
			System.out.println("Enter the Fertilzers");
			String Fertilzers=scan.next();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Farmer_id);
			pstmt.setString(2, Farmer_name);
			pstmt.setString(3, crop);
			pstmt.setString(4,Fertilzers);
			pstmt.execute();
			System.out.println("Rows are inserted");
			break;
		case 3: //Student table
			System.out.println("Enter the Query to insert");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter the student id");
			int Stud_id=scan.nextInt();
			System.out.println("Enter the Stundet name");
			String Stud_name=scan.next();
			System.out.println("Enter the Student age");
			int Stud_age=scan.nextInt();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Stud_id);
			pstmt.setString(2, Stud_name);
			pstmt.setInt(3, Stud_age);
			pstmt.execute();
			System.out.println("Rows are inserted");
			break;
		default:
			System.out.println("Not Allowed- Go to Pradeep Eyecare");
		}
		
	}
	public static void update(Connection con)throws Exception
	{
		String query=null;
		PreparedStatement pstmt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Select the table to insert values");
		System.out.println("Press-1 to Update values in the Employee table");
		System.out.println("Press-2 to Update values in the Farmer table");
		System.out.println("Press-3 to Update values in the Student table");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter the Query to update Emp_name and Emp_id");
				scan.nextLine();
				query=scan.nextLine();
				System.out.println("Enter the employee name");
				String Emp_name=scan.next();
				System.out.println("Enter the employee id");
				int Emp_id=scan.nextInt();
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, Emp_name);
				pstmt.setInt(2, Emp_id);
				pstmt.executeUpdate();
				System.out.println("Rows are Updated");
				break;
			case 2:
				System.out.println("Enter the Query to update Crop and Farmer_id");
				scan.nextLine();
				query=scan.nextLine();
				System.out.println("Enter the crop name");
				String Crop=scan.next();
				System.out.println("Enter the Farmer id");
				int Farmer_id=scan.nextInt();
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, Crop);
				pstmt.setInt(2, Farmer_id);
				pstmt.executeUpdate();
				System.out.println("Rows are Updated");
				break;
			case 3:
				System.out.println("Enter the Query to update Stud_age and Stud_id");
				scan.nextLine();
				query=scan.nextLine();
				System.out.println("Enter the Student age");
				int Stud_age=scan.nextInt();
				System.out.println("Enter the Student id");
				int Stud_id=scan.nextInt();
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1, Stud_age);
				pstmt.setInt(2, Stud_id);
				pstmt.executeUpdate();
				System.out.println("Rows are Updated");
				break;
			default:
				System.out.println("Not Allowed- Go to Pradeep Eyecare");
		}
	}
	public static void delete(Connection con)throws Exception
	{
		String query=null;
		PreparedStatement pstmt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Select the table to insert values");
		System.out.println("Press-1 to delete values in the Employee table");
		System.out.println("Press-2 to delete values in the Farmer table");
		System.out.println("Press-3 to delete values in the Student table");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Query to delete as Employee id");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter employee id");
			int Emp_id=scan.nextInt();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Emp_id);
			pstmt.executeUpdate();
			System.out.println("Query is executed");
			break;
		case 2:
			System.out.println("Enter the Query to delete as Farmer id");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter Farmer id");
			int Farmer_id=scan.nextInt();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,Farmer_id);
			pstmt.executeUpdate();
			System.out.println("Query is executed");
			break;
		case 3:
			System.out.println("Enter the Query to delete as Student id");
			scan.nextLine();
			query=scan.nextLine();
			System.out.println("Enter employee id");
			int Stud_id=scan.nextInt();
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Stud_id);
			pstmt.executeUpdate();
			System.out.println("Query is executed");
			break;
		default:
			System.out.println("Not Allowed- Go to Pradeep Eyecare");
		}
	}
	public static void fetchData(Connection con)throws Exception
	{
		String query=null;
		PreparedStatement pstmt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Select the table to fetch data");
		System.out.println("Press-1 to fetch data in the Employee table");
		System.out.println("Press-2 to fetch data in the Farmer table");
		System.out.println("Press-3 to fetch data in the Student table");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the query to fetch data from Employee table");
			scan.nextLine();
			query =scan.nextLine();
			pstmt=con.prepareStatement(query);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
			System.out.println("Query is executed");
			break;
		case 2:
			System.out.println("Enter the query to fetch data from farmer table");
			scan.nextLine();
			query =scan.nextLine();
			pstmt=con.prepareStatement(query);
			ResultSet rs2=pstmt.executeQuery();
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getDouble(3));
			}
			System.out.println("Query is executed");
			break;
		case 3:
			System.out.println("Enter the query to fetch data from student table");
			scan.nextLine();
			query =scan.nextLine();
			pstmt=con.prepareStatement(query);
			ResultSet rs3=pstmt.executeQuery();
			while(rs3.next())
			{
				System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getDouble(3));
			}
			System.out.println("Query is executed");
			break;
		default:
			System.out.println("Not Allowed- Go to Pradeep Eyecare");
		}
	}
}
