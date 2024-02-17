/*"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
*/

package garima_s;

class ReplaceDigitsWithSpecial {
	void printReplaceDigits(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				input = input.replace(String.valueOf(ch), "*");
			}
		}
		System.out.println("String With Special Characters : "+input);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new ReplaceDigitsWithSpecial().printReplaceDigits(input);
	}
}