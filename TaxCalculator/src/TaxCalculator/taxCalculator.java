package TaxCalculator;

import java.util.Scanner;

public class taxCalculator 
{

	public static double calculateTotalWithTax(double purchaseAmount,double taxRate) 
	{
		double taxAmount=purchaseAmount*taxRate;
		double totalCost=purchaseAmount+taxAmount;
		return totalCost;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount=scan.nextDouble();
		
		System.out.println("Enter the tax rate(In decimal form): ");
		double taxRate=scan.nextDouble();
		
		double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);

        System.out.println("Total cost including tax: " + totalCost);
	}

}
