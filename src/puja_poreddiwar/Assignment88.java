/*
 * Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT
 */

package puja_poreddiwar;

public class Assignment88 {

	String getReverStringOf(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output;
	}

	void printReverseFirstLastString(String[] arr) {
		String output = "";
		for (int i = 0; i <arr.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				String result = getReverStringOf(arr[i]);
				output += result + " ";
			} else {
				output += arr[i] + " ";
			}
		}
		output = output.trim();
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		String[] str1 = str.split(" ");
		new Assignment88().printReverseFirstLastString(str1);
	}

}
