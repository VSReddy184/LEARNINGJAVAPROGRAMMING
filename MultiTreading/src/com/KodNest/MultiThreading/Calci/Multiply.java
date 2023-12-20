package com.KodNest.MultiThreading.Calci;

public class Multiply extends Thread
{
	int a;
	int b;
	public Multiply(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		try
		{
		int c=a*b;
		System.out.println("Multiplication result: "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}