package mainMethodQuestions;

//Can we overload the main Method: YES

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main method with String args[].... ");
	}
	
	public static void main(Integer args[])
	{
		System.out.println("Main Method with Integer args[]....");
	}
	
	public static void main(Double args[])
	{
		System.out.println("Main method with Double args[].....");
	}
	
	public static void main(Object args[])
	{
		System.out.println("Main Method with Object args[].....");
	}
	
	public static void main(Float args[])
	{
		System.out.println("Main method with Float args[].......");
	}
	

}
