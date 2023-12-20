package CalculatorDilemma;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
        int num1 =scan.nextInt();
        int num2 =scan.nextInt();
        Calculator.performOperation(num1,num2);
	}
	
	public static void performOperation(int num1,int num2) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter operator");
		int result = scan.next().charAt(0);
		switch(result)
		{
		case '+' :
			result = num1+num2;
			System.out.println("Result = "+result);
			break;
		case '-' :
			result = num1-num2;
			System.out.println("Result = "+result);
			break;
		case '*' :
			result = num1*num2;
			System.out.println("Result = "+result);
			break;
		case '/' :
			result = num1/num2;
			System.out.println("Result = "+result);
			break;
		case '%' :
			result = num1%num2;
			System.out.println("Result = "+result);
			break;
		default:
			System.out.println("ERROR");
		}
	}
	

}
