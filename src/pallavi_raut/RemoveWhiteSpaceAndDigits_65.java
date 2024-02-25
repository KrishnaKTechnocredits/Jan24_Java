//Remove digits and whitespace characters:
//input: H2i H3el4lo P4un2e5
//output: HiHelloPune"

package pallavi_raut;

public class RemoveWhiteSpaceAndDigits_65 {

	public static void main(String[] args) {
		RemoveWhiteSpaceAndDigits_65 removeWhiteSpaceAndDigits = new RemoveWhiteSpaceAndDigits_65();
		removeWhiteSpaceAndDigits.removeDigitAndSpace("H2i H3el4lo P4un2e5");

	}

	void removeDigitAndSpace(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !(str.charAt(index) == ' ')) {
				output = output + ch;

			}

		}
		System.out.println(output);
	}
}