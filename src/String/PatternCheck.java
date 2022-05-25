package String;

import java.util.Scanner;

public class PatternCheck {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pattern: ");
		String input = sc.next();
		while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
		System.out.println(input.isEmpty());
	}

}
