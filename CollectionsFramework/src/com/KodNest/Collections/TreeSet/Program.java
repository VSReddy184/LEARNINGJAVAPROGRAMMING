package com.KodNest.Collections.TreeSet;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		System.out.println("TS-->"+ts);
//		for(int i=0;i<=ts.size()-1;i++)
//		{
//			System.out.print(ts.get(i));
//		}
//		System.out.println();
		for(Object x:ts)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		ListIterator litr=ts.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
//		System.out.println();
		Iterator ditr=ts.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.print(ditr.next()+" ");
		}
	}
}
