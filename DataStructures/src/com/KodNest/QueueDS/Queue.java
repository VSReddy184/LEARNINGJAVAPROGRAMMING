package com.KodNest.QueueDS;

public class Queue 
{
	private int queue[]=null;
	private int size=0;
	private int first=-1;
	public Queue(int n)
	{
		queue=new int[n];
		size=queue.length;
	}
	public void push(int elem)
	{
		if(first==size-1)
		{
			System.out.println("Queue is full can't push element");
		}
		else
		{
			++first;
			queue[first]=elem;
		}
	}
	public void pop()
	{
		if(size==0)
		{
			System.out.println("Queue is empty can't pop element");
		}
		else
		{
			first--;
		}
	}
	public void display()
	{
		for(int i=first;i>=0;i--)
		{
			System.out.println(queue[i]);
		}
	}
}
