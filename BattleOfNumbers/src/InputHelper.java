
public class InputHelper {

	/*
	 * Check the string or input if it is a valid(Number Integer) Input
	 * -checks if is Nan
	 * -checks if is less than 2(Contestants needs to be 2 or more to proceed) 
	 */
	static int validate(String str) {
		int input;
		
		if(isNan(str)) {
			System.out.println("Invalid input! Please enter numerical values only.");
			return 0;
		}
		
		input = Integer.parseInt(str);
		
		if(input < 2) {
			System.out.println("Invalid input! Please enter a number of contestant higher than 1.");
			return 0;
		}
		
		return input;
	}
	
	/*
	 * Check if the string is Nan
	 */
	static boolean isNan(String str) {
		int input;
		try {
			input = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			return true;
		}
		return false;
	}
	
}
