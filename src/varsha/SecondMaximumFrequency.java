package varsha;

//Print character with second-highest frequency:
//input: aakanksha
//output: k->2

class SecondMaximumFrequency {

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

	char printMaximumCharacter(String input) {
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
		return target;
	}

	public static void main(String[] args) {
		SecondMaximumFrequency secondMaximumFrequency = new SecondMaximumFrequency();
		String input = "aakanksha";
		char ch = secondMaximumFrequency.printMaximumCharacter(input);
		input = input.replace(Character.toString(ch), "");
		ch = secondMaximumFrequency.printMaximumCharacter(input);
		int count = secondMaximumFrequency.getCountOfChar(input, ch);
		System.out.println(ch + "->" + count);
	}
}
