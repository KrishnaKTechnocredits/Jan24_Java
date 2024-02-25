/*
 *Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */

package padmaja;

public class SumOfSquaresOfOddDigits {

	void printSumOfSquareOfOddDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				if (ch % 2 != 0) {
					int c = Character.getNumericValue(ch);
					sum = sum + (c * c);
				}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfSquaresOfOddDigits sum = new SumOfSquaresOfOddDigits();
		sum.printSumOfSquareOfOddDigits("te3ch4noc7red8its");
	}
}
