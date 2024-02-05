package varsha.AssignmentOn4;
public class MaximumChar {

	int getCharFreqCount(String str, char targetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	void PrintAllCharFreq(String input) {
		int max = 0;
		char targetChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreqCount(input, ch);
			if (max < count) {
				max = count;
				targetChar = ch;
			}
		}
		if (max == 1) {
			System.out.println(input + " having all unique characters");
		} else {
			System.out.println(input + " : " + targetChar + " -> " + max);
		}
	}

	public static void main(String[] args) {
		MaximumChar maximumChar = new MaximumChar();
		maximumChar.PrintAllCharFreq("aakanksha");
		maximumChar.PrintAllCharFreq("teeeccchnocreedits");
		maximumChar.PrintAllCharFreq("maulik");
	}
}