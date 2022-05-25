/**
Hamming Distance between two given strings

Objective: Given two strings with equal lengths, write an algorithm to calculate the hamming 
distance between the strings.  

Hamming Distance: Hamming distance between two strings is the number of positions at which the characters are different.

Example:
-------
	X = AABBCCDD, Y = AAAACCCC
	Hamming distance: 4
	There are four positions at which bits are different
	
	X = dogandcat, Y = catanddog
	Hamming distance: 6
	There are six positions at which bits are different.

 */
package String;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string1: ");
		String s1=sc.nextLine();
		System.out.print("Enter string2: ");
		String s2=sc.nextLine();
		
		int hamming_distance=hammingDistance(s1,s2);
		System.out.println("Hamming Distance between "+s1+" and  "+s2+" is: "+hamming_distance);
		sc.close();
	}

	private static int hammingDistance(String s1, String s2) {
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are different in sizes ");
			return -1;
		}
		
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				count++;
			}
		}
		return count;
		
	}

}
