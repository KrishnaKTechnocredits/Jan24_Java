package garima_s;

public class RemoveDigitsStringArray {
	void removeDigits(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch)) {
				output += ch;
			}
		}
		System.out.println("String Without Digits : " + output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new RemoveDigitsStringArray().removeDigits(input);
	}
}
