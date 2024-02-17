/*
 Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 */

package gaurav_garg;

public class ReplaceDigitWithSpecificCharacterAssigment66 {

	void printRearrangeTheString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char char1 = str.charAt(index);
			if (Character.isDigit(char1)) {
				str = str.replace(char1, '*');
			}
		}
		System.out.print(str);
	}

	public static void main(String[] args) {
		new ReplaceDigitWithSpecificCharacterAssigment66().printRearrangeTheString("H2i H3el4lo P4un2e5");
	}
}
