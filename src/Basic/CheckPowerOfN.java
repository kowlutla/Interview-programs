package Basic;

import java.util.Scanner;

public class CheckPowerOfN {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter power: ");
		int power=sc.nextInt();
		System.out.print("Enter no of test cases: ");
		int cases=sc.nextInt();
		for(int i=1;i<=cases;i++)
		{
			System.out.print("Enter number for test case "+i+" : ");
			int n=sc.nextInt();
			boolean isPower=test(n,power);
			if(isPower)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}

	private static boolean test(int n,int power)
	{
		int rem=0;
		while(n>=power)
		{
			rem=n/power;
			n=n/power;
		}
		if(rem==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


//to check a number is power of 4 or not