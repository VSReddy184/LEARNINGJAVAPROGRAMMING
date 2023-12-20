package com.KodNest.OOPS.Polymorphism1;

public class Rectangle extends Shape
{
	double l=6.5;
	double b=4.5;
	void draw()
	{
		System.out.println("Drawing a Rectangle Shape");
	}
	double findArea()
	{
		System.out.print("Area of Rectangle: ");
		return l*b;
	}
}
