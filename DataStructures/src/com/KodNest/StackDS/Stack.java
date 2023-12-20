package com.KodNest.StackDS;

public class Stack 
{
	private int stack[]=null;
	private int size=0;
	private int top=-1;
	public Stack(int n)
	{
		stack=new int[n];
		size=stack.length;
	}
	public void push(int elem)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full can't insert element");
		}
		else
		{
			++top;
			stack[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty can't delete element");
		}
		else
		{
			--top;
		}
	}
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
}
