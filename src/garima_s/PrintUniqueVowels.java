/*	
Print only unique vowels:
input: technocredits
output: eo
 */

package garima_s;

public class PrintUniqueVowels {
	void printUniqueVowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = Character.toLowerCase(input.charAt(index));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch))
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.print("Unique Vowels in String : ");
		new PrintUniqueVowels().printUniqueVowels(input);
	}
}
