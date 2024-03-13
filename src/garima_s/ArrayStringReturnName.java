/*Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
output : Samiksha 
*/

package garima_s;

public class ArrayStringReturnName {
	boolean isNameContainsDigit(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index)))
				return true;
		}
		return false;
	}

	void getNameEndWithA(String[] arr) {
		String output = "";
		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean flagDigit = isNameContainsDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && !flagDigit) {
				output = name;
				System.out.println(output);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new ArrayStringReturnName().getNameEndWithA(names);
	}
}
