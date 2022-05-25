package Basic;

import java.util.Scanner;

class PascalTriangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of lines: ");
		int n=sc.nextInt();
		display(n);

	}
	private static void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
			}
			System.out.println();
		}
	}
	public static int fact(int n)
	{
		int fact=1;
		int i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
}
