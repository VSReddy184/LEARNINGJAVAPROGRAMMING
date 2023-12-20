package com.Sumofdigitscalculator;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		calculateSumOfDigits(n);
	}
	public static void calculateSumOfDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println(sum);
	}
}
