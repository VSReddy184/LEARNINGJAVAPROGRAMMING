package com.kodnest.Array.level2;

import java.util.Scanner;

public class Odd 
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
		System.out.println("Odd numbers in array are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

}
