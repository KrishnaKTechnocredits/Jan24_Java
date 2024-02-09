package shramika_vaidya;

public class RemoveAllDigitsFromGivenString {

	String getDigitRemovedFromString(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!Character.isDigit(ch))) {
				str1 = str1 + ch;
			}
		}
		System.out.print(str1);
		return str1;
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		RemoveAllDigitsFromGivenString removeAllDigitsFromGivenString = new RemoveAllDigitsFromGivenString();
		removeAllDigitsFromGivenString.getDigitRemovedFromString(str);
	}
}
