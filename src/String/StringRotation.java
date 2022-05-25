package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringRotation {

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no of Quries: ");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.println("------ Instance "+i+" --------");
			System.out.print("Enter String1: ");
			String s1=br.readLine();
			System.out.print("Enter String2: ");
			String s2=br.readLine();
			boolean isEqual=stringRotation(s1,s2);
			if(isEqual)
			{
				System.out.println("Both are rotatory strings");
			}
			else
			{
				System.out.println("Both are not rotatory strings");
			}
		}

	}

	private static boolean stringRotation(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			String s3=s1+s1;
			System.out.println(s3);
			if(s3.contains(s2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}
