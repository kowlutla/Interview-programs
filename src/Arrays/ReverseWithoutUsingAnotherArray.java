package Arrays;

import java.util.Scanner;

public class ReverseWithoutUsingAnotherArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int len=sc.nextInt();
		int array[]=new int[len];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<len;i++)
		{
			System.out.print("Element  "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}	
		System.out.print("Actual array: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0,j=len-1;i<len/2;i++,j--)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}

		System.out.print("Reversed array: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
