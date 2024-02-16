/*
 * Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */

package puja_poreddiwar;

public class Assignment57SqOfOddDig {

	boolean isDigit(String str, char ch) {
		if (Character.isDigit(ch)) {
			return true;
		}
		return false;
	}

	void getSumSqOfOddDigits(String input) {
		int sum = 0;
		int num1 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (isDigit(input, ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					num1 = num * num;
					sum = sum + num1 ;
				}

			}
		}
		System.out.println("sum of squares of odd digits is : " + sum);
	}

	public static void main(String[] args) {
		String str = "te3ch4noc7red8its";
		new Assignment57SqOfOddDig().getSumSqOfOddDigits(str);

	}

}
