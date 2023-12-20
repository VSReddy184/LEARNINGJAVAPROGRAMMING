package com.kodNest.Strings.level1;

import java.util.Scanner;

public class Program9 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=scan.nextLine();
		System.out.println("Entered Sentence Is: ");
		System.out.println(str);
		String arr1[]=str.split(" ");
		String arr2[]=new String[arr1.length];
		StringBuffer sb=new StringBuffer();
		int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			arr2[j]=arr1[i];
			sb.append(arr2[j]+" ");
			j++;
		}
		sb.toString();
		System.out.println("Final Sentence: ");
		System.out.println(sb);
	}
}
