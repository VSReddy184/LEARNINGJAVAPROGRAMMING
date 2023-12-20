package com.kodnest.Array.level2;

public class printArray 
{
	public static void printArray(int arr[]) 
	{
		
		System.out.print("Forward: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
