package shramika_vaidya;

public class ReplaceDigitWithSpecificChar {

	void replaceDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ReplaceDigitWithSpecificChar().replaceDigit("H2i H3el4lo P4un2e5");
	}
}
