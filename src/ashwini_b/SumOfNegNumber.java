package ashwini_b;

/*
Assignment - 61 : 16th Feb'2024
"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */
public class SumOfNegNumber {

	void printSumOfNegNum(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				if (input.charAt(i - 1) == '-') {
					sum = sum - Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfNegNumber sumOfNegNumber = new SumOfNegNumber();
		sumOfNegNumber.printSumOfNegNum("te-3ch4noc7red-8its");
	}
}
