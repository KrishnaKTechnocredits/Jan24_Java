package akshada_marne;

public class ExtractDigitAndSpecialCharacterFromString {

	void extractDigit(String str) {
		String displaystr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch))
				displaystr = displaystr + ch;
			else if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch))
				displaystr = displaystr + ch;
		}
		System.out.print(displaystr);
	}

	public static void main(String args[]) {
		ExtractDigitAndSpecialCharacterFromString extractDigitAndSpecialCharacterFromString = new ExtractDigitAndSpecialCharacterFromString();
		extractDigitAndSpecialCharacterFromString.extractDigit("Aas-H3v7i");
	}
}
