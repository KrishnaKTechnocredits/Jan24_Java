/*"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
*/
package rupali_umagol;

public class Assignment61 {
	static int getSumOfNegative(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '-' && Character.isDigit(input.charAt(i + 1))) {
				sum = sum + (Character.getNumericValue(input.charAt(i + 1))) * -1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "-3ch4noc7red-8its";
		System.out.println("Sum of Negative numbers : " + getSumOfNegative(input));
	}
}