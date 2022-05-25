package Arrays;

import java.util.Scanner;

public class RotateArray
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of test cases: ");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			System.out.print("Length of array: ");
		    int n=sc.nextInt();
		    System.out.print("Enter number size of rotation: ");
		    int d=sc.nextInt();
		    int array[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		    	System.out.print("Element "+(j+1)+" : ");
		        array[j]=sc.nextInt();
		    }
		    rotateArray(array,d);
		    System.out.println();
		}
	}
	public static void rotateArray(int array[],int d)
	{
	    int l=array.length;
	    System.out.println("Before rotating array: ");
	    int array1[]=new int[l];
	    for(int i:array)
	    {
	    	System.out.print(i+" ");
	    }
	   for(int i=0;i<l;i++)
	   {
	       int val=(i+d)%l;
	       array1[i]=array[val];
	       
	   }
	   System.out.println("\nAfter Rotating array: ");
	   for(int i=0;i<l;i++)
	   {
	       System.out.print(array1[i]+" ");
	   }
	}
}
