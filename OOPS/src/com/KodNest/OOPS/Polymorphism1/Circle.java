package com.KodNest.OOPS.Polymorphism1;

public class Circle extends Shape
{
	double rad=5.5;
	void draw()
	{
		System.out.println("Drawing a Circle Shape");
	}
	double findArea()
	{
		System.out.print("Area of Circle: ");
		return Math.PI*rad*rad;
	}
}
