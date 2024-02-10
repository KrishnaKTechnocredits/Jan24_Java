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
