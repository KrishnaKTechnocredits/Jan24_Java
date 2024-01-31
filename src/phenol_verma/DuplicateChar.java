/*Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak */

package phenol_verma;

public class DuplicateChar {
	void dupChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (index == str.indexOf(chr)) {
				if (str.indexOf(chr) != str.lastIndexOf(chr)) {
					System.out.print(str.charAt(index));
				}	
			}
		}
	}
	public static void main(String[] args) {
		DuplicateChar duplicateChar = new DuplicateChar();
		duplicateChar.dupChar("aakanksha");
	}

}
