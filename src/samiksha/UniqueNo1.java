package samiksha;

public class UniqueNo1 {

	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char targetCh = str.charAt(index);
			if (targetCh == ch)
				count++;
		}
		return count;
	}

	void printUniqueNo() {
		String str = "technocredits";
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			int charFreq = getCharFreq(str, ch);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		UniqueNo1 uniqueNo = new UniqueNo1();
		uniqueNo.printUniqueNo();
	}

}
