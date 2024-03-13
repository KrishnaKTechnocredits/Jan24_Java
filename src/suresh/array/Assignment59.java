package suresh.array;

public class Assignment59 {

	int getCharFrequecy(String input, char ch) {
		int count = 0;
		// input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {

			char ch1 = input.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	char getMaxFrequecy(String input) {
		int maxcount = 0;
		char maxchar = ' ';
		String str = input.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = getCharFrequecy(str, ch);
			if (count > maxcount) {
				maxcount = count;
				maxchar = ch;

			}

		}
		System.out.println(maxchar);
		System.out.println(maxcount);

		return maxchar;
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		assignment59.getMaxFrequecy("TeeCccChH");
	}
}
