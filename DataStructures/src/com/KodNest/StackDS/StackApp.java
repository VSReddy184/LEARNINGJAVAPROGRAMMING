package com.KodNest.StackDS;

import java.util.Scanner;

public class StackApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you wish to create a stack? say true or false");
		boolean choice=scan.nextBoolean();
		if(choice==true)
		{
			System.out.println("Enter the length of stack");
			int n=scan.nextInt();
			Stack s=new Stack(n);
			while(true)
			{
				System.out.println("Press-1 for PUSH");
				System.out.println("Press-2 for POP");
				System.out.println("Press-3 for DISPLAY");
				System.out.println("Press any other for STOP");
				int ch=scan.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter element for push");
					int elem=scan.nextInt();
					s.push(elem);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				default:
					System.out.println("TATA BYE BYE...!");
					return;
				}
			}
		}
	}
}
