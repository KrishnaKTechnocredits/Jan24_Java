/*

Assignment - 94 : 25th March'2024 [18-20 mins] 
PhenolV_Assignment_102
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
 */

package phenol_verma;

import java.util.Arrays;

public class ArrayReverseStringSeq {

	String reverseArrayString(String str) {
		String[] strToArray = str.split(" ");
		String updatedString = "";
		for (int index = strToArray.length - 1; index >= 0; index--) {
			updatedString += strToArray[index] + " ";
		}
		updatedString = updatedString.substring(0, updatedString.length() - 1);

		return updatedString;
	}

	public static void main(String[] args) {
		ArrayReverseStringSeq arrayReverseStringSeq = new ArrayReverseStringSeq();
		String str = "Kajol is Working in Roche";
		System.out.println("Original String - " + str);
		System.out.println("Reverse String - " + arrayReverseStringSeq.reverseArrayString(str));
	}
}
