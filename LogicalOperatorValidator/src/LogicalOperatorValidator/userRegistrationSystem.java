package LogicalOperatorValidator;

import java.util.Scanner;

public class userRegistrationSystem 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The true or false");
		boolean isInputValid = scan.nextBoolean();
		boolean meetsCertainCondition = scan.nextBoolean();
		
		boolean result=isValidInput(isInputValid,meetsCertainCondition);
		
		System.out.println("Is Input Valid(True or False): "+isInputValid);
		System.out.println("Does Input Meets a Certain Condition(True or False): "+meetsCertainCondition);
		
		if(result)
		{
			System.out.println("Input Is Valid.");
		}
		else
		{
			System.out.println("Input Is Not Valid.");
		}
	}
	public static boolean isValidInput(boolean isValid,boolean meetsCertainCondition)
	{
		return isValid && meetsCertainCondition;
	}
}
