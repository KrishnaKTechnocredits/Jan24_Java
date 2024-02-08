package garima_s;

public class SumOddDigits {
	void printDigits(String value) {
		System.out.print("Sum of Odd Digits in Given String : ");
		int sum = 0;
		int temp = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (Character.isDigit(ch)) {
				temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sum = sum + temp;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOddDigits sumOddDigits = new SumOddDigits();
		sumOddDigits.printDigits("te3ch4noc7red8its");
		sumOddDigits.printDigits("te2chn6ocred8its");
	}

}
