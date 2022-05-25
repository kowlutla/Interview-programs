package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachChar {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			occuranceOfEachChar(s);
			System.out.println();
		}
	}

	private static void occuranceOfEachChar(String s) 
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
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println("Occurance of each character: ");
		System.out.println(map);
	}

}
