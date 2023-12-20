package com.KodNest.OOPS.Polymorphism2;

public class Circle extends Shape
{
	double rad=5.5;
	double findArea()
	{
		System.out.print("Area of Circle: ");
		return Math.PI*rad*rad;
	}
	double findCirclePerimeter()
	{
		System.out.print("Perimeter of Circle: ");
		return 2*Math.PI*rad;
	}
}
