package NumberTablePrinter;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		printTable(num);
	}
	public static void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}

	}
}
