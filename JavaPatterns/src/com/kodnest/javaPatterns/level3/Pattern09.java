package com.kodnest.javaPatterns.level3;

public class Pattern09 
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || i==n || j==0 || j==n)
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
