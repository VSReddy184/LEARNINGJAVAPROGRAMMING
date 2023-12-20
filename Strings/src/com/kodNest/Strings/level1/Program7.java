package com.kodNest.Strings.level1;

import java.util.Scanner;

public class Program7 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String res=reverseString(str);
		System.out.println(res);
	}
	public static String reverseString(String str)
	{
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==' ')
			{
				arr2[i]=arr1[i];
			}
		}
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=' ')
			{
				if(arr2[j]==' ')
				{
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
		}
		return new String(arr2);
	}
}
