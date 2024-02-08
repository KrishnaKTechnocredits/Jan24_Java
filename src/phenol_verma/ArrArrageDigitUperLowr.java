/*
 * ------------------------------------------
Assignment - 45 : 4th Feb'2024
PhenolV_Assignment_51
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase. 
input :- String arr[] = { "AasH3v7i", "Aaka2ns5ha", "I2sh4a4n", "Aas3hvi" };

output:-37AHasvi
25Aakansha
244Ishan
3Aashvi


hint
String upperCaseStr = "";
String lowerCaseStr = "";
String digitStr = "";

if(Character.isDigit(ch))
	digitStr = digitStr + ch;
else if(Character.isUpperCase(ch))
	str1 = str1 + ch;

String ans = digitStr+upperCaseStr+lowerCaseStr;
return ans;

 */

package phenol_verma;

import javax.print.DocFlavor.CHAR_ARRAY;

public class ArrArrageDigitUperLowr {
	void rearrangeChar(String arr[]) {
		String charDigit = "";
		String charUpperCase = "";
		String charLowerCase = "";
		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				char ch = testStr.charAt(chIndex);
				if (Character.isDigit(ch))
					charDigit = charDigit + ch;
				else if (Character.isUpperCase(ch))
					charUpperCase = charUpperCase + ch;
				else if (Character.isLowerCase(ch))
					charLowerCase = charLowerCase + ch;
			}
			String finalString = charDigit + charUpperCase + charLowerCase;
			System.out.println(finalString);
			charDigit = "";
			charUpperCase = "";
			charLowerCase = "";
		}

	}

	public static void main(String[] args) {
		ArrArrageDigitUperLowr arrageDigitUperLowr = new ArrArrageDigitUperLowr();
		String arr[] = { "AasH3v7i", "Aaka2ns5ha", "I2sh4a4n", "Aas3hvi" };
		arrageDigitUperLowr.rearrangeChar(arr);
	}

}
