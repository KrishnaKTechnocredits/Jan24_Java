package ashwini_b;
/*
 Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0
*/

public class SumOfAllDigit {

	void allDigitSumInString(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		System.out.println("input : " + input);
		System.out.println("output : " + sum);
	}

	public static void main(String[] args) {
		SumOfAllDigit sumOfAllDigit = new SumOfAllDigit();
		sumOfAllDigit.allDigitSumInString("te3ch4nocred8its");
		sumOfAllDigit.allDigitSumInString("technocredits");

	}

}
