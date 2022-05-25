package OOPSConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	m.sum(10,20);
	m.sum(10,3.4f);

	}

	public void sum(int a,int b)
	{
		System.out.println("Int+Int");
	}
	public void sum(int b)
	{
		System.out.println("Int");
	}
	public void sum(float a,float b)
	{
		System.out.println("Float+Float");
	}
	public void sum(int a,float b)
	{
		System.out.println("Int+Float");
	}
	public void sum(double a,int b)
	{
		System.out.println("double+Int");
	}
}
