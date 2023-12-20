package com.KodNest.MultiThreading.Calci2;

public class Subtract implements Runnable
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
			System.out.println("Subtraction Result: "+c);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
