package Basic;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		System.out.print("Enter digit: ");
		int digit=sc.nextInt();
		String dig=Integer.toString(digit);
		int i=n;
		boolean isMax=true;
		while(isMax)
		{
			if(Integer.toString(i).contains(dig))
			{
				i--;
			}
			else
			{
				isMax=false;
			}
		}
		System.out.print(i);
		
	}

}



/*
How to find largest number less than a given number and without a given digit?
Ex: n=145,digit=5 ==>139
 */