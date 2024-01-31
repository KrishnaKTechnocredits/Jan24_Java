package shafaque;

public class SumOfOdd {

	void getSumOfOddDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				if (Character.getNumericValue(ch) % 2 != 0)

					sum = sum + Character.getNumericValue(ch);

			}
		}

		System.out.println("Sum of Odd Digits in a String: " + sum);
	}

	public static void main(String[] args) {

		new SumOfOdd().getSumOfOddDigits("te3ch4noc7red8its");
		new SumOfOdd().getSumOfOddDigits("te2chn6ocred8its");
	}

}