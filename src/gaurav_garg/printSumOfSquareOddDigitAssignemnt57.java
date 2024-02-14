/*
 Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */
package gaurav_garg;

public class printSumOfSquareOddDigitAssignemnt57 {

	static boolean getcount(char ch) {
			if (Character.isDigit(ch)) {
				return true;
			}
		return false;
	}

	static void printSumOfSquareOddDigit(String str) {
		int sum=0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean chardigit = getcount(ch);	
			if (chardigit) {	
				if (Character.getNumericValue(ch)%2==1) {	
				sum =sum +(Character.getNumericValue(ch)*Character.getNumericValue(ch));
				}
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		printSumOfSquareOddDigit("te3ch4noc7red8its");
	}
}
