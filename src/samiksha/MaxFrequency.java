package samiksha;

public class MaxFrequency {

	int getCharFreq(String str, char targetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	void PrintMaxFreq(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreq(input, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}
		}
		System.out.println(input + " : frequency of ch " + targetCh + " is " + max);
		if (max == 1) {
			System.out.println(input + " having all unique characters");
		}
	}

	public static void main(String[] args) {
		MaxFrequency maxFreq = new MaxFrequency();
		maxFreq.PrintMaxFreq("aakanksha");
		maxFreq.PrintMaxFreq("teecccchnoceredites");
		maxFreq.PrintMaxFreq("maulik");
	}

}
