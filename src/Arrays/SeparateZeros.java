package Arrays;

import java.util.Scanner;

public class SeparateZeros {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter Elements into array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		int array1[]=new int[n];
		int nonzero=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]!=0)
			{
				array1[nonzero++]=array[i];
			}
		}
		int zeros=array.length-nonzero;
		System.out.println("Zeros at end:");
		int array2[]=new int[n];
		for(int i=0;i<nonzero;i++)
		{
			array2[i]=array1[i];
		}
		for(int i=nonzero;i<n;i++)
		{
			array1[i]=0;
		}
		for(int i:array2)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nZeros at start:");
		for(int i=0;i<zeros;i++)
		{
			array2[i]=0;
		}
		for(int i=zeros,j=0;i<n;i++,j++)
		{
			array2[i]=array1[j];
		}
		
		for(int i:array2)
		{
			System.out.print(i+" ");
		}

	}

}
