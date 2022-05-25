package OOPSConcepts;

public class Constructor {

	
	
	public static void main(String[] args) {
	
		Firefox f=new Firefox("kowlutla");
		f.getString();

	}

}

class Firefox
{
	private String s;
	public Firefox(String s)
	{
		s=s;
	}
	public String getString()
	{
		return s;
	}
}