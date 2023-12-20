package com.KodNest.MultiThreading.Calci;

public class Division extends Thread
{
	int a;
	int b;
	public Division(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		try
		{
		int c=a/b;
		System.out.println("Division result: "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
