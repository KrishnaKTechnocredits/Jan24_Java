/*WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune  */

package kanchan_ghuge;

class Assignment51 {

	void removeDigitFromString(String str) {
		String str1 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				str1 += ch;
			}
		}
		System.out.println("Output String after removing all digits from given String = " + str1);
	}

	public static void main(String[] args) {
		String s = "H2i H3el4lo P4un2e5";
		new Assignment51().removeDigitFromString(s);
	}
}
