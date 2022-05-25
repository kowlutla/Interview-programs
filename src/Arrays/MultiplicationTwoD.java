package Arrays;

import java.util.Scanner;

public class MultiplicationTwoD {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows 1: ");
		int rows1=sc.nextInt();
		System.out.print("Cols1: ");
		int cols1=sc.nextInt();
		System.out.print("Rows2: ");
		int rows2=sc.nextInt();
		System.out.print("Cols2: ");
		int cols2=sc.nextInt();
		int array1[][]=new int[rows1][cols1];
		int array2[][]=new int[rows2][cols2];
		System.out.println("Enter elements into Matrix1: ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print("Enter element: ");
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements into Matrix2: ");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				System.out.print("Enter element: ");
				array2[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Matrix1: ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Matrix2: ");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Transpose of matrix1 :");
		int [][]transpose=new int[cols1][rows1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				transpose[j][i]=array1[i][j];
			}
		}
		
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Addition of Two matrices: ");
		int addition[][]=new int[rows1][cols1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				addition[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print(addition[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Subtraction of Two matrices: ");
		int subtract[][]=new int[rows1][cols1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				subtract[i][j]=array1[i][j]-array2[i][j];
			}
		}
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				System.out.print(subtract[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Product of Two matrices: ");
		int product[][]=new int[rows1][cols2];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				for(int k=0;k<cols1;k++)
				{
					product[i][j]=product[i][j]+array1[i][k]*array2[k][j];
				}
			}
		}
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
