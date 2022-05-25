package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCapitalize {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		String s=br.readLine();
		String array[]=s.split(" ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=capitalizeString(array[i]);
		}
		System.out.println("Capitalized String: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\ntOGGLED wORDS: ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=toggleWords(array[i]);
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		char array1[]=s.toCharArray();
		int words=0;
		if(s=="")
		{
			words=0;
		}
		else
		{
			words=1;
		}
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==' ')
			{
				words++;
			}
		}
		System.out.println("\nNo of words: "+words);
//		String ss[]= {"kowl","abc","bcd"};
//		String a="abc";
//		String b=new String("abc");
//		System.out.println(a.equals(ss[1]));
//		System.out.println(a==ss[1]);
	}

	private static String toggleWords(String string) {
		String first=string.substring(0,1);
		String last=string.substring(1);
		return first.toLowerCase()+last.toUpperCase();
	}

	private static String capitalizeString(String string) {
		
		String first=string.substring(0,1);
		String last=string.substring(1);
		String capitalizedstring=first.toUpperCase()+last.toLowerCase();
		return capitalizedstring;
	}

}
