package mainMethodQuestions;

public class MainMethodStatic {

	public static void main(String[] args) {
		
		c3 c=new c3();
		c.show();
				
			
		

	}

}

class c1
{
	void show()
	{
		System.out.println("c1 show....");
	}
}

interface i1
{
	void show();
}

class c3 extends c1 implements i1
{
	@Override
	public void show()
	{
		System.out.println("c3 show");
	}
	
}


