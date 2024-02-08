/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0*/

package prathamesh_tati;

public class SumOfDigits {

	void getSumOfDigitsFromString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of Digits in " + str + " = " + sum);
	}

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		sumOfDigits.getSumOfDigitsFromString("te3ch4nocred8its");
		sumOfDigits.getSumOfDigitsFromString("technocredits");
	}
}
