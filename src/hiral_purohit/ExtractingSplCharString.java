package hiral_purohit;

public class ExtractingSplCharString {

	String extractionDigit(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
		return input;
	}

	public static void main(String[] args) {
		new ExtractingSplCharString().extractionDigit("Aas-H3v7i");
	}
}
