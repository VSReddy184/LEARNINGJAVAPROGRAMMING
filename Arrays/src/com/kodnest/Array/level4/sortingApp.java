package com.kodnest.Array.level4;

import java.util.Scanner;

public class sortingApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of array");
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
		InsertionSort sort=new InsertionSort();
		sort.insertionSort(arr);
		System.out.println();
		System.out.print("Array elements after sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
