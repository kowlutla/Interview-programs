package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryCheck {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of Quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			boolean isBinary=binaryCheck(s);
			if(isBinary)
			{
				System.out.println(s+" is Binary ");
			}
			else
			{
				System.out.println(s+" is not Binary");
			}
		}
	}

	private static boolean binaryCheck(String s) 
	{
		int zero=0,one=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				zero++;
			}
			if(s.charAt(i)=='1')
			{
				one++;
			}
		}
		if((one+zero)==s.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

//Write a java program to check whether given number is binary or not.
// A binary number is a number which contains only 0 or 1. 
//For example : 101101, 110010110, 10010011 are binary numbers.
// This program is one of the number related basic java programs for interview
