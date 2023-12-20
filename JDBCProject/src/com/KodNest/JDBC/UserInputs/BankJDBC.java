package com.KodNest.JDBC.UserInputs;
import java.sql.*;
import java.util.*;
public class BankJDBC 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="VSReddy@184";
		Connection con=null;
		String query1="update Bank set Amount=Amount-? where Acc_no=1111";
		String query2="update Bank122 set Amount=Amount+? where Acc_no=3333";
		try
		{
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			con.setAutoCommit(false);
			PreparedStatement pstmt1=con.prepareStatement(query1);
			PreparedStatement pstmt2=con.prepareStatement(query2);
			System.out.println("Statament is prepared");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Amount to transfer");
			int amount=scan.nextInt();
			pstmt1.setInt(1,amount);
			pstmt2.setInt(1, amount);
			pstmt1.executeUpdate();
			System.out.println("Amount is debited from Acc_no:1111");
			pstmt2.executeUpdate();
			System.out.println("Amount is debited from Acc_no:3333");
			con.commit();
		}
		catch(Exception e)
		{
			try 
			{
				con.rollback();
				System.out.println("Changes are rolled back");
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
