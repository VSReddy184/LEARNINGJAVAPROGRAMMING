package com.KodNest.MultiThreading.Calci3;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers to calculator");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Calculator cr=new Calculator(a,b);
		Thread t1=new Thread(cr);
		Thread t2=new Thread(cr);
		Thread t3=new Thread(cr);
		Thread t4=new Thread(cr);
		t1.setName("Addition");
		t2.setName("Subtract");
		t3.setName("Multiply");
		t4.setName("Divide");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
