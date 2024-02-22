package garima_s;

class LeftIndent {
	int maxCount = 0;
	
	int getMaxCountWord(String word) {
		if (maxCount < word.length()) {
			maxCount = word.length();
		}
		return maxCount;
	}

	String getWord(String word) {
		String output = "";
		int requiredSpace = maxCount - word.length();
		for (int i = 0; i < requiredSpace; i++) {
			output += " ";
		}
		output = output + word;
		return output;
	}

	void processData() {
		String input = "Hello Hi Technocredits Pune";
		String[] word = input.split(" ");
		String[] output = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			maxCount = getMaxCountWord(word[i]);
		}
		for (int i = 0; i < word.length; i++) {
			output[i] = getWord(word[i]);
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		new LeftIndent().processData();
	}
}
