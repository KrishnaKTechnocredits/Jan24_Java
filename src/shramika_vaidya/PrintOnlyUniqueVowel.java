package shramika_vaidya;

public class PrintOnlyUniqueVowel {

	int getCharVowelCount(String str, char targetchar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (ch == targetchar) {
					count++;
				}
			}
		}
		return count;
	}

	void printVowelIfUnique(String input) {
		char targetchar = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charcount = getCharVowelCount(input, ch);
			if (charcount == 1) {
				targetchar = ch;
				System.out.print(targetchar);
			}
		}
	}

	public static void main(String[] args) {
		new PrintOnlyUniqueVowel().printVowelIfUnique("technocredits");
	}
}
