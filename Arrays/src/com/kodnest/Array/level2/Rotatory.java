package com.kodnest.Array.level2;

public class Rotatory 
{
	public void clockwiseRotatory(int arr[],int m) 
	{
		//Clockwise
		for(int j=1;j<=m;j++)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		System.out.print("Rotated array clockwise: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void anticlockwiseRotatory(int arr[],int n)
	{
		//Anti-clockwise
		for(int j=1;j<=n;j++)
		{
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		System.out.print("Rotated array Anti-Clockwise: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
}
