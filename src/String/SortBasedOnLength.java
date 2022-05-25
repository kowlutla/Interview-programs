package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortBasedOnLength {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter String: ");
			String s=br.readLine();
			String array[]=s.split(" ");
			sort(array);
			for(String ss: array)
			{
				System.out.print(ss+" ");
			}
			System.out.println();
		}

	}
	public static void sort(String [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int len1=array[i].length();
				int len2=array[j].length();
				if(len1>len2)
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}

}
