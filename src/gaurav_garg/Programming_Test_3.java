/*
Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */
package gaurav_garg;

import java.util.Arrays;

public class Programming_Test_3 {

	String reversestring(String str) {
		String newstring = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newstring = newstring + str.charAt(i);
		}
		return newstring;
	}

	String getUpperCharcaterInWord(String s) {
		return s.toUpperCase().charAt(0) + s.substring(1, s.length() - 1) + s.toUpperCase().charAt(s.length() - 1);
	}

	void printCheckPalindromePrint(String str[]) {
		String newstr[] = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			String reverse = reversestring(str[i]);
			if (str[i].equals(reverse)) {
				newstr[i] = str[i];
			} else {
				newstr[i] = getUpperCharcaterInWord(reverse);
			}
		}
		System.out.print(Arrays.toString(newstr));
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new Programming_Test_3().printCheckPalindromePrint(arr);
	}
}
