package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BInarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		System.out.print("Enter value to search :");
		int key=sc.nextInt();
		Arrays.parallelSort(array);
		binarySearch(array,key);
		

	}
	
	
	
	public static void binarySearch(int array[],int key)
	{
		int index=binarySearch(array,0,array.length-1,key);
		if(index==-1)
		{
			System.out.println(key +" is not in array ");
		}
		else
		{
			System.out.println(key+" is present in array at "+index+" index position");
		}
	}
	private static int binarySearch(int[] array, int left, int right, int key) 
	{
		if(left<=right)
		{
			int mid=(left+(right-1))/2;
			if(array[mid]==key)
			{
				return mid;
			}
			if(array[mid]<key)
			{
				return binarySearch(array,mid+1,right,key);
			}
			return binarySearch(array,left,mid-1,key);	
		}
		return -1;
	}

}
