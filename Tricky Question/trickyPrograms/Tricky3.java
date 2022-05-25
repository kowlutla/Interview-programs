/**
  Question: What do the expression 1.0 / 0.0 will return? will it throw Exception?
   any compile time error?


 */
package trickyPrograms;

/**
 * @author apiiit-rkv
 *
 */
public class Tricky3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("(1.0/0.0) : "+1.0/0.0);
		System.out.println("(1f/0) : "+1f/0f);
//		System.out.println("(1/0) : "+1/0);
//		System.out.println('a'/'b');
//		long a=10;
//		long b=0;
//		System.out.println(a/b);
		float d=2.0f%0;
		System.out.println(d);
		System.out.println(Double.isNaN(d));

	}

}
