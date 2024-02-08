/*"Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = ""aakanksha"";
output : ak "
*/

package madhura_kulkarni;

public class Assignment25 {

	void checkUniqueChar(String input) {
		System.out.print("Unique characters in a given string are: ");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i == input.indexOf(ch)) {

				if (input.indexOf(ch) != input.lastIndexOf(ch))
					System.out.print(input.charAt(i));
			}
		}

	}

	public static void main(String[] args) {
		String st1 = "madhurakulkarni";
		Assignment25 ass25 = new Assignment25();
		ass25.checkUniqueChar(st1);
	}

}
