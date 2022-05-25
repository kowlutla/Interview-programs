package queueUsingStack;

import java.util.Stack;

public class MyQueue {

	Stack<Integer>stack1;				//stack1 for implementing queue
	Stack<Integer>stack2;				//stack2 for implementing queue
	public MyQueue()
	{
		stack1=new Stack<Integer>();		//initializing stacks
		stack2=new Stack<Integer>();
	}
	public void push(int x)					//push operation method
	{
		if(stack1.isEmpty())
		{
			stack1.push(x);							
		}
		else
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			stack1.push(x);
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
		}
	}
	public int pop()						//pop operation method
	{
		if(stack1.isEmpty())
		{
			return -1;
		}
		return stack1.pop();
	}
	public int peek()						//peek operation method
	{
		return stack1.peek();
	}
	public boolean isEmpty()				//isEmpty opration method
	{
		return stack1.isEmpty();
	}
	public static void main(String[] args) 
	{	
		MyQueue q=new MyQueue();				//object creation
		q.push(1);								//pushing 1 into queue 
		q.push(2);		
		q.push(30);
		//pushing 2 into queue
		System.out.println(q.peek());			//calling peek and printing result
		System.out.println(q.pop());
		System.out.println(q.peek());
		//calling pop and printing result
		System.out.println(q.isEmpty());		//calling isEmoty and printing result
	}

}
