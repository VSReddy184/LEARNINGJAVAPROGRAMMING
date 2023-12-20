package com.KodNest.OOPS.Polymorphism2;

public class Square extends Shape
{
	double s=5.5;
	double findArea()
	{
		System.out.print("Area of Square: ");
		return s*s;
	}
	double findSqarePerimeter()
	{
		System.out.print("Perimeter of Square: ");
		return 4*s;
	}
}
