package garima_s;

public class CountOfDigitsStringArray {

	int getCountOfDigits(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new CountOfDigitsStringArray().getCountOfDigits(input);
	}

}
