/*WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6 */

package kanchan_ghuge;

class Assignment50 {

	void countDigitInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		System.out.println("Digits in given String is = " + count);
	}

	public static void main(String[] args) {
		String s = "H2i H3el4lo P4un2e5";
		new Assignment50().countDigitInString(s);
	}
}
