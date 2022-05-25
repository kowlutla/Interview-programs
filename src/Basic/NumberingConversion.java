package Basic;

import java.util.Scanner;

public class NumberingConversion {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Decimal number:");
		int number=sc.nextInt();
		System.out.println("--------------------------------------------------");
		String binarynumber=decimalToBinary(number);
		System.out.println("Binary equivalance of "+number+" is : "+binarynumber);
		String octalnumber=decimalToOctal(number);
		System.out.println("Octal equivalance of "+number+" is : "+octalnumber);
		String hexadecimalnumber=decimalToHexadecimal(number);
		System.out.println("Octal equivalance of "+number+" is : "+hexadecimalnumber);
		System.out.println("--------------------------------------------------------");
		System.out.print("Enter Bunary number: ");
		String binarystring=sc.next();
		System.out.println("Binary to Decimal: ");
		int decimal=binaryToDecimal(binarystring);
		System.out.println("Decimal equivalance of "+binarystring+" is: "+decimal);
		System.out.println("--------------------------------------------------------");
		System.out.print("Enter  Octal number: ");
		int octal=sc.nextInt();
		int octaltodecimal=octalToDecimal(octal);
		System.out.println("Decimal equivalance of "+octal+" is: "+octaltodecimal);
		System.out.println("--------------------------------");
		System.out.print("Enter  Octal number: ");
		String hexa=sc.next();
		int hexatodecimal=hexaToDecimal(hexa);
		System.out.println("Decimal equivalance of "+hexa+" is: "+hexatodecimal);
		

	}

	private static int hexaToDecimal(String hexa) 
	{
		int decimal=0;
		for(int i=0;i<hexa.length();i++)
		{
			int digit=0;
			if(hexa.charAt(i)=='A')
			{
				digit=10;
			}
			else if(hexa.charAt(i)=='B')
			{
				digit=11;
			}
			else if(hexa.charAt(i)=='C')
			{
				digit=12;
			}
			else if(hexa.charAt(i)=='D')
			{
				digit=13;
			}
			else if(hexa.charAt(i)=='E')
			{
				digit=14;
			}
			else if(hexa.charAt(i)=='F')
			{
				digit=15;
			}
			else
			{
				digit=Character.getNumericValue(hexa.charAt(i));
			}
			decimal=decimal*16+digit;
		}
		return decimal;
		
	}

	private static int octalToDecimal(int octal) {
		int decimal=0;
		String octalstring=Integer.toString(octal);
		for(int i=0;i<octalstring.length();i++)
		{
			int digit=Character.getNumericValue(octalstring.charAt(i));
			decimal=decimal*8+digit;
		}
		return decimal;
	}

	private static String decimalToBinary(int number) 
	{
		String binary="";
		while(number!=0)
		{
			int reminder=number%2;
			binary=reminder+binary;
			number=number/2;
		}
		return binary;
	}
	
	
	public static String decimalToOctal(int  number)
	{
		String octal="";
		while(number>0)
		{
			int reminder=number%8;
			octal=reminder+octal;
			number=number/8;
			
		}
				
		return octal;
	}

	
	public static String decimalToHexadecimal(int number)
	{
		String hexadecimal="";
		String[] hexa= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		while(number>0)
		{
			int reminder=number%16;
			hexadecimal=hexa[reminder]+hexadecimal;
			number=number/16;
		}
		return hexadecimal;
		
	}
	
	
	public static int binaryToDecimal(String binary)
	{
		int decimal=0;
		for(int i=0;i<binary.length();i++)
		{
			int value=Character.getNumericValue(binary.charAt(i));
			decimal=decimal*2+value;
			
		}
		return decimal;
	}
}
