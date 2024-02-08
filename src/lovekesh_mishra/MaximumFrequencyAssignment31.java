package lovekesh_mishra;

class MaximumFrequencyAssignment31 {

	int getCharFrequency(String str, char targetch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetch) {
				count++;
			}
		}
		return count;
	}

	void printAllCharFrequency(String input) {
		int max = 0;
		char targetch = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharFrequency(input, ch);
			if (max < count) {
				max = count;
				targetch = ch;
			}

		}
		if (max == 1) {
			System.out.println(input + " having all unique characters");
		} else {
			System.out.println(input + "-->" + targetch + "-" + max);
		}
	}

	public static void main(String[] args) {
		MaximumFrequencyAssignment31 ans = new MaximumFrequencyAssignment31();
		ans.printAllCharFrequency("aakanksha");
		ans.printAllCharFrequency("teeccchnoceredites");
		ans.printAllCharFrequency("maulik");

	}

}
