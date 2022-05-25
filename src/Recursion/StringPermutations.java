package Recursion;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		permut(s,"");
		sc.close();
	}

	private static void permut(String s, String ss)
	{
		if(s.length()==0)
		{
			System.out.println(ss);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String sub=s.substring(0,i)+s.substring(i+1);
			permut(sub,ss+c);
		}
		
	}

//	private static boolean palindrome(String ss) {
//		String s="";
//		//System.out.println("Comming to palindrome");
//		for(int i=ss.length()-1;i>=0;i--)
//		{
//			s=s+ss.charAt(i);
//		}
//		//System.out.println(s);
//		if(s.equals(ss))
//			return true;
//		else
//			return false;
//	}

	
}
