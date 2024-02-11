/*
 WAP to find count of digits in a given String.
 String str = "H2i H3el4lo P4un2e5";
 output : 6
 */
package gaurav_garg;

public class CountOfDigitInStringAssignment50 {

	void printCountDigitInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char char1 = str.charAt(index);
			if (Character.isDigit(char1)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new CountOfDigitInStringAssignment50().printCountDigitInString("H2i H3el4lo P4un2e5");
	}
}
