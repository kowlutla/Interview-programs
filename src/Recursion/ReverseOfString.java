package Recursion;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		String rev=reverse(s);
		System.out.println("Reverse of "+s+" - - > "+rev);
				
	}

	private static String reverse(String s) 
	{
		if(s.length()==0)
		{
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}

}
