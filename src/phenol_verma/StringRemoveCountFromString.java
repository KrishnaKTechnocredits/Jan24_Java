/*
Assignment - 51 : 9th Feb'2024
WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune
*/

package phenol_verma;

public class StringRemoveCountFromString {

	void stringDigitCount(String str) {
		String finalStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				finalStr = finalStr + str.charAt(index);
			}
		}
		System.out.println("String after digits removal - " + finalStr);
	}

	public static void main(String[] args) {
		StringRemoveCountFromString stringRemoveCountFromString = new StringRemoveCountFromString();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("Original String - " + str);
		stringRemoveCountFromString.stringDigitCount(str);
	}
}
