/*"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */
package akshay_gaikwad;

public class SumOfNegativeNum {
	
	void printSumOfNegativeNum(String input) {
		int sum = 0;
		for (int index = 1; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.charAt(index-1) == '-' && Character.isDigit(ch)) {
				sum += (Character.getNumericValue(ch)) * -1;
			}
		}
		System.out.println("Sum of all negative digits in given string : " + sum);
	}
	
	public static void main(String[] args) {
		new SumOfNegativeNum().printSumOfNegativeNum("te-3ch4noc7red-8its");
	}
}
