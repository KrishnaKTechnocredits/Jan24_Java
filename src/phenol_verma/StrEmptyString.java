/*
Assignment - 63 : 16th Feb'2024
PhenolV_Assignment_68
"Detect empty input string:
input: """"
output: Empty string, no character found."
*/

package phenol_verma;

public class StrEmptyString {

	void findEmptyString(String str) {
		if (str.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

	public static void main(String[] args) {
		StrEmptyString strEmptyString = new StrEmptyString();
		String str = "";
		System.out.println("Original String - " + str);
		strEmptyString.findEmptyString(str);
	}
}
