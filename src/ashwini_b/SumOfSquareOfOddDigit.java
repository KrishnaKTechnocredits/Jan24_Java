package ashwini_b;

/*
 Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */
public class SumOfSquareOfOddDigit {

	void printSumOfSquares(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sum = sum + temp * temp;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfSquareOfOddDigit sumOfSquareOfOddDigit = new SumOfSquareOfOddDigit();
		sumOfSquareOfOddDigit.printSumOfSquares("te3ch4noc7red8its");
	}
}
