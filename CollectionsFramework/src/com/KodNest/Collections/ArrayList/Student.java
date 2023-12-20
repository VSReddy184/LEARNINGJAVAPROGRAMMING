package com.KodNest.Collections.ArrayList;

public class Student 
{
	int rollNo;
	String name;
	float percentage;
	public Student(int rollNo,String name,float percentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}
	@Override
	public String toString() 
	{
		return rollNo+" "+name+" "+percentage;
	}
}
