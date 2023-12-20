package com.KodNest.ExceptionHandling;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{	
		System.out.println("Calculation is Started");
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=scan.nextInt();
		System.out.println("Enter Second number");
		int b=scan.nextInt();
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		divide(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in main method");
		}
		System.out.println("Calculation is Ended");
	}
	public static void add(int a,int b) throws Exception
	{
		int c=a+b;
		System.out.println("Addition Result: "+c);
	}
	public static void subtract(int a,int b)
	{	
		try
		{
			int c=a-b;
			System.out.println("Subtraction Result: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in subtract method");
		}
	}
	public static void multiply(int a,int b)
	{
		try
		{
			int c=a*b;
			System.out.println("Multiplication Result: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in multiply method");
		}
	}
	public static void divide(int a,int b)
	{
		try
		{
			int c=a/b;
			System.out.println("Division Result: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in division method");
			throw e;
		}
	}
}
