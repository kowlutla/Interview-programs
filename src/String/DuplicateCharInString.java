package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			duplicateChars1(s);
			System.out.println();
		}

	}

	//Using Set
	private static void duplicateChars(String s) 
	{
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.add(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}
	
	//Using Map
	public static void duplicateChars1(String s)
	{
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))!=null)
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		}
		Iterator<Entry<Character,Integer>>it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Character,Integer>entry=it.next();
			if(entry.getValue()!=1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
