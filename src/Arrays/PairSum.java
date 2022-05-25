package Arrays;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array :");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.print("Enter your number: ");
		int num=sc.nextInt();
		System.out.println("Enter values into array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		System.out.println("Paris of elements equals to "+num);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==num)
				{
					System.out.print("{"+array[i]+","+array[j]+"}");
				}
			}
		}

	}

}
// How to find all pairs of elements in an array whose sum is equal to given number?