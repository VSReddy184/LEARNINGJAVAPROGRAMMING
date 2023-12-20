package takingInputAsArr.Length;

import java.util.Scanner;

public class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lengths of 3D regular array");
		int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
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
