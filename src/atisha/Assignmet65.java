//"Remove digits and whitespace characters:
//input: H2i H3el4lo P4un2e5

package atisha;

public class Assignmet65 {

	String removeDigitSpace(String str) {
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isDigit(ch) || ch == ' ') {

				str = str.replace(ch, '*');
			}
		}
		String str2 = String.valueOf('*');
		str = str.replace(str2, "");

		System.out.println(str);
		return str;

	}

	public static void main(String[] args) {
		new Assignmet65().removeDigitSpace("H2i H3el4lo P4un2e5");

	}
}
