package DiscountAplicability;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
	}
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount Aplicable");
		}
		else
		{
			System.out.println("Discount Not Aplicable");
		}
	}
}
