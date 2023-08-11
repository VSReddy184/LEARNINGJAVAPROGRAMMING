package TemperatureConverter;

import java.util.Scanner;

public class temperatureConverterApp 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Temperature In Fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double celsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
	}

}
