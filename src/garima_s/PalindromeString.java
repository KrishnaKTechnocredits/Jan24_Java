/*Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */

package garima_s;

import java.util.Arrays;

public class PalindromeString {

	String getReverseString(String value) {
		String temp = "";
		for (int index = (value.length() - 1); index >= 0; index--) {
			temp = temp + value.charAt(index);
		}
		return temp;
	}

	String[] printUppercaseFirstLast(String[] input) {
		String output;
		for (int i = 0; i < input.length; i++) {
			output = getReverseString(input[i]);
			if (!input[i].equals(output)) {
				output = Character.toUpperCase(output.charAt(0)) + output.substring(1, output.length() - 1)
						+ Character.toUpperCase(output.charAt(output.length() - 1));
				input[i] = output;
			} else {
				input[i] = output;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		String[] input = { "naman", "techno", "madam", "credits", "nitin" };
		PalindromeString palindromeString = new PalindromeString();
		input = palindromeString.printUppercaseFirstLast(input);
		System.out.println(Arrays.toString(input));
	}
}
