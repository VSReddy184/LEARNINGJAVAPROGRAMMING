package com.KodNest.MultiThreading.Calci2;

public class Division implements Runnable
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
			System.out.println("Division Result: "+c);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
