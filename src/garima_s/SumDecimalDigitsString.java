/*"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */

package garima_s;

class SumDecimalDigitsString {
	void printSumDecimalDigit(String input) {
		double sumDouble = 0, sum = 0;
		String temp = "", input1 = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == '.') {
				input1 = temp + input.charAt(index - 1) + ch + input.charAt(index + 1);
				double value = Double.parseDouble(input1);
				sumDouble += value;
			} else if (Character.isDigit(ch) && input.charAt(index + 1) != '.' && input.charAt(index - 1) != '.') {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all integers in a string : " + (sum + sumDouble));
	}

	public static void main(String[] args) {
		String input = "te3ch4.5noc7red8.1its";
		new SumDecimalDigitsString().printSumDecimalDigit(input);
	}
}