package mainMethodQuestions;


//Can we override a method: NO
public class MainMethodOverride {

	public static void main(String[] args) {
		
		System.out.println("Main method1....");

	}
}
class MainMethodOverride1 extends MainMethodOverride
{
	//@Override
	public static void main(String ...args)
	{
		System.out.println("Main Method 2...");
	}
}
