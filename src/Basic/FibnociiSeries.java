package Basic;

import java.util.Scanner;

public class FibnociiSeries {

	static int count=0;
	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int result[]=fib(n);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	private static int[] fib(int n) {
		
		int array[]=new int[n+1];
		array[0]=0;
		array[1]=1;
		for(int i=2;i<=n;i++)
		{
			array[i]=array[i-1]+array[i-2];
		}
		return array;
		
	}

}
