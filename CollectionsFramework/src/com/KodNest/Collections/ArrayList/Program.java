package com.KodNest.Collections.ArrayList;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add(30);
		al.add(50);
		System.out.println("AL--->"+al);
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("-------------");
		for(Object x:al)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("-------------");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("--------------");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
	}
}
