package trickyPrograms;

import java.util.Arrays;

public class UniCodeSystem {
	
	static int temp=0;
	public static void show()
	{
		System.out.println(temp);
	}

	public static void main(String[] args) {
		
		char []c=new char[] {
				'\u0097'
		};
		String s=new String(c);
		System.out.println(s);
		byte[]array=s.getBytes();
		System.out.println(Arrays.toString(array));
		show();
	}

}
