package Recursion;

import java.util.Scanner;

public class StringPermutationUsingSwapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String string=sc.nextLine();
		System.out.println("All Permutations of "+string+" are: ");
		stringPermutations(string,0,string.length()-1);
		sc.close();

	}
	
	public static void stringPermutations(String string,int l,int r)
	{
		if(l==r)
		{
			System.out.println(string);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				string=swap(string,l,i);
				stringPermutations(string,l+1,r);
				string =swap(string,l,i);
			}
		}	
	}

	private static String swap(String string, int l, int r) {
		char array[]=string.toCharArray();
		char c=array[l];
		array[l]=array[r];
		array[r]=c;
		return String.valueOf(array);	
	}

}
