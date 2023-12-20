package P4;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Power4 p1=new Power4();
		int digits=p1.countDigits(n);
		int res=p1.raiseToPowerN(n, digits);
		System.out.println("Result when "+n+" raised to power "+digits+" is "+res);
	}
}
