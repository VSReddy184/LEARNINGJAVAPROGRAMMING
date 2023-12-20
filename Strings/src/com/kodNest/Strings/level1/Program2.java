package com.kodNest.Strings.level1;

public class Program2 
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2=new String("RAMA");
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
	}
}
