package Basic;

import java.util.Scanner;

public class ArmstringNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		int nodigits=0;
		int dup=n;
		int sum=0,temp=n;
		int digit=0;
		while(n!=0)
		{
			n=n/10;
			nodigits++;
		}
		while(dup!=0)
		{
			digit=dup%10;
			sum=(int) (sum+Math.pow(digit, nodigits));
			dup=dup/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is Armstring Number");
		}
		else
		{
			System.out.println(temp+ " is Not armstring Number");
		}
		
		System.out.println(Integer.MIN_VALUE);
	}

}
