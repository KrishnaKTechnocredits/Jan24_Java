/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7 */

package padmaja;

public class DiffBetSumOfOddAndEvenNos {

	void printSumofOddDigits(String str) {
		int sumOfOddDigits = 0;
		int sumOfevenDigits = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sumOfOddDigits = sumOfOddDigits + temp;
				} else if (temp % 2 == 0)
					sumOfevenDigits = sumOfevenDigits + temp;
			}
		}
		System.out.println(sumOfOddDigits - sumOfevenDigits);
	}

	public static void main(String[] args) {
		DiffBetSumOfOddAndEvenNos diff = new DiffBetSumOfOddAndEvenNos();
		diff.printSumofOddDigits("te3ch4noc7re9d8its");
	}
}
