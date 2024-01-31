/*Assignment - 24 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [with indexOf & lastIndexOf]

String str = ""technocredits"";
output : hnordis"
*/
package madhura_kulkarni;

public class Assignment24 {

	void checkUniqueChar(String input) {
		System.out.print("Unique characters in a given string are: ");
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.print(input.charAt(i));
		}
	}

	public static void main(String[] args) {
		String st1 = "technocredits";
		Assignment24 ass24 = new Assignment24();
		ass24.checkUniqueChar(st1);

	}

}
