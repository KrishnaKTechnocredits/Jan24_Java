package akshada_marne;

public class ExtractDigitFromString {

	void extractDigit(String str) {
		String displayString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				displayString = displayString + ch;
			}
		}
		System.out.println(displayString);
	}

	public static void main(String args[]) {
		ExtractDigitFromString extractDigitFromString = new ExtractDigitFromString();
		extractDigitFromString.extractDigit("Aas-H3v7i");
	}

}
