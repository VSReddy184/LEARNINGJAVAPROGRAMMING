package com.KodNest.Compositon;

public class Book 
{
	String auther;
	Page p=new Page("Java");
	Book(String auther)
	{
		this.auther=auther;
	}
	void readBook()
	{
		System.out.println("Reading book by auther "+auther);
	}
}
