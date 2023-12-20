package com.kodnest.Array.level4;

import java.util.Scanner;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Array elements before sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.print("Array elements after sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
