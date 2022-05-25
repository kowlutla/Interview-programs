package Arrays;

import java.util.Scanner;

public class SpiralOrder {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter matrix size: ");
		int n=sc.nextInt();
		int array[][]=new int[n][n];
		int mincol=0;
		int maxcol=n-1;
		int minrow=0;
		int maxrow=n-1;
		int i=1;
		while(i<=n*n)
		{
			for(int j=mincol;j<=maxcol;j++)
			{
				array[minrow][j]=i;
				i++;
			}
			for(int j=minrow+1;j<=maxrow;j++)
			{
				array[j][maxcol]=i++;
			}
			for(int j=maxcol-1;j>=mincol;j--)
			{
				array[maxrow][j]=i++;
			}
			for(int j=maxrow-1;j>minrow;j--)
			{
				array[j][mincol]=i++;
			}
			mincol++;
			maxcol--;
			minrow++;
			maxrow--;
		}
		System.out.println("Spiral order: ");
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
