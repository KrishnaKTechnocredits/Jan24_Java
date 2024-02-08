package sasmita;

public class MaxGetCharFreq {
	int getCharFreqCount(String str, char tagetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == tagetCh) {
				count++;
			}
		}
		return count;
	}

	void printAllCharFreq(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreqCount(input, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}

		}
		if (max == 1) {
			System.out.println(input + " is having all unique character");
		} else {
			System.out.println(targetCh + " --> " + max);
		}
	}

	public static void main(String[] args) {
		MaxGetCharFreq maxGetCharFreq = new MaxGetCharFreq();
		maxGetCharFreq.printAllCharFreq("aakanksha");
		maxGetCharFreq.printAllCharFreq("teecccchnoceredite");
		maxGetCharFreq.printAllCharFreq("maulik");

	}

}
