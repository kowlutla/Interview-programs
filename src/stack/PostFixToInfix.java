/**
 * 
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author kowlutla
 * x^y/(5*z)+2
 *
 */
public class PostFixToInfix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Infix Expression: ");
		String s=sc.nextLine();
		System.out.println("PostFix Expression: "+s);
		s=postfixToInfix(s);
		System.out.println("Infix expression: "+s);
		sc.close();
	}

	private static String postfixToInfix(String s) {
		
		Stack<String>stack=new Stack<String>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			//if character is operand
			if(Character.isLetterOrDigit(c))
			{
				stack.push(c+"");
			}
			else
			{
				String op1=stack.peek();
				stack.pop();
				String op2=stack.peek();
				stack.pop();
				
				stack.push("("+op2+c+op1+")");
			}
		}
		
		return stack.peek();
	}

}
