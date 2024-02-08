package akshay_gaikwad;

public class SumOfDigitInString {
	void getSumOfDigit(String input) {
		int sum = 0;
		for (int index = 0 ; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digits in" + input + " is : " + sum);
	}
	public static void main(String[] args) {
		SumOfDigitInString sumofdigitinstring = new SumOfDigitInString();
		sumofdigitinstring.getSumOfDigit("te3ch4nocred8its");
		sumofdigitinstring.getSumOfDigit("technocredits");
	}
}
