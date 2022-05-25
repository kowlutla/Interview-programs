package Basic;

import java.util.Scanner;

public class DecimalToRomanNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number between 1 to 3999 ");
		int number=sc.nextInt();
		int temp=number;
		String []roman= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int []decimal= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String romannumber="";
		if(number>=1 && number<=3999)
		{
			for(int i=0;i<13;i++)
			{
				while(number>=decimal[i])
				{
					romannumber=romannumber+roman[i];
					number=number-decimal[i];
				}
				
			}
		}
		else
		{
			System.out.println("Invalid entry");
		}
		
		System.out.println("Roman number of "+temp+" is: "+romannumber);

	}

}
