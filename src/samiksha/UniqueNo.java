package samiksha;

public class UniqueNo {

	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char targetCh = str.charAt(index);
			if (ch == targetCh)
				count++;
		}
		return count;
	}

	void printUniqueChar() {
		String str = "technocredits";
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			int charFreq = getCharFreq(str, ch);
			if (charFreq == 1)
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		UniqueNo uniqueNo = new UniqueNo();
		uniqueNo.printUniqueChar();
	}
}
