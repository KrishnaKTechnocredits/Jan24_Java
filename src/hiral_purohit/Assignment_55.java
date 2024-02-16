package hiral_purohit;

public class Assignment_55 {

	int toGetRepeatedChar(String input, char temp) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == temp) {
				count++;
			}
		}
		return count;
	}

	void toPrintDuplicateChar(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = toGetRepeatedChar(input, ch);
			if (input.indexOf(ch) == i) {
				if (count == 2) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Assignment_55().toPrintDuplicateChar("teecccchhhnno");
	}
}
