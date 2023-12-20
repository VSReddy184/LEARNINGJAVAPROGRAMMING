package com.kodnest.arrays2D;

import java.util.Scanner;

public class CopyingArrays 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2D-array lengths");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		int arr2[][]=new int[m][n];
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr2[i][j]=arr1[i][j];
			}
		}
		System.out.print("Array-1 elements: ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
		}
		System.out.println();
		System.out.print("Array-2 elements: ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
		}
	}
}
