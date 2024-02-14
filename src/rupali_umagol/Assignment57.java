/*"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
*/
package rupali_umagol;

public class Assignment57 {
	boolean isDigitFromString(char ch) {
		if (Character.isDigit(ch)) {
			return true;
		}
		return false;
	}

	void getSumOfOddDigit(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isDigitFromString(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					// System.out.println(num);
					sum = sum + (num * num);
					// System.out.println(sum);
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4noc7red8its";
		new Assignment57().getSumOfOddDigit(input);
	}
}
