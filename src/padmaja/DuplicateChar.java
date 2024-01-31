/*Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak */

package padmaja;

public class DuplicateChar {
	void printUniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch))
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateChar duplicateChar = new DuplicateChar();
		duplicateChar.printUniqueChar("aakanksha");
	}
}
