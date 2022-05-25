package Basic;

import java.util.Scanner;

public class MissingNUmber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int len=sc.nextInt();
		int array[]=new int[len-1];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<len-1;i++)
		{
			System.out.print("Element  "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		int actualsum=((len)*(len+1))/2;
		//System.out.println(actualsum);
		int arraysum=0;
		for(int i=0;i<len-1;i++)
		{
			arraysum=arraysum+array[i];
		}
		//System.out.print(arraysum);
		int missingnumber=actualsum-arraysum;
		System.out.println("Missing number: "+missingnumber);
			
	}

}
