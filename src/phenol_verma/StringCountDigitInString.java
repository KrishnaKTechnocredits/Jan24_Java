/*
Assignment - 50 : 9th Feb'2024
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6
*/

package phenol_verma;

public class StringCountDigitInString {

	void stringDigitCount(String str) {
		String finalStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (!Character.isDigit(str.charAt(index))) {
				finalStr = finalStr + str.charAt(index);
			}
		}
		System.out.println("String after digits removal - " + finalStr);
	}

	public static void main(String[] args) {
		StringCountDigitInString stringCountDigitInString = new StringCountDigitInString();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("Original String - " + str);
		stringCountDigitInString.stringDigitCount(str);
	}
}
