package com.kodnest.javaPatterns.level2;

public class Pattern24 
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=5;j++) 
		{
			for(int i=1;i<=5;i++)
			{
				if(j==1 || j==5 || i==1 || i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
