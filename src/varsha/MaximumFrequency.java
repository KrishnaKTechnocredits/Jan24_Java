package varsha;

//Print the character with maximum frequency:
//input: TeeCccChH
//output: c->4"

class MaximumFrequency {

	int getCountOfChar(String input, char character) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.toLowerCase().charAt(i);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void getMaximumCountCharacter(String input) {
		int max = 0;
		char target = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.toLowerCase().charAt(i);
			int count = getCountOfChar(input, ch);
			if (max < count) {
				max = count;
				target = ch;
			}
		}
		System.out.println(target + "->" + max);
	}

	public static void main(String[] args) {
		MaximumFrequency maximumFrequency = new MaximumFrequency();
		maximumFrequency.getMaximumCountCharacter("TeeCccChH");
	}
}