/*
"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */

package puja_poreddiwar;

public class Assignment61NegativeNum {

	int sum = 0;

	void getSumOfNegNo(String str) {
		for (int index = 1; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.charAt(index - 1) == '-' && Character.isDigit(ch)) {
				int input = Character.getNumericValue(ch);
				sum = sum + (input * -1);
			}
		}
		System.out.println("Sum of negative numbers : " + sum);
	}

	public static void main(String[] args) {
		String str = "te-3ch4noc7red-8its";
		new Assignment61NegativeNum().getSumOfNegNo(str);
	}
}
