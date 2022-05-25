/**
 * 
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author apiiit-rkv
 *
 */
public class InfixToPostfix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Infix Expression: ");
		String s=sc.nextLine();
		System.out.println("Infix Expression: "+s);
		s=infixToPostfix(s);
		System.out.println("Postfix expression: "+s);
		sc.close();
	}

	private static String infixToPostfix(String s) {
	
		String postfix="";
		
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				postfix+=c;
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					postfix+=stack.pop();
				}
				stack.pop();
			}
			else 
			{
				while(!stack.isEmpty() && prec(stack.peek())>=prec(c))
				{
					postfix+=stack.pop();
				}
				stack.push(c);
			}
			
		}
		while(!stack.isEmpty())
		{
			postfix+=stack.pop();
		}
		
		
		
		
		
		return postfix;
	}
	
	
	static int prec(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
		}
	}

}
