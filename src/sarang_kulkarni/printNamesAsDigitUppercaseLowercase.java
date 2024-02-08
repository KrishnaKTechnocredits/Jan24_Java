/*Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
 
input :-AasH3v7i
output:-37AHsvi*/

package sarang_kulkarni;

public class printNamesAsDigitUppercaseLowercase {

	void printRearrangeString(String str) {
		String digitStr = "";
		String upCaseStr = "";
		String lowCaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr += ch;
			} else if (Character.isUpperCase(ch)) {
				upCaseStr += ch;
			} else if (Character.isLowerCase(ch)) {
				lowCaseStr += ch;
			}
		}
		System.out.println("Rearranged string is : " + (digitStr + upCaseStr + lowCaseStr));
	}

	public static void main(String[] args) {
		new printNamesAsDigitUppercaseLowercase().printRearrangeString("Aas*H3/v7i");
	}
}
