/*
 * Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */

package shridhar_k;

public class Assignment57 {
	
	boolean isCharOdd(char ch) {
		int num = Character.getNumericValue(ch);
		if(num % 2 != 0) {
			return true;
		}
		return false;
	}

	void printOddCharSqSum(String inpStr) {
		int numOut = 0;
		for(int i =0;i< inpStr.length(); i++) {
			char ch = inpStr.charAt(i);
			if(Character.isDigit(ch) && isCharOdd(ch)) {
				int numtemp = Character.getNumericValue(ch);
				numOut = numOut + numtemp*numtemp ;
			}
		}
		System.out.println("Output: " + numOut);
	}
	
	public static void main(String[] args) {
		String input = "te3ch4noc7red8its";
		new Assignment57().printOddCharSqSum(input);
	}
}
