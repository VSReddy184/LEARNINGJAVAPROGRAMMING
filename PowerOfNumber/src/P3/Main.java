package P3;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Counting theCounting=new Counting();
		int digits=theCounting.countDigits(n);
		System.out.println("Number of digits in "+n+" are "+digits);
	}
}
