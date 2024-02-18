/*Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */

package garima_s;

import java.util.Arrays;

public class PalindromeString {

	String getReverseArray(String value) {
		String temp = "";
		for (int index = (value.length() - 1); index >= 0; index--) {
			temp = temp + value.charAt(index);
		}
		return temp;
	}

	boolean isPalindrome(String input, String Output) {
		if (input.equals(Output)) {
			return true;
		}
		return false;
	}

	String printUppercaseFirstLast(String input, String output) {
		if (!isPalindrome(input, output)) {
			output = output.replace(output.charAt(0), output.toUpperCase().charAt(0));
			output = output.replace(output.charAt(output.length() - 1),
					output.toUpperCase().charAt(output.length() - 1));
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "naman", "techno", "madam", "credits", "nitin" };
		String[] output = new String[input.length];
		PalindromeString palindromeString = new PalindromeString();
		for (int index = 0; index < input.length; index++) {
			output[index] = palindromeString.getReverseArray(input[index]);
			output[index] = palindromeString.printUppercaseFirstLast(input[index], output[index]);
		}
		System.out.println(Arrays.toString(output));
	}
}
