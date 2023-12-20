package com.KodNest.MutliThreading;

public class Program implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("Number"))
		{
			numPrinting();
		}
		else
		{
			charPrinting();
		}
	}
	public void numPrinting()
	{
		System.out.println("Number Printing Started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing Ended");
	}
	public void charPrinting()
	{
		System.out.println("Character Printing Started");
		for(char i='A';i<='E';i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Character Printing Ended");
	}
}
