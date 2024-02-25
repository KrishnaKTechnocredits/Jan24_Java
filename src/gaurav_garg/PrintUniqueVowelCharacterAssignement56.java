/*
 Print only unique vowels:
input: technocredits
output: oi"
 */
package gaurav_garg;

public class PrintUniqueVowelCharacterAssignement56 {

	static void printOnlyUniqueVowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		printOnlyUniqueVowel("technocredits");
	}

}
