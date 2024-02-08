package ashwini_b;

/*
 Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0


 */
public class OddDigitSum {

	void sumOfAllOddDigit(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {

					sum = sum + temp;
				}
			}
		}
		System.out.println("input : " + input);
		System.out.println("output : " + sum);

	}

	public static void main(String[] args) {

		OddDigitSum oddDigitSum = new OddDigitSum();
		oddDigitSum.sumOfAllOddDigit("te3ch4noc7red8its");
		oddDigitSum.sumOfAllOddDigit("te2chn6ocred8its");
	}
}
