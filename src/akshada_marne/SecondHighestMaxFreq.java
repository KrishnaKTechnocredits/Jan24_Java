package akshada_marne;

public class SecondHighestMaxFreq {

	int checkCharFreq(String str, char target) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == target) {
				count++;
			}
		}
		return count;
	}

	char getMaxFreq(String str) {
		int max = 0;
		char maxChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = checkCharFreq(str, ch);

			if (count > max) {
				max = count;
				maxChar = ch;
			}
		}

		return maxChar;
	}

	void printnthMaxFreq(String str) {
		char nthFreqChar = getMaxFreq(str);

		if (nthFreqChar == 1) {
			System.out.print(nthFreqChar);
		} 
		else {
			String temp = str.valueOf(nthFreqChar);
			str = str.replace(temp, "");

			nthFreqChar = getMaxFreq(str);
		}

		System.out.print("Second maximum character is " + nthFreqChar);
	}

	public static void main(String args[]) {
		SecondHighestMaxFreq secondHighestMaxFreq = new SecondHighestMaxFreq();
		secondHighestMaxFreq.printnthMaxFreq("aakanksha");
	}

}
