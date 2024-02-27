/*Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58 */

package kanchan_ghuge;

class Assignment57 {

	void printSumOfSquareOfOddDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (ch % 2 != 0)
					sum += (Character.getNumericValue(ch) * Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum og Square of Odd Digits is = " + sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4noc7red8its";
		new Assignment57().printSumOfSquareOfOddDigits(input);
	}
}
