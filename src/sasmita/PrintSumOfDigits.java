package sasmita;

public class PrintSumOfDigits {

	void sumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digits in " + str + "is :" + sum);
	}

	public static void main(String[] args) {
		PrintSumOfDigits sumofdigits = new PrintSumOfDigits();
		sumofdigits.sumOfDigits("te3ch4nocred8its");
		sumofdigits.sumOfDigits("technocredits");
	}
}
