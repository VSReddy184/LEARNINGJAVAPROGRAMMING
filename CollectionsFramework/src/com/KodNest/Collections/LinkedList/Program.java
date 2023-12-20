package com.KodNest.Collections.LinkedList;
import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(null);
		ll.add("Java");
		ll.add(10);
		ll.add(98.45F);
		ll.add(true);
		System.out.println("LL--->"+ll);
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		for(Object x:ll)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		Iterator ditr=ll.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.print(ditr.next()+" ");
		}
	}
}
