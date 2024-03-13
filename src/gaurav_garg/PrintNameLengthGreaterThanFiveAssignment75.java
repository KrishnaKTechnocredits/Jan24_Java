/*
Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
output : Samiksha 
 */

package gaurav_garg;

public class PrintNameLengthGreaterThanFiveAssignment75 {

	boolean checkdigit(String s) {
		for (int index = 0; index < s.length(); index++) {
			if (Character.isDigit(s.charAt(index))) {
				return true;
			}
		}
		return false;
	}

	void printNamewWithLeanghthGreterThan5(String[] names) {
		for (String name : names) {
			if (name.length() > 5) {
				if (name.charAt(name.length() - 1) == 'a' || name.charAt(name.length() - 1) == 'A') {
					boolean answer = checkdigit(name);
					if (answer == false)
						System.out.print(name);
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new PrintNameLengthGreaterThanFiveAssignment75().printNamewWithLeanghthGreterThan5(names);
	}
}
