package Recursion;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutationswithoutRepeatition 
{

	static Set<String>set=new LinkedHashSet<String>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		System.out.println("permutations without repeteatition: ");
		stringPermut(s,"");
		for(String k:set)
		{
			System.out.println(k);
		}
		sc.close();
	}
	public static void stringPermut(String s,String ss)
	{
		if(s.length()==0)
		{
			set.add(ss);
//			System.out.println(ss);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String sub=s.substring(0,i)+s.substring(i+1);
			
			stringPermut(sub,ss+c);
		}
	}
	

}
