package atisha;

//print max frequency of given string
class Assignment31 {
	int getFreqOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	void printMaxFreq(String input) {
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
		Assignment31 max = new Assignment31();
		max.printMaxFreq("aakanksha");
		max.printMaxFreq("teecccchnoceredites");
		max.printMaxFreq("maulik");
	}
}
