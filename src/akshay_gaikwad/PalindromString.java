/*Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"] */

package akshay_gaikwad;

import java.util.Arrays;

public class PalindromString {

	boolean isPalindromString(String input) {
		String output = getReversedString(input);
		if (input.equalsIgnoreCase(output)) {
			return true;
		} else {
			return false;
		}
	}

	String getReversedString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] processData(String[] inputArr) {
		String[] outputArr = new String[inputArr.length];
		for (int index = 0; index < inputArr.length; index++) {
			String currentStr = inputArr[index];
			if (!isPalindromString(currentStr)) {
				String output = getReversedString(currentStr);
				outputArr[index] = Character.toUpperCase(output.charAt(0)) + output.substring(1, output.length() - 1) + Character.toUpperCase(output.charAt(output.length() - 1));
			} else {
				outputArr[index] = currentStr;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		String[] outArr = new PalindromString().processData(arr);
		System.out.println(Arrays.toString(outArr));
	}
}
