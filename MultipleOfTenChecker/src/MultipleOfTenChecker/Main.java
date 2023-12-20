package MultipleOfTenChecker;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		checkMultipleOfTen(n);
	}
	public static void checkMultipleOfTen(int n) 
	{
		if(n%10==0)
		{
			System.out.println("The number is multiple of 10");
		}
		else
		{
			System.out.println("The number is not multiple of 10");
		}
	}
}