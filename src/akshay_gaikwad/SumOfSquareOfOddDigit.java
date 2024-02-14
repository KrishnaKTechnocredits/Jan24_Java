/* Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58 */
package akshay_gaikwad;

public class SumOfSquareOfOddDigit {
	
	void printSumOfSqrOfOdd(String str) {
		int sum = 0;
		int num = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					sum += (num * num);
				}
			}
		}
		System.out.println("Sum of squares of all odd digits is : " + sum);
	}
	
	public static void main(String[] args) {
		new SumOfSquareOfOddDigit().printSumOfSqrOfOdd("te3ch4noc7red8its");
	}
}
