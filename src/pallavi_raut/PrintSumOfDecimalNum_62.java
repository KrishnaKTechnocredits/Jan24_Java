/* Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1   */

package pallavi_raut;

public class PrintSumOfDecimalNum_62 {

	public static void main(String[] args) {
		String input = "te3ch4.5noc7red8.1its";
		PrintSumOfDecimalNum_62 printSumOfDecimalNum = new PrintSumOfDecimalNum_62();
		printSumOfDecimalNum.sumOfDecimalnum(input);
	}

	void sumOfDecimalnum(String input) {
		double sum1 = 0;
		double sum = 0;
		for (int i = 0; i < input.length(); i++) {
			String temp = "";
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				if (input.charAt(i + 1) == '.') {
					if (Character.isDigit(input.charAt(i + 2))) {
						temp = temp + ch + input.charAt(i + 1) + input.charAt(i + 2);
						sum1 = sum1 + Double.parseDouble(temp);
					}
				} else {
					if (input.charAt(i - 1) != '.')
						sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("Sum of all digits : " + (sum + sum1));
	}
}