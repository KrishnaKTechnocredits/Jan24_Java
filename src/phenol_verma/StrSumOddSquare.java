/*
 Assignment - 57 : 14th Feb'2024
 PhenolV_Assignment_63
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */

package phenol_verma;

public class StrSumOddSquare {

	void squreOddDigit(String str) {
		int oddDigitSqureSum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int numericValueOfDigit = Character.getNumericValue(ch);
			if (Character.isDigit(ch) && numericValueOfDigit % 2 != 0) {
				int squre = (int) Math.pow(numericValueOfDigit, 2);
				oddDigitSqureSum = oddDigitSqureSum + squre;
			}
		}
		System.out.println(oddDigitSqureSum);
	}

	public static void main(String[] args) {
		StrSumOddSquare strSumOddSquare = new StrSumOddSquare();
		String oriString = "te3ch4noc7red8its";
		System.out.println("Original String - " + oriString);
		System.out.print("Sum of squre of odd digit in string - ");
		strSumOddSquare.squreOddDigit(oriString);
	}

}
