/*Assignment - 28 : 31st Jan'2024
Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0*/

package prathamesh_tati;

public class SumOfOddDigits {

	void printSumOfOddDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0)
					sum = sum + num;
			}
		}
		System.out.println("Sum of Odd Digits in " + str + " = " + sum);
	}

	public static void main(String[] args) {
		SumOfOddDigits sumOfOddDigits = new SumOfOddDigits();
		sumOfOddDigits.printSumOfOddDigits("te3ch4noc7red8its");
		sumOfOddDigits.printSumOfOddDigits("te2chn6ocred8its");
	}
}
