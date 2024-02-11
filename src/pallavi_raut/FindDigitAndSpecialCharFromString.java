/*Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37

hint
if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
	str = str + ch;
	----------------------------------------------------------*/
package pallavi_raut;

public class FindDigitAndSpecialCharFromString {

	public static void main(String[] args) {
		new FindDigitAndSpecialCharFromString().getDigitAndSpecialCharFromString("Aas-H3v7i");
	}

	void getDigitAndSpecialCharFromString(String str) {
		String output = getSpecialCharacterFromString(str) + getDigitsFromString(str);
		System.out.println(output);
	}

	String getDigitsFromString(String digitstr) {
		String getDigitStr = "";
		for (int i = 0; i < digitstr.length(); i++) {
			char ch = digitstr.charAt(i);
			if (Character.isDigit(ch)) {
				getDigitStr = getDigitStr + ch;
			}
		}
		return getDigitStr;
	}

	String getSpecialCharacterFromString(String splCharStr) {
		String getsplCharStr = "";
		for (int i = 0; i < splCharStr.length(); i++) {
			char ch = splCharStr.charAt(i);
			if (!Character.isDigit(ch) && !Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				getsplCharStr = getsplCharStr + ch;
			}
		}
		return getsplCharStr;
	}
}
