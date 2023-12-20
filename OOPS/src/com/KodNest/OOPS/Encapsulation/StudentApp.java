package com.KodNest.OOPS.Encapsulation;

import java.util.Scanner;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data of student");
		Student st=new Student();
		//Accessing the private data members INDIRECTLY using setter method
		st.setData(scan.nextInt(),scan.next(),scan.nextInt());
		//Accessing the private data members INDIRECTLY using getter method
		System.out.println(st.getRollNo());
		System.out.println(st.getName());
		System.out.println(st.getAge());
	}
}
