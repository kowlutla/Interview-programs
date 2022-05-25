package Arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKSortedArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of arrays: ");
		int n=sc.nextInt();
		System.out.print("Enter size of array: ");
		int m=sc.nextInt();
		int array[][]=new int[n][m];
		System.out.println("Enter arrays: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Arrays before sorted: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.print("\t");
		}
		System.out.println();
		int result[]=sortArrays(array);
		System.out.println("\nArrays after sorting: ");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		sc.close();
	}

//	private static void sortArrays(int[][] array) {
//	
//		PriorityQueue<Integer>q=new PriorityQueue<Integer>();
//		
//		int size=0;
//		for(int i=0;i<array.length;i++)
//		{
//			size=size+array[i].length;
//			for(int j=0;j<array[i].length;j++)
//			{
//				q.add(array[i][j]);
//				
//			}
//		}
//		
//		while(!q.isEmpty())
//		{
//			System.out.print(q.poll()+" ");
//		}
//	}
	
	
	
	private static int[] sortArrays(int [][]array)
	{
		PriorityQueue<PriorityNode>q=new PriorityQueue<PriorityNode>();
		
		int size=0;
		for(int i=0;i<array.length;i++)
		{
			size+=array[i].length;
			if(array[i].length>0)
			{
				q.add(new PriorityNode(i,0,array[i][0]));
			}
		}
		
		int result[]=new int[size];
		
		for(int i=0;!q.isEmpty();i++)
		{
			PriorityNode pq=q.poll();
			result[i]=pq.value;
			int pos=pq.position+1;
			if(pos<array[pq.array_no].length)
			{
				q.add(new PriorityNode(pq.array_no,pos,array[pq.array_no][pos]));
			}
		}
		return result;
	}
}



class PriorityNode implements Comparable<PriorityNode>
{
	int array_no;
	int value;
	int position;
	
	public PriorityNode(int array_no,int position,int value)
	{
		this.array_no=array_no;
		this.position=position;
		this.value=value;
	}
	
	@Override
	public int compareTo(PriorityNode node)
	{
		if(this.value>node.value)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}


}
