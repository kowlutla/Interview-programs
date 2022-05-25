package Arrays;

import java.util.Scanner;

public class BulbSwitcher {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=1;
		}
		for(int i=1;i<n;i=i+2)
		{
			array[i]=0;
		}
		for(int i=2;i<n;i++)
		{
			int count=i;
			for(int j=i;j<n;j=j+count)
			{
				if(array[j]==1)
				{
					array[j]=0;
				}
				else 
				{
					array[j]=1;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				System.out.print("off ");
			}
			else 
			{
				System.out.print("on ");
			}
		}
		sc.close();

	}

}
