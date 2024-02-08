/*
 Assignment - 49 : 8th Feb'2024
 PR - PhenolV_Assignment_54
 Condition 1 - If last digit numeric, print second last character
 Condition 2 - If last digit non numeric, print last character
Input = String arr[] = { "Phenol17", "Neha2", "Lalit", "Maulik123", "Harsh1", "Ma1r3g4i5" };
Output - 
1
a
t
2
h
i  */

package phenol_verma;

public class ArrFindLastNonNumericChar {
	private String arr[];

	char[] nonNumricChar(String arr[]) {

		char finalChar[] = new char[6];

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			this.arr = arr;
			if (Character.isDigit(str.charAt(str.length() - 1)))
				// If last digit numeric, capture second last character
				finalChar[index] = str.charAt(str.length() - 2);
			else
				// If last digit non numeric, capture last character
				finalChar[index] = str.charAt(str.length() - 1);
		}
		return finalChar;
	}

	void printFinalArr(char finArr[]) {
		for (int finalIndex = 0; finalIndex < finArr.length; finalIndex++) {
			System.out.println("Second last charater of string " + arr[finalIndex] + " -> " + finArr[finalIndex]);
		}
	}

	public static void main(String[] args) {
		ArrFindLastNonNumericChar arrFindLastNonNumericChar = new ArrFindLastNonNumericChar();
		String arr[] = { "Phenol17", "Neha2", "Lalit", "Maulik123", "Harsh1", "Ma1r3g4i5" };

		char[] finalChar = arrFindLastNonNumericChar.nonNumricChar(arr);

		arrFindLastNonNumericChar.printFinalArr(finalChar);
	}
}
