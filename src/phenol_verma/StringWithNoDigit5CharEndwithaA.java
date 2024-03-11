/*Assignment - 75 : 7th March'2024 (15-18 mins)
PhenolV_Assignment_78
Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha */

package phenol_verma;

import java.util.Arrays;

public class StringWithNoDigit5CharEndwithaA {

	boolean checkDigit(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
			}
		}
		return flag;
	}

	void checkString(String[] arr) {

		for (int index = 0; index < arr.length - 1; index++) {
			char ch = arr[index].charAt(arr[index].length() - 1);
			if (arr[index].length() > 5 && checkDigit(arr[index]) == false && (ch == 'a' || ch == 'A')) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		StringWithNoDigit5CharEndwithaA stringWithNoDigit5CharEndwithaA = new StringWithNoDigit5CharEndwithaA();
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		stringWithNoDigit5CharEndwithaA.checkString(names);
	}
}
