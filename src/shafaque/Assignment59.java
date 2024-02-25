package shafaque;

public class Assignment59 {

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
		Assignment59 assignment59 = new Assignment59();
		assignment59.getMaximumCountCharacter("TeeCccChH");
	}
}
