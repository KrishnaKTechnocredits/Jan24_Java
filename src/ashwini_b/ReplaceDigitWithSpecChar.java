package ashwini_b;

/*
Assignment - 66 : 16th Feb'2024
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 */
public class ReplaceDigitWithSpecChar {

	String replaceDigit(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				input = input.replace(ch, '*');
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ReplaceDigitWithSpecChar replaceDigitWithSpecChar = new ReplaceDigitWithSpecChar();
		String outputString = replaceDigitWithSpecChar.replaceDigit("H2i H3el4lo P4un2e5");
		System.out.println(outputString);
	}
}
