package com.KodNest.ArrayDS;

import java.util.Scanner;

public class Array 
{
	private int[] arr=null;
	private Scanner scan=new Scanner(System.in);
	
	public Array(int n)
	{
		arr=new int[n];
	}
	public void insert()
	{
		System.out.println("Enter the position to insert element from 0 to "+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("Enter the element to insert at position "+pos);
		int elem=scan.nextInt();
		arr[pos]=elem;
	}
	public void delete()
	{
		System.out.println("Enter the position to delete from array");
		int pos=scan.nextInt();
		arr[pos]=0;
	}
	public void display()
	{
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
}
