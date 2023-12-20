package com.KodNest.OOPS.Polymorphism2;

public class ShapeApp 
{
	public static void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.findArea());
		if(sh instanceof Square)
		{
			System.out.println(((Square)(sh)).findSqarePerimeter());
		}
		else if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).findCirclePerimeter());
		}
		else
		{
			System.out.println(((Rectangle)(sh)).findRectanglePerimeter());
		}
	}
	public static void main(String[] args) 
	{
		Square sq=new Square();
		Circle cr=new Circle();
		Rectangle rt=new Rectangle();
		doActivity(sq);
		doActivity(cr);
		doActivity(rt);
	}
}
