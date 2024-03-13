/*Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha */
package rupali_umagol;

public class Assignment75 {

	boolean isNameContainDigit(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i)))
				return true;
		}
		return false;
	}

	void getNamesLengthMoreThanFive(String[] arr) {

		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean digit = isNameContainDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && !digit) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		Assignment75 assignment75 = new Assignment75();
		assignment75.getNamesLengthMoreThanFive(names);
	}
}
