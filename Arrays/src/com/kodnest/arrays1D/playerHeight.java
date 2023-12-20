package com.kodnest.arrays1D;

import java.util.Scanner;

public class playerHeight 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double ht[]=new double[10];
		for(int i=0;i<=ht.length-1;i++)
		{
			System.out.println("Enter player height");
			ht[i]=scan.nextDouble();
		}
		scan.close();
		System.out.println("Player heights contents are...");
		for(int i=0;i<=ht.length-1;i++)
		{
			System.out.println("Player "+i+" height is "+ht[i]+" ");
		}
	}
}
