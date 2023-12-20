package com.KodNest.MultiThreading.Calci;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers to calculate");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Addition add=new Addition(a,b);
		Subtract sub=new Subtract(a,b);
		Multiply mul=new Multiply(a,b);
		Division div=new Division(a,b);
		add.start();
		sub.start();
		mul.start();
		div.start();
	}
}
