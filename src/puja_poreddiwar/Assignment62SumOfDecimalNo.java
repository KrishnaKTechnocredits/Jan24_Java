/*
Assignment - 62 : 16th Feb'2024
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */

package puja_poreddiwar;

public class Assignment62SumOfDecimalNo {

	String outputStr = "";
	double sum = 0;

	void getSumOfDecimalNum(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) && str.charAt(i - 1) != '.') {
				if (str.charAt(i + 1) == '.') {
					outputStr = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1))
							+ Character.toString(str.charAt(i + 2));
					sum = sum + Double.parseDouble(outputStr);
				} else {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String str = "te3ch4.5noc7red8.1its";
		new Assignment62SumOfDecimalNo().getSumOfDecimalNum(str);
	}
}
