package com.kodNest.Strings.level1;

public class Program5 
{
	public static void main(String[] args) 
	{
		String str=new String(" Raja Ram Mohan Roy ");
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("j"));
		System.out.println(str.charAt(3));
		System.out.println(str.isEmpty());
		System.out.println(str.contains("Raja"));
		System.out.println(str.contains("Aam"));
		System.out.println(str.substring(9));
		System.out.println(str.substring(9, 13));
		System.out.println(str.length());
		System.out.println(str.trim());
		System.out.println(str.replace("Ram", "RAM"));
		System.out.println(str.replaceFirst("Roy", "ROY"));
		System.out.println(str.replaceAll(" ", "_"));
		System.out.println(str.startsWith(" "));
		System.out.println(str.endsWith("Roy"));
		char charArr[]=str.toCharArray();
		System.out.println("Array of characters");
		for(char c:charArr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String space=" ";
		String stringArr[]=str.split(space);
		System.out.println("Array of strings");
		for(String s:stringArr)
		{
			System.out.println(s);
		}
	}
}
