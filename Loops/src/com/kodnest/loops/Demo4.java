package com.kodnest.loops;

public class Demo4 
{
	public static void main(String[] args) 
	{
		System.out.println("start");
		int i=1;
		venky:while(i<=5)
		{
			int j=1;
			viswa:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break venky;
			}
			System.out.println();
			i++;
		}
	}
}
