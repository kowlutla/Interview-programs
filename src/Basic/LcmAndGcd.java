package Basic;

import java.util.Scanner;

public class LcmAndGcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Entries : ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Number: "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		int gcd=GCD(array);
		int lcm=LCM(array);
		System.out.println("Numbers :");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\nGCD: "+gcd);
		System.out.println("LCM: "+lcm);

	}
	
	
	public static int GCD(int array[])
	{
		int result=array[0];
		for(int i=1;i<array.length;i++)
		{
			result=GCD(result,array[i]);
		}
		return result;
	}
	
	
	public static int LCM(int array[])
	{
		int result=array[0];
		for(int i=1;i<array.length;i++)
		{
			result=LCM(result,array[i]);
		}
		return result;
	}
	
	public static int GCD(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return GCD(b,a%b);
	}
	
	public static int LCM(int a,int b)
	{
		return (a*b)/GCD(a,b);
	}

}
