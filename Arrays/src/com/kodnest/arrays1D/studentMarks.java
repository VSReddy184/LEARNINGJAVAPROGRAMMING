package com.kodnest.arrays1D;

import java.util.Scanner;

public class studentMarks {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int marks[]=new int [5];
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.println("Enter marks of student "+i);
			marks[i]=scan.nextInt();
		}
		System.out.println("Students marks are...");
		System.out.print("Student marks --> | ");
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.print(marks[i]+" | ");
		}
		scan.close();
	}
}
