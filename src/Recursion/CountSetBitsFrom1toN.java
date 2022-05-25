package Recursion;

import java.util.Scanner;

public class CountSetBitsFrom1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
		int cases=sc.nextInt();
		for(int i=1;i<=cases;i++)
		{
			System.out.print("Enter number for TestCase "+i+" : ");
			int n=sc.nextInt();
			int setbit_count=countsetBit(n);
			System.out.println("Set bits from 1 to "+n+" is: "+setbit_count);
		}

	}

	private static int countsetBit(int n) {
	int count=0;
	for(int i=1;i<=n;i++)
	{
		count=count+countBits(i);
	}
	return count;
	}

	private static int countBits(int n) {
		if(n==0)
		{
			return 0;
		}
		return n%2+countBits(n/2);
	}

}
// if N=6 - ->Binary represntation is 110 so no of set bits are 11


//here if N=3 Output =4 because 1,2,3 - - >contain 1,1,2 set respectively


