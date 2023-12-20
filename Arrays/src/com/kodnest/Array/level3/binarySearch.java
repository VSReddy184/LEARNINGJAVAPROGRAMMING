package com.kodnest.Array.level3;

import java.util.Scanner;

public class binarySearch 
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
		System.out.println("Enter the key to search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		//boolean flag=false;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("KEY FOUND at "+mid);
				//flag=true;
				//break;
				return;
			}
			else if(key<arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		//if(flag==false)
		System.out.println("KEY NOT FOUND");
	}
}
