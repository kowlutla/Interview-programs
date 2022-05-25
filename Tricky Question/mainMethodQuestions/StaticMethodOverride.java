package mainMethodQuestions;


//Can we Override a static method : NO
public class StaticMethodOverride {

	public static void main(String[] args) {
		
		StaticOverrideParent s=new StaticOverrideChild();
		s.show();

	}

}

class StaticOverrideParent
{
	public static void show()
	{
		System.out.println("Parent show ");
	}
	
}

class StaticOverrideChild extends StaticOverrideParent
{
	//@Override
	public static void show()
	{
		System.out.println("Child Show....");
	}
}
