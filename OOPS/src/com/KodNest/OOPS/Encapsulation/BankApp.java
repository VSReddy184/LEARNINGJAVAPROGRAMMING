package com.KodNest.OOPS.Encapsulation;

import java.util.Scanner;

public class BankApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the money to take");
		Bank b=new Bank();
		//Indirectly accessing the private data member
		b.setMoney(scan.nextInt());
		System.out.println("Taking the money "+b.getMoney());
	}
}
