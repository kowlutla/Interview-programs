package String;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		System.out.println("Original String: "+s);
		System.out.print("String without white spaces: ");
		String ss="";
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)==' '))
			{
				ss=ss+s.charAt(i);
			}
		}
		System.out.println(ss);
	}

}
