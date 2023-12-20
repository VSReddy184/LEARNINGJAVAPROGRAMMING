package com.kodnest.javaPatterns.level3;

public class Pattern30 
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==n-i || i==j && j<=n)
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
