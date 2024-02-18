package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 * Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */

public class NonPalindromStringReverseProgram {
	
	String reverseString(String str) {
		String reverseStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
				reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}
	
	void printReverseArray(String[] strArr) {
		String reverse;
		String[] reverseArr = new String[strArr.length];
		
		for(int i=0; i<strArr.length; i++) {
			reverse = reverseString(strArr[i]);
			if(!reverse.equals(strArr[i])) {
				reverseArr[i] =reverse.toUpperCase().charAt(0)+ reverse.substring(1, reverse.length()-2)+reverse.toUpperCase().charAt(reverse.length()-1);
			} else {
				reverseArr[i] =strArr[i];
			}
		}
		System.out.println(Arrays.toString(reverseArr));
	}
	
	public static void main(String[] args) {
		NonPalindromStringReverseProgram nonPalindron = new NonPalindromStringReverseProgram();
		String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"};
		nonPalindron.printReverseArray(arr);
	}

}
