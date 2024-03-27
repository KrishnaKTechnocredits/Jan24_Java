/*
 * Assignment - 88 : 24th March'2024 [15-20 mins]
 * 
 * PhenolV_Assignment_96
 * 
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT
 * 
 * 
 * 
 */

package phenol_verma;


public class ArrayReverseStringFirstAndLast {

	String revFistLast(String inputString) {
		String[] arrString = inputString.split(" ");
		String outputString = "";
		for (int index = 0; index <  arrString.length; index++) {
			String revString = "";
			
			if (index == arrString.length - 1 || index == 0) {
				for (int innerIndex = arrString[index].length() - 1; innerIndex >= 0; innerIndex--) {
					revString += arrString[index].charAt(innerIndex);
				}
			} else {
				revString = arrString[index];
			}
			outputString += revString + " ";
		}
		outputString = outputString.substring(0, outputString.length() - 1);
		return outputString;
	}

	public static void main(String[] args) {
		ArrayReverseStringFirstAndLast arrayReverseStringFirstAndLast = new ArrayReverseStringFirstAndLast();
		String inputString = "Welcome to the Technocredits";
		System.out.println("Origibnal String - " + inputString);
		System.out.println("Output String - " + arrayReverseStringFirstAndLast.revFistLast(inputString));
	}
}
