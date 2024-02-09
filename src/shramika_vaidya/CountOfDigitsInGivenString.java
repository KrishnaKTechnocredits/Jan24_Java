package shramika_vaidya;

public class CountOfDigitsInGivenString {

	int getCountOfDigitInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("total digit in String -> " + count);
		return count;
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new CountOfDigitsInGivenString().getCountOfDigitInString(str);
	}
}
