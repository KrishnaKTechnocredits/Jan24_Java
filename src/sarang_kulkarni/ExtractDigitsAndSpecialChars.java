/*
 * Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37*/

package sarang_kulkarni;

public class ExtractDigitsAndSpecialChars {

	void getDigitAndSpecialCharFromStr(String str) {
		String output = "";
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) || !Character.isLowerCase(ch)) {
				output += ch;
			}
		}
		System.out.println("String without Digits and Special Characters = "+output);
	}
	public static void main(String[] args) {
		new ExtractDigitsAndSpecialChars().getDigitAndSpecialCharFromStr("Aas-H3v7i");
		
	}
}
