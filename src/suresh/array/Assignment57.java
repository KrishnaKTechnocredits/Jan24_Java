/*
 Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 * 
 */

package suresh.array;

public class Assignment57 {

	void getdigitsInTheString(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			boolean flge = (Character.isDigit(ch));
			if (flge == true) {
				boolean flag2 = (Character.getNumericValue(ch) % 2 != 0);

				if (flag2 == true) {
					sum = sum + (Character.getNumericValue(ch) * Character.getNumericValue(ch));
				}
			}

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		assignment57.getdigitsInTheString("te3ch4noc7red8its");
	}
}
