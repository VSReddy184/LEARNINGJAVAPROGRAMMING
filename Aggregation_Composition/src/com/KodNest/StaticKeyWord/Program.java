package com.KodNest.StaticKeyWord;

public class Program 
{
	static
	int a,b;	//static variables or instance variables
	
	static	//static block or instance block
	{
		System.out.println("Inside Static Block");
		a=10;
		b=20;
	}
	static void display1()	//static method or instance method
	{
		System.out.println("Inside Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	int x,y;  //non-static variables or instance variables
	
	{		 //non-static block or instance block
		System.out.println("Inside non-static block");  
		
	}
	void display2()	//non-static method or instance method
	{
		System.out.println("Inside non-static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	Program() //constructor
	{
		System.out.println("Inside Constructor");
		x=70;
		y=80;
	}
	public static void main(String []args)
	{
		Program.display1();
		Program p=new Program();
		p.display2();
	}
}
