package mainMethodQuestions;

//Can you override a private or static method in Java?
//Answer: NO

public class PrivateMethodOverride {
	
	public static void main(String args[])
	{
		Child p=new Child();
		p.think();
	}

}
class Parent
{
	protected void show()
	{
		System.out.println("Parent show ");
	}
	 void think()
	 {
		 System.out.println("Parent think ");
	 }
}

class Child extends Parent
{
	
	public void show()
	{
		super.show();
	}
}