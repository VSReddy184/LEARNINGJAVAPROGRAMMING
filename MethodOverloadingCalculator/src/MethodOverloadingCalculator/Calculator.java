package MethodOverloadingCalculator;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int num1=scan.nextInt();
		System.out.println("Enter The Second Number: ");
		int num2=scan.nextInt();
		System.out.println("Enter the operator(+,-,*,/): ");
		char operator=scan.next().charAt(0);
		
		int result=0;
		
		switch(operator)
		{
		case '+':
			result=calculate(num1,num2);
			break;
		case '-':
			result=calculate(num1,operator,num2);
			break;
		case '*':
			result=calculate(operator,num1,num2);
			break;
		case '/':
			result=calculate(num1,num2,operator);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	System.out.println("Result: "+result);
	}
	public static int calculate(int num1,int num2)
	{
		return num1+num2;
	
	}
	public static int calculate(int num1,char operator,int num2)
	{
		return num1-num2;
	
	}
	public static int calculate(char operator,int num1,int num2)
	{
		return num1*num2;
	
	}
	public static int calculate(int num1,int num2,char operator)
	{
		return num1/num2;
	
	}
	
}
