package ashwini_b;
/*
Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37
 */
public class StrExtractDigitSpecialChar {
 
	void DigitSpecialChar(String inputStr) {
		String str = "";
		for(int index = 0 ; index < inputStr.length() ; index++) {
			char ch = inputStr.charAt(index);
			if(Character.isDigit(ch) || Character.isAlphabetic(index) ) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		StrExtractDigitSpecialChar strExtractDigitSpecialChar = new StrExtractDigitSpecialChar();
		strExtractDigitSpecialChar.DigitSpecialChar("Aas-H3v7i");
	}
}
