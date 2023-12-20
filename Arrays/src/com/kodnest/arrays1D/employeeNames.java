package com.kodnest.arrays1D;

import java.util.Scanner;

public class employeeNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String emp[]=new String[8];
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println("Enter name of employee "+i);
			emp[i]=scan.next();
		}
		scan.close();
		System.out.println("Employee names are...");
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println("Employee" +i+ "name is " +emp[i]+" ");
		}
	}

}
