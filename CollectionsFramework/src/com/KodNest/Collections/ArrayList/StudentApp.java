package com.KodNest.Collections.ArrayList;

import java.util.ArrayList;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		//creating the objects of the students class
		Student s1=new Student(101,"Venkey",82.00F);
		Student s2=new Student(102,"Viswa",80.00F);
		Student s3=new Student(103,"Vignath",85.00F);
		
		//creating ArrayList
		ArrayList al=new ArrayList();
		
		//Sorting the student objects in the ArrayList
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		//Printing the ArrayList to display Student object details
		System.out.println(al);
		
//		ArrayList al2=new ArrayList();
//		al2.add(s2.rollNo);
//		al2.add(s2.name);
//		al2.add(s2.percentage);
//		
//		ArrayList al3=new ArrayList();
//		al3.add(s3.rollNo);
//		al3.add(s3.name);
//		al3.add(s3.percentage);
//	
//		System.out.println(al2);
//		System.out.println(al3);
	}
}
