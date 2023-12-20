package com.KodNest.OOPS.Encapsulation;

public class Student 
{
	//Private data members
	private int rollNo;
	private String name;
	private int age;
	//Public setter method
	public void setData(int x,String y,int z)
	{
		rollNo = x;
		name = y;
		age = z;
	}
	//Public getter method
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
