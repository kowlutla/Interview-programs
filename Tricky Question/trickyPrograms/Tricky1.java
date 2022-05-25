package trickyPrograms;

public class Tricky1 {

	public static void main(String[] args) {
		
		
		//Double.MIN_VALUE and Double.MAX_VALUE both are positive so 
		System.out.println("Double Values: ");
		System.out.println("Double Maximum value: "+Double.MAX_VALUE);
		System.out.println("Double Minimum value: "+Double.MIN_VALUE);
		System.out.println("Math.max(Double.MIN_VALUE, 0.0) :"+Math.max(Double.MIN_VALUE, 0.0));
		System.out.println("Math.min(Double.MIN_VALUE, 0.0): "+Math.min(Double.MIN_VALUE, 0.0));
		
		
		System.out.println("- - - - Integer Values - - - - - ");
		
		System.out.println("Integer Maximum Value: "+Integer.MAX_VALUE);
		System.out.println("Integer Minimum Value: "+Integer.MIN_VALUE);
		System.out.println("Math.max(Integer.MAX_VALUE, 0) : "+Math.max(Integer.MAX_VALUE, 0));
		System.out.println("Math.min(Integer.MIN_VALUE, 0) : "+Math.min(Integer.MIN_VALUE, 0));
		
		System.out.println("- - - - Float Values - - - - - - ");
		System.out.println("Float Maximum value: "+Float.MAX_VALUE);
		System.out.println("Float Minimum value: "+Float.MIN_VALUE);
		System.out.println("Math.max(Float.MIN_VALUE, 0f) : "+Math.max(Float.MIN_VALUE, 0f));
		System.out.println("Math.min(Float.MIN_VALUE, 0) : "+Math.min(Float.MIN_VALUE, 0));
	}

}

