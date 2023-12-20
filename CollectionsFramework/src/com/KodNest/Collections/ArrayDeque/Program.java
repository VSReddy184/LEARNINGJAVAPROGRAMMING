package com.KodNest.Collections.ArrayDeque;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(10);
		//ad.add(null);
		ad.add("Java");
		ad.add(98.45F);
		ad.add(true);
		System.out.println("AD--->"+ad);
//		for(int i=0;i<=ad.size()-1;i++)
//		{
//			System.out.print(ad.get(i));
//		}
//      System.out.println();
		for(Object x:ad)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=ad.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		ListIterator litr=ad.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
//		System.out.println();
		Iterator ditr=ad.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.print(ditr.next()+" ");
		}
	}
}
