package akshada_marne;

public class ReplaceDigitsWthSpecialCharacter {
	void replaceFunction(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String args[]) {
		ReplaceDigitsWthSpecialCharacter replaceDigitsWthSpecialCharacter = new ReplaceDigitsWthSpecialCharacter();
		replaceDigitsWthSpecialCharacter.replaceFunction("H2i H3el4lo P4un2e5");
	}
}
