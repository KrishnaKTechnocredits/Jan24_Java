/*Assignment - 50 : 9th Feb'2024
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6*/

package pallavi_raut;

public class FindDigitInString_50 {
	
	public static void main(String[] args) {

		String input = "H2i H3el4lo P4un2e5";
		FindDigitInString_50 findDigitInString = new FindDigitInString_50();
		findDigitInString.countDigitsInString(input);
	}	

	void countDigitsInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		System.out.println("Total number of digits in given string is: " + count);
	}
}
