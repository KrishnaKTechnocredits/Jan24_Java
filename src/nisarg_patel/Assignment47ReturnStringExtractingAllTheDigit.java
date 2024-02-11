package nisarg_patel;

public class Assignment47ReturnStringExtractingAllTheDigit {

	String getDigitString(String name) {
		String digitString = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch))
				digitString = digitString + ch;
		}
		System.out.println("String have only Digits = " + digitString);
		return digitString;
	}

	public static void main(String[] args) {
		new Assignment47ReturnStringExtractingAllTheDigit().getDigitString("Aas-H3v7i");
	}
}
