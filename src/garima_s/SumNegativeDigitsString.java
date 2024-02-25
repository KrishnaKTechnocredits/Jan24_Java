/*"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11" 
 */

package garima_s;

class SumNegativeDigitsString {
	void printSumNegativeDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == '-') {
				char ch = input.charAt(index + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		System.out.print("Sum Of Negative Intergers in a String : " + sum);
	}

	public static void main(String[] args) {
		String input = "te-3ch4noc7red-8its";
		new SumNegativeDigitsString().printSumNegativeDigit(input);
	}
}