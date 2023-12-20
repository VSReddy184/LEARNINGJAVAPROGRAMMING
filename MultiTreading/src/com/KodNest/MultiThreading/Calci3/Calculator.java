package com.KodNest.MultiThreading.Calci3;

public class Calculator implements Runnable
{
	int a;
	int b;
	public Calculator(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	public void run() 
	{
		if(Thread.currentThread().getName().equals("Addition"))
		{
			addition();
		}
		else if(Thread.currentThread().getName().equals("Subtract"))
		{
			subtract();
		}
		else if(Thread.currentThread().getName().equals("Multiply"))
		{
			multiply();
		}
		else
		{
			division();
		}
	}
	public void addition()
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
	public void subtract()
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
	public void multiply()
	{
		try
		{
			int c=a*b;
			System.out.println("Multiplication Result: "+c);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void division()
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
