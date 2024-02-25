/* Print only unique vowels:
input: technocredits
output: oi  */

package pallavi_raut;

public class FindUniqueVovelsInGivenString_56 {

	public static void main(String[] args) {
		FindUniqueVovelsInGivenString_56 findUniqueVovelsInGivenString = new FindUniqueVovelsInGivenString_56();
		findUniqueVovelsInGivenString.printUniqueVovels("technocredits");
	}

	void printUniqueVovels(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch))
					System.out.print(ch);
			}
		}
	}
}
