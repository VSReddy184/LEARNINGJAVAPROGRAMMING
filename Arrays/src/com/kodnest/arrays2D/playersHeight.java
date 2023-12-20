package com.kodnest.arrays2D;

import java.util.Scanner;

public class playersHeight 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double ht[][]=new double[5][];
				ht[0]=new double[4];
				ht[1]=new double[3];
				ht[2]=new double[5];
				ht[3]=new double[6];
				ht[4]=new double[2];
		for(int i=0;i<=ht.length-1;i++)
		{
			for(int j=0;j<=ht[i].length-1;j++)
			{
			System.out.println("Enter height of game "+i+" player "+j);
			ht[i][j]=scan.nextDouble();
			}
		}
		System.out.println("Player heights are...");
		for(int i=0;i<=ht.length-1;i++)
		{
			for(int j=0;j<=ht[i].length-1;j++)
			{
			System.out.print(ht[i][j]+" ");
			}
			System.out.println();
		}
	}
}
