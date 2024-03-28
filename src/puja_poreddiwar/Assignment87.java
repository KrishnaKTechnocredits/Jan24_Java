/*
 * Assignment - 87 : 24th March'2024 [15-20 mins]
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT
 */

package puja_poreddiwar;

public class Assignment87 {

	String getReverseString(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			output += word.charAt(i);
		}
		return output;
	}

	void printReverseString(String[] arr) {
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			String output1 = getReverseString(arr[i]);
			output += output1 + " ";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str = "Welcome to Technocredits";
		String[] str1 = str.split(" ");
		new Assignment87().printReverseString(str1);
	}
}
