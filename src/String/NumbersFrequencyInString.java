package String;

import java.util.Scanner;

public class NumbersFrequencyInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		int array[]=new int[10];
		getCount(s,array);

	}

	private static void getCount(String s, int[] array) {
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				switch(s.charAt(i))
				{
					case '0':
						array[0]++;
						break;
					case '1':
						array[1]++;
						break;
					case '2':
						array[2]++;
						break;
					case '3':
						array[3]++;
						break;
					case '4':
						array[4]++;
						break;
					case '5':
						array[5]++;
						break;
					case '6':
						array[6]++;
						break;
					case '7':
						array[7]++;
						break;
					case '8':
						array[8]++;
						break;
					case '9':
						array[9]++;
						break;
					
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(i+" - - > "+array[i]);
		}
		
	}

}
