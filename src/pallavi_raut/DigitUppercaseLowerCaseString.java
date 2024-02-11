/*Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
 
input :-AasH3v7i
output:-37AHsvi

hint
String upperCaseStr = "";
String lowerCaseStr = "";
String digitStr = "";

if(Character.isDigit(ch))
	digitStr = digitStr + ch;
else if(Character.isUpperCase(ch))
	str1 = str1 + ch;

String ans = digitStr+upperCaseStr+lowerCaseStr;
return ans; ---------------*/

package pallavi_raut;

public class DigitUppercaseLowerCaseString {
	public static void main(String[] args) {
		new DigitUppercaseLowerCaseString().getDigitUpperLowerString("AasH3v7i");
	}

	String getDigitUpperLowerString(String str) {
		String upperCaseString = "";
		String lowerCaseString = "";
		String digitString = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
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
}
