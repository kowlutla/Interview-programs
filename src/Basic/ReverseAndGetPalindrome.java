package Basic;

import java.util.Scanner;

public class ReverseAndGetPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int rev=0;
	
		boolean isPalindrome=false;
		while(!isPalindrome)
		{
			rev=reverse(n);
			if(rev==n)
			{
				isPalindrome=true;
			}
			else
			{
				n=n+rev;
			}
		}
		System.out.println(n);
		sc.close();

	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}

}
