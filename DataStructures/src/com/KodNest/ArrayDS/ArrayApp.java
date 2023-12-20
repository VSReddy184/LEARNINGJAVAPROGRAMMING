package com.KodNest.ArrayDS;

import java.util.Scanner;

public class ArrayApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you wish to create an array say true or false");
		boolean choice=scan.nextBoolean();
		if(choice==true)
		{
			System.out.println("Enter the Array length");
			int n=scan.nextInt();
			Array arr=new Array(n);
			while(true)
			{
				System.out.println("Press-1 for INSERT");
				System.out.println("Press-2 for DELETE");
				System.out.println("Press-3 for DISPLAY");
				System.out.println("Press any for STOP");
				int ch=scan.nextInt();
				switch(ch)
				{
				case 1:
					arr.insert();
					break;
				case 2:
					arr.delete();
					break;
				case 3:
					arr.display();
					break;
				default:
					System.out.println("TATA BYE BYE...!");
					return;
						
				}
			}
		}
	}
}
