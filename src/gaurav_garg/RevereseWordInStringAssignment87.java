/*
 Assignment - 87 : 24th March'2024 [15-20 mins]
Code to reverse words in string:
Input: Welcome to Technocredits
Output: emocleW ot stiderconhceT
 */

package gaurav_garg;

public class RevereseWordInStringAssignment87 {

	String reverseEachWord(String str) {
		String new1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			new1 = new1 + c;
		}
		return new1;
	}

	void reverseWord(String str) {
		String arr[] = str.split(" ");
		String newLine = "";
		for (int i = 0; i < arr.length; i++) {
			String name = reverseEachWord(arr[i]);
			newLine = newLine + name + " ";
		}
		System.out.print(newLine.trim());
	}

	public static void main(String[] args) {
		String s = "Welcome to Technocredits";
		new RevereseWordInStringAssignment87().reverseWord(s);
	}
}
