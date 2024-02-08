/*
 * Assignment - 36 : 4th Feb'2024
PhenolV_Assignment_42
Print all the names with their frequency from given array. 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output: techno = 2 credits=1 samikash=1 varsha=1
*/

package phenol_verma;

public class ArrNameWithFreq {

	void nameFrqCheck(String arr[], String str) {

		int stringCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == str) {
				stringCount++;
			}
		}
		System.out.println("Count of " + str + " is " + stringCount);
	}

	void countNameFrq(String arr[]) {
		for (int index = 0; index < arr.length; index++) {
			String temp = arr[index];
			
			for (int InrIndex = index + 1; InrIndex < arr.length; InrIndex++) {
				if (temp != arr[InrIndex]) {
					nameFrqCheck(arr, arr[index]);
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		ArrNameWithFreq arrNameWithFreq = new ArrNameWithFreq();
		String arr[] = { "techno", "credits", "samikash", "varsha", "techno" };
		arrNameWithFreq.countNameFrq(arr);
	}
}
