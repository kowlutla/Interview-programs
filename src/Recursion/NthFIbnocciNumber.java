package Recursion;

import java.util.Scanner;

public class NthFIbnocciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Nth number: ");
		int n=sc.nextInt();
		int fib=fibnoci(n);
		int fib1=fibnocii(n);
		System.out.println("Fibnocii number at "+n+" th place: "+fib);
		System.out.println("Fibnocii number at "+n+" th place: "+fib);
		
		System.out.print("Series: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(fibnoci(i)+" ");
		}
	}

	private static int fibnocii(int n) 
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fibnocii(n-1)+fibnocii(n-2);
	}
	
	
	//Using Dynamic programming
	public static int fibnoci(int n)
	{
		int array[]=new int[n+1];
		array[0]=0;
		if(n>0)
		{
			array[1]=1;
			for(int i=2;i<=n;i++)
			{
				array[i]=array[i-1]+array[i-2];
			}
		}
		return array[n];
	}
	

}
