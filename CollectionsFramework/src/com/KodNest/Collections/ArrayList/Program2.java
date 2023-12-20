package com.KodNest.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program2 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
