package Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortBasedOnFrequency {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array1 length: ");
		int len=sc.nextInt();
		System.out.println("Enter elements into array1: ");
		int array[]=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		sortFrequency(array);
	}

	private static void sortFrequency(int[] array) 
	{
		Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(map.get(array[i])!=null)
			{
				map.put(array[i],map.get(array[i])+1);
			}
			else
			{
				map.put(array[i],1);
			}
		}
//		int max=0,maxele=0;
//		for(Entry<Integer,Integer>entry:map.entrySet())
//		{
//			if(entry.getValue()>max)
//			{
//				max=entry.getValue();
//				maxele=entry.getKey();
//			}
//		}
		
		List<Entry<Integer,Integer>>list=new LinkedList<Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,Integer>>()
				{

					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
					{
						if(o1.getValue()<o2.getValue())
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
		
				});
		Iterator<Entry<Integer,Integer>>iter=list.iterator();
		while(iter.hasNext())
		{
			Entry<Integer,Integer>e=iter.next();
			int frequency=e.getValue();
			while(frequency>=1)
			{
				System.out.print(e.getKey()+" ");
				frequency--;
			}
		}
		
	}

}
