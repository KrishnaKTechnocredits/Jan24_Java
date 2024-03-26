/*
 Assignment - 87 : 24th March'2024 [15-20 mins]
 PhenolV_Assignment_95
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT
 */

package phenol_verma;

public class ArrayReverseString {

	String reverseString(String strToReverse) {
		String updatedString = "";
		String[] arr = strToReverse.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String reverseString = "";
			for (int innerIndex = arr[index].length() - 1; innerIndex >= 0; innerIndex--) {
				reverseString += arr[index].charAt(innerIndex) + "";

			}
			updatedString = updatedString + reverseString + " ";
		}
		return updatedString;
	}

	public static void main(String[] args) {

		ArrayReverseString arrayReverseString = new ArrayReverseString();
		String str = "Welcome to Technocredits";
		System.out.println(arrayReverseString.reverseString(str));

	}
}
