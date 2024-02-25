
/*
 * Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */

package puja_poreddiwar;

import java.util.Arrays;

public class Program_Test_3 {

	String palindromeNum(String arr) {
		String str1 = "";
		for (int i = arr.length() - 1; i >= 0; i--) {
			char ch = arr.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}

	String processInput(String input) {
		char ch1 = input.charAt(0);
		char ch2 = input.charAt(input.length() - 1);
		input = Character.toUpperCase(ch1) + input.substring(1, input.length() - 1) + Character.toUpperCase(ch2);
		return input;
	}

	void printNames(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String revOutput = palindromeNum(arr[i]);
			if (!revOutput.equals(arr[i])) {
				arr[i] = processInput(revOutput);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new Program_Test_3().printNames(arr);
		System.out.println(Arrays.toString(arr));
	}
}
