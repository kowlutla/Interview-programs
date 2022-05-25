package Arrays;

import java.util.Scanner;

public class LeaderInArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter Elements into array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		int leaderarray[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			boolean isLeader=false;
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					isLeader=true;
				}
				else
				{
					isLeader=false;
					break;
				}
			}
			if(isLeader)
			{
				leaderarray[count++]=array[i];
			}
		}
		leaderarray[count++]=array[n-1];
		System.out.println("leader array: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(leaderarray[i]+" ");
		}

	}

}
//Write a java program to find all the leaders in an integer array.
// An element is said to be a leader if all the elements on it’s right side are smaller
//  than it.Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} 
//is the given array then {14, 11, 8, 5, 3} are the leaders in this array