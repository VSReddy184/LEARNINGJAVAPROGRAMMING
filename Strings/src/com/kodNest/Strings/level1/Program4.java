package com.kodNest.Strings.level1;

public class Program4 
{
	public static void main(String[] args) 
	{
		String s1="SIVANI";
		String s2="Sivani";
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		String Cricketer1="Sachin";
		String Cricketer2="Sourav";
		if(Cricketer1.compareTo(Cricketer2)>0)
		{
			System.out.println("String 1 that is "+Cricketer1+" is greater");
		}
		else if(Cricketer1.compareTo(Cricketer2)<0)
		{
			System.out.println("String 2 that is "+Cricketer2+" is greater");
		}
		else
		{
			System.out.println("Strings are equal");
		}
	}
}
