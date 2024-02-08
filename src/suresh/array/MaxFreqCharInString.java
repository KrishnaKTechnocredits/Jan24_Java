package suresh.array;

public class MaxFreqCharInString {

	int getcharfrequcy(String input, char targetch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == targetch) {
				count++;
			}
		}
		return count;

	}

	void printCountOfChar(String str) {
		int max = 0;
		char targetch = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = getcharfrequcy(str, ch);
			if (max < count) {
				max = count;
				targetch = ch;
			}
		}
		System.out.println(targetch + "-->" + max);
		if (max == 1) {
			System.out.println(str + " having all unique characters");
		}

	}

	public static void main(String[] args) {
		MaxFreqCharInString maxFreqCharInString = new MaxFreqCharInString();
		maxFreqCharInString.printCountOfChar("aakanksha");
		maxFreqCharInString.printCountOfChar(" teecccchnoceredites");
		maxFreqCharInString.printCountOfChar("maulik");
	}
}
