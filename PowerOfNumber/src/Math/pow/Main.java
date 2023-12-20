package Math.pow;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("Enter the power to which it should be raised");
		int n=scan.nextInt();
		int res=(int) math.pow(num, n);
		System.out.println("Result = "+res);
	}

}
