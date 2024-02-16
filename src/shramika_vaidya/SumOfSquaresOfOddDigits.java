package shramika_vaidya;

public class SumOfSquaresOfOddDigits {

	int getSumOfSquareOfDigit(String input) {
		int sum = 0;
		for (int i = 1; i < input.length(); i++) {
			input = input.toLowerCase();
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					sum = sum + (num * num);
				}
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		new SumOfSquaresOfOddDigits().getSumOfSquareOfDigit("te3ch4noc7red8its");
	}
}
