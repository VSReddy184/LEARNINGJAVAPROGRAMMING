package takingInputAsArr.Length;

import java.util.Scanner;

public class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of 1st-D of 3D jogged array");
		int arr[][][]=new int[scan.nextInt()][][];
		System.out.println("Enter 2D lengths");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the 2nd-D length of 1st-D "+i);
			arr[i]=new int[scan.nextInt()][];
		}
		System.out.println("Enter 3D lengths");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the 3rd-D length of 1st-D "+i+" 2nd-D "+j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the elements");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print("| ");
					System.out.print(arr[i][j][k]+" | ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
