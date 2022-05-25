package String;

import java.util.Scanner;
import java.util.TreeSet;

public class AllPermutations {
	static TreeSet<String>set=new TreeSet<String>();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		allPermutations(s,0,s.length()-1);
		for(String k:set)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		set.clear();
		

	}
	
	private static void allPermutations(String s, int left, int right)
	{
		
		if(left==right)
		{
			set.add(s);
		}
		else
		{
			for(int i=left;i<=right;i++)
			{
				s=swap(s,left,i);
				allPermutations(s,left+1,right);
				s=swap(s,left,i);
				
			}
		}
	}

	private static String swap(String s, int left, int i) {
	
		char []array=s.toCharArray();
		char c=array[left]; 
		array[left]=array[i];
		array[i]=c;
		return String.valueOf(array);
		
	}

}
