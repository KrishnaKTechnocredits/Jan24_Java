package technocredits;

public class StringEx2 {

	int getCharFreq(String input, char ch) {
		// Logic
		return 0;
	}

	void printUniqueChar() {
		String str = "technocredits";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int charCount = getCharFreq(str, ch);
			if (charCount == 1)
				System.out.print(ch);
		}
	}
}
