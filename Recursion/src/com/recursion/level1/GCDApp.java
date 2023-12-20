package com.recursion.level1;

import java.util.Scanner;

public class GCDApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD gcd=new GCD();
		int res=gcd.gcd(m, n);
		System.out.println(res);
		System.out.println(m%n);
	}
}
