package garima_s;

public class LeftIndentWordWithSum {
	int maxCount = 0;
	int sum = 0;
	String str = "";

	int getMaxCount(String word) {
		if (maxCount < word.length()) {
			maxCount = word.length();
		}
		return maxCount;
	}

	String getSumWord(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				word = word.replace(ch, '*');
				sum = sum + Character.getNumericValue(ch);
			}
		}
		output = word.replace(String.valueOf('*'), "");
		str = "" + sum;
		return output;
	}

	String getWordLeftIndent(String word) {
		String output = "";
		int space = maxCount - word.length();
		for (int i = 0; i < space; i++) {
			output += " ";
		}
		output += word;
		return output;
	}

	void processData() {
		String input = "Hel5l2o Hi techno3cred2its P1une";
		String[] word = input.split(" ");
		String[] output1 = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			output1[i] = getSumWord(word[i]);
			maxCount = getMaxCount(output1[i]);
		}
		for (int i = 0; i < word.length; i++) {
			output1[i] = getWordLeftIndent(output1[i]);
			System.out.println(output1[i]);
		}
		str = getWordLeftIndent(str);
		System.out.println(str);
	}

	public static void main(String[] args) {
		new LeftIndentWordWithSum().processData();
	}
}