package com.KodNest.OOPS.Encapsulation;

public class Bank 
{
	//Providing the security to the data member
	private int money;
	//Public setter method
	//Cashier who can take money from the customer & deposit in the bank
	public void setMoney(int amount)
	{
		//Taking the amount if only the money is positive 
		if(amount>0)
		{
			money=amount;
		}
		else
		{
			System.out.println("Please enter a positive amount...");
			System.exit(0);
		}
	}
	//Public getter method
	public int getMoney()
	{
		return money;
	}
}
