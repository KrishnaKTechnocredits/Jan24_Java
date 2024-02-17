/*
Assignment - 66 : 16th Feb'2024
PhenolV_Assignment_71
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 * package phenol_verma;
 */
package phenol_verma;

public class StrDigitReplaceToSpecfChar {

	void replaceSpaceSpclChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (Character.isDigit(chr)) {
				str = str.replace(Character.toString(chr), "*");
			}
		}
		System.out.println("String after replacment of digit into * - " + str);
	}

	public static void main(String[] args) {
		StrDigitReplaceToSpecfChar strDigitReplaceToSpecfChar = new StrDigitReplaceToSpecfChar();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("Original String - " + str);
		strDigitReplaceToSpecfChar.replaceSpaceSpclChar(str);
	}

}
