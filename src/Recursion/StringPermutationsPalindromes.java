package Recursion;

import java.util.Scanner;

public class StringPermutationsPalindromes
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		System.out.println("Palindrome permutations: ");
		stringPermut(s,"");
		sc.close();
	}
	public static void stringPermut(String s,String ss)
	{
		if(s.length()==0)
		{
			
			boolean palindrome=isPalindrome(ss);
			if(palindrome)
			{
				System.out.println(ss);
			}
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String sub=s.substring(0,i)+s.substring(i+1);
			
			stringPermut(sub,ss+c);
		}
	}
	
	public static boolean isPalindrome(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String ss=sb.toString();
		return s.equals(ss);
	}
}
