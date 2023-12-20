package com.kodNest.Strings.level1;

public class Program1 
{
	public static void main(String[] args) 
	{
		String s1="RAMU";
		String s2="RAMU";
		if(s1==s2)
		{
			System.out.println("Refernces are equal");
		}
		else
		{
			System.out.println("References ar unequal");
		}
		
		String s3=new String("SITA");
		String s4=new String("SITA");
		if(s3==s4)
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
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("strings are unequal");
		}
	}
}
