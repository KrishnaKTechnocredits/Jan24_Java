package garima_s;

public class LeftIndentDigitsFirst {
	int maxCount = 0;
	String output = "";

	int getMaxCountWord(String word) {
		if (maxCount < word.length()) {
			maxCount = word.length();
		}
		return maxCount;
	}

	String getWord(String word) {
		String output = "";
		int spaces = maxCount - word.length();
		for (int i = 0; i < spaces; i++) {
			output += " ";
		}
		output += word;
		return output;
	}

	String getFirstDigits(String word) {
		String str = "";
		String str1 = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				str += ch;
			} else
				str1 += ch;
		}
		output = str + str1;
		return output;
	}

	void processData() {
		String input = "Hel2l5o Hi Tech4nocre7dits Pu1ne";
		String[] word = input.split(" ");
		String[] output1 = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			maxCount = getMaxCountWord(word[i]);
			output1[i] = getFirstDigits(word[i]);
		}
		for (int i = 0; i < word.length; i++) {
			output1[i] = getWord(output1[i]);
			System.out.println(output1[i]);
		}
	}

	public static void main(String[] args) {
		new LeftIndentDigitsFirst().processData();
	}
}
