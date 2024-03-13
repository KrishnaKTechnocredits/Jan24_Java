/*Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune */

package kanchan_ghuge;

public class Assignment65 {

	void removeDigitsAndWhiteSpaces(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !(str.charAt(index) == ' ')) {
				output += ch;
			}
		}
		System.out.println("String After Removing digits and Whitespace Characters : " + output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new Assignment65().removeDigitsAndWhiteSpaces(input);
	}
}
