package com.KodNest.QueueDS;

import java.util.Scanner;

public class QueueApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you wish create a queue? say true or false");
		boolean choice=scan.nextBoolean();
		if(choice==true)
		{
			System.out.println("Enter the length of Queue");
			int n=scan.nextInt();
			Queue q=new Queue(n);
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
					System.out.println("Enter an element to push");
					int elem=scan.nextInt();
					q.push(elem);
					break;
				case 2:
					q.pop();
					break;
				case 3:
					q.display();
					break;
				default:
					System.out.println("TATA BYE BYE...!");
				}
			}
		}
	}
}
