package varsha;

//Print only unique vowels:
//input: technocredits
//output: oi"

class UniqueVowelCharFromStr {

	int getCountOfChar(String input, char character) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void printUniqueVowel(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int Count = getCountOfChar(input, ch);
			if (Count == 1) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		UniqueVowelCharFromStr uniqueVowelCharFromStr = new UniqueVowelCharFromStr();
		uniqueVowelCharFromStr.printUniqueVowel("technocredits");
	}
}