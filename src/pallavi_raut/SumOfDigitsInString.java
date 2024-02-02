/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0

Programming-Test : 1, PR #123, 20 mins
-----------------------------------------------*/

package pallavi_raut;

class SumOfDigitsInString {

	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		sumOfDigitsInString.printSumDigitsInString("te3ch4nocred8its");
		sumOfDigitsInString.printSumDigitsInString("technocredits");
	}

	int printSumDigitsInString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digits in String '" + str + "' is: " + sum);
		return sum;
	}
}
