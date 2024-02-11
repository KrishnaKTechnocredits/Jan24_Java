/*
Assignment - 50 : 9th Feb'2024
PhenolV_Assignment_56
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6
*/

package phenol_verma;

public class StringCountDigitInString {

	void stringDigitCount(String str) {
		int countDigit = 0;
		int countDigitSum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				char ch = str.charAt(index);
				countDigit++;
				countDigitSum = countDigitSum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Digit sum from string - " + countDigitSum);
		System.out.println("Digit count from string - " + countDigit);
	}

	public static void main(String[] args) {
		StringCountDigitInString stringCountDigitInString = new StringCountDigitInString();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("Original String - " + str);
		stringCountDigitInString.stringDigitCount(str);
	}
}
