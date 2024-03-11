/*Assignment - 75 : 7th March'2024 (15-18 mins)

Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha */

package madhura_kulkarni;

public class Assignment75 {
	boolean checkIsDigitInString(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				flag = true;
		}
		return flag;
	}

	void printNames(String[] arr) {
		for (String input : arr) {
			char ch = input.charAt(input.length() - 1);
			boolean flag = checkIsDigitInString(input);
			if (input.length() > 5 && (ch == 'a' || ch == 'A') && flag == false) {
				System.out.println(input);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new Assignment75().printNames(names);
	}

}
