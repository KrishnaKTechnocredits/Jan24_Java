/*  	
Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58
 */

package garima_s;

public class SumOddSquareDigits {
	void printSumOddSquareDigits(String input) {
		int sum = 0;
		int square = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					square = temp * temp;
					sum = sum + square;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4noc7red8its";
		System.out.print("Sum Of Squares of Odd Digits : ");
		new SumOddSquareDigits().printSumOddSquareDigits(input);
	}
}
