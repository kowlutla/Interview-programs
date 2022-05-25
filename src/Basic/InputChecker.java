package Basic;

import java.util.*;

public class InputChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Data: ");
		if (input.hasNextInt()) {
			System.out.print("Integer");
		} else if (input.hasNextFloat())
			System.out.println("This input is of type Float.");

		else if (input.hasNextLine())
			System.out.println("This input is of type string.");

		else if (input.hasNextDouble())
			System.out.println("This input is of type Double.");

		else if (input.hasNextBoolean())
			System.out.println("This input is of type Boolean.");

		else if (input.hasNextLong())
			System.out.println("This input is of type Long.");

	}

}
