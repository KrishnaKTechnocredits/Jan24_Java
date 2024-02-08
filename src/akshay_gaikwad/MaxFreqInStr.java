package akshay_gaikwad;

public class MaxFreqInStr {
	int getFreqOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	void printMaxFreqCh(String input) {
		int maxFreq = 1;
		char maxCh = '-';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = getFreqOfChar(input, ch);
			if (freq > maxFreq) {
				maxFreq = freq;
				maxCh = ch;
			}
		}
		if (maxFreq == 1) {
			System.out.println(input + " having all unique characters.");
		} else {
			System.out.println(input + " -> " + maxCh + " -> " + maxFreq);
		}
	}

	public static void main(String[] args) {
		MaxFreqInStr maxFreqInStr = new MaxFreqInStr();
		maxFreqInStr.printMaxFreqCh("aakanksha");
		maxFreqInStr.printMaxFreqCh("teecccchnoceredites");
		maxFreqInStr.printMaxFreqCh("maulik");
	}
}
