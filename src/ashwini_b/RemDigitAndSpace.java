package ashwini_b;
/*
Assignment - 65 :  16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
 */
public class RemDigitAndSpace {

	void remDigitSpace(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				input = input.replace(ch, '*');
				// input = input.replace(' ','*');
			}
			input = input.replace(' ', '*');
		}
		input = input.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		RemDigitAndSpace remDigitAndSpace = new RemDigitAndSpace();
		remDigitAndSpace.remDigitSpace("H2i H3el4lo P4un2e5");
	}
}
