package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Array1 length: ");
		int len1=sc.nextInt();
		System.out.print("Array2 length: ");
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
		
		System.out.print("Array1: ");
		for(int i=0;i<len1;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.print("\nArray2: ");
		for(int i=0;i<len2;i++)
		{
			System.out.print(array2[i]+" ");
		}
		int newarray1[]=removeDuplicates(array1);
		int newarray2[]=removeDuplicates(array2);
		System.out.println("\nIntersection:");
		for(int i=0;i<newarray1.length;i++)
		{
			for(int j=0;j<newarray2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.print(array1[i]+" ");
				}
			}
		}
	}

	private static int[] removeDuplicates(int[] array)
	{
		Set<Integer>set=new LinkedHashSet<Integer>();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		int temp[]=new int[set.size()];
		set.toArray();
		return temp;
	}

}
