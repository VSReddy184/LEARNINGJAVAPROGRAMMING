package com.KodNest.Collections.LinkedHashSet;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(25);
		lhs.add(11);
		lhs.add(53);
		lhs.add(121);
		lhs.add(51);
		System.out.println("HS--->"+lhs);
//		for(int i=0;i<=lhs.size()-1;i++)
//		{
//			System.out.print(lhs.get(i));
//		}
//		System.out.println();
		for(Object x:lhs)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		ListIterator litr=lhs.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
//		System.out.println();
//		Iterator ditr=lhs.descendingIterator();
//		while(ditr.hasNext())
//		{
//			System.out.print(ditr.next());
//		}
	}
}
