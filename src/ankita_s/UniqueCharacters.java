package ankita_s;

public class UniqueCharacters {
	int getFrequencyOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++)
			if (str.charAt(index) == ch) {
				count++;
			}
		return count;
	}

	void printUniqueCharacters(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (getFrequencyOfChar(str, ch) == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		UniqueCharacters uniqueCharacters = new UniqueCharacters();
		System.out.print("Output is:- ");
		uniqueCharacters.printUniqueCharacters("technocredits");
	}
}
