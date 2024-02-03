package nisarg_patel;

public class Assignment28SumOddDigits {

	void printDigits(String value) {
		System.out.print("Sum of Odd Digits in Given String : ");
		int sum = 0;
		int temp = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			boolean digit = Character.isDigit(ch);
			if (digit == true) {
				temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sum = sum + temp;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment28SumOddDigits assignment28SumOddDigits = new Assignment28SumOddDigits();
		assignment28SumOddDigits.printDigits("te3ch4noc7red8its");
		assignment28SumOddDigits.printDigits("te2chn6ocred8its");
	}
}
