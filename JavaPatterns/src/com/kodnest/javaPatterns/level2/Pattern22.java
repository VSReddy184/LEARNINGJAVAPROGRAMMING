package com.kodnest.javaPatterns.level2;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=5;j++)
		{
			for(int i=5;i>=j;i--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=j;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j=2;j<=5;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=j;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}