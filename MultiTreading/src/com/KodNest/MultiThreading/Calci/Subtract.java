package com.KodNest.MultiThreading.Calci;

public class Subtract extends Thread
{
	int a;
	int b;
	public Subtract(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		try
		{
		int c=a-b;
		System.out.println("Subtration result: "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}