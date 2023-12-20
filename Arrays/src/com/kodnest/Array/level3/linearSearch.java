package com.kodnest.Array.level3;

import java.util.Scanner;

public class linearSearch 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key=scan.nextInt();	
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key found at "+i);
				//System.exit(0);
				//return;
				flag=true;
			}
		}
		if(flag==false)
		System.out.println("Key not found...");
	}
}
