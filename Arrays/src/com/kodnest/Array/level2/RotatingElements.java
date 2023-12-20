package com.kodnest.Array.level2;

import java.util.Scanner;

public class RotatingElements 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();		
		}
		System.out.print("Original array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Rotatory r=new Rotatory();
		while(true)
		{
			System.out.println();
			System.out.println("Enter your choice");
			System.out.println("Choice-1--->Clockwise Rotation");
			System.out.println("Choice-2--->Anti-Clockwise Rotation");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter no.of rotations");
				int m=scan.nextInt();
				r.clockwiseRotatory(arr, m);
				break;
			case 2:
				System.out.println("Enter no.of rotations");
				int n=scan.nextInt();
				r.anticlockwiseRotatory(arr, n);
				break;
			default:
				System.out.println("Go to Pradeep eye care...");
			}
			return;
		}
	}
}
