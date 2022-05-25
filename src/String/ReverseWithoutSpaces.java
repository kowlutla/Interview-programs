package String;

import java.util.Scanner;

public class ReverseWithoutSpaces {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		char array[]=s.toCharArray();
		char resultarray[]=new char[s.length()];
		//taking all spaces into result array
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==' ')
			{
				resultarray[i]=' ';
			}
		}
		
		//have to iterate from start of array of characters and place them from last to the first in result array
		int j=resultarray.length-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=' ')
			{
				if(resultarray[j]==' ')
				{
					j--;
				}
				if(resultarray[j]!=' ')
				{
					resultarray[j]=array[i];
					j--;
				}
			}
		}
		String result=new String(resultarray);
		System.out.println(result);
	}

}
