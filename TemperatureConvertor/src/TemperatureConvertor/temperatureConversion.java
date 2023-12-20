package TemperatureConvertor;

import java.util.Scanner;

public class temperatureConversion 
{

	   public static double celsiusToFahrenheit(double celsius) 
	   {
	       return (celsius * 9 / 5) + 32;
	   }

	    public static double fahrenheitToCelsius(double fahrenheit) 
	    {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Welcome to the Temperature Conversion Tool!");
	        
	        System.out.println("Select an option: ");
	        System.out.println("1. Convert Celsius to Fahrenheit");
	        System.out.println("2. Convert Fahrenheit to Celsius");

	        System.out.print("Enter your choice: ");
	        int choice = scan.nextInt();

	        if (choice == 1) 
	        {
	            System.out.println("Enter the temperature in Celsius: ");
	            double celsius = scan.nextDouble();
	            double fahrenheit = celsiusToFahrenheit(celsius);
	            System.out.println(celsius+"°C is equivalent to "+fahrenheit+"°F");
	        } 
	        else if (choice == 2) 
	        {
	            System.out.println("Enter the temperature in Fahrenheit: ");
	            double fahrenheit = scan.nextDouble();
	            double celsius = fahrenheitToCelsius(fahrenheit);
	            System.out.println(fahrenheit+"°F is equivalent to "+celsius+"°C");
	        } 
	        else 
	        {
	            System.out.println("Invalid choice. Please select 1 or 2.");
	        }

	  }


}
