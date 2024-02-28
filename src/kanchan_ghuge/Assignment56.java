/*Print only unique vowels:
input: technocredits
output: eo  */
package kanchan_ghuge;

class Assignment56 {

	void printUniqueVowels(String input) {
		input = input.toLowerCase();
		System.out.println("Printing Unique Vowels in a String = ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch))
					System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new Assignment56().printUniqueVowels(str);
	}
}
