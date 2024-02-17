package rohini_deshmane.string_programs;
/*
 * Assignment - 61 : 16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
 */
public class RemoveDigitWhiteSpaceFromString {

	String removeWhite(String str) {
		String withoutWhiteSpace = str;
		for(int i=0; i< str.length(); i++) {
			if(Character.isSpace(str.charAt(i))) {
				withoutWhiteSpace = str.replaceAll(Character.toString(str.charAt(i)), "");
			}
		}
		return withoutWhiteSpace;
	}
	
	String removeDigit(String str) {
		String withoutDigitStr =str;
		for(int i=0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				withoutDigitStr = withoutDigitStr.replace(Character.toString(str.charAt(i)), "");
			}
		}
		return withoutDigitStr;
	}
	
	public static void main(String[] args) {
		RemoveDigitWhiteSpaceFromString removeDigitWhite = new RemoveDigitWhiteSpaceFromString();
		String afterDigit = removeDigitWhite.removeDigit("H2i H3el4lo P4un2e5");
		System.out.println(removeDigitWhite.removeWhite(afterDigit));
	}
}
