package com.KodNest.MultiThreading.Calci2;

public class Addition implements Runnable
{
	int a;
	int b;
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run() 
	{
		try
		{
			int c=a+b;
			System.out.println("Addition Result: "+c);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
