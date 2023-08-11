package DoubleTrouble;

import java.util.Scanner;

public class doubleTrouble 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
				
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}
}
