package com.KodNest.Collections.PriorityQueue;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(40);
		pq.add(30);
		pq.add(20);
		pq.add(40);
		pq.add(50);
		System.out.println("PQ--->"+pq);
//		for(int i=0;i<=pq.size()-1;i++)
//		{
//			System.out.print(pq.get(i));
//		}
//		System.out.println();
		for(Object x:pq)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
//		ListIterator litr=pq.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
//		System.out.println();
//		Iterator ditr=pq.descendingIterator();
//		while(ditr.hasNext())
//		{
//			System.out.print(ditr.next());
//		}
	}
}
