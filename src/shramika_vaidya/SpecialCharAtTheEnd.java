package shramika_vaidya;

public class SpecialCharAtTheEnd {

	String isSpecialChar(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!Character.isDigit(ch)) && (!Character.isUpperCase(ch)) && (!Character.isLowerCase(ch))) {
				str1 = str1 + ch;
			}
		}
		return str1;
	}

	String getRemainingchar(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
				str2 = str2 + ch;
			}
		}
		return str2;
	}

	void getFinalString(String input) {
		String temp = "";
		String temp1 = getRemainingchar(input);
		String temp2 = isSpecialChar(input);
		temp = temp1 + temp2;
		System.out.print(temp);
	}

	public static void main(String[] args) {
		new SpecialCharAtTheEnd().getFinalString("-AasH?3v7i!");
	}
}
