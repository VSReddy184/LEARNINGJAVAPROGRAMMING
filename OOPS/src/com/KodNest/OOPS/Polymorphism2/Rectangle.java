package com.KodNest.OOPS.Polymorphism2;

public class Rectangle extends Shape
{
	double l=7.5;
	double b=5.5;
	double findArea()
	{
		System.out.print("Area of Rectangle: ");
		return l*b;
	}
	double findRectanglePerimeter()
	{
		System.out.print("Perimeter of Rectangle: ");
		return 2*(l+b);
	}
	
}
