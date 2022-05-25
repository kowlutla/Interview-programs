package Arrays;

import java.util.Scanner;

public class ContiniousSubArraySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("------ Enter elements---------");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		System.out.print("Your Number: ");
		int num=sc.nextInt();
		int start[]=new int[100];
		int end[]=new int[100];
		int scount=0,ecount=0;
		for(int i=0;i<n;i++)
		{
			int sum=array[i];
			if(sum==num)
			{
				start[scount++]=i;
				end[ecount++]=i;
			}
			else
			{
				for(int j=i+1;j<n;j++)
				{
					sum=sum+array[j];
					if(sum==num)
					{
						start[scount++]=i;
						end[ecount++]=j;
					}
				}
			}
		}
		System.out.println("Sub Array With sum Results Zero are: ");
		for(int i=0;i<scount;i++)
		{
			for(int k=start[i];k<=end[i];k++)
			{
				System.out.print(array[k]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}


//How to find continuous sub array whose sum is equal to given number
