package shafaque;

public class diffOfNum {

	void getDiffOfDigits(String str) {
		int sumodd = 0, sumeven = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				if (Character.getNumericValue(ch) % 2 != 0)

					sumodd = sumodd + Character.getNumericValue(ch);
				else
					sumeven = sumeven + Character.getNumericValue(ch);

			}
		}

		System.out.println("Sum of Odd Digits in a String: " + sumodd);
		System.out.println("Sum of Even Digits in a String: " + sumeven);
		System.out.println("Difference of Odd and Even Digits in a String: " + (sumodd - sumeven));
	}

	public static void main(String[] args) {

		new diffOfNum().getDiffOfDigits("te3ch4noc7re9d8its");

	}

}
