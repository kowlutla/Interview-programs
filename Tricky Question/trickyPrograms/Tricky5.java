package trickyPrograms;

public class Tricky5 {

	public static void main(String[] args) {
		
		T t=new T();
		System.out.println(t.x);
		

	}

}
class T
{
	static final int x=10;
	static
	{
		System.out.println("T class");
	}
}