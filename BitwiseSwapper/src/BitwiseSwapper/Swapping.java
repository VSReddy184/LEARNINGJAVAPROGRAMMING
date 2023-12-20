package BitwiseSwapper;

import java.util.Scanner;

public class Swapping 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The First Interger: ");
		int num1=scan.nextInt();
		System.out.println("Enter The Second Integer: ");
		int num2=scan.nextInt();
		swapUisngBitwise(num1,num2);
	}
	public static void swapUisngBitwise(int num1,int num2) 
	{
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		System.out.println("First Integer After Swapping = "+num1);
		System.out.println("Second Integer After Swapping = "+num2);
	}
}
