/*
 * Assignment - 47 : 4th Feb'2024
Return the string extracting all the digits from it. 

input :-Aas-H3v7i
output:-37*/

package sarang_kulkarni;

public class RemoveDigitsFromString {

	void printStrAllDigits(String str) {
		String digitStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr += ch;
			}
		}
		System.out.println("Digits in given string are : " + digitStr);
	}

	public static void main(String[] args) {
		new RemoveDigitsFromString().printStrAllDigits("-Aas-H3v7i");
	}
}
