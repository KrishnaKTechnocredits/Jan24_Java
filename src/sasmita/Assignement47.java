package sasmita;

public class Assignement47 {
	String getDigitString(String str) {
		String digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit = digit + ch;
		}
		System.out.println("Digit's from the strings are: " + digit);
		return digit;

	}

	public static void main(String[] args) {
		new Assignement47().getDigitString("Aas-H3v7i");
	}
}
