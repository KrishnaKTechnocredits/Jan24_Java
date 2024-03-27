/*Assignment 82 - String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14
NOTE : use Exception concept */

package padmaja;

public class ExceptionAssignment {

	void getSumOfDigits(String str) {
		String[] arr = str.split(" ");
		int count = 0;
		for (String str1 : arr) {
			try {
				count = count + Integer.parseInt(str1);
			} catch (NumberFormatException e) {
				continue;
			}
		}

		System.out.println("Total Sum of Digits : " + count);
	}

	public static void main(String[] args) {
		new ExceptionAssignment().getSumOfDigits("I am having 11 years and 3 months of experience in java selenium");
	}
}
