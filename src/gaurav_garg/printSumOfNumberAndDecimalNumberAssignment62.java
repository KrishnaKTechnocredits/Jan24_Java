/*
Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */
package gaurav_garg;

public class printSumOfNumberAndDecimalNumberAssignment62 {

	void printSumOfNumberAndDecimalNumber(String str) {
		double numericsum = 0;
		double sum = 0;
		for (int index = 0; index < str.length(); index++) {
			String numeric = "";
			char char1 = str.charAt(index);
			if (Character.isDigit(char1)) {
				if (str.charAt(index + 1) == '.') {
					if (Character.isDigit(str.charAt(index + 2))) {
						numeric = numeric + char1 + str.charAt(index + 1) + str.charAt(index + 2);
						double d = Double.parseDouble(numeric);
						numericsum = numericsum + d;
					}
				} else {
					if (str.charAt(index - 1) != '.')
						sum = sum + Character.getNumericValue(char1);
				}
			}
		}
		System.out.print(sum + numericsum);
	}

	public static void main(String[] args) {
		new printSumOfNumberAndDecimalNumberAssignment62().printSumOfNumberAndDecimalNumber("te3ch4.5noc7red8.1its");
	}
}
