package com.kodnest.arrays1D;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int []arr=new int[3];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("Array contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
