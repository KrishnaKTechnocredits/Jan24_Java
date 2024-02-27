/*
Assignment - 46 : 4th Feb'2024
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
return ans;  */

package kanchan_ghuge;

class Assignment46 { 

	void printString(String str) {
		System.out.println("Input String is = " + str);
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		String answer = "";
		System.out.println(
				"Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase = ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) == true)
				upperCase += ch;
			else if (Character.isLowerCase(ch) == true)
				lowerCase += ch;
			else if (Character.isDigit(ch) == true)
				digit += ch;
		}
		answer = digit + upperCase + lowerCase;
		System.out.println(answer);
	}

	public static void main(String[] args) {
		String s = "-AasH3v7i";
		new Assignment46().printString(s);
	}
}
