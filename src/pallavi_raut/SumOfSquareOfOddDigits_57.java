/*Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58*/

package pallavi_raut;

public class SumOfSquareOfOddDigits_57 {

	public static void main(String[] args) {
		String Str = "te3ch4noc7red8its";
		SumOfSquareOfOddDigits_57 sumOfSquareOfOddDigits_57 = new SumOfSquareOfOddDigits_57();
		sumOfSquareOfOddDigits_57.square(Str);
	}

	void square(String input) {
		int result = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isDigit(ch);
			int temp = Character.getNumericValue(ch);
			if (flag == true && temp % 2 != 0) {
				result = (result + (temp * temp));
			}
		}
		System.out.println("Sum of squares of odd digits:- " + result);
	}
}