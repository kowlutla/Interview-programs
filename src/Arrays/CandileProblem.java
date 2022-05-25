package Arrays;

import java.util.Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CandileProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		int array[]=new int[age];
		System.out.println("Enter heights of candles: ");
		for(int i=0;i<age;i++)
		{
			System.out.print("Enter height: ");
			array[i]=sc.nextInt();
		}
		int candle=birthdayCakeCandles(array);	
		System.out.println("Max candle: "+candle);
		sc.close();

	}

	private static int birthdayCakeCandles(int[] array)
	{
		Map<Integer,Integer>map=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		for(int i=0;i<array.length;i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i], map.get(array[i])+1);
			}
			else
			{
				map.put(array[i],1);
			}
		}
		int array1[]=new int[map.size()];
		int i=0;
		for(Entry<Integer,Integer>e:map.entrySet())
		{
			array1[i++]=e.getValue();
		}
		return array1[0];
	}

}
//if your niece is turning 4 years old, and the cake will have candles of height 4,4 ,1 ,3 
//she will be able to blow out 2 candles successfully,since the tallest candles are of height 4 and there are 2 such candles. 