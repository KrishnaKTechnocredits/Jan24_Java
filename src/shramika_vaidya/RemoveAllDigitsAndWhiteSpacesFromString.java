package shramika_vaidya;

public class RemoveAllDigitsAndWhiteSpacesFromString {

	void isDigitOrSpace(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || Character.isWhitespace(ch)) {
				String temp = String.valueOf(ch);
				str = str.replace(temp, "*");
			}
		}
		String str1 = str.replace("*", "");
		System.out.println(str1);
	}

	public static void main(String[] args) {
		new RemoveAllDigitsAndWhiteSpacesFromString().isDigitOrSpace("H2i H3el4lo P4un2e5");
	}
}
