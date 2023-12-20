package com.KodNest.MutliThreading;

public class ProgramApp 
{
	public static void main(String[] args) 
	{
		//creating the object of Program class
		Program p1=new Program();
		
		//creating the Thread objects
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p1);
		t1.setName("Number");
		t2.setName("Char");
		t1.start();
		t2.start();
	}
}
