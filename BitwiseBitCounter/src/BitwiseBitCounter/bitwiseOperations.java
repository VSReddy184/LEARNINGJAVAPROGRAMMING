package BitwiseBitCounter;

import java.util.Scanner;

public class bitwiseOperations 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num=scan.nextInt();
		
		int count=countSetBits(num);
		System.out.println("Number Of Set Bits: "+count);
	}
	public static int countSetBits(int num) 
	{
		int count = 0;
		while(num>0)
		{
			count += num & 1;
			num>>=1;
		}
		return count;
	}
	
}
