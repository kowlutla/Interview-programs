package String;

import java.util.Scanner;

public class RemoveContinues {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		String s=sc.nextLine();
		String ss=removoveContinues(s);
		System.out.println(ss);

	}

	private static String removoveContinues(String s) 
	{
		StringBuffer db=new StringBuffer(s);
		for(int i=0;i<db.length()-1;i++)
		{
			if(db.charAt(i)=='b')
			{
				db.deleteCharAt(i);
				i--;
			}
			if(db.charAt(i)=='a')
			{
				if(db.charAt(i+1)=='a')
				{
					db.deleteCharAt(i+1);
					i--;
				}
			}
		}
		return db.toString();
	}
	
}


//Given a string remove all continues occurances of 'a' and any occurance of 'b' 