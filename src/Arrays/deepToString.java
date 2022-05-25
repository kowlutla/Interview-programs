package Arrays;

import java.util.Arrays;

public class deepToString {

	public static void main(String[] args)
	{
		String array1[]= {"kowlutla","deepu","hari","hindu","roopa","aruna","lakshmi","keshavaiah"};
		System.out.println("--------------------------------------------------------");
		System.out.println("Single Dimensional array: ");
		System.out.println(Arrays.deepToString(array1));
		System.out.println("---------------------------------------------------");
		System.out.println("Two Dimensional Array: ");
		String array2[][]={{"kowlutla","deepu","hari"},{"hindu","roopa","aruna","lakshmi","keshavaiah"}};
		System.out.println(Arrays.deepToString(array2));
		for(int i=0;i<array2.length;i++)
		{
			
			
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Three Dimensional Array: ");
		String array3[][][]=new String[][][]
				{
			{
				{"ONE", "TWO", "THREE"},
				{"FOUR", "FIVE", "SIX", "SEVEN"},
				{"ONE", "TWO", "THREE"},
				{"FOUR", "FIVE", "SIX", "SEVEN"}
			}
				};
		System.out.println(Arrays.deepToString(array3));
	}

}
