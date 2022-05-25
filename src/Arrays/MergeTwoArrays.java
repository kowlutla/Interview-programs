package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoArrays {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array1 length: ");
		int len1=sc.nextInt();
		System.out.print("Enter array2 length: ");
		int len2=sc.nextInt();
		int array1[]=new int[len1];
		int array2[]=new int[len2];
		System.out.println("Enter elements into array1: ");
		for(int i=0;i<len1;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements into array2: ");
		for(int i=0;i<len2;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array2[i]=sc.nextInt();
		}
		System.out.println("Using Method 1:");
		mergeSort(array1,array2);
		System.out.println("-------------------------------------------");
		System.out.println("Using methos 2: ");
		mergeSort1(array1,array2);
	}
	//Method 1
	private static void mergeSort(int[] array1, int[] array2) 
	{
		int len1=array1.length;
		int len2=array2.length;
		Arrays.parallelSort(array1);
		Arrays.parallelSort(array2);
		int array3[]=new int[len1+len2];
		int i=0,j=0,k=0;
		while(i<len1 && j<len2)
		{
			if(array1[i]<array2[j])
			{
				array3[k]=array1[i];
				i++;
				k++;
			}
			else
			{
				array3[k]=array2[j];
				j++;k++;
			}
		}
		while(i<len1)
		{
			array3[k]=array1[i];
			i++;k++;
		}
		while(j<len2)
		{
			array3[k]=array2[j];
			j++;k++;
		}
		
		System.out.println("With duplicates: ");
		for(int m:array3)
		{
			System.out.print(m+" ");
		}

		System.out.println("\nWithout Duplicates: ");
		
		Set<Integer>set=new LinkedHashSet<Integer>();
		for(int m=0;m<array3.length;m++)
		{
			set.add(array3[m]);
		}
		
		for(Integer m:set)
		{
			System.out.print(m+" ");
		}
	}
	
	
	//Method 2
	
	public static void mergeSort1(int array1[],int array2[])
	{
		Set<Integer>set=new TreeSet<Integer>();
		for(int i:array1)
		{
			set.add(i);
		}
		for(int i:array2)
		{
			set.add(i);
		}
		for(Integer i:set)
		{
			System.out.print(i+" ");
		}
	}
	
	
	
	
}


//merge two unsorted into single sorted array without duplicates