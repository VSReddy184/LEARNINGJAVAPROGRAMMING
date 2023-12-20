package com.kodnest.javaPatterns.level3;

public class Pattern27 
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0 || j==i*2)
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
