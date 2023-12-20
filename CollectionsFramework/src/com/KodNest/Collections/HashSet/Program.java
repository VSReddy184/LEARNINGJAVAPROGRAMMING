package com.KodNest.Collections.HashSet;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(25);
		hs.add(11);
		hs.add(53);
		hs.add(121);
		hs.add(51);
		System.out.println("HS--->"+hs);
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.print(hs.get(i));
//		}
//		System.out.println();
		for(Object x:hs)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		ListIterator litr=hs.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
//		System.out.println();
//		Iterator ditr=hs.descendingIterator();
//		while(ditr.hasNext())
//		{
//			System.out.print(ditr.next());
//		}
	}
}
