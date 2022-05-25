package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatefromString {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			System.out.print(RemoveDuplicate(s));
			System.out.println();
		}

	}
	public static String RemoveDuplicate(String s)
	{
		Set<Character>set=new LinkedHashSet<Character>();
		char array[]=s.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		Character[]arr=new Character[set.size()];
		arr=set.toArray(arr);
		
		String ss=Arrays.toString(arr);
		return ss;
	}

}
