/*Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11 */

package kanchan_ghuge;

public class Assignment61 {

	void printSumOfNegativeNum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == '-') {
				char ch = str.charAt(index + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		System.out.println("Sum of Negative numbers in String is : " + sum);
	}

	public static void main(String[] args) {
		String str = "te-3ch4noc7red-8its";
		new Assignment61().printSumOfNegativeNum(str);
	}
}
