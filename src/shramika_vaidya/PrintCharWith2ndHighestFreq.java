package shramika_vaidya;

public class PrintCharWith2ndHighestFreq {

	int getCharCount(String str, char targetchar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if (targetchar == ch) {
				count++;
			}
		}
		return count;
	}

	void printCharWith2ndHighestFreq(String input) {
		int max = 0;
		int secondMax = 0;
		char targetchar = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charcount = getCharCount(input, ch);
			if (max < charcount) {
				max = charcount;
			} else if (secondMax < charcount && max > charcount) {
				secondMax = charcount;
				targetchar = ch;
			}
		}
		System.out.println(targetchar + "->" + secondMax);
	}

	public static void main(String[] args) {
		new PrintCharWith2ndHighestFreq().printCharWith2ndHighestFreq("aakanksha");
	}
}
