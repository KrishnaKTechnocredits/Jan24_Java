package garima_s;

public class PrintDigitUpperLowerString {

	String getDigitUpperLowerString(String name) {
		String upperCaseString = "";
		String lowerCaseString = "";
		String digitString = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch))
				digitString = digitString + ch;
			else if (Character.isUpperCase(ch))
				upperCaseString = upperCaseString + ch;
			else
				lowerCaseString = lowerCaseString + ch;
		}
		String ans = digitString + upperCaseString + lowerCaseString;
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		new PrintDigitUpperLowerString().getDigitUpperLowerString("AasH3v7i");
	}

}
