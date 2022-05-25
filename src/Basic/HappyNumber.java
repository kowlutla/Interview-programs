  package Basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	static int temp;
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		
		System.out.println("Using Method1: ");
		boolean ishappy=happy(n);
		temp=n;
		System.out.println(ishappy);
		System.out.println("\nUsing Method2: ");
		boolean ishappy1=isHappy(n);
		System.out.println(ishappy1);
		
		System.out.println((int)' ');
	}
	
	
	//Time complexity O(nlogn) space complexity: O(n)
	private static boolean happy(int n) {
		
		Set<Integer>set=new HashSet<Integer>();
		
		while(set.add(n))
		{
			int value=0;
			while(n>0)
			{
				value=value+(int) Math.pow(n%10, 2);
				n=n/10;
			}
			n=value;
		}
		
		if(n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	static boolean isHappy(int n)
	{
		int slow=n,fast=n;
		
		do {
			slow=getSquareSum(slow);
			fast=getSquareSum(getSquareSum(fast));
		}while(slow!=fast);
		
		if(slow==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	private static int getSquareSum(int n) {
		
		int sum=0;
		while(n>0)
		{
			sum=sum+(int)Math.pow(n%10, 2);
			n=n/10;
		}
		return sum;
	}

}
