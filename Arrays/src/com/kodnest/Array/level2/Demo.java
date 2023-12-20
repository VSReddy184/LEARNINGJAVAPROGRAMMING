package com.kodnest.Array.level2;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];

		for(int i=0;i<=arr.length-1;i++)
		{ 
			arr[i]=scan.nextInt();
		}
		
		int arr2[]=new int[arr.length];

		for(int i=0;i<=arr.length-1;i++)
		{

			arr2[i]=arr[arr.length-1-i];
		}
		printArray.printArray(arr);
	}

}
