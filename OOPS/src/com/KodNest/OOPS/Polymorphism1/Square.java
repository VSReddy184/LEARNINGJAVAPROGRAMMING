package com.KodNest.OOPS.Polymorphism1;

public class Square extends Shape
{
	double s=5.5;
	void draw()
	{
		System.out.println("Drawing a Square Shape");
	}
	double findArea()
	{
		System.out.print("Area of Square: ");
		return s*s;
	}
}
