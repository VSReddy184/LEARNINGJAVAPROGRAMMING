package com.kodNest.Strings.level1;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=scan.nextLine();
		char str2[]=str1.toCharArray();
		for(int i=0;i<=str2.length-1;i++)
		{
			System.out.println(str2[i]);
		}
		for(char c:str2)//enhanced for-loop or for-each loop
		{
			System.out.print(c+" ");
		}
	}
}
