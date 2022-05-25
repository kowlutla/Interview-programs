package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraysPrograms 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int length=sc.nextInt();
		int array[]=new int[length];
		
		
		System.out.println("Enter elements into array: ");
		for(int i=0;i<length;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		
		
		//original array
		System.out.print("Original array: ");
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
		//reversing array
		System.out.print("\nReversed array: ");
		int reversearray[]=reverse(array);
		for(int i:reversearray)
		{
			System.out.print(i+" ");
		}
		
		
		
		//checking for duplicates
		System.out.print("\nIs array contains duplicates: ");
		boolean iscontainduplicate=iscontainduplicateisContainDupllicates(array);
		if(iscontainduplicate)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		
		//printing duplicates of array
		System.out.print("Duplicates of array: ");
		int duparray[]=duplicatearray(array);
		if(duparray.length==0)
		{
			System.out.print("No Duplicates in array");
		}
		else
		{
			for(int i=0;i<duparray.length;i++)
			{
				System.out.print(duparray[i]+" ");
			}
		}
		
		//printing array without duplicates
		System.out.print("\nArray without duplicates:");
		withoutDup(array);
		
		System.out.println("\n- - -Converting list to array - - -");
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		//Method1
		int listarray[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			listarray[i]=list.get(i);
		}
		for(int i:listarray)
		{
			System.out.print(i+" ");
		}
	}

	//Method for reversing array
	private static int[] reverse(int[] array) 
	{
		int temp[]=new int[array.length];
		for(int i=array.length-1,j=0;i>=0;i--)
		{
			temp[j++]=array[i];
		}
		return temp;
	}
	
	
	
	//Method to check is array contain duplicates or not
	private static  boolean iscontainduplicateisContainDupllicates(int[] array)
	{
		boolean iscontainduplicate=false;
		HashSet<Integer>set=new HashSet<Integer>(array.length);
		
		for(int i=0;i<array.length;i++)
		{
			if(set.add(array[i])==false)
			{
				iscontainduplicate=true;
			}
		}
		return iscontainduplicate;
		
	}

	
	
	//Method for printing duplicates in array
	private static int[] duplicatearray(int[] array) 
	{
		int[] temp=new int[array.length];
		Set<Integer>set=new HashSet<Integer>();
		int k=0;
		for(int i=0;i<array.length;i++)
		{
			if(set.add(array[i])==false)
			{
				temp[k++]=array[i];
			}
		}
		int[] duparray=new int[k];
		for(int i=0;i<k;i++)
		{
			duparray[i]=temp[i];
		}
		return duparray;
	}

	
	//Method for removing duplicates
	public static void withoutDup(int array[])
	{
		HashSet<Integer>set=new HashSet<Integer>(array.length);
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		for(int i:set)
		{
			System.out.print(i+" ");
		}
	}

}
