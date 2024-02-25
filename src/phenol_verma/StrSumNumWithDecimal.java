/*
Assignment - 64 : 16th Feb'2024
PhenolV_Assignment_69
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */
package phenol_verma;

public class StrSumNumWithDecimal {
	String decimalDigitString = "";
	double decimalDigit = 0;
	double finalSumDigit = 0;

	void sumNumDecimal(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (Character.isDigit(chr)) {
				if (str.charAt(index + 1) == '.' && Character.isDigit(str.charAt(index + 2))) {
					decimalDigitString = Character.toString(str.charAt(index))
							+ Character.toString(str.charAt(index + 1)) + Character.toString((str.charAt(index + 2)));
					decimalDigit = Double.parseDouble(decimalDigitString);
					finalSumDigit = finalSumDigit + decimalDigit;
					index = index + 2;
				} else {
					finalSumDigit = finalSumDigit + Character.getNumericValue(chr);
				}
			}
		}
		System.out.println("Sum of numbers and Handle decimal numbers too - " + finalSumDigit);
	}

	public static void main(String[] args) {
		StrSumNumWithDecimal strSumNumWithDecimal = new StrSumNumWithDecimal();
		String str = "te3ch4.5noc7red8.1its";
		System.out.println("Original String - " + str);
		strSumNumWithDecimal.sumNumDecimal(str);
	}
}
