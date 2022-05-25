
package Basic;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter power: ");
		int power=sc.nextInt();
		System.out.print("Enter number to check: ");
		int number =sc.nextInt();
		if(checkPower(power,number))
		{
			System.out.println(number+" is power of "+power);
		}
		else
		{
			System.out.println(number+" is not power of "+power);
		}
			
	}

	private static boolean checkPower(int power, int number) {
		
		while(number!=1)
		{
			if(number%power!=0)
			{
				return false;
			}
			number=number/power;
		}
		return true;
	}

}
