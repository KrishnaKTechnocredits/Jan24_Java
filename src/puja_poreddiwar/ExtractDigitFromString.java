//Assignment - 47 : 4th Feb'2024
package puja_poreddiwar;

public class ExtractDigitFromString {

	void getDigitsFromString(String str) {
		String digitStr = "";
		String ans = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
				ans = digitStr;
			}
		}
		System.out.println("string having all the digits are: " + ans);
	}

	public static void main(String[] args) {
		new ExtractDigitFromString().getDigitsFromString("Aas-H3v7i");
	}

}
