package trickyPrograms;
//What will happen if you put return statement or System.exit () on try or catch block?
//Will finally block execute?


public class Tricky2 {

	public static void main(String[] args) {
		
		Tricky2 t=new Tricky2();
		t.check(0);
		
	}
	
	public void check(int k)
	{
		try {
			if(10/k==5)
			{
				System.out.println("Yes");
			}
		}
		catch(Exception e)
		{
			//System.exit(0);
			return;
		}
		finally 
		{
			System.out.println("Finally");
		}
	}

}

/*
 *  finally block will execute even if you put a return statement in the try block 
 *  or catch block but finally block won't run if you call System.exit() from try 
 *  or catch block.

 */
