package com.KodNest.OOPS.Encapsulation;

import java.util.Scanner;

public class EmployeeApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data employee-1");
		Employee emp1=new Employee(scan.nextInt(),scan.next(),scan.nextFloat());
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());;
		System.out.println(emp1.getSalary());
		System.out.println("Enter the data employee-2");
		Employee emp2=new Employee(scan.nextInt(),scan.next(),scan.nextFloat());
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getName());;
		System.out.println(emp2.getSalary());
	}
}
