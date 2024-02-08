package garima_s;

public class DifferenceOfDigits {
	void printDigits(String value) {
		System.out.print("Difference of Odd and even Digits in a Given String : ");
		int sumOdd = 0;
		int sumEven = 0;
		int diff = 0;
		int temp = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			boolean digit = Character.isDigit(ch);
			if (digit == true) {
				temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sumOdd = sumOdd + temp;
				} else {
					sumEven = sumEven + temp;
				}
				diff = sumOdd - sumEven;
			}
		}
		System.out.println(diff);
	}

	public static void main(String[] args) {
		DifferenceOfDigits differenceOfDigits = new DifferenceOfDigits();
		differenceOfDigits.printDigits("te3ch4noc7re9d8its");
	}
}
