package GreatestCommonDivisor;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		findGCD(num1, num2);
	}
	public static void findGCD(int a, int b)
	{
		while(b!=0)
		{
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println("GCD="+a);
	}
}
