package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

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

	private static String RemoveDuplicate(String s) 
	{
		Set<String>set=new LinkedHashSet<String>();
		String array[]=s.split(" ");
		String nodup="";
		for(String ss: array)
		{
			if(set.add(ss))
			{
				nodup=nodup+ss+" ";
			}
		}
		return nodup;
	}

}
