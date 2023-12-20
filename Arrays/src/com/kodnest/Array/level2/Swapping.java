package com.kodnest.Array.level2;

import java.util.Scanner;

public class Swapping 
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
		System.out.print("Before Swapping");
		System.out.print("--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		arr[1]=arr[1]+arr[2];
		arr[2]=arr[1]-arr[2];
		arr[1]=arr[1]-arr[2];
		
		System.out.print("After Swapping");
		System.out.print("--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
