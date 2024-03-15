/*String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14

NOTE : use Exception concept 
 */
package sasmita;

public class Assignment82 {

	void sumOfDigits(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println("sum of Digits in string: " + sum);

	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		Assignment82 assignment82 = new Assignment82();
		assignment82.sumOfDigits(str);
	}

}
