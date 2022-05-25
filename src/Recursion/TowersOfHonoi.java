package Recursion;

import java.util.Scanner;

public class TowersOfHonoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of disks: ");
		int n=sc.nextInt();
		char fromrod='A';
		char torod='C';
		char auxrod='B';
		towersOfHonoi(n,fromrod,torod,auxrod);

	}

	private static void towersOfHonoi(int n, char fromrod, char torod, char auxrod) {
		
	if(n>0)
	{
		towersOfHonoi(n-1,fromrod,auxrod,torod);
		System.out.println("Move disc from "+fromrod+" to "+torod);
		towersOfHonoi(n-1,auxrod,torod,fromrod);
	}
		
	}

}
