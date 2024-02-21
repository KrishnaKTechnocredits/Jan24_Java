/*Assignment - 65 :  16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune" */

package padmaja;

public class RemoveDigitsWhiteSpaceFromString {

	void removeDigitsAndWhiteSpace(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) || Character.isWhitespace(ch)) {
				String temp = String.valueOf(ch);
				str = str.replace(temp, "*");
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		new RemoveDigitsWhiteSpaceFromString().removeDigitsAndWhiteSpace("H2i H3el4lo P4un2e5");
	}
}
