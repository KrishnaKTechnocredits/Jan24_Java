package ashwini_b;

/*
 Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7
 */
public class DiffrBetSumOfOddEven {

	void SumOfAllOddEven(String input) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 == 0) {

					evenSum = evenSum + temp;
				} else {
					oddSum = oddSum + temp;

				}
			}

		}
		System.out.println("even number sum: " + evenSum);
		System.out.println("odd number sum: " + oddSum);

		int diff = oddSum - evenSum;
		System.out.println("output: " + diff);
	}

	public static void main(String[] args) {
		DiffrBetSumOfOddEven diffrBetSumOfOddEven = new DiffrBetSumOfOddEven();
		diffrBetSumOfOddEven.SumOfAllOddEven("te3ch4noc7re9d8its");
	}

}
