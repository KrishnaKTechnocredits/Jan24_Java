/*Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0 */


package padmaja;

public class SumOfOddDigitsInAString {
	void printSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sum = sum + temp;
				}
			}
		}
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		SumOfOddDigitsInAString sum = new SumOfOddDigitsInAString();
		sum.printSum("te3ch4noc7red8its");
		sum.printSum("te2chn6ocred8its");

	}

}
