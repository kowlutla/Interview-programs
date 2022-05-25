package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			firstNonRepeated1(s);
			System.out.println();
		}


	}

	
	//Using Loop
	private static void firstNonRepeated(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
			}
			if(count==0)
			{
				System.out.println("First Non Repeated Character is: "+s.charAt(i));
				break;
			}
		}
		
	}
	
	
	//Using Map
	public static void firstNonRepeated1(String s)
	{
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))!=null)
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		}
		System.out.print("First Non-Repeated Character: ");
		for(Entry<Character,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey());
				break;
			}
		}
	}
	
	
	

}
