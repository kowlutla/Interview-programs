package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Chegg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			
			
			System.out.print("enter string: ");
			String s=sc.nextLine();
			ArrayList<String>list=getBigWords(s);		
			for(String k:list)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	private static ArrayList<String> getBigWords(String s) {
		
		ArrayList<String>list=new ArrayList<String>();
		
		//regex to remove all special characters from string
		String regex="[^a-zA-Z]";
		//removing all special characters by replacing with space
		s=s.replaceAll(regex, " ");
		
		//split the string and store resulted words in an array
		String[]array=s.split(" ");
		
		//traverse through array of words add the words to list if their length is greater than 5
		for(int i=0;i<array.length;i++)
		{
			if(array[i].length()>5)
			{
				list.add(array[i]);
			}
		}
		//returning list
		return list;
	}

}
