package nisarg_patel;

public class Assignment48ReturnStringDigitsAndCharacters {

	String getDigitSpecialCharacterString(String name) {
		String specialCharacterString = "";
		String digitString = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch))
				digitString = digitString + ch;
			else if (Character.isUpperCase(ch) == false && Character.isLowerCase(ch) == false)
				specialCharacterString = specialCharacterString + ch;
		}
		String ans = specialCharacterString + digitString;
		System.out.println("String have Digits and Special Characters = " + ans);
		return ans;
	}

	public static void main(String[] args) {
		new Assignment48ReturnStringDigitsAndCharacters().getDigitSpecialCharacterString("Aas-H3v7i");
	}
}
