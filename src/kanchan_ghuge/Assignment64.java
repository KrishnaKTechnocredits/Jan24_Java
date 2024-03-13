/*Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?! */

package kanchan_ghuge;

public class Assignment64 {

	void placingSpecialCharactersAtTheEnd(String str) {
		String temp1 = "";
		String temp2 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch)) {
				temp1 += ch;
			} else {
				temp2 += ch;
			}
		}
		System.out.println("String by placing special characters at the end : " + temp1 + temp2);
	}

	public static void main(String[] args) {
		String input = "-AasH?3v7i!";
		new Assignment64().placingSpecialCharactersAtTheEnd(input);
	}
}
