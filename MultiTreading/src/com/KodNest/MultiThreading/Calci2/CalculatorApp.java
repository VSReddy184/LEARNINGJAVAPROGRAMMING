package com.KodNest.MultiThreading.Calci2;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to calculate");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Addition add=new Addition(a,b);
		Subtract sub=new Subtract(a,b);
		Multiply mul=new Multiply(a,b);
		Division div=new Division(a,b);
		Thread t1=new Thread(add);
		Thread t2=new Thread(sub);
		Thread t3=new Thread(mul);
		Thread t4=new Thread(div);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
