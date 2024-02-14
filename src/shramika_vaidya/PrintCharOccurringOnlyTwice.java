package shramika_vaidya;

public class PrintCharOccurringOnlyTwice {

	int getCharCount(String str, char targetchar) {
		int charcount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (targetchar == ch) {
				charcount++;
			}
		}
		return charcount;
	}

	void printCharHavingFreq2(String input) {
		for (int index = 0; index < input.length(); index++) {
			char chr = input.charAt(index);
			int chcount = getCharCount(input, chr);
			if (chcount == 2) {
				if (input.indexOf(chr) == index) {
					System.out.print(chr);
				}
			}
		}
	}

	public static void main(String[] args) {
		new PrintCharOccurringOnlyTwice().printCharHavingFreq2("teecccchhhnno");
	}
}
