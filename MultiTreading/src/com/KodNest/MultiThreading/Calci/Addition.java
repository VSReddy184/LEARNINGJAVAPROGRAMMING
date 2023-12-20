package com.KodNest.MultiThreading.Calci;

public class Addition extends Thread
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
		System.out.println("Addition result: "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
