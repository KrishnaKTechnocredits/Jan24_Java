package akshay_gaikwad;

public class SumOfOddDigits {
	void getSumOfOddDigits(String input) {
		int sum = 0;
		for (int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			int chValue = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				if (chValue % 2 != 0) {
					sum += chValue;
				}
			}
		}
		System.out.println("Sum of All digits in " + input + " is : " + sum);
	}
	public static void main(String[] args) {
		SumOfOddDigits sumofodddigits = new SumOfOddDigits();
		sumofodddigits.getSumOfOddDigits("te3ch4noc7red8its");
		sumofodddigits.getSumOfOddDigits("te2chn6ocred8its");

	}
}
