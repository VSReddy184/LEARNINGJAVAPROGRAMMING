package com.kodNest.Strings.level1;

import java.util.Scanner;

public class Program8 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		String revSentence="";
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			String revWord="";
			char arr1[]=word.toCharArray();
			char arr2[]=new char[arr1.length];
			int k=arr1.length-1;
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr2[k]=arr1[j];
				k--;
			}
			revWord=new String(arr2);
			revSentence=revSentence+revWord+" ";
		}
		System.out.println(revSentence);
	}
}
