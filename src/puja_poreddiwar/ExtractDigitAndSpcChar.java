//Assignment - 48 : 4th Feb'2024
package puja_poreddiwar;

public class ExtractDigitAndSpcChar {

	void getDigitsAndSpcChar(String str) {
		String digitStr = "";
		String specialCharacterStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digitStr = digitStr + ch;
			else if (Character.isUpperCase(ch) == false && Character.isLowerCase(ch) == false)
				specialCharacterStr = specialCharacterStr + ch;
		}
		String ans1 = specialCharacterStr + digitStr;
		System.out.println("String have Digits and Special Characters = " + ans1);
	}

	public static void main(String[] args) {
		new ExtractDigitAndSpcChar().getDigitsAndSpcChar("Aas-H3v7i");
	}
}
