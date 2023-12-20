package com.kodnest.loops;

public class Demo5 
{
	public static void main(String[] args) 
	{
		int n=1;
		venky:do 
		{
			int m=1;
			viswa:do
			{
				System.out.println("* ");
				m++;
				break venky;
			}while(m<=1);
		}while(n<=1);
		n++;
		System.out.println();
	}

}
