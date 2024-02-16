/*Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"*/
package madhura_kulkarni;

public class Assignment57 {

	void printSumOfSquaresOfOddDigits(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				if (ch % 2 != 0)
					sum = sum + (Character.getNumericValue(ch) * Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum of squares of odd digits is: " + sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4noc7red8its";
		new Assignment57().printSumOfSquaresOfOddDigits(input);
	}

}
