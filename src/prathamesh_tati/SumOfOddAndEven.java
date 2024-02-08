/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7*/

package prathamesh_tati;

public class SumOfOddAndEven {

	void GetdifferenceBetweenSum(String str) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);

				if (num % 2 == 0)
					evenSum = evenSum + num;
				else
					oddSum = oddSum + num;
			}
		}
		System.out.println("Difference between Sum of Odd and Even digits = " + (oddSum - evenSum));
	}

	public static void main(String[] args) {
		SumOfOddAndEven sumOfOddAndEven = new SumOfOddAndEven();
		sumOfOddAndEven.GetdifferenceBetweenSum("te3ch4noc7re9d8its");
	}
}
