package garima_s;
/*"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
*/

class RemoveDigitsWhitespace {
	void printRemoveDigitWhiteSpace(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch) && ch != ' ') {
				output += ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new RemoveDigitsWhitespace().printRemoveDigitWhiteSpace(input);
	}
}