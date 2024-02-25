package rohini_deshmane.string_programs;
/*
 * Assignment - 66 : 16th Feb'2024
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 */

public class ReplaceDigitwithSpecialChar {

	void replaceDigitWithChar(String str) {
		String updatedString = str;
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(updatedString.charAt(i))) {
				updatedString = updatedString.replace(Character.toString(updatedString.charAt(i)), "*");
			}
		}
		System.out.println(updatedString);
	}
	
	public static void main(String[] args) {
		ReplaceDigitwithSpecialChar replaceDigit = new ReplaceDigitwithSpecialChar();
		replaceDigit.replaceDigitWithChar("H2i H3el4lo P4un2e5");
	}
}
