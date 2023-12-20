package com.kodNest.Strings.level1;

public class Program3 
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4="RAMA"+"SITA";
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
		String s5=s1+s2;
		String s6=s1+s2;
		if(s5==s6)
		{
			System.out.println("Referecese are equal");
		}
		else
		{
			System.out.println("References are unequal");
		}
		if(s5.equals(s6))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
	}
}
