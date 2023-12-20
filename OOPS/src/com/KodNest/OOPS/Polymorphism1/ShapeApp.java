package com.KodNest.OOPS.Polymorphism1;

public class ShapeApp 
{
	public static void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.findArea());
	}
	public static void main(String[] args) 
	{
		Square sq=new Square();
		Rectangle rt=new Rectangle();
		Circle cr=new Circle();
		doActivity(sq);
		doActivity(rt);
		doActivity(cr);
	}
}
