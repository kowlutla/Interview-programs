package patterns;

import java.util.Scanner;
import java.lang.*;

public class SpiralMatrix {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Using Matrix: ");
		pattern1(n);
		System.out.println("Without using matrix: ");
		pattern2(n);

	}

	public static void pattern1(int n)
	{
		int len=2*n-1;
		int array[][]=new int[len][len];
		int minrow=0,maxrow=len-1,mincol=0,maxcol=len-1;
		int temp=n;
		while(temp>0)
		{
			for(int i=mincol;i<=maxcol;i++)
			{
				array[minrow][i]=temp;
			}
			for(int i=minrow+1;i<=maxrow;i++)
			{
				array[i][maxcol]=temp;
			}
			
			for(int i=maxcol-1;i>=mincol;i--)
			{
				array[maxrow][i]=temp;
			}
			for(int i=maxrow-1;i>=minrow;i--)
			{
				array[i][mincol]=temp;
			}
			temp--;
			minrow++;
			mincol++;
			maxcol--;
			maxrow--;
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}



	public static void pattern2(int n)
	{
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				System.out.print(1+Math.max(Math.abs(n-i),Math.abs(n-j))+" ");
			}
			System.out.println();
		}	
	}
	

}
