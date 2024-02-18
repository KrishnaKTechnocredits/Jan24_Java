/*Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
PhenolV_Assignment_73
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
*/

package phenol_verma;

import java.util.Arrays;

public class ArrReverStringPalandrom {

	String strReverse(String str) {

		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

	void checkPalndram(String arr[]) {

		for (int index = 0; index < arr.length; index++) {
			String reverStr = "";

			String str = strReverse(arr[index]);
			if (!arr[index].equals(str)) {
				reverStr = str.toUpperCase().charAt(0) + str.substring(1, str.length() - 1)
						+ str.toUpperCase().charAt(str.length() - 1);
				arr[index] = reverStr;
			}
		}
	}

	public static void main(String[] args) {
		ArrReverStringPalandrom arrReverStringPalandrom = new ArrReverStringPalandrom();
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		System.out.println("Original Array - " + Arrays.toString(arr));

		arrReverStringPalandrom.checkPalndram(arr);
		System.out.println("Output Array - " + Arrays.toString(arr));
	}
}
